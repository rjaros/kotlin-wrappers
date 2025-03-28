@file:Suppress(
    "WRONG_BODY_OF_EXTERNAL_DECLARATION",
    "INLINE_EXTERNAL_DECLARATION",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "DECLARATION_CANT_BE_INLINED",
)

package react

import js.array.ReadonlyArray
import js.reflect.unsafeCast
import seskar.js.JsAlias
import kotlin.reflect.KProperty

/**
 * Only works inside [fc]
 * @see <a href="https://reactjs.org/docs/hooks-state.html#hooks-and-function-components">Hooks and Function Components</a>
 */
sealed external interface StateInstance<T> {
    @JsAlias("[0]")
    operator fun component1(): T

    @JsAlias("[1]")
    operator fun component2(): StateSetter<T>

    @JsAlias("[0]")
    operator fun getValue(
        thisRef: Nothing?,
        property: KProperty<*>,
    ): T

    inline operator fun setValue(
        thisRef: Nothing?,
        property: KProperty<*>,
        value: T,
    ) {
        unsafeCast<ReadonlyArray<StateSetter<T>>>(this)[1](value)
    }
}

inline fun <T> StateInstance(
    value: T,
    setter: StateSetter<T>,
): StateInstance<T> =
    unsafeCast(arrayOf(value, setter))
