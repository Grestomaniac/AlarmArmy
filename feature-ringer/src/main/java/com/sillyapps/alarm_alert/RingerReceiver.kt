package com.sillyapps.alarm_alert

import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import com.sillyapps.alarm_alert.ui.AlarmAlertActivity
import com.sillyapps.core_ui.getImmutablePendingIntentFlags
import com.sillyapps.core_ui.startForegroundServiceCompat

class RingerReceiver: BroadcastReceiver() {
  override fun onReceive(p0: Context?, p1: Intent?) {
    if (p0 == null) throw Exception("RingerReceiver received null context.")

    val intent = Intent(p0, RingerService::class.java)
    startForegroundServiceCompat(p0, intent)
  }
}