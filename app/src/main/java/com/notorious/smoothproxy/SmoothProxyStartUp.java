package com.notorious.smoothproxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class SmoothProxyStartUp extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
            Intent serviceIntent = new Intent(context, MainService.class);
            context.startService(serviceIntent);
        }
    }
}
