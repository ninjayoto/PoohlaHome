package com.ninja.poohla;

import android.Manifest;
import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import com.ninja.poohla.adapters.RecyclerViewDataAdapter;
import com.ninja.poohla.control.Api;
import com.ninja.poohla.models.Collection;
import com.ninja.poohla.models.HooplaCollections;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.ninja.poohla.R.id.my_recycler_view;


public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;

    private static final String TAG = "PoohlaApp  ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);


        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle("Poohla Home");

        }


//        Map JSON();
        mapJSON();
        Log.d(TAG, "Mapping Json");

    }


    // parsing JSON method
    public void mapJSON() {
        getPermissionToUseInternet();
        //retrofit2
        Api.Factory.getInstance().listCollection().enqueue(new Callback<HooplaCollections>() {
            //Call(request to the server) and a response
            public void onResponse(Call<HooplaCollections> call,
                                   Response<HooplaCollections> response) {

                HooplaCollections res = response.body();
                List<Collection> itemsList;

                itemsList = res.getCollections();

                mRecyclerView = (RecyclerView) findViewById(my_recycler_view);
                mRecyclerView.setHasFixedSize(true);

                // use a linear layout manager
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

                RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(getApplicationContext(), (ArrayList<Collection>) itemsList);
                mRecyclerView.setAdapter(adapter);

                adapter.notifyDataSetChanged();

            }

            public void onFailure(Call<HooplaCollections> call, Throwable t) {

                // snackbar message to the user to check connection if data retrieval fails
                Snackbar.make(mRecyclerView, getString(R.string.connection_snackbar), Snackbar.LENGTH_LONG).show();

            }
        });

    }
    // Checking for runtime permissions in Android M and above

    // Identifier for the permission request
    private static final int INTERNET_PERMISSIONS_REQUEST = 1;

    @TargetApi(Build.VERSION_CODES.M)
    public void getPermissionToUseInternet() {


        if (ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {


            requestPermissions(new String[]{Manifest.permission.INTERNET},
                    INTERNET_PERMISSIONS_REQUEST);
        }
    }

    // Callback with the request from calling requestPermissions(...)
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           @NonNull String permissions[],
                                           @NonNull int[] grantResults){
        // Check that this is Internet request
        if (requestCode == INTERNET_PERMISSIONS_REQUEST) {
            if (grantResults.length == 1 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                Toast.makeText(this, R.string.perm_granted, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, R.string.perm_denied, Toast.LENGTH_SHORT).show();
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }
}


