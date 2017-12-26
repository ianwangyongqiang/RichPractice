package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.*
import com.skycopyhot.richpractice.database.DateConverter
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * User
 */
@Entity(tableName = "users")
@TypeConverters(DateConverter::class)
data class UserEntity(@PrimaryKey
                      @ColumnInfo(name = "userId")
                      val id: Int,
                      @ColumnInfo(name = "userName")
                      val name: String,
                      @ColumnInfo(name = "userEmail")
                      val email: String,
                      @ColumnInfo(name = "userPassword")
                      val password: String,
                      @ColumnInfo(name = "userGender")
                      val gender: Int,
                      @ColumnInfo(name = "userAge")
                      val age: Int,
                      @ColumnInfo(name = "userLastActiveTime")
                      val lastActiveTime: Date)