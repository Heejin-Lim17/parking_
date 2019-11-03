package kr.ac.gachon.parking.ParkingFunction

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class AlarmReceiver : BroadcastReceiver() {

    internal lateinit var context: Context

    override fun onReceive(context: Context, intent: Intent) {

        this.context = context
        // intent로부터 전달받은 string
        val get_yout_string = intent.extras!!.getString("state")

        // RingtonePlayingService 서비스 intent 생성
        val service_intent = Intent(context, RingtonePlayingService::class.java)

        // RingtonePlayinService로 extra string값 보내기
        service_intent.putExtra("state", get_yout_string)
        // start the ringtone service

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            this.context.startForegroundService(service_intent)
        } else {
            this.context.startService(service_intent)
        }
    }
}