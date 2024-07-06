// Generated by Karakum - do not modify it manually!

@file:JsModule("node:trace_events")

package node.traceEvents

/**
 * The `node:trace_events` module provides a mechanism to centralize tracing information
 * generated by V8, Node.js core, and userspace code.
 *
 * Tracing can be enabled with the `--trace-event-categories` command-line flag
 * or by using the `trace_events` module. The `--trace-event-categories` flag
 * accepts a list of comma-separated category names.
 *
 * The available categories are:
 *
 * * `node`: An empty placeholder.
 * * `node.async_hooks`: Enables capture of detailed [`async_hooks`](https://nodejs.org/docs/latest-v20.x/api/async_hooks.html) trace data.
 * The [`async_hooks`](https://nodejs.org/docs/latest-v20.x/api/async_hooks.html) events have a unique `asyncId` and a special `triggerId` `triggerAsyncId` property.
 * * `node.bootstrap`: Enables capture of Node.js bootstrap milestones.
 * * `node.console`: Enables capture of `console.time()` and `console.count()` output.
 * * `node.threadpoolwork.sync`: Enables capture of trace data for threadpool synchronous operations, such as `blob`, `zlib`, `crypto` and `node_api`.
 * * `node.threadpoolwork.async`: Enables capture of trace data for threadpool asynchronous operations, such as `blob`, `zlib`, `crypto` and `node_api`.
 * * `node.dns.native`: Enables capture of trace data for DNS queries.
 * * `node.net.native`: Enables capture of trace data for network.
 * * `node.environment`: Enables capture of Node.js Environment milestones.
 * * `node.fs.sync`: Enables capture of trace data for file system sync methods.
 * * `node.fs_dir.sync`: Enables capture of trace data for file system sync directory methods.
 * * `node.fs.async`: Enables capture of trace data for file system async methods.
 * * `node.fs_dir.async`: Enables capture of trace data for file system async directory methods.
 * * `node.perf`: Enables capture of [Performance API](https://nodejs.org/docs/latest-v20.x/api/perf_hooks.html) measurements.
 *    * `node.perf.usertiming`: Enables capture of only Performance API User Timing
 *    measures and marks.
 *    * `node.perf.timerify`: Enables capture of only Performance API timerify
 *    measurements.
 * * `node.promises.rejections`: Enables capture of trace data tracking the number
 * of unhandled Promise rejections and handled-after-rejections.
 * * `node.vm.script`: Enables capture of trace data for the `node:vm` module's `runInNewContext()`, `runInContext()`, and `runInThisContext()` methods.
 * * `v8`: The [V8](https://nodejs.org/docs/latest-v20.x/api/v8.html) events are GC, compiling, and execution related.
 * * `node.http`: Enables capture of trace data for http request / response.
 *
 * By default the `node`, `node.async_hooks`, and `v8` categories are enabled.
 *
 * ```bash
 * node --trace-event-categories v8,node,node.async_hooks server.js
 * ```
 *
 * Prior versions of Node.js required the use of the `--trace-events-enabled` flag to enable trace events. This requirement has been removed. However, the `--trace-events-enabled` flag _may_ still be
 * used and will enable the `node`, `node.async_hooks`, and `v8` trace event categories by default.
 *
 * ```bash
 * node --trace-events-enabled
 *
 * # is equivalent to
 *
 * node --trace-event-categories v8,node,node.async_hooks
 * ```
 *
 * Alternatively, trace events may be enabled using the `node:trace_events` module:
 *
 * ```js
 * const trace_events = require('node:trace_events');
 * const tracing = trace_events.createTracing({ categories: ['node.perf'] });
 * tracing.enable();  // Enable trace event capture for the 'node.perf' category
 *
 * // do work
 *
 * tracing.disable();  // Disable trace event capture for the 'node.perf' category
 * ```
 *
 * Running Node.js with tracing enabled will produce log files that can be opened
 * in the [`chrome://tracing`](https://www.chromium.org/developers/how-tos/trace-event-profiling-tool) tab of Chrome.
 *
 * The logging file is by default called `node_trace.${rotation}.log`, where `${rotation}` is an incrementing log-rotation id. The filepath pattern can
 * be specified with `--trace-event-file-pattern` that accepts a template
 * string that supports `${rotation}` and `${pid}`:
 *
 * ```bash
 * node --trace-event-categories v8 --trace-event-file-pattern '${pid}-${rotation}.log' server.js
 * ```
 *
 * To guarantee that the log file is properly generated after signal events like `SIGINT`, `SIGTERM`, or `SIGBREAK`, make sure to have the appropriate handlers
 * in your code, such as:
 *
 * ```js
 * process.on('SIGINT', function onSigint() {
 *   console.info('Received SIGINT.');
 *   process.exit(130);  // Or applicable exit code depending on OS and signal
 * });
 * ```
 *
 * The tracing system uses the same time source
 * as the one used by `process.hrtime()`.
 * However the trace-event timestamps are expressed in microseconds,
 * unlike `process.hrtime()` which returns nanoseconds.
 *
 * The features from this module are not available in [`Worker`](https://nodejs.org/docs/latest-v20.x/api/worker_threads.html#class-worker) threads.
 * @experimental
 * @see [source](https://github.com/nodejs/node/blob/v20.13.1/lib/trace_events.js)
 */


/* export * from "trace_events"; */
