
package views.html.worm

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
    <link rel="stylesheet" media="screen" href=""""),_display_(/*10.50*/routes/*10.56*/.Assets.versioned("stylesheets/styles/vendor.css")),format.raw/*10.106*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*11.50*/routes/*11.56*/.Assets.versioned("stylesheets/styles/main.css")),format.raw/*11.104*/("""">
</head>
<body ng-app="wormClientApp">

<div class="container" ng-controller="MainCtrl">

    <ul ng-repeat="hero in heroes">
        <li>"""),format.raw/*18.13*/("""{"""),format.raw/*18.14*/("""{"""),format.raw/*18.15*/("""hero.heroName"""),format.raw/*18.28*/("""}"""),format.raw/*18.29*/("""}"""),format.raw/*18.30*/("""</li>
        <li>"""),format.raw/*19.13*/("""{"""),format.raw/*19.14*/("""{"""),format.raw/*19.15*/("""hero.description"""),format.raw/*19.31*/("""}"""),format.raw/*19.32*/("""}"""),format.raw/*19.33*/("""</li>
    </ul>

</div>

<script>
       !function(A,n,g,u,l,a,r)"""),format.raw/*25.32*/("""{"""),format.raw/*25.33*/("""A.GoogleAnalyticsObject=l,A[l]=A[l]||function()"""),format.raw/*25.80*/("""{"""),format.raw/*25.81*/("""
       """),format.raw/*26.8*/("""(A[l].q=A[l].q||[]).push(arguments)"""),format.raw/*26.43*/("""}"""),format.raw/*26.44*/(""",A[l].l=+new Date,a=n.createElement(g),
       r=n.getElementsByTagName(g)[0],a.src=u,r.parentNode.insertBefore(a,r)
       """),format.raw/*28.8*/("""}"""),format.raw/*28.9*/("""(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

       ga('create', """"),_display_(/*30.23*/config/*30.29*/.googleAnalyticsKey),format.raw/*30.48*/("""");
       ga('send', 'pageview');
</script>

<script>
    var CharacterOrganizer = CharacterOrganizer || """),format.raw/*35.52*/("""{"""),format.raw/*35.53*/("""}"""),format.raw/*35.54*/(""";
    CharacterOrganizer.baseUrl = """"),_display_(/*36.36*/config/*36.42*/.baseUrl),format.raw/*36.50*/(""""
</script>

<script src=""""),_display_(/*39.15*/routes/*39.21*/.Assets.versioned("javascripts/js/angularlib.min.js")),format.raw/*39.74*/(""""></script>
<script src=""""),_display_(/*40.15*/routes/*40.21*/.Assets.versioned("javascripts/js/wormjs.min.js")),format.raw/*40.70*/(""""></script>

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
                  DATE: Tue Jan 05 18:50:10 PST 2016
                  SOURCE: /Users/conicoll/gitrepo/worm/play-worm-app/app/views/worm/mainapp.scala.html
                  HASH: 94029860e187498897ff8bc8c6dd72b25a8312d9
                  MATRIX: 768->1|893->31|921->33|1171->256|1186->262|1258->312|1337->364|1352->370|1422->418|1590->558|1619->559|1648->560|1689->573|1718->574|1747->575|1793->593|1822->594|1851->595|1895->611|1924->612|1953->613|2046->678|2075->679|2150->726|2179->727|2214->735|2277->770|2306->771|2457->895|2485->896|2616->1000|2631->1006|2671->1025|2805->1131|2834->1132|2863->1133|2927->1170|2942->1176|2971->1184|3025->1211|3040->1217|3114->1270|3167->1296|3182->1302|3252->1351
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|42->11|42->11|42->11|49->18|49->18|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|50->19|50->19|56->25|56->25|56->25|56->25|57->26|57->26|57->26|59->28|59->28|61->30|61->30|61->30|66->35|66->35|66->35|67->36|67->36|67->36|70->39|70->39|70->39|71->40|71->40|71->40
                  -- GENERATED --
              */
          