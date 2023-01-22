package com.example.cravrrkakhaanapeena.Api;


import com.example.cravrrkakhaanapeena.Models.AddOrderPostResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface AddOrderPostApiInterface {

    @FormUrlEncoded // annotation used in POST type requests
    @POST("api/get-item-details") // API's endpoints
    Call<AddOrderPostResponse> postItemOrder(@Field("Empname") String Empname,
                                             @Field("Itemdesc") String Itemdesc,
                                             @Field("Price") String Price);

    // In postItemOrder method @Field used to set the keys and String data type is representing its a string type value
    // and callback is used to get the response from api and it will set it in our POJO class
}