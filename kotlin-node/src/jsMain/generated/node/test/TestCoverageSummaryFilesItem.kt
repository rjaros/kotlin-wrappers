// Generated by Karakum - do not modify it manually!

package node.test

sealed external interface TestCoverageSummaryFilesItem {
    /**
     * The absolute path of the file.
     */
    var path: String

    /**
     * The total number of lines.
     */
    var totalLineCount: Double

    /**
     * The total number of branches.
     */
    var totalBranchCount: Double

    /**
     * The total number of functions.
     */
    var totalFunctionCount: Double

    /**
     * The number of covered lines.
     */
    var coveredLineCount: Double

    /**
     * The number of covered branches.
     */
    var coveredBranchCount: Double

    /**
     * The number of covered functions.
     */
    var coveredFunctionCount: Double

    /**
     * The percentage of lines covered.
     */
    var coveredLinePercent: Double

    /**
     * The percentage of branches covered.
     */
    var coveredBranchPercent: Double

    /**
     * The percentage of functions covered.
     */
    var coveredFunctionPercent: Double

    /**
     * An array of functions representing function coverage.
     */
    var functions: Array<TestCoverageSummaryFilesItemFunctionsItem>

    /**
     * An array of lines representing line numbers and the number of times they were covered.
     */
    var lines: Array<TestCoverageSummaryFilesItemLinesItem>
}
