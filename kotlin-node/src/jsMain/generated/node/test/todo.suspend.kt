// Generated by Karakum - do not modify it manually!

package node.test


@seskar.js.JsAsync
external suspend fun todo(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.core.Void


@seskar.js.JsAsync
external suspend fun todo(name: String = definedExternally, fn: TestFn = definedExternally): js.core.Void


@seskar.js.JsAsync
external suspend fun todo(options: TestOptions = definedExternally, fn: TestFn = definedExternally): js.core.Void


@seskar.js.JsAsync
external suspend fun todo(fn: TestFn = definedExternally): js.core.Void


suspend fun todo(): js.core.Void =
    todoAsync(

    ).await()
