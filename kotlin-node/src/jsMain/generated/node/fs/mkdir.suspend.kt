// Generated by Karakum - do not modify it manually!

package node.fs


@seskar.js.JsAsync
external suspend fun mkdir(path: PathLike, options: MkdirRecursiveAsyncOptions): String?


@seskar.js.JsAsync
external suspend fun mkdir(path: PathLike): js.core.Void


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@seskar.js.JsAsync
external suspend fun mkdir(path: PathLike, options: Mode? = definedExternally): js.core.Void


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@seskar.js.JsAsync
external suspend fun mkdir(path: PathLike, options: (MkdirAsyncOptions)? = definedExternally): js.core.Void


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */


/**
 * Asynchronous mkdir(2) - create a directory.
 * @param path A path to a file. If a URL is provided, it must use the `file:` protocol.
 * @param options Either the file mode, or an object optionally specifying the file mode and whether parent folders
 * should be created. If a string is passed, it is parsed as an octal integer. If not specified, defaults to `0o777`.
 */

@seskar.js.JsAsync
external suspend fun mkdir(path: PathLike, options: MakeDirectoryOptions? = definedExternally): String?
