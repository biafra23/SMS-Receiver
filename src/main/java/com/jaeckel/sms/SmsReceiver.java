package com.jaeckel.sms;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * User: biafra
 * Date: 12/16/11
 * Time: 10:13 AM
 */
public class SmsReceiver extends BroadcastReceiver {

  private final static String TAG          = "SmsReceiver";
  private final static String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";

  @Override
  public void onReceive(Context context, Intent intent) {
    Log.i(TAG, "-----------> Intent received: " + intent.getAction());

    if (intent.getAction().equals(SMS_RECEIVED)) {

      Log.i(TAG, "-----------> SMS received: " + intent.getAction());

      // Beware! uncommenting this will discard all incoming sms!!
//      abortBroadcast();
    }
  }
}
