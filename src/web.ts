import { WebPlugin } from '@capacitor/core';

import type { ButtonsPluginPlugin } from './definitions';

export class ButtonsPluginWeb extends WebPlugin implements ButtonsPluginPlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
