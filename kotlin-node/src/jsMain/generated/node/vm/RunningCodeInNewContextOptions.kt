// Generated by Karakum - do not modify it manually!


package node.vm


sealed external interface RunningCodeInNewContextOptions : RunningScriptInNewContextOptions {
    var cachedData: Any? /* ArrayBufferView | Buffer | undefined */
    var importModuleDynamically: ((specifier: String, script: Script, importAssertions: Any) -> Module)?
}
