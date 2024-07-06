// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("suite")

package node.test.suite

import js.promise.Promise
import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for marking a suite as `TODO`. This is the same as [`suite([name], { todo: true }[, fn])`](https://nodejs.org/docs/latest-v20.x/api/test.html#suitename-options-fn).
 * @since v20.13.0
 */

@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<Unit>


@JsName("todo")
external fun todoAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("todo")
external fun todoAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("todo")
external fun todoAsync(fn: SuiteFn = definedExternally): Promise<Unit>

@JsName("todo")
external fun todoAsync(): Promise<Unit>
