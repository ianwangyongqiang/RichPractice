package com.skycopyhot.richpractice.module

/**
 * Created by yongqiangwang on 26/12/17.
 * IBook
 */
interface IBook {
    fun getId(): Int
    fun getTitle(): String
    fun getAuthor(): String
    fun getType(): String
    fun getNumber(): String
    fun getSize(): Int
}