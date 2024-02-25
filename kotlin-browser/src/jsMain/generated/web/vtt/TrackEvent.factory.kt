// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package web.vtt

import web.events.EventTarget
import web.events.EventType

inline fun TrackEvent(
    type: EventType<TrackEvent<*>>,
): TrackEvent<*> =
    TrackEvent<EventTarget?>(
        type = type,
    )

inline fun TrackEvent(
    type: EventType<TrackEvent<*>>,
    init: TrackEventInit,
): TrackEvent<*> =
    TrackEvent<EventTarget?>(
        type = type,
        init = init,
    )
