package com.sillyapps.alarmarmy.ui

import android.content.Context
import androidx.compose.runtime.Composable
import com.sillyapps.alarm_data.di.AlarmDbComponent
import com.sillyapps.alarmarmy.di.DaggerAppComponent
import com.sillyapps.alarmarmy.navigation.AppNavHost
import com.sillyapps.core_ui.compose.theme.AlarmArmyTheme
import com.sillyapps.profiler_db.di.ProfilerDbComponent

@Composable
fun MainApp(context: Context, alarmDbComponent: AlarmDbComponent, profilerDbComponent: ProfilerDbComponent) {
  val appComponent = DaggerAppComponent.builder().context(context).build()

  AlarmArmyTheme {
    AppNavHost(appComponent = appComponent, alarmDbComponent = alarmDbComponent, profilerDbComponent = profilerDbComponent)
  }
}