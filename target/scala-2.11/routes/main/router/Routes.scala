
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/conicoll/gitrepo/worm/play-worm-app/conf/routes
// @DATE:Tue Jan 05 19:15:40 PST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:13
  Characters_3: controllers.Characters,
  // @LINE:18
  Assets_1: controllers.Assets,
  // @LINE:22
  Yeoman_0: com.tuplejump.playYeoman.Yeoman,
  // @LINE:23
  yeoman_Routes_0: yeoman.Routes,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:13
    Characters_3: controllers.Characters,
    // @LINE:18
    Assets_1: controllers.Assets,
    // @LINE:22
    Yeoman_0: com.tuplejump.playYeoman.Yeoman,
    // @LINE:23
    yeoman_Routes_0: yeoman.Routes
  ) = this(errorHandler, Application_2, Characters_3, Assets_1, Yeoman_0, yeoman_Routes_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Characters_3, Assets_1, Yeoman_0, yeoman_Routes_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.Application.main()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/characters""", """controllers.Characters.getCharacters"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """client/character/$id<[^/]+>""", """controllers.Characters.getCharacter(id:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """ui""", """com.tuplejump.playYeoman.Yeoman.index"""),
    prefixed_yeoman_Routes_0_6.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_main1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_Application_main1_invoker = createInvoker(
    Application_2.main(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "main",
      Nil,
      "GET",
      """Application Routing""",
      this.prefix + """main"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Characters_getCharacters2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/characters")))
  )
  private[this] lazy val controllers_Characters_getCharacters2_invoker = createInvoker(
    Characters_3.getCharacters,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Characters",
      "getCharacters",
      Nil,
      "GET",
      """ API Routes""",
      this.prefix + """client/characters"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Characters_getCharacter3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("client/character/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Characters_getCharacter3_invoker = createInvoker(
    Characters_3.getCharacter(fakeValue[Int]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Characters",
      "getCharacter",
      Seq(classOf[Int]),
      "GET",
      """""",
      this.prefix + """client/character/$id<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned4_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path
 @TODO: change the path to be ui folder""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:22
  private[this] lazy val com_tuplejump_playYeoman_Yeoman_index5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("ui")))
  )
  private[this] lazy val com_tuplejump_playYeoman_Yeoman_index5_invoker = createInvoker(
    Yeoman_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "com.tuplejump.playYeoman.Yeoman",
      "index",
      Nil,
      "GET",
      """ Yeoman routing""",
      this.prefix + """ui"""
    )
  )

  // @LINE:23
  private[this] val prefixed_yeoman_Routes_0_6 = Include(yeoman_Routes_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + "ui/"))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:10
    case controllers_Application_main1_route(params) =>
      call { 
        controllers_Application_main1_invoker.call(Application_2.main())
      }
  
    // @LINE:13
    case controllers_Characters_getCharacters2_route(params) =>
      call { 
        controllers_Characters_getCharacters2_invoker.call(Characters_3.getCharacters)
      }
  
    // @LINE:14
    case controllers_Characters_getCharacter3_route(params) =>
      call(params.fromPath[Int]("id", None)) { (id) =>
        controllers_Characters_getCharacter3_invoker.call(Characters_3.getCharacter(id))
      }
  
    // @LINE:18
    case controllers_Assets_versioned4_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned4_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:22
    case com_tuplejump_playYeoman_Yeoman_index5_route(params) =>
      call { 
        com_tuplejump_playYeoman_Yeoman_index5_invoker.call(Yeoman_0.index)
      }
  
    // @LINE:23
    case prefixed_yeoman_Routes_0_6(handler) => handler
  }
}