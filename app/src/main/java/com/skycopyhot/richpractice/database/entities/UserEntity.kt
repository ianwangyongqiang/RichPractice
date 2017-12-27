package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.*
import com.skycopyhot.richpractice.database.RPConverter
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * User
 */
@Entity(tableName = UserEntity.TABLE_NAME,
        indices = [(Index(name = "userId"))])
@TypeConverters(RPConverter::class)
data class UserEntity(@PrimaryKey
                      @ColumnInfo(name = "userId")
                      val id: Int = 0,
                      @ColumnInfo(name = "userName")
                      val name: String = "",
                      @ColumnInfo(name = "userEmail")
                      val email: String = "",
                      @ColumnInfo(name = "userPassword")
                      val password: String = "",
                      @ColumnInfo(name = "userGender")
                      val gender: Int = 0,
                      @ColumnInfo(name = "userAge")
                      val age: Int = 0,
                      @ColumnInfo(name = "userLastActiveTime")
                      val lastActiveTime: Date = Date()) {

    companion object {
        const val TABLE_NAME = "users"
    }
}