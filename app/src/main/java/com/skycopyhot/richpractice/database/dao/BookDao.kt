package com.skycopyhot.richpractice.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.skycopyhot.richpractice.database.entities.BookEntity
import io.reactivex.Flowable

/**
 * Created by yongqiangwang on 27/12/17.
 * BookDao
 */
@Dao
interface BookDao {

    @Query("SELECT * FROM " + BookEntity.TABLE_NAME + " WHERE bookTitle LIKE :title")
    fun getBooksByTitle(title: String): Flowable<List<BookEntity>>
}