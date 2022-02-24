import { registerPlugin } from '@capacitor/core';
const ButtonsPlugin = registerPlugin('ButtonsPlugin', {
    web: () => import('./web').then(m => new m.ButtonsPluginWeb()),
});
export * from './definitions';
export { ButtonsPlugin };
//# sourceMappingURL=index.js.map