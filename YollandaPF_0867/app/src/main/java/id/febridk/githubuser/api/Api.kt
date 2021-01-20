package id.febridk.githubuser.api

import id.febridk.githubuser.data.model.DetailUserResponse
import id.febridk.githubuser.data.model.User
import id.febridk.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 90276abb5e2cc91cc53a98f21129f8ef29f3614e")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 90276abb5e2cc91cc53a98f21129f8ef29f3614e")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 90276abb5e2cc91cc53a98f21129f8ef29f3614e")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 90276abb5e2cc91cc53a98f21129f8ef29f3614e")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}