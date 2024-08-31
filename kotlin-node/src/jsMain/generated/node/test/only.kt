// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.core.Void
import js.promise.Promise

/**
 * Shorthand for marking a test as `only`, same as `test([name], { only: true }[, fn])`.
 * @since v20.2.0
 */

@JsName("only")
external fun onlyAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Void>


@JsName("only")
external fun onlyAsync(name: String = definedExternally, fn: TestFn = definedExternally): Promise<Void>


@JsName("only")
external fun onlyAsync(options: TestOptions = definedExternally, fn: TestFn = definedExternally): Promise<Void>


@JsName("only")
external fun onlyAsync(fn: TestFn = definedExternally): Promise<Void>

@JsName("only")
external fun onlyAsync(): Promise<Void>
