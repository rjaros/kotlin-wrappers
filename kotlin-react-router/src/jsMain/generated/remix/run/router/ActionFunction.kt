// Generated by Karakum - do not modify it manually!

package remix.run.router

/**
 * Route action function signature
 */
sealed external interface ActionFunction<Context /* default is Any? */> : ActionLike {
    @seskar.js.JsNativeInvoke
    operator fun invoke(
        args: ActionFunctionArgs<Context>,
        handlerCtx: Any? = definedExternally,
    ): DataFunctionReturnValue
}
