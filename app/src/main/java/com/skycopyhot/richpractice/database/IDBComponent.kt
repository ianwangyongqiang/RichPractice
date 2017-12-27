package com.skycopyhot.richpractice.database

import dagger.Subcomponent

/**
 * Created by yongqiangwang on 27/12/17.
 * IDBComponent
 */
@Subcomponent(modules = [(DBModule::class)])
interface IDBComponent {

    @Subcomponent.Builder
    interface Builder {

        fun build(): IDBComponent
    }
}