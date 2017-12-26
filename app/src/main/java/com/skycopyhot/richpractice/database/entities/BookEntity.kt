package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by yongqiangwang on 22/12/17.
 * BookEntity
 */
@Entity(tableName = "books")
data class BookEntity(@PrimaryKey(autoGenerate = true)
                      @ColumnInfo(name = "bookId")
                      val id: Int,
                      @ColumnInfo(name = "bookTitle")
                      val title: String,
                      @ColumnInfo(name = "bookAuthor")
                      val author: String,
                      @ColumnInfo(name = "bookType")
                      val type: String,
                      @ColumnInfo(name = "bookNumber")
                      val number: String,
                      @ColumnInfo(name = "bookSize")
                      val size: Int)