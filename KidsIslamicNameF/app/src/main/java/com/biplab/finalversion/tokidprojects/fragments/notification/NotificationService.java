package com.biplab.finalversion.tokidprojects.fragments.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.biplab.finalversion.tokidprojects.HomeActivity;
import com.biplab.finalversion.tokidprojects.R;
import com.biplab.finalversion.tokidprojects.fragments.database.DatabaseSource;
import com.biplab.finalversion.tokidprojects.fragments.database.Event;

import java.util.ArrayList;
import java.util.Calendar;

import static com.biplab.finalversion.tokidprojects.fragments.notification.AppNotification.CHANNEL_ID;

public class NotificationService extends Service {

    public static NotificationService notificationService;

    private ArrayList<Event> events;
    private DatabaseSource source;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        events = new ArrayList<>();
        source = new DatabaseSource(this);
        events = source.getAllEvents();

        Calendar newCalendar = Calendar.getInstance();
        int year = newCalendar.get(Calendar.YEAR);
        int month = newCalendar.get(Calendar.MONTH)+1;
        int day = newCalendar.get(Calendar.DAY_OF_MONTH);

        String input = "";

        if (events!=null){
            for (int i=0; i<events.size() ; i++){
                if (events.get(i).getDay() == day && events.get(i).getMonth() == month && events.get(i).getYear() == year ){

                    input = input + events.get(i).getTitle()+" ,";
                }
            }
        }

        if (!input.equals("")){
            Intent notificationIntent = new Intent(this, HomeActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this,
                    0,notificationIntent,0);

            Notification notification = new NotificationCompat.Builder(this,CHANNEL_ID)
                    .setContentTitle("Todays Event")
                    .setContentText(input)
                    .setSmallIcon(R.drawable.logo)
                    .setContentIntent(pendingIntent)
                    .build();

            startForeground(1,notification);
        }


        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
