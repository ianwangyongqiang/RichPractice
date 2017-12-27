package com.skycopyhot.richpractice.module

/**
 * Created by yongqiangwang on 26/12/17.
 * IBook
 */
interface IBook {
    fun getBookId(): Int
    fun getBookTitle(): String
    fun getBookAuthor(): String
    fun getBookType(): String
    fun getBookNumber(): String
    fun getBookSize(): Int
}