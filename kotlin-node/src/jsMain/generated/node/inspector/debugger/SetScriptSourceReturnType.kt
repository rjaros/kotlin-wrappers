// Generated by Karakum - do not modify it manually!


package node.inspector.debugger


sealed external interface SetScriptSourceReturnType {
    /**
     * New stack trace in case editing has happened while VM was stopped.
     */
    var callFrames: js.array.ReadonlyArray<CallFrame>?

    /**
     * Whether current call stack  was modified after applying the changes.
     */
    var stackChanged: Boolean?

    /**
     * Async stack trace, if any.
     */
    var asyncStackTrace: node.inspector.runtime.StackTrace?

    /**
     * Async stack trace, if any.
     * @experimental
     */
    var asyncStackTraceId: node.inspector.runtime.StackTraceId?

    /**
     * Exception details if any.
     */
    var exceptionDetails: node.inspector.runtime.ExceptionDetails?
}
