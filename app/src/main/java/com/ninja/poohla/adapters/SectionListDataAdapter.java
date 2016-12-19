package com.ninja.poohla.adapters;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.ninja.poohla.R;
import com.ninja.poohla.models.Title;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/*
Creates the adapter for the (nested) recyclerview
 */
public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private static final String TAG = " Loading Items : ";
    private ArrayList<Title> itemsList;
    private Context mContext;

    public SectionListDataAdapter(Context context, ArrayList<Title> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;

    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_card, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {

        Title singleItem = itemsList.get(i);

        Log.d(TAG , singleItem.getArtKey());


        Picasso.with(mContext)
              .load(mContext.getString(R.string.img_url_start) + singleItem.getArtKey() + "_270.jpeg").into(holder.itemImage);


    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected ImageView itemImage;



        public SingleItemRowHolder(View view) {
            super(view);


            //images
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);


            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Toast.makeText(v.getContext(), "Clicked", Toast.LENGTH_SHORT).show();

                }
            });


        }

    }

}