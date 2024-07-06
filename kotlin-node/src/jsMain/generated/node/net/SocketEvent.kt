// Generated by Karakum - do not modify it manually!

package node.net


sealed external interface SocketEvent {
    sealed interface CLOSE : node.events.LegacyEventType
    sealed interface CONNECT : node.events.LegacyEventType
    sealed interface CONNECTIONATTEMPT : node.events.LegacyEventType
    sealed interface CONNECTIONATTEMPTFAILED : node.events.LegacyEventType
    sealed interface CONNECTIONATTEMPTTIMEOUT : node.events.LegacyEventType
    sealed interface DATA : node.events.LegacyEventType
    sealed interface DRAIN : node.events.LegacyEventType
    sealed interface END : node.events.LegacyEventType
    sealed interface ERROR : node.events.LegacyEventType
    sealed interface LOOKUP : node.events.LegacyEventType
    sealed interface READY : node.events.LegacyEventType
    sealed interface TIMEOUT : node.events.LegacyEventType

    companion object {
        @seskar.js.JsValue("close")
        val CLOSE: CLOSE

        @seskar.js.JsValue("connect")
        val CONNECT: CONNECT

        @seskar.js.JsValue("connectionAttempt")
        val CONNECTIONATTEMPT: CONNECTIONATTEMPT

        @seskar.js.JsValue("connectionAttemptFailed")
        val CONNECTIONATTEMPTFAILED: CONNECTIONATTEMPTFAILED

        @seskar.js.JsValue("connectionAttemptTimeout")
        val CONNECTIONATTEMPTTIMEOUT: CONNECTIONATTEMPTTIMEOUT

        @seskar.js.JsValue("data")
        val DATA: DATA

        @seskar.js.JsValue("drain")
        val DRAIN: DRAIN

        @seskar.js.JsValue("end")
        val END: END

        @seskar.js.JsValue("error")
        val ERROR: ERROR

        @seskar.js.JsValue("lookup")
        val LOOKUP: LOOKUP

        @seskar.js.JsValue("ready")
        val READY: READY

        @seskar.js.JsValue("timeout")
        val TIMEOUT: TIMEOUT

        @seskar.js.JsValue("close")
        fun close(): node.events.EventType<Socket, js.array.JsTuple1<Boolean>>

        @seskar.js.JsValue("connect")
        fun connect(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("connectionAttempt")
        fun connectionAttempt(): node.events.EventType<Socket, js.array.JsTuple3<String, Double, Double>>

        @seskar.js.JsValue("connectionAttemptFailed")
        fun connectionAttemptFailed(): node.events.EventType<Socket, js.array.JsTuple3<String, Double, Double>>

        @seskar.js.JsValue("connectionAttemptTimeout")
        fun connectionAttemptTimeout(): node.events.EventType<Socket, js.array.JsTuple3<String, Double, Double>>

        @seskar.js.JsValue("data")
        fun data(): node.events.EventType<Socket, js.array.JsTuple1<node.buffer.Buffer>>

        @seskar.js.JsValue("drain")
        fun drain(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("end")
        fun end(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("error")
        fun error(): node.events.EventType<Socket, js.array.JsTuple1<Throwable /* JsError */>>

        @seskar.js.JsValue("lookup")
        fun lookup(): node.events.EventType<Socket, js.array.JsTuple4<Throwable /* JsError */, String, Any /* string | number */, String>>

        @seskar.js.JsValue("ready")
        fun ready(): node.events.EventType<Socket, js.array.JsTuple>

        @seskar.js.JsValue("timeout")
        fun timeout(): node.events.EventType<Socket, js.array.JsTuple>
    }
}
