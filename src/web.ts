import { WebPlugin } from '@capacitor/core';

import type { ButtonsPluginPlugin } from './definitions';

export class ButtonsPluginWeb extends WebPlugin implements ButtonsPluginPlugin {
  setMaxVolumeForNotifications(): Promise<void> {
    console.log("Programming buttons plugin is not implemented for web!");
    return Promise.resolve(undefined);
  }

  setVolumeButtonsMode(options: { changeVolume: boolean }): Promise<void> {
    console.log(options);
    console.log("Programming buttons plugin is not implemented for web!");
    return Promise.resolve(undefined);
  }

}
