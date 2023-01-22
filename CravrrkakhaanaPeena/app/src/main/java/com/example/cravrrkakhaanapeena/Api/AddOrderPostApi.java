package com.example.cravrrkakhaanapeena.Api;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AddOrderPostApi {

    private static Retrofit retrofit = null;
    public static AddOrderPostApiInterface getClient() {

        // change our base URL as per our requirements
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://shoppersstopuatapi.cravrr.com/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        //Creating object for our interface
        AddOrderPostApiInterface addOrderPostApiInterface = retrofit.create(AddOrderPostApiInterface.class);

        // return the APIInterface object
        return addOrderPostApiInterface;

    }

}

