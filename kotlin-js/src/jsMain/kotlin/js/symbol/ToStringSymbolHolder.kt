@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.symbol

import seskar.js.JsNativeGetter

external interface ToStringSymbolHolder {
    @JsNativeGetter
    operator fun get(
        key: Symbol.toStringTag,
    ): ToString = definedExternally
}
