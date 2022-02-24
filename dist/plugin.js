var capacitorButtonsPlugin = (function (exports, core) {
    'use strict';

    const ButtonsPlugin = core.registerPlugin('ButtonsPlugin', {
        web: () => Promise.resolve().then(function () { return web; }).then(m => new m.ButtonsPluginWeb()),
    });

    class ButtonsPluginWeb extends core.WebPlugin {
    }

    var web = /*#__PURE__*/Object.freeze({
        __proto__: null,
        ButtonsPluginWeb: ButtonsPluginWeb
    });

    exports.ButtonsPlugin = ButtonsPlugin;

    Object.defineProperty(exports, '__esModule', { value: true });

    return exports;

})({}, capacitorExports);
//# sourceMappingURL=plugin.js.map
