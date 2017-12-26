package com.skycopyhot.richpractice.database.entities

import android.arch.persistence.room.*
import com.skycopyhot.richpractice.database.DateConverter
import java.util.*

/**
 * Created by yongqiangwang on 22/12/17.
 * LoanEntity
 */
@Entity(tableName = "loans",
        foreignKeys = [ForeignKey(entity = UserEntity::class, parentColumns = arrayOf("userId"), childColumns = arrayOf("loanUserId")),
            ForeignKey(entity = BookEntity::class, parentColumns = arrayOf("bookId"), childColumns = arrayOf("loanBookId"))
        ])
@TypeConverters(DateConverter::class)
data class LoanEntity(@PrimaryKey(autoGenerate = true)
                      @ColumnInfo(name = "loanId")
                      val id: Int,
                      @ColumnInfo(name = "loanUserId")
                      val userId: Int,
                      @ColumnInfo(name = "loanBookId")
                      val bookId: Int,
                      @ColumnInfo(name = "loanStartTime")
                      val startTime: Date)