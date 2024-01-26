// Generated by Karakum - do not modify it manually!


package node.diagnosticsChannel


sealed external interface TracingChannelSubscribers<ContextType : Any> {
    var start: (message: ContextType) -> Unit
    var end: (message: TracingChannelSubscribersEndMessage<ContextType>) -> Unit
    var asyncStart: (message: TracingChannelSubscribersAsyncStartMessage<ContextType>) -> Unit
    var asyncEnd: (message: TracingChannelSubscribersAsyncEndMessage<ContextType>) -> Unit
    var error: (message: TracingChannelSubscribersErrorMessage<ContextType>) -> Unit
}
