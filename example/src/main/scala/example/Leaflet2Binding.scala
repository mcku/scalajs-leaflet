package example

import com.felstar.scalajs.leaflet._

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.JSON
import scala.scalajs.js.annotation.JSExport
import com.thoughtworks.binding.Binding.Var
import com.thoughtworks.binding.{Binding, dom}
import org.scalajs.dom.Element
import org.scalajs.dom.raw.HTMLElement


@JSExport
object Leaflet2Binding extends {
  implicit def makeIntellijHappy(x: scala.xml.Elem): Binding[HTMLElement] = ???
  implicit def makeIntellijHappy(x: HTMLElement): Binding[HTMLElement] = ???


  @dom def renderMap: Binding[Element] = {

    val mapElement = <div id="mapid" style="width: 1000px; height: 600px; position: relative; outline: currentcolor none medium;"
                          class="leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom"
                          data:tabindex="0"></div>.asInstanceOf[HTMLElement]

    val mapOptions=LMapOptions.zoom(13).center((51.505, -0.09))

    val lmap = L.map(mapElement, mapOptions)

    val mapPopup = L.popup()

    val tileLayer = L.tileLayer("https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw",
      TileLayerOptions.id("mapbox.streets").maxZoom(19).attribution("""Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
                                                                      |<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
                                                                      |Imagery © <a href="http://mapbox.com">Mapbox</a>""".stripMargin))
    tileLayer.addTo(lmap)
    
    lmap.invalidateResize(true)
    
    mapElement
  }

  @JSExport
  def main() = {
    dom.render(org.scalajs.dom.document.getElementById("newMapRoot"), renderMap)
//    dom.render(org.scalajs.dom.document.body, renderMap(literal().asInstanceOf[LMapOptions]))
  }
}
