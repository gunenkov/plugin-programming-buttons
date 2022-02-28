import { WebPlugin } from '@capacitor/core';
import type { ButtonsPluginPlugin } from './definitions';
export declare class ButtonsPluginWeb extends WebPlugin implements ButtonsPluginPlugin {
    setMaxVolumeForNotifications(): Promise<void>;
    setVolumeButtonsMode(options: {
        changeVolume: boolean;
    }): Promise<void>;
}
