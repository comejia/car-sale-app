package com.cmejia.kotlinapp.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cmejia.kotlinapp.entities.User

class UserViewModel : ViewModel() {

    private var usersAsList : MutableList<User> = ArrayList()
    private var users : MutableLiveData<List<User>> = MutableLiveData<List<User>>()

    init {
        users.value = loadUsers()
    }

    private fun loadUsers() : List<User> {
        usersAsList.add(User(0,"cesar mejia", "cmejia@gmail.com", "1234"))
        usersAsList.add(User(1,"octavio", "octavio@yahoo.com", "1234"))
        usersAsList.add(User(2,"jose luis mejia", "joseluis@outlook.com", "1234"))

        return usersAsList
    }

    fun getUsers(): LiveData<List<User>> {
        return users
    }

    fun addUser(user : User) {
        usersAsList.add(user)
        users.value = usersAsList
    }
}