// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gamepad

import seskar.js.JsValue

sealed external interface GamepadMappingType {
    companion object {
        @JsValue("")
        val none: GamepadMappingType

        @JsValue("standard")
        val standard: GamepadMappingType

        @JsValue("xr-standard")
        val xrStandard: GamepadMappingType
    }
}
