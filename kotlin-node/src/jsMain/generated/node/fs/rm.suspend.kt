// Generated by Karakum - do not modify it manually!

package node.fs


import js.core.Void

suspend fun rm(path: PathLike, options: RmOptions = undefined.unsafeCast<Nothing>()): Void =
    rmAsync(
        path, options
    ).await()
