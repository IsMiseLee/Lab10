
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

object customers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customers: List[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/("""


"""),_display_(/*4.2*/main("Customer page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product list</p> 

  """),format.raw/*7.68*/("""
  """),_display_(/*8.4*/if(flash.containsKey("success"))/*8.36*/{_display_(Seq[Any](format.raw/*8.37*/("""
      """),format.raw/*9.7*/("""<div class="alert alert-success">
          """),_display_(/*10.12*/flash/*10.17*/.get("success")),format.raw/*10.32*/("""
      """),format.raw/*11.7*/("""</div>
  """)))}),format.raw/*12.4*/("""
  """),format.raw/*13.3*/("""<table class="table table-bordered table-hover table-condensed"> 
      <thead> 
      <!-- The header row--> 
      <tr> 
          <th>ID</th> 
          <th>First Name</th> 
          <th>Last Name</th> 
          <th>Address</th> 
           
      </tr> 
      </thead> 
      <tbody> 
          <!-- Product row(s) --> 
          """),format.raw/*26.62*/("""
        """),_display_(/*27.10*/for(p<-customers) yield /*27.27*/{_display_(Seq[Any](format.raw/*27.28*/("""
            """),format.raw/*28.13*/("""<tr> 
                <td>"""),_display_(/*29.22*/p/*29.23*/.getId),format.raw/*29.29*/("""</td> 
                <td>"""),_display_(/*30.22*/p/*30.23*/.getFName),format.raw/*30.32*/("""</td> 
                <td>"""),_display_(/*31.22*/p/*31.23*/.getLName),format.raw/*31.32*/("""</td> 
                <td>"""),_display_(/*32.22*/p/*32.23*/.getAddress),format.raw/*32.34*/("""</td> 
                <!-- Edit customer button -->
                <td>
                    <a href=""""),_display_(/*35.31*/routes/*35.37*/.HomeController.updateCustomer(p.getId)),format.raw/*35.76*/("""" class="btn-xs btn-danger">
                        <span class="glyphicon glyphicon-pencil"></span>
                    </a>
                </td>
                <td>
                    <a href=""""),_display_(/*40.31*/routes/*40.37*/.HomeController.deleteCustomer(p.getId)),format.raw/*40.76*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                        <span class="glyphicon glyphicon-trash"></span>
                    </a>
                </td> 
            </tr> 
        """)))}),format.raw/*45.10*/("""
      """),format.raw/*46.7*/("""</tbody> 
  </table> 

  <p>
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.HomeController.addCustomer()),format.raw/*50.54*/("""">
            <button class="btn btn-primary">Add a customer</button>
        </a>
  </p>
  """)))}))
      }
    }
  }

  def render(customers:List[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customers)

  def f:((List[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customers) => apply(customers)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:40:14 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab10OneToMany/app/views/customers.scala.html
                  HASH: d44281357e680cda14f4e15bfa7b6867d570da3a
                  MATRIX: 967->1|1096->35|1125->39|1154->60|1193->62|1223->66|1287->168|1316->172|1356->204|1394->205|1427->212|1499->257|1513->262|1549->277|1583->284|1623->294|1653->297|2017->684|2054->694|2087->711|2126->712|2167->725|2221->752|2231->753|2258->759|2313->787|2323->788|2353->797|2408->825|2418->826|2448->835|2503->863|2513->864|2545->875|2676->979|2691->985|2751->1024|2978->1224|2993->1230|3053->1269|3292->1477|3326->1484|3400->1531|3415->1537|3465->1566
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|39->7|40->8|40->8|40->8|41->9|42->10|42->10|42->10|43->11|44->12|45->13|58->26|59->27|59->27|59->27|60->28|61->29|61->29|61->29|62->30|62->30|62->30|63->31|63->31|63->31|64->32|64->32|64->32|67->35|67->35|67->35|72->40|72->40|72->40|77->45|78->46|82->50|82->50|82->50
                  -- GENERATED --
              */
          