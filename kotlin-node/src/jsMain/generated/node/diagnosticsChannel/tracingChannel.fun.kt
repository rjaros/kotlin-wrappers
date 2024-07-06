// Generated by Karakum - do not modify it manually!

@file:JsModule("node:diagnostics_channel")

package node.diagnosticsChannel

/**
 * Creates a `TracingChannel` wrapper for the given `TracingChannel Channels`. If a name is given, the corresponding tracing
 * channels will be created in the form of `tracing:${name}:${eventType}` where `eventType` corresponds to the types of `TracingChannel Channels`.
 *
 * ```js
 * import diagnostics_channel from 'node:diagnostics_channel';
 *
 * const channelsByName = diagnostics_channel.tracingChannel('my-channel');
 *
 * // or...
 *
 * const channelsByCollection = diagnostics_channel.tracingChannel({
 *   start: diagnostics_channel.channel('tracing:my-channel:start'),
 *   end: diagnostics_channel.channel('tracing:my-channel:end'),
 *   asyncStart: diagnostics_channel.channel('tracing:my-channel:asyncStart'),
 *   asyncEnd: diagnostics_channel.channel('tracing:my-channel:asyncEnd'),
 *   error: diagnostics_channel.channel('tracing:my-channel:error'),
 * });
 * ```
 * @since v19.9.0
 * @experimental
 * @param nameOrChannels Channel name or object containing all the `TracingChannel Channels`
 * @return Collection of channels to trace with
 */
external fun <StoreType /* default is Any? */, ContextType : Any /* default is Any /* StoreType extends object ? StoreType : object */ */> tracingChannel(
    nameOrChannels: String,
): TracingChannel<StoreType, ContextType>

/**
 * Creates a `TracingChannel` wrapper for the given `TracingChannel Channels`. If a name is given, the corresponding tracing
 * channels will be created in the form of `tracing:${name}:${eventType}` where `eventType` corresponds to the types of `TracingChannel Channels`.
 *
 * ```js
 * import diagnostics_channel from 'node:diagnostics_channel';
 *
 * const channelsByName = diagnostics_channel.tracingChannel('my-channel');
 *
 * // or...
 *
 * const channelsByCollection = diagnostics_channel.tracingChannel({
 *   start: diagnostics_channel.channel('tracing:my-channel:start'),
 *   end: diagnostics_channel.channel('tracing:my-channel:end'),
 *   asyncStart: diagnostics_channel.channel('tracing:my-channel:asyncStart'),
 *   asyncEnd: diagnostics_channel.channel('tracing:my-channel:asyncEnd'),
 *   error: diagnostics_channel.channel('tracing:my-channel:error'),
 * });
 * ```
 * @since v19.9.0
 * @experimental
 * @param nameOrChannels Channel name or object containing all the `TracingChannel Channels`
 * @return Collection of channels to trace with
 */
external fun <StoreType /* default is Any? */, ContextType : Any /* default is Any /* StoreType extends object ? StoreType : object */ */> tracingChannel(
    nameOrChannels: TracingChannelCollection<StoreType, ContextType>,
): TracingChannel<StoreType, ContextType>
