
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

object addCustomer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Customer],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(customerForm: Form[models.Customer]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add customer")/*7.22*/{_display_(Seq[Any](format.raw/*7.23*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new customer</p>
    """),_display_(/*9.6*/if(flash.containsKey("success"))/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""
    """),format.raw/*14.5*/("""<!--Use the views.html.helpers package to create the form -->
    """),_display_(/*15.6*/form(action=routes.HomeController.addCustomerSubmit() , 'class -> "form-horizontal", 'role -> "form")/*15.107*/{_display_(Seq[Any](format.raw/*15.108*/("""

        """),format.raw/*17.37*/("""
        """),format.raw/*18.99*/("""
        """),_display_(/*19.10*/CSRF/*19.14*/.formField),format.raw/*19.24*/("""
        
        """),format.raw/*21.9*/("""<!--Build the form, adding an input for each field -->
        <!-- Note the label parameter -->

        """),_display_(/*24.10*/inputText(customerForm("fName"),   '_label -> "First Name", 'class -> "form-control")),format.raw/*24.95*/("""
        """),_display_(/*25.10*/inputText(customerForm("lName"),   '_label -> "Last Name",  'class -> "form-control")),format.raw/*25.95*/("""
        """),_display_(/*26.10*/inputText(customerForm("address"), '_label -> "Address",    'class -> "form-control")),format.raw/*26.95*/("""
        
        """),format.raw/*28.9*/("""<!-- Hidden ID field - required for updates-->
        """),_display_(/*29.10*/inputText(customerForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*29.75*/("""

        """),format.raw/*31.9*/("""<!--Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add Customer" class="btn btn-primary" onclick="return confirmAddedUpdated();">
            <a href=""""),_display_(/*34.23*/routes/*34.29*/.HomeController.customers()),format.raw/*34.56*/(""""><!--index() ??? or index -->
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*39.22*/("""
""")))}))
      }
    }
  }

  def render(customerForm:Form[models.Customer]): play.twirl.api.HtmlFormat.Appendable = apply(customerForm)

  def f:((Form[models.Customer]) => play.twirl.api.HtmlFormat.Appendable) = (customerForm) => apply(customerForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:40:15 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab10OneToMany/app/views/addCustomer.scala.html
                  HASH: e92a8f56a582f74d544ff7fc03e033d507614156
                  MATRIX: 969->1|1079->41|1124->38|1152->57|1181->61|1209->81|1247->82|1278->87|1347->131|1387->163|1425->164|1461->173|1535->220|1549->225|1585->240|1621->249|1663->261|1695->266|1788->333|1899->434|1939->435|1977->473|2014->572|2051->582|2064->586|2095->596|2140->614|2274->721|2380->806|2417->816|2523->901|2560->911|2666->996|2711->1014|2794->1070|2880->1135|2917->1145|3143->1344|3158->1350|3206->1377|3370->1526
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|46->14|47->15|47->15|47->15|49->17|50->18|51->19|51->19|51->19|53->21|56->24|56->24|57->25|57->25|58->26|58->26|60->28|61->29|61->29|63->31|66->34|66->34|66->34|71->39
                  -- GENERATED --
              */
          