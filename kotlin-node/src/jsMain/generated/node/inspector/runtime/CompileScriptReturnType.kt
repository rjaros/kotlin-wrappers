// Generated by Karakum - do not modify it manually!


package node.inspector.runtime


sealed external interface CompileScriptReturnType {
    /**
     * Id of the script.
     */
    var scriptId: ScriptId?

    /**
     * Exception details.
     */
    var exceptionDetails: ExceptionDetails?
}
