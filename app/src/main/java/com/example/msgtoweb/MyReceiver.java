package com.example.msgtoweb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.telephony.SmsMessage;
import android.util.Log;
import android.os.Bundle;



public class MyReceiver extends BroadcastReceiver {

    private static final String SMS_RECEIVED = "android.provider.Telephony.SMS_RECEIVED";

    private static final String TAG = "SmsBroadcastReceiver";
String message,phoneNo;
    @Override
    public void onReceive(final Context context, Intent intent) {

        Log.i(TAG,"intent receiver"+intent.getAction());

        if(intent.getAction() == SMS_RECEIVED){
            Bundle dataBundle = intent.getExtras();
            if(dataBundle != null){
                Object [] mypdu = (Object[])dataBundle.get("pdus");

                final SmsMessage[] msg = new SmsMessage[mypdu.length];

                for(int i=0;i<mypdu.length;i++){

                    if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
                        String format = dataBundle.getString("format");
                        msg[i] = SmsMessage.createFromPdu( (byte[]) mypdu[i] );
                    }
                    else{
                        msg[i] = SmsMessage.createFromPdu( (byte[]) mypdu[i] );
                    }
                    message = msg[i].getMessageBody();
                    phoneNo = msg[i].getOriginatingAddress();

                }

                intent = new Intent(context, MessageActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.putExtra("message", message);
                intent.putExtra("phoneno", phoneNo);

                context.startActivity(intent);

            }

        }




    }

    }

