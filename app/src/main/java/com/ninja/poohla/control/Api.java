package com.ninja.poohla.control;

import com.ninja.poohla.models.HooplaCollections;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface Api {


	String BASE_URL = "https://hoopla-ws-dev.hoopladigital.com/"; 

	//retrofit interface

	@Headers("ws-api:2.1")
	@GET("home")
	

	Call<HooplaCollections> listCollection();

	class Factory{

		private static Api service;


		public static Api getInstance(){
			// a method to instantiate an instance of service if not instantiated
			
			if (service == null){
				Retrofit retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create())
				.baseUrl(BASE_URL)
				.build();
				service = retrofit.create(Api.class);
				return service;
			}else {
				return service;
			}
		}
	}
}

