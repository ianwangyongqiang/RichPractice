package com.skycopyhot.richpractice.database.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.skycopyhot.richpractice.database.entities.LoanEntity
import io.reactivex.Flowable

/**
 * Created by yongqiangwang on 27/12/17.
 * LoanDao
 */
@Dao
interface LoanDao {

    @Query("SELECT * FROM " + LoanEntity.TABLE_NAME)
    fun getLoans(): Flowable<List<LoanEntity>>
}