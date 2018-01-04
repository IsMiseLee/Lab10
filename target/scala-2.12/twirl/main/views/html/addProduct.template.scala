
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

object addProduct extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[models.Product],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(productForm: Form[models.Product]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*3.2*/import helper._


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*4.1*/("""


"""),_display_(/*7.2*/main("Add product")/*7.21*/{_display_(Seq[Any](format.raw/*7.22*/("""
    """),format.raw/*8.5*/("""<p class="lead">Add a new product</p>
    """),_display_(/*9.6*/if(flash.containsKey("success"))/*9.38*/{_display_(Seq[Any](format.raw/*9.39*/("""
        """),format.raw/*10.9*/("""<div class="alert alert-success">
            """),_display_(/*11.14*/flash/*11.19*/.get("success")),format.raw/*11.34*/("""
        """),format.raw/*12.9*/("""</div>
    """)))}),format.raw/*13.6*/("""

    """),format.raw/*15.5*/("""<!--Use the views.html.helpers package to create the form -->
    """),_display_(/*16.6*/form(action=routes.HomeController.addProductSubmit() , 'class -> "form-horizontal", 'role -> "form")/*16.106*/{_display_(Seq[Any](format.raw/*16.107*/("""

        """),format.raw/*18.37*/("""
        """),format.raw/*19.99*/("""
        """),_display_(/*20.10*/CSRF/*20.14*/.formField),format.raw/*20.24*/("""
        
        """),format.raw/*22.9*/("""<!--Build the form, adding an input for each field -->
        <!-- Note the label parameter -->

        """),_display_(/*25.10*/inputText(productForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*25.85*/("""
        """),_display_(/*26.10*/inputText(productForm("description"), '_label -> "Description", 'class -> "form-control")),format.raw/*26.99*/("""
        """),_display_(/*27.10*/select(
            productForm("category.id"),
            options(Category.options),
            '_label -> "Category", '_default -> "-- Choose a category --",
            '_showConstraints -> false, 'class -> "form-control"
        )),format.raw/*32.10*/("""
        
        """),_display_(/*34.10*/inputText(productForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*34.87*/("""
        """),_display_(/*35.10*/inputText(productForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*35.87*/("""

        """),format.raw/*37.9*/("""<!-- Hidden ID field - required for updates-->
        """),_display_(/*38.10*/inputText(productForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*38.74*/("""

        """),format.raw/*40.9*/("""<!--Add a submit button -->
        <div class="actions">
            <input type="submit" value="Add Product" class="btn btn-primary" onclick="return confirmAddedUpdated();">
            <a href=""""),_display_(/*43.23*/routes/*43.29*/.HomeController.index(0)),format.raw/*43.53*/(""""><!--index() ??? or index -->
                <button class="btn btn-warning">Cancel</button>
            </a>
        </div>

    """)))}),format.raw/*48.22*/("""
""")))}))
      }
    }
  }

  def render(productForm:Form[models.Product]): play.twirl.api.HtmlFormat.Appendable = apply(productForm)

  def f:((Form[models.Product]) => play.twirl.api.HtmlFormat.Appendable) = (productForm) => apply(productForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:40:15 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab10OneToMany/app/views/addProduct.scala.html
                  HASH: 955be2e73125d276fdb39207840953117378bac0
                  MATRIX: 967->1|1075->39|1120->36|1148->55|1177->59|1204->78|1242->79|1273->84|1341->127|1381->159|1419->160|1455->169|1529->216|1543->221|1579->236|1615->245|1657->257|1690->263|1783->330|1893->430|1933->431|1971->469|2008->568|2045->578|2058->582|2089->592|2134->610|2268->717|2364->792|2401->802|2511->891|2548->901|2805->1137|2851->1156|2949->1233|2986->1243|3084->1320|3121->1330|3204->1386|3289->1450|3326->1460|3551->1658|3566->1664|3611->1688|3775->1837
                  LINES: 28->1|31->3|34->1|36->4|39->7|39->7|39->7|40->8|41->9|41->9|41->9|42->10|43->11|43->11|43->11|44->12|45->13|47->15|48->16|48->16|48->16|50->18|51->19|52->20|52->20|52->20|54->22|57->25|57->25|58->26|58->26|59->27|64->32|66->34|66->34|67->35|67->35|69->37|70->38|70->38|72->40|75->43|75->43|75->43|80->48
                  -- GENERATED --
              */
          