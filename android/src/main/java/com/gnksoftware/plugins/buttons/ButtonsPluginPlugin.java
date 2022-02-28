package com.gnksoftware.plugins.buttons;

import android.content.Context;
import android.media.AudioManager;
import android.view.KeyEvent;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ButtonsPlugin")
public class ButtonsPluginPlugin extends Plugin {

    public ButtonsPluginPlugin() {
        ButtonsPluginController.instance = this;
    }
    private boolean changeVolume = false;

    @PluginMethod
    public void setMaxVolumeForNotifications(PluginCall call) {
        AudioManager audioManager = (AudioManager)getContext().getSystemService(Context.AUDIO_SERVICE);
        if (audioManager.getRingerMode() == AudioManager.RINGER_MODE_NORMAL) {
            audioManager.setStreamVolume(AudioManager.STREAM_NOTIFICATION,audioManager.getStreamMaxVolume(AudioManager.STREAM_NOTIFICATION) * 5 / 8,0);
            call.resolve();
        }
        else {
            call.reject("Phone is muted or in only vibration mode!");
        }
    }

    @PluginMethod
    public void setVolumeButtonsMode(PluginCall call) {
        if (call.getBoolean("changeVolume") != null) {
            this.changeVolume = call.getBoolean("changeVolume");
            call.resolve();
        }
        else {
            call.reject("changeVolume is null!");
        }
    }

    public boolean notify(KeyEvent event) {
        if (event.getKeyCode() == 287) {
            if (event.getAction() == KeyEvent.ACTION_DOWN){
                notifyListeners("buttonPttPressed", null);
                return true;
            }
        }

        if (event.getKeyCode() == 286) {
            if (event.getAction() == KeyEvent.ACTION_DOWN){
                notifyListeners("buttonSosPressed", null);
                return true;
            }
        }

        if (event.getKeyCode() == 24) {
            if (event.getAction() == KeyEvent.ACTION_DOWN){
                if (changeVolume) {
                    return false;
                }
                notifyListeners("buttonUpPressed", null);
                return true;
            }
        }

        if (event.getKeyCode() == 25) {
            if (event.getAction() == KeyEvent.ACTION_DOWN){
                if (changeVolume) {
                    return false;
                }
                notifyListeners("buttonDownPressed", null);
                return true;
            }
        }

        return false;
    }
}
