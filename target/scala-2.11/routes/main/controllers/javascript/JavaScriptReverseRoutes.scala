
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/conicoll/gitrepo/worm/play-worm-app/conf/routes
// @DATE:Tue Jan 05 17:38:42 PST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:18
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseCharacters(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def getCharacter: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Characters.getCharacter",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/character/" + (""" + implicitly[PathBindable[Int]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:13
    def getCharacters: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Characters.getCharacters",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "client/characters"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "main"})
        }
      """
    )
  
  }


}