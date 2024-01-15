// Generated by Karakum - do not modify it manually!


package node.inspector.profiler


/**
 * Profile.
 */

sealed external interface Profile {
    /**
     * The list of profile nodes. First item is the root node.
     */
    var nodes: js.array.ReadonlyArray<ProfileNode>

    /**
     * Profiling start timestamp in microseconds.
     */
    var startTime: Double

    /**
     * Profiling end timestamp in microseconds.
     */
    var endTime: Double

    /**
     * Ids of samples top nodes.
     */
    var samples: js.array.ReadonlyArray<Double>?

    /**
     * Time intervals between adjacent samples in microseconds. The first delta is relative to the profile startTime.
     */
    var timeDeltas: js.array.ReadonlyArray<Double>?
}
