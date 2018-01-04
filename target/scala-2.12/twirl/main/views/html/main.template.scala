
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/(""" 

"""),format.raw/*3.1*/("""<!DOCTYPE html> 
<html lang="en"> 

<head> 
  <meta charset="utf-8"> 
  <title>Online Shop - """),_display_(/*8.25*/title),format.raw/*8.30*/("""</title> 
  <!-- Bootstrap Core CSS --> 
  <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.css" rel="stylesheet" />   
  <!-- Custom CSS --> 
  <link href=""""),_display_(/*12.16*/routes/*12.22*/.Assets.versioned("stylesheets/main.css")),format.raw/*12.63*/("""" rel="stylesheet" /> 
  <link href=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("stylesheets/numeric.css")),format.raw/*13.66*/("""" rel="stylesheet" /> 
</head> 

<body> 
  <nav class="navbar navbar-inverse"> 
      <div class="container-fluid"> 
          <div class="navbar-header"> 
          <a class="navbar-brand" href="#">Online Shop</a> 
          </div> 

          <ul class="nav navbar-nav"> 
            <li """),_display_(/*24.18*/if(title == "Products Page")/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""class="active"""")))}),format.raw/*24.62*/("""><a href=""""),_display_(/*24.73*/routes/*24.79*/.HomeController.index()),format.raw/*24.102*/("""">Home</a></li>
            <li """),_display_(/*25.18*/if(title == "Customer page")/*25.46*/{_display_(Seq[Any](format.raw/*25.47*/("""class="active"""")))}),format.raw/*25.62*/("""><a href=""""),_display_(/*25.73*/routes/*25.79*/.HomeController.customers()),format.raw/*25.106*/("""">Customer</a></li>
            <li """),_display_(/*26.18*/if(title == "Services page")/*26.46*/{_display_(Seq[Any](format.raw/*26.47*/("""class="active"""")))}),format.raw/*26.62*/("""><a href=""""),_display_(/*26.73*/routes/*26.79*/.HomeController.index()),format.raw/*26.102*/("""">Services</a></li>
            <li """),_display_(/*27.18*/if(title == "Contact page")/*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""class="active"""")))}),format.raw/*27.61*/("""><a href=""""),_display_(/*27.72*/routes/*27.78*/.HomeController.index()),format.raw/*27.101*/("""">Contact</a></li>
            <li """),_display_(/*28.18*/if(title == "About Us")/*28.41*/{_display_(Seq[Any](format.raw/*28.42*/("""class="active"""")))}),format.raw/*28.57*/("""><a href=""""),_display_(/*28.68*/routes/*28.74*/.HomeController.index()),format.raw/*28.97*/("""">About</a></li>
          </ul> 
      </div> 
  </nav>     
  <container> 
      <row> 
          <div class="col-md-12">             
              """),_display_(/*35.16*/content),format.raw/*35.23*/(""" 
          """),format.raw/*36.11*/("""</div> 
      </row> 
  </container> 
  <container> 
      <row> 
          <div class="col-md-12">             
              Copyright <strong>Online Shop</strong> 
          </div> 
      </row> 
  </container> 
  <script src=""""),_display_(/*46.17*/routes/*46.23*/.Assets.versioned("javascripts/main.js")),format.raw/*46.63*/(""""></script>
</body> 
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:40:15 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab10OneToMany/app/views/main.scala.html
                  HASH: d0b201d88aa867aabebbb069627c43e6c90f889f
                  MATRIX: 952->1|1077->31|1106->34|1226->128|1251->133|1461->316|1476->322|1538->363|1603->401|1618->407|1683->451|2001->742|2038->770|2077->771|2123->786|2161->797|2176->803|2221->826|2281->859|2318->887|2357->888|2403->903|2441->914|2456->920|2505->947|2569->984|2606->1012|2645->1013|2691->1028|2729->1039|2744->1045|2789->1068|2853->1105|2889->1132|2928->1133|2974->1148|3012->1159|3027->1165|3072->1188|3135->1224|3167->1247|3206->1248|3252->1263|3290->1274|3305->1280|3349->1303|3528->1455|3556->1462|3596->1474|3854->1705|3869->1711|3930->1751
                  LINES: 28->1|33->1|35->3|40->8|40->8|44->12|44->12|44->12|45->13|45->13|45->13|56->24|56->24|56->24|56->24|56->24|56->24|56->24|57->25|57->25|57->25|57->25|57->25|57->25|57->25|58->26|58->26|58->26|58->26|58->26|58->26|58->26|59->27|59->27|59->27|59->27|59->27|59->27|59->27|60->28|60->28|60->28|60->28|60->28|60->28|60->28|67->35|67->35|68->36|78->46|78->46|78->46
                  -- GENERATED --
              */
          