package com.skycopyhot.richpractice.database

import android.arch.persistence.room.RoomDatabase
import com.skycopyhot.richpractice.database.entities.BookEntity
import io.reactivex.Flowable

/**
 * Created by yongqiangwang on 22/12/17.
 * RPDatabase
 */
abstract class RPDatabase : RoomDatabase() {

    abstract fun getBookByName(name: String): Flowable<List<BookEntity>>
}