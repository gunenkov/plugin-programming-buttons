import { registerPlugin } from '@capacitor/core';

import type { ButtonsPluginPlugin } from './definitions';

const ButtonsPlugin = registerPlugin<ButtonsPluginPlugin>('ButtonsPlugin', {
  web: () => import('./web').then(m => new m.ButtonsPluginWeb()),
});

export * from './definitions';
export { ButtonsPlugin };
