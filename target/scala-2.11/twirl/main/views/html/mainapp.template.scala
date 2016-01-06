
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object mainapp_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class mainapp extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.Configuration,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(config: models.Configuration):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!doctype html>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/styles/main.css")),format.raw/*10.104*/("""">
</head>
<body ng-app="wormClientApp">

<div class="container" ng-controller="MainCtrl">

</div>

<script>
       !function(A,n,g,u,l,a,r)"""),format.raw/*19.32*/("""{"""),format.raw/*19.33*/("""A.GoogleAnalyticsObject=l,A[l]=A[l]||function()"""),format.raw/*19.80*/("""{"""),format.raw/*19.81*/("""
       """),format.raw/*20.8*/("""(A[l].q=A[l].q||[]).push(arguments)"""),format.raw/*20.43*/("""}"""),format.raw/*20.44*/(""",A[l].l=+new Date,a=n.createElement(g),
       r=n.getElementsByTagName(g)[0],a.src=u,r.parentNode.insertBefore(a,r)
       """),format.raw/*22.8*/("""}"""),format.raw/*22.9*/("""(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

       ga('create', """"),_display_(/*24.23*/config/*24.29*/.googleAnalyticsKey),format.raw/*24.48*/("""");
       ga('send', 'pageview');
</script>

<script>
    var CharacterOrganizer = CharacterOrganizer || """),format.raw/*29.52*/("""{"""),format.raw/*29.53*/("""}"""),format.raw/*29.54*/(""";
    CharacterOrganizer.baseUrl = """"),_display_(/*30.36*/config/*30.42*/.baseUrl),format.raw/*30.50*/(""""
</script>

<script src=""""),_display_(/*33.15*/routes/*33.21*/.Assets.versioned("javascripts/js/angularlib.min.js")),format.raw/*33.74*/(""""></script>
<script src=""""),_display_(/*34.15*/routes/*34.21*/.Assets.versioned("javascripts/js/wormjs.min.js")),format.raw/*34.70*/(""""></script>

</body>
</html>
"""))
      }
    }
  }

  def render(config:models.Configuration): play.twirl.api.HtmlFormat.Appendable = apply(config)

  def f:((models.Configuration) => play.twirl.api.HtmlFormat.Appendable) = (config) => apply(config)

  def ref: this.type = this

}


}

/**/
object mainapp extends mainapp_Scope0.mainapp
              /*
                  -- GENERATED --
                  DATE: Tue Jan 05 17:39:14 PST 2016
                  SOURCE: /Users/conicoll/gitrepo/worm/play-worm-app/app/views/mainapp.scala.html
                  HASH: 21264128540839cbbb2e0b0674a4af15a2f4c078
                  MATRIX: 763->1|888->31|916->33|1166->256|1181->262|1251->310|1419->450|1448->451|1523->498|1552->499|1587->507|1650->542|1679->543|1830->667|1858->668|1989->772|2004->778|2044->797|2178->903|2207->904|2236->905|2300->942|2315->948|2344->956|2398->983|2413->989|2487->1042|2540->1068|2555->1074|2625->1123
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|50->19|50->19|50->19|50->19|51->20|51->20|51->20|53->22|53->22|55->24|55->24|55->24|60->29|60->29|60->29|61->30|61->30|61->30|64->33|64->33|64->33|65->34|65->34|65->34
                  -- GENERATED --
              */
          