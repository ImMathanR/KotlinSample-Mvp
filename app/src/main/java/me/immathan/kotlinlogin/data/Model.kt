package me.immathan.kotlinlogin.data

/**
 * Created by Mathan on 06-Sep-17.
 */

data class LoginResponse(var id: Int,
                         var success: Boolean,
                         var message: String,
                         var token: String,
                         var name: String)
