// Generated by Karakum - do not modify it manually!

package node.crypto

@Suppress("INTERFACE_WITH_SUPERCLASS")
sealed external interface DecipherChaCha20Poly1305 : Decipher {
    fun setAuthTag(buffer: js.buffer.ArrayBufferView<*>): Unit /* this */
    fun setAAD(buffer: js.buffer.ArrayBufferView<*>, options: DecipherChaCha20Poly1305SetAADOptions): Unit /* this */
}
