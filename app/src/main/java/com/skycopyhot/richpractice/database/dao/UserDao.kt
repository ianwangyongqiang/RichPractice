package com.skycopyhot.richpractice.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.skycopyhot.richpractice.database.entities.UserEntity
import io.reactivex.Flowable

/**
 * Created by yongqiangwang on 27/12/17.
 * UserDao
 */
@Dao
interface UserDao {

    @Query("SELECT * FROM " + UserEntity.TABLE_NAME + " WHERE userName = :name")
    fun getUserByName(name: String): Flowable<UserEntity>
}