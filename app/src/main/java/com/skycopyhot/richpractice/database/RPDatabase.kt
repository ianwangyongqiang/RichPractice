package com.skycopyhot.richpractice.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.skycopyhot.richpractice.database.dao.BookDao
import com.skycopyhot.richpractice.database.dao.LoanDao
import com.skycopyhot.richpractice.database.dao.UserDao
import com.skycopyhot.richpractice.database.entities.BookEntity
import com.skycopyhot.richpractice.database.entities.LoanEntity
import com.skycopyhot.richpractice.database.entities.UserEntity

/**
 * Created by yongqiangwang on 22/12/17.
 * RPDatabase
 */
@Database(entities = [(BookEntity::class), (LoanEntity::class), (UserEntity::class)], version = 1)
abstract class RPDatabase : RoomDatabase() {

    abstract fun getBookDao(): BookDao
    abstract fun getLoanDao(): LoanDao
    abstract fun getUserDao(): UserDao

    companion object {

        private val DB_NAME = "rp.db"

        fun buildDatabase(context: Context) = Room.databaseBuilder(context, RPDatabase::class.java, DB_NAME).build()
    }
}