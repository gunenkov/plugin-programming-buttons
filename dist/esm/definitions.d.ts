import { PluginListenerHandle } from '@capacitor/core';
export interface ButtonsPluginPlugin {
    setVolumeButtonsMode(options: {
        changeVolume: boolean;
    }): Promise<void>;
    setMaxVolumeForNotifications(): Promise<void>;
    addListener(eventName: 'buttonUpPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;
    addListener(eventName: 'buttonDownPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;
    addListener(eventName: 'buttonPttPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;
    addListener(eventName: 'buttonSosPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;
}
