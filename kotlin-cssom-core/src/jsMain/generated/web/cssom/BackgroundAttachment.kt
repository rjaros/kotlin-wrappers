// Automatically generated - do not modify!

package web.cssom

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface BackgroundAttachment {
    companion object {
        @JsValue("fixed")
        val fixed: BackgroundAttachment

        @JsValue("local")
        val local: BackgroundAttachment

        @JsValue("scroll")
        val scroll: BackgroundAttachment
    }
}
