package remix.run.router


sealed external interface AgnosticDataIndexRouteObject : AgnosticIndexRouteObject {
    override var id: String?
}
