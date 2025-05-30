// Generated by Karakum - do not modify it manually!

package electron.core

external interface BrowserWindowConstructorOptions : BaseWindowConstructorOptions {
// Docs: https://electronjs.org/docs/api/structures/browser-window-options
    /**
     * Whether the renderer should be active when `show` is `false` and it has just
     * been created.  In order for `document.visibilityState` to work correctly on
     * first load with `show: false` you should set this to `false`.  Setting this to
     * `false` will cause the `ready-to-show` event to not fire.  Default is `true`.
     */
    var paintWhenInitiallyHidden: Boolean?

    /**
     * Settings of web page's features.
     */
    var webPreferences: WebPreferences?
}
