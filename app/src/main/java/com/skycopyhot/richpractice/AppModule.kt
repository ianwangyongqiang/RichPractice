package com.skycopyhot.richpractice

import android.content.Context
import com.skycopyhot.richpractice.database.IDBComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by yongqiangwang on 27/12/17.
 * AppModule
 */
@Module(subcomponents = [(IDBComponent::class)])
class AppModule(private val context: Context) {

    @Provides
    @Singleton
    fun provideContext() = context
}