def call() {
    def checker = new org.p9.OwaspDependencyCheck(this)
    checker.runOwaspDependencyCheck()
    checker.archiveReports()
}
