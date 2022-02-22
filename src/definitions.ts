import { PluginListenerHandle } from '@capacitor/core';

export interface ButtonsPluginPlugin {
  addListener(eventName: 'buttonUpPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;

  addListener(eventName: 'buttonDownPressed', listenerFunc: () => void): Promise<PluginListenerHandle> & PluginListenerHandle;
}
