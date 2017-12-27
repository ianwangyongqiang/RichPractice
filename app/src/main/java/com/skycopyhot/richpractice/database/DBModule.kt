package com.skycopyhot.richpractice.database

import android.content.Context
import com.skycopyhot.richpractice.database.RPDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yongqiangwang on 27/12/17.
 * DBModule
 */
@Module
class DBModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context) = RPDatabase.buildDatabase(context)
}