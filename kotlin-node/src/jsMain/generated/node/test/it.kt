// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * Alias for `test()`.
 *
 * The `it()` function is imported from the `node:test` module.
 * @since v18.6.0, v16.17.0
 */

@JsName("it")
external fun itAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Unit>


@JsName("it")
external fun itAsync(name: String = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("it")
external fun itAsync(options: TestOptions = definedExternally, fn: TestFn = definedExternally): Promise<Unit>


@JsName("it")
external fun itAsync(fn: TestFn = definedExternally): Promise<Unit>

@JsName("it")
external fun itAsync(): Promise<Unit>
