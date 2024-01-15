// Generated by Karakum - do not modify it manually!


package node.inspector.profiler


/**
 * Source offset and types for a parameter or return value.
 * @experimental
 */

sealed external interface TypeProfileEntry {
    /**
     * Source offset of the parameter or end of function for return values.
     */
    var offset: Double

    /**
     * The types for this parameter or return value.
     */
    var types: js.array.ReadonlyArray<TypeObject>
}
