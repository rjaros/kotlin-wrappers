// Automatically generated - do not modify!

package web.gpu

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface GPUFilterMode {
    companion object {
        @JsValue("nearest")
        val nearest: GPUFilterMode

        @JsValue("linear")
        val linear: GPUFilterMode
    }
}
