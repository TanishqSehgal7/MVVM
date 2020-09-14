package com.example.mvvm.contentpack.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.mvvm.contentpack.db.entities.CURRENT_USER_ID
import com.example.mvvm.contentpack.db.entities.User

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun Usert(user:User):Long

    @Query("SELECT * FROM user WHERE uid=$CURRENT_USER_ID")
    fun getUser() : LiveData<User>
}