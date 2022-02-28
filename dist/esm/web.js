import { WebPlugin } from '@capacitor/core';
export class ButtonsPluginWeb extends WebPlugin {
    setMaxVolumeForNotifications() {
        console.log("Programming buttons plugin is not implemented for web!");
        return Promise.resolve(undefined);
    }
    setVolumeButtonsMode(options) {
        console.log(options);
        console.log("Programming buttons plugin is not implemented for web!");
        return Promise.resolve(undefined);
    }
}
//# sourceMappingURL=web.js.map