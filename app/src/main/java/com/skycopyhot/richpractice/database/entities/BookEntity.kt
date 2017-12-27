package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey
import com.skycopyhot.richpractice.module.IBook

/**
 * Created by yongqiangwang on 22/12/17.
 * BookEntity
 */
@Entity(tableName = BookEntity.TABLE_NAME,
        indices = [(Index(name = "bookId"))])
data class BookEntity(@PrimaryKey(autoGenerate = true)
                      @ColumnInfo(name = "bookId")
                      val id: Int = 0,
                      @ColumnInfo(name = "bookTitle")
                      val title: String = "",
                      @ColumnInfo(name = "bookAuthor")
                      val author: String = "",
                      @ColumnInfo(name = "bookType")
                      val type: String = "",
                      @ColumnInfo(name = "bookNumber")
                      val number: String = "",
                      @ColumnInfo(name = "bookSize")
                      val size: Int = 0): IBook {

    override fun getBookId(): Int = id

    override fun getBookTitle(): String = title

    override fun getBookAuthor(): String = author

    override fun getBookType(): String = type

    override fun getBookNumber(): String = number

    override fun getBookSize(): Int = size

    companion object {
        const val TABLE_NAME = "books"
    }
}