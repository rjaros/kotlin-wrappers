// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("describe")

package node.test.describe

import js.core.Void
import js.promise.Promise
import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for skipping a suite. This is the same as [`describe([name], { skip: true }[, fn])`](https://nodejs.org/docs/latest-v20.x/api/test.html#describename-options-fn).
 * @since v18.15.0
 */

@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<Void>


@JsName("skip")
external fun skipAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<Void>


@JsName("skip")
external fun skipAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<Void>


@JsName("skip")
external fun skipAsync(fn: SuiteFn = definedExternally): Promise<Void>

@JsName("skip")
external fun skipAsync(): Promise<Void>
