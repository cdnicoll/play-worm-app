
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

    <div class="hero-container" ng-repeat="hero in heroes">
        <ul>
            <li>Hero Name: """),format.raw/*19.28*/("""{"""),format.raw/*19.29*/("""{"""),format.raw/*19.30*/("""hero.heroName"""),format.raw/*19.43*/("""}"""),format.raw/*19.44*/("""}"""),format.raw/*19.45*/("""</li>
            <li>Sreet Name: """),format.raw/*20.29*/("""{"""),format.raw/*20.30*/("""{"""),format.raw/*20.31*/("""hero.streetName"""),format.raw/*20.46*/("""}"""),format.raw/*20.47*/("""}"""),format.raw/*20.48*/("""</li>
        </ul>
        <p>Faction: """),format.raw/*22.21*/("""{"""),format.raw/*22.22*/("""{"""),format.raw/*22.23*/("""hero.factionId"""),format.raw/*22.37*/("""}"""),format.raw/*22.38*/("""}"""),format.raw/*22.39*/("""</p>
        <p>Description: """),format.raw/*23.25*/("""{"""),format.raw/*23.26*/("""{"""),format.raw/*23.27*/("""hero.description"""),format.raw/*23.43*/("""}"""),format.raw/*23.44*/("""}"""),format.raw/*23.45*/("""</p>
    </div>

</div>

<script>
       !function(A,n,g,u,l,a,r)"""),format.raw/*29.32*/("""{"""),format.raw/*29.33*/("""A.GoogleAnalyticsObject=l,A[l]=A[l]||function()"""),format.raw/*29.80*/("""{"""),format.raw/*29.81*/("""
       """),format.raw/*30.8*/("""(A[l].q=A[l].q||[]).push(arguments)"""),format.raw/*30.43*/("""}"""),format.raw/*30.44*/(""",A[l].l=+new Date,a=n.createElement(g),
       r=n.getElementsByTagName(g)[0],a.src=u,r.parentNode.insertBefore(a,r)
       """),format.raw/*32.8*/("""}"""),format.raw/*32.9*/("""(window,document,'script','https://www.google-analytics.com/analytics.js','ga');

       ga('create', """"),_display_(/*34.23*/config/*34.29*/.googleAnalyticsKey),format.raw/*34.48*/("""");
       ga('send', 'pageview');
</script>

<script>
    var CharacterOrganizer = CharacterOrganizer || """),format.raw/*39.52*/("""{"""),format.raw/*39.53*/("""}"""),format.raw/*39.54*/(""";
    CharacterOrganizer.baseUrl = """"),_display_(/*40.36*/config/*40.42*/.baseUrl),format.raw/*40.50*/(""""
</script>

<script src=""""),_display_(/*43.15*/routes/*43.21*/.Assets.versioned("javascripts/js/angularlib.min.js")),format.raw/*43.74*/(""""></script>
<script src=""""),_display_(/*44.15*/routes/*44.21*/.Assets.versioned("javascripts/js/wormjs.min.js")),format.raw/*44.70*/(""""></script>

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
                  DATE: Tue Jan 05 19:40:00 PST 2016
                  SOURCE: /Users/conicoll/gitrepo/worm/play-worm-app/app/views/worm/mainapp.scala.html
                  HASH: 94d73da612522e98bd79c95228908671105fd895
                  MATRIX: 768->1|893->31|921->33|1171->256|1186->262|1258->312|1337->364|1352->370|1422->418|1642->610|1671->611|1700->612|1741->625|1770->626|1799->627|1861->661|1890->662|1919->663|1962->678|1991->679|2020->680|2088->720|2117->721|2146->722|2188->736|2217->737|2246->738|2303->767|2332->768|2361->769|2405->785|2434->786|2463->787|2556->852|2585->853|2660->900|2689->901|2724->909|2787->944|2816->945|2967->1069|2995->1070|3126->1174|3141->1180|3181->1199|3315->1305|3344->1306|3373->1307|3437->1344|3452->1350|3481->1358|3535->1385|3550->1391|3624->1444|3677->1470|3692->1476|3762->1525
                  LINES: 27->1|32->1|34->3|41->10|41->10|41->10|42->11|42->11|42->11|50->19|50->19|50->19|50->19|50->19|50->19|51->20|51->20|51->20|51->20|51->20|51->20|53->22|53->22|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|54->23|54->23|60->29|60->29|60->29|60->29|61->30|61->30|61->30|63->32|63->32|65->34|65->34|65->34|70->39|70->39|70->39|71->40|71->40|71->40|74->43|74->43|74->43|75->44|75->44|75->44
                  -- GENERATED --
              */
          