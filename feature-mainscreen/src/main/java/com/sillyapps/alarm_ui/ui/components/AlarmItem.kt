package com.sillyapps.alarm_ui.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sillyapps.alarm_ui.model.UIAlarm
import com.sillyapps.core_ui.compose.theme.AlarmArmyTheme
import com.sillyapps.core_ui.compose.theme.Typography

@Composable
fun AlarmItem(
  item: UIAlarm,
  onToggleActive: (Long) -> Unit,
  onClick: (Long) -> Unit
) {
  Surface(
    elevation = 4.dp,
    modifier = Modifier.clickable { onClick(item.id) }
      .padding(bottom = 16.dp, start = 8.dp, end = 8.dp)
  ) {
    Row(
      Modifier
        .fillMaxWidth()
        .padding(vertical = 32.dp)
    ) {
      Column(
        modifier = Modifier
          .padding(start = 16.dp)
          .align(Alignment.CenterVertically)
      ) {
        Text(
          text = item.time,
          modifier = Modifier.align(Alignment.Start),
          style = Typography.h4
        )
        Text(
          text = item.weekDays,
          modifier = Modifier.align(Alignment.Start).padding(top = 4.dp),
          style = Typography.subtitle1
        )
      }

      Box(
        modifier = Modifier
          .weight(1f)
          .padding(end = 16.dp)
          .align(Alignment.CenterVertically)
      ) {
        Switch(
          checked = item.active,
          onCheckedChange = { onToggleActive(item.id) },
          modifier = Modifier.align(Alignment.CenterEnd)
        )
      }
    }

  }
}

@Preview
@Composable
fun AlarmItemPreview() {
  val previewAlarm = UIAlarm(0, "09:20", true, "Once", false)

  AlarmArmyTheme {
    AlarmItem(
      item = previewAlarm,
      onToggleActive = {},
      onClick = {}
    )
  }
}