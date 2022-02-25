package com.gnksoftware.plugins.buttons;

import android.view.KeyEvent;
import com.getcapacitor.Plugin;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "ButtonsPlugin")
public class ButtonsPluginPlugin extends Plugin {

    public ButtonsPluginPlugin() {
        ButtonsPluginController.instance = this;
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
                notifyListeners("buttonUpPressed", null);
                return true;
            }
        }

        if (event.getKeyCode() == 25) {
            if (event.getAction() == KeyEvent.ACTION_DOWN){
                notifyListeners("buttonDownPressed", null);
                return true;
            }
        }

        return false;
    }
}
