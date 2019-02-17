package com.biplab.finalversion.tokidprojects.fragments.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    public static String ACTIN_DATABASE_UPDATED = "com.biplab.dcl.tokidprojects.fragments.notification.DATABASE_CHANGED";

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "updated", Toast.LENGTH_SHORT).show();
    }
}
