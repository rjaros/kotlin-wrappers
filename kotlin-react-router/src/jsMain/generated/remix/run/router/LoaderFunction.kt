// Generated by Karakum - do not modify it manually!

package remix.run.router

/**
 * Route loader function signature
 */
sealed external interface LoaderFunction<Context /* default is Any? */> : LoaderLike {
    @seskar.js.JsNativeInvoke
    operator fun invoke(
        args: LoaderFunctionArgs<Context>,
        handlerCtx: Any? = definedExternally,
    ): DataFunctionReturnValue

    var hydrate: Boolean?
}
