package com.skycopyhot.richpractice.database

import android.arch.persistence.room.TypeConverter
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * DateConverter
 */
class DateConverter{

    @TypeConverter
    fun toDate(time: Long = System.currentTimeMillis()) = Date(time)

    @TypeConverter
    fun toTimestamp(date: Date = Date()) = date.time
}