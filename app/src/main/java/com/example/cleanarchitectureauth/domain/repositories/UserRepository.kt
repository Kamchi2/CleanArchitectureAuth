package com.example.cleanarchitectureauth.domain.repositories

interface UserRepository {

    fun saveUser(username: String, name: String, surname: String, age: Int, password: String)

    fun getUserName(): String

    fun getName(): String

    fun getSurname(): String

    fun getAge(): Int

    fun getPassword(): String

    fun getAuthorized(): Boolean

    fun setAuthorized(boolean: Boolean)
}