// Generated by Karakum - do not modify it manually!

package node.zlib

sealed external interface BrotliOptionsParams {
    /**
     * Each key is a `constants.BROTLI_*` constant.
     */
    @seskar.js.JsNativeGetter
    operator fun get(key: Number): (Any /* boolean | number */)?

    @seskar.js.JsNativeSetter
    operator fun set(key: Number, value: (Any /* boolean | number */)?)
}
