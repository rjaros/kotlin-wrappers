// Automatically generated - do not modify!

package web.midi

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface MIDIPortType {
    companion object {
        @JsValue("input")
        val input: MIDIPortType

        @JsValue("output")
        val output: MIDIPortType
    }
}
