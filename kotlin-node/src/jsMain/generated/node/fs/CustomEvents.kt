// Generated by Karakum - do not modify it manually!

package node.fs

/**
 * string & {} allows to allow any kind of strings for the event
 * but still allows to have auto completion for the normal events.
 */
external interface CustomEvents {
    @seskar.js.JsNativeGetter
    operator fun <Key : Any /* string & {} | symbol */> get(key: Key): (Function<Unit> /* (...args: any[]) => void */)?

    @seskar.js.JsNativeSetter
    operator fun <Key : Any /* string & {} | symbol */> set(
        key: Key,
        value: (Function<Unit> /* (...args: any[]) => void */)?,
    )
}
