// Generated by Karakum - do not modify it manually!


package node.inspector.runtime


sealed external interface EvaluateParameterType {
    /**
     * Expression to evaluate.
     */
    var expression: String

    /**
     * Symbolic group name that can be used to release multiple objects.
     */
    var objectGroup: String?

    /**
     * Determines whether Command Line API should be available during the evaluation.
     */
    var includeCommandLineAPI: Boolean?

    /**
     * In silent mode exceptions thrown during evaluation are not reported and do not pause execution. Overrides <code>setPauseOnException</code> state.
     */
    var silent: Boolean?

    /**
     * Specifies in which execution context to perform evaluation. If the parameter is omitted the evaluation will be performed in the context of the inspected page.
     */
    var contextId: ExecutionContextId?

    /**
     * Whether the result is expected to be a JSON object that should be sent by value.
     */
    var returnByValue: Boolean?

    /**
     * Whether preview should be generated for the result.
     * @experimental
     */
    var generatePreview: Boolean?

    /**
     * Whether execution should be treated as initiated by user in the UI.
     */
    var userGesture: Boolean?

    /**
     * Whether execution should <code>await</code> for resulting value and return once awaited promise is resolved.
     */
    var awaitPromise: Boolean?
}
