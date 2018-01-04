
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/playapps/WMDD1Lab10OneToMany/conf/routes
// @DATE:Sun Dec 17 10:16:14 GMT 2017


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
