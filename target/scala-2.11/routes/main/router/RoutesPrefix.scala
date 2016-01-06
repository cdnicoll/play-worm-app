
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/conicoll/gitrepo/worm/play-worm-app/conf/routes
// @DATE:Tue Jan 05 19:15:40 PST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
