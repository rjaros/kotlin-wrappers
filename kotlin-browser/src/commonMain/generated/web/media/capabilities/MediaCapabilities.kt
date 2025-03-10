// Automatically generated - do not modify!

package web.media.capabilities

import js.promise.Promise
import seskar.js.JsAsync

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities)
 */
external class MediaCapabilities
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/decodingInfo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun decodingInfo(configuration: MediaDecodingConfiguration): MediaCapabilitiesDecodingInfo

    @JsName("decodingInfo")
    fun decodingInfoAsync(configuration: MediaDecodingConfiguration): Promise<MediaCapabilitiesDecodingInfo>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaCapabilities/encodingInfo)
     */
    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun encodingInfo(configuration: MediaEncodingConfiguration): MediaCapabilitiesEncodingInfo

    @JsName("encodingInfo")
    fun encodingInfoAsync(configuration: MediaEncodingConfiguration): Promise<MediaCapabilitiesEncodingInfo>
}
