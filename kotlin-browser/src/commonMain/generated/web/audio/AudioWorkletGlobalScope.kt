// Automatically generated - do not modify!

package web.audio

import js.core.Int53
import web.worklets.WorkletGlobalScope

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope)
 */
external class AudioWorkletGlobalScope
private constructor() :
    WorkletGlobalScope {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentFrame)
     */
    val currentFrame: Int53

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/currentTime)
     */
    val currentTime: Double

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/sampleRate)
     */
    val sampleRate: Float

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioWorkletGlobalScope/registerProcessor)
     */
    fun registerProcessor(
        name: String,
        processorCtor: AudioWorkletProcessorConstructor,
    )
}
