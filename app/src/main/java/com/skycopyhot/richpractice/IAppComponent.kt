package com.skycopyhot.richpractice

import dagger.Component
import javax.inject.Singleton

/**
 * Created by yongqiangwang on 27/12/17.
 * IAppComponent
 */
@Singleton
@Component(modules = [(AppModule::class)])
interface IAppComponent {


}