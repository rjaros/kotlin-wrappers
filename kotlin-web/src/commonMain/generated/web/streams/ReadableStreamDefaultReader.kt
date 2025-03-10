// Automatically generated - do not modify!

package web.streams

import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader)
 */
open external class ReadableStreamDefaultReader<R>(
    stream: ReadableStream<R>,
) : ReadableStreamGenericReader {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/read)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun read(): ReadableStreamReadResult<R>

    @JsName("read")
    fun readAsync(): Promise<ReadableStreamReadResult<R>>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/ReadableStreamDefaultReader/releaseLock)
     */
    fun releaseLock()
}
