package com.gnksoftware.plugins.buttons;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ButtonsPlugin")
public class ButtonsPluginPlugin extends Plugin {

    private ButtonsPlugin implementation = new ButtonsPlugin();

    private int dCount = 0;
    private int uCount = 0;

    @Override
    public void load() {
        /*BroadcastReceiver buttonDownReceiver =
                new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        onButtonDownPressed();
                    }
                };
        IntentFilter buttonDownFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        getActivity().registerReceiver(buttonDownReceiver, buttonDownFilter);

        BroadcastReceiver buttonUpReceiver =
                new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        onButtonUpPressed();
                    }
                };
        IntentFilter buttonUpFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        getActivity().registerReceiver(buttonUpReceiver, buttonUpFilter);*/
       // getActivity().onKeyDown() = (a, b) -> {

       // }
        BroadcastReceiver receiver =
                new BroadcastReceiver() {
                    @Override
                    public void onReceive(Context context, Intent intent) {
                        int newVolume = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", 0);
                        int oldVolume = intent.getIntExtra("android.media.EXTRA_PREV_VOLUME_STREAM_VALUE", 0);

                        if (newVolume - oldVolume > 0) {
                            onButtonUpPressed();
                        }
                        else {
                            onButtonDownPressed();
                        }
                    }
                };
        IntentFilter buttonUpFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
        getActivity().registerReceiver(receiver, buttonUpFilter);
    }

    @PluginMethod
    public void echo(PluginCall call) {
        String value = call.getString("value");

        JSObject ret = new JSObject();
        ret.put("value", implementation.echo(value));
        call.resolve(ret);
    }

    public void onButtonDownPressed() {
        dCount++;
        if (dCount == 2) {
            notifyListeners("buttonDownPressed", null);
            System.out.println("Notify");
            dCount = 0;
        }
    }

    public void onButtonUpPressed() {
        uCount++;
        if (uCount == 2) {
            notifyListeners("buttonUpPressed", null);
            System.out.println("Notify");
            uCount = 0;
        }
    }
}
