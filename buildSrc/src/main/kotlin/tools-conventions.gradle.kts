import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension
import org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin
import org.jetbrains.kotlin.gradle.targets.js.npm.LockFileMismatchReport
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmExtension

plugins.withType<NodeJsRootPlugin> {
    the<NodeJsRootExtension>().apply {
        version = "22.12.0" // https://nodejs.org/en/download/package-manager

        versions.apply {
            webpack.version = "5.97.1" // https://www.npmjs.com/package/webpack
            webpackCli.version = "5.1.4" // https://www.npmjs.com/package/webpack-cli
            karma.version = "6.4.4" // https://www.npmjs.com/package/karma
        }
    }

    the<NpmExtension>().apply {
        lockFileDirectory = projectDir
        packageLockMismatchReport = LockFileMismatchReport.NONE
        ignoreScripts = false
    }
}
