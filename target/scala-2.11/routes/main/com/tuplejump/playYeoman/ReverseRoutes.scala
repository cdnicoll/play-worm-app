
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/conicoll/gitrepo/worm/play-worm-app/conf/routes
// @DATE:Tue Jan 05 19:15:40 PST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:22
package com.tuplejump.playYeoman {

  // @LINE:22
  class ReverseYeoman(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:22
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "ui")
    }
  
  }


}