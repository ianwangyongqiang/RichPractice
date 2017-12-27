package com.skycopyhot.richpractice.database

import android.arch.persistence.room.TypeConverter
import com.skycopyhot.richpractice.database.entities.LoanEntity
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * RPConverter
 */
class RPConverter {

    @TypeConverter
    fun timestampToDate(time: Long = System.currentTimeMillis()) = Date(time)

    @TypeConverter
    fun dateToTimestamp(date: Date = Date()) = date.time

    @TypeConverter
    fun eLoanStatusToInt(status: LoanEntity.ELoanStatus) = when (status) {
        LoanEntity.ELoanStatus.STATUS_AVAILABLE -> 0
        LoanEntity.ELoanStatus.STATUS_DONE -> 1
    }

    @TypeConverter
    fun intToELoanStatus(status: Int) = when (status) {
        0 -> LoanEntity.ELoanStatus.STATUS_AVAILABLE
        else -> LoanEntity.ELoanStatus.STATUS_DONE
    }
}