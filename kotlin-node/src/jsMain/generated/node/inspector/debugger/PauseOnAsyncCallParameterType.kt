// Generated by Karakum - do not modify it manually!


package node.inspector.debugger


sealed external interface PauseOnAsyncCallParameterType {
    /**
     * Debugger will pause when async call with given stack trace is started.
     */
    var parentStackTraceId: node.inspector.runtime.StackTraceId
}
