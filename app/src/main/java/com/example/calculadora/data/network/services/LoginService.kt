package com.example.calculadora.data.network.services

import android.util.Log
import com.example.calculadora.core.RetrofitHelperAuth
import com.example.calculadora.data.dto.LoginDTO
import com.example.calculadora.data.model.DataResponse
import com.example.calculadora.data.network.clients.LoginApiClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit

class LoginService {
    val retrofit:Retrofit = RetrofitHelperAuth.getRetrofit()

    suspend fun signIn(loginDTO: LoginDTO):DataResponse{
        return withContext(Dispatchers.IO){
            val response: Response<DataResponse> = retrofit.create(LoginApiClient::class.java).signIn(loginDTO)
            Log.e("Login DTO", loginDTO.toString())
            Log.e("Body", response.body().toString())
            response.body()!!
        }
    }


}