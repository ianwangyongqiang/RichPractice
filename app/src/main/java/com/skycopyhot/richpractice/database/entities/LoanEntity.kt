package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.*
import com.skycopyhot.richpractice.database.RPConverter
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * LoanEntity
 */
@Entity(tableName = LoanEntity.TABLE_NAME)
@TypeConverters(RPConverter::class)
data class LoanEntity(@PrimaryKey(autoGenerate = true)
                      @ColumnInfo(name = "loanId")
                      val id: Int = 0,
                      @ColumnInfo(name = "loanUserId")
                      val userId: Int = 0,
                      @ColumnInfo(name = "loanBookId")
                      val bookId: Int = 0,
                      @ColumnInfo(name = "loanStartTime")
                      val startTime: Date = Date(),
                      @ColumnInfo(name = "loanStatus")
                      val status: ELoanStatus = ELoanStatus.STATUS_DONE) {

    @Ignore
    constructor(): this(id = 0)

    enum class ELoanStatus {
        STATUS_AVAILABLE,
        STATUS_DONE
    }

    companion object {
        const val TABLE_NAME = "loans"
    }
}