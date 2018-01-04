
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.Product],List[models.Category],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product], categories: List[models.Category]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""


"""),_display_(/*4.2*/main("Products Page")/*4.23*/ {_display_(Seq[Any](format.raw/*4.25*/(""" 
  """),format.raw/*5.3*/("""<p class="lead">Product Catalogue</p> 
  <div class="row">
        <div class="col-sm-2">
          <h4>Categories</h4>
          <div class="list-group">
              <!-- A link to display all the products-->
              <a href=""""),_display_(/*11.25*/routes/*11.31*/.HomeController.index(0)),format.raw/*11.55*/("""" class="list-group-item">All categories</a>
              <!-- Start of for loop = for each c in categories add a list item -->
              <!-- Also show the number of products in each category -->
             
              """),_display_(/*15.16*/for(c<-categories) yield /*15.34*/{_display_(Seq[Any](format.raw/*15.35*/("""
                  """),format.raw/*16.19*/("""<a href=""""),_display_(/*16.29*/routes/*16.35*/.HomeController.index(c.getId)),format.raw/*16.65*/("""" class="list-group-item">"""),_display_(/*16.92*/c/*16.93*/.getName),format.raw/*16.101*/("""
                        """),format.raw/*17.25*/("""<span class="badge">"""),_display_(/*17.46*/c/*17.47*/.getProducts.size()),format.raw/*17.66*/("""</span>
                  </a>
              """)))}),format.raw/*19.16*/("""
          """),format.raw/*20.11*/("""</div>
        </div>
        <div class="col-sm-10">
            """),format.raw/*23.77*/("""
            """),_display_(/*24.14*/if(flash.containsKey("success"))/*24.46*/{_display_(Seq[Any](format.raw/*24.47*/("""
                """),format.raw/*25.17*/("""<div class="alert alert-success">
                    """),_display_(/*26.22*/flash/*26.27*/.get("success")),format.raw/*26.42*/("""
                """),format.raw/*27.17*/("""</div>
            """)))}),format.raw/*28.14*/("""

            """),format.raw/*30.13*/("""<table class="table table-bordered table-hover table-condensed"> 
                <thead> 
                <!-- The header row--> 
                <tr> 
                    <th>ID</th> 
                    <th>Name</th> 
                    <th>Category</th>
                    <th>Description</th> 
                    <th>Stock</th> 
                    <th>Price</th> 
                </tr> 
                </thead> 
                <tbody> 
                    <!-- Product row(s) --> 
                    """),format.raw/*44.72*/("""
                    """),_display_(/*45.22*/for(p<-products) yield /*45.38*/{_display_(Seq[Any](format.raw/*45.39*/("""
                        """),format.raw/*46.25*/("""<tr> 
                            <td>"""),_display_(/*47.34*/p/*47.35*/.getId),format.raw/*47.41*/("""</td> 
                            <td>"""),_display_(/*48.34*/p/*48.35*/.getName),format.raw/*48.43*/("""</td> 
                            <td>"""),_display_(/*49.34*/p/*49.35*/.getCategory.getName),format.raw/*49.55*/("""</td>
                            <td>"""),_display_(/*50.34*/p/*50.35*/.getDescription),format.raw/*50.50*/("""</td> 
                            <td>"""),_display_(/*51.34*/p/*51.35*/.getStock),format.raw/*51.44*/("""</td> 
                            <td id="priceAlRight">&euro; """),_display_(/*52.59*/("%.2f".format(p.getPrice))),format.raw/*52.86*/("""</td>
                            <!-- Edit product button -->
                            <td>
                                <a href=""""),_display_(/*55.43*/routes/*55.49*/.HomeController.updateProduct(p.getId)),format.raw/*55.87*/("""" class="btn-xs btn-danger" >
                                    <span class="glyphicon glyphicon-pencil"></span>
                                </a>
                            </td>
                            <!-- Delete product button-->
                            <td>
                                <a href=""""),_display_(/*61.43*/routes/*61.49*/.HomeController.deleteProduct(p.getId)),format.raw/*61.87*/("""" class="btn-xs btn-danger" onclick="return confirmDel();">
                                    <span class="glyphicon glyphicon-trash"></span>
                                </a>
                            </td>
                        </tr> 
                    """)))}),format.raw/*66.22*/(""" """),format.raw/*66.44*/("""
                """),format.raw/*67.17*/("""</tbody> 
            </table> 
             <p><a href=""""),_display_(/*69.27*/routes/*69.33*/.HomeController.addProduct()),format.raw/*69.61*/("""">
                <button class="btn btn-primary">Add a product</button>
            </a></p>
        </div>
    </div>
  """)))}))
      }
    }
  }

  def render(products:List[models.Product],categories:List[models.Category]): play.twirl.api.HtmlFormat.Appendable = apply(products,categories)

  def f:((List[models.Product],List[models.Category]) => play.twirl.api.HtmlFormat.Appendable) = (products,categories) => apply(products,categories)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 16 17:40:14 GMT 2017
                  SOURCE: /home/wdd/webapps/playapps/WMDD1Lab10OneToMany/app/views/index.scala.html
                  HASH: c1ff95265ee8ac825b74de023d752c21da9cd4a1
                  MATRIX: 984->1|1146->68|1175->72|1204->93|1243->95|1273->99|1536->335|1551->341|1596->365|1854->596|1888->614|1927->615|1974->634|2011->644|2026->650|2077->680|2131->707|2141->708|2171->716|2224->741|2272->762|2282->763|2322->782|2399->828|2438->839|2532->969|2573->983|2614->1015|2653->1016|2698->1033|2780->1088|2794->1093|2830->1108|2875->1125|2926->1145|2968->1159|3508->1722|3557->1744|3589->1760|3628->1761|3681->1786|3747->1825|3757->1826|3784->1832|3851->1872|3861->1873|3890->1881|3957->1921|3967->1922|4008->1942|4074->1981|4084->1982|4120->1997|4187->2037|4197->2038|4227->2047|4319->2112|4367->2139|4532->2277|4547->2283|4606->2321|4952->2640|4967->2646|5026->2684|5324->2951|5353->2973|5398->2990|5483->3048|5498->3054|5547->3082
                  LINES: 28->1|33->1|36->4|36->4|36->4|37->5|43->11|43->11|43->11|47->15|47->15|47->15|48->16|48->16|48->16|48->16|48->16|48->16|48->16|49->17|49->17|49->17|49->17|51->19|52->20|55->23|56->24|56->24|56->24|57->25|58->26|58->26|58->26|59->27|60->28|62->30|76->44|77->45|77->45|77->45|78->46|79->47|79->47|79->47|80->48|80->48|80->48|81->49|81->49|81->49|82->50|82->50|82->50|83->51|83->51|83->51|84->52|84->52|87->55|87->55|87->55|93->61|93->61|93->61|98->66|98->66|99->67|101->69|101->69|101->69
                  -- GENERATED --
              */
          