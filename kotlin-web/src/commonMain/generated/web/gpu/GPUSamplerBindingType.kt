// Automatically generated - do not modify!

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package web.gpu

import seskar.js.JsValue

sealed external interface GPUSamplerBindingType {
    companion object {
        @JsValue("comparison")
        val comparison: GPUSamplerBindingType

        @JsValue("filtering")
        val filtering: GPUSamplerBindingType

        @JsValue("non-filtering")
        val nonFiltering: GPUSamplerBindingType
    }
}
