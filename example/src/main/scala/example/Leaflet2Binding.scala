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

  // I would like to use a function like this in popup content, which is set by
  // L.popup().setContent()
  @dom def randomPopupContent(str: String): Binding[Element] =
    <div>I am dynamic: {str}</div>


  @dom def renderPopups(popupContent: Binding[Element]): Binding[Element] = {
    <div class="leaflet-popup  leaflet-zoom-animated" style="opacity: 1; transform: translate3d(940px, 69px, 0px); bottom: -7px; left: -147px;">
      <div class="leaflet-popup-content-wrapper" data:data-vivaldi-spatnav-clickable="1">
        <div class="leaflet-popup-content" style="width: 253px;">
          {randomPopupContent("asdf").bind}
        </div>
      </div>
      <div class="leaflet-popup-tip-container">
        <div class="leaflet-popup-tip"></div>
      </div>
      <a class="leaflet-popup-close-button" href="#close" data:data-vivaldi-spatnav-clickable="1">×</a>
    </div>

  }

  @dom def renderMap(mapOptions: LMapOptions): Binding[Element] = {
//    val lmap = L.map("mapid2")

    <div id="mapid2" style="width: 1000px; height: 600px; position: relative; outline: none;"
         class="leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom"
         data:tabindex="0">
      <div class="leaflet-pane leaflet-map-pane" style="transform: translate3d(-91px, 0px, 0px);">
        <div class="leaflet-pane leaflet-tile-pane">
          <div class="leaflet-layer " style="z-index: 1; opacity: 1;">
            <div class="leaflet-tile-container leaflet-zoom-animated" style="z-index: 19; transform: translate3d(0px, 0px, 0px) scale(1);">
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4093/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(256px, 9px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4093/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(256px, 265px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4092/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(0px, 9px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4094/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(512px, 9px, 0px); opacity: 1;"/>
                <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4092/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                     class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(0px, 265px, 0px); opacity: 1;"/>
                  <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4094/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                       class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(512px, 265px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4093/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(256px, -247px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4093/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(256px, 521px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4092/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(0px, -247px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4094/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(512px, -247px, 0px); opacity: 1;"/>
                <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4092/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                     class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(0px, 521px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4094/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(512px, 521px, 0px); opacity: 1;"/>
                <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4091/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                     class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(-256px, 9px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4095/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(768px, 9px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4091/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(-256px, 265px, 0px); opacity: 1;"/>
                <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4095/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                     class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(768px, 265px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4091/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw"
                   class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(-256px, -247px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4095/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(768px, -247px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4091/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(-256px, 521px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4095/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(768px, 521px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4096/2723.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(1024px, 9px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4096/2724.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(1024px, 265px, 0px); opacity: 1;"/>
              <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4096/2722.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(1024px, -247px, 0px); opacity: 1;"/>
                <img alt="" data:role="presentation" src="https://api.tiles.mapbox.com/v4/mapbox.streets/13/4096/2725.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw" class="leaflet-tile leaflet-tile-loaded" style="width: 256px; height: 256px; transform: translate3d(1024px, 521px, 0px); opacity: 1;"/>
              </div>
          </div>
        </div>
        <div class="leaflet-pane leaflet-shadow-pane"></div>
        <div class="leaflet-pane leaflet-overlay-pane"></div>
        <div class="leaflet-pane leaflet-marker-pane"></div>
        <div class="leaflet-pane leaflet-tooltip-pane"></div>
        <div class="leaflet-pane leaflet-popup-pane">
          {renderPopups(randomPopupContent("fafasafasdf")).bind}
        </div>
        <div class="leaflet-proxy leaflet-zoom-animated" style="transform: translate3d(1.04814e+06px, 697379px, 0px) scale(4096);">
        </div>
      </div>
      <div class="leaflet-control-container">
        <div class="leaflet-top leaflet-left">
          <div class="leaflet-control-zoom leaflet-bar leaflet-control">
            <a class="leaflet-control-zoom-in" href="#" title="Zoom in" data:role="button" data:aria-label="Zoom in">+</a>
            <a class="leaflet-control-zoom-out" href="#" title="Zoom out" data:role="button" data:aria-label="Zoom out">−</a>
          </div>
        </div>
        <div class="leaflet-top leaflet-right"></div>
        <div class="leaflet-bottom leaflet-left"></div>
        <div class="leaflet-bottom leaflet-right">
          <div class="leaflet-control-attribution leaflet-control">
                <a href="http://leafletjs.com" title="A JS library for interactive maps">Leaflet</a> | Map data © <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
            <a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
            Imagery © <a href="http://mapbox.com">Mapbox</a>
          </div>
        </div>
      </div>
    </div>

  }

  @JSExport
  def mainOld(el: String, southwarkpark: js.Object): LMap = {

    val mapElement = org.scalajs.dom.window.document.createElement("div").asInstanceOf[HTMLElement]

    mapElement.setAttribute("id","newMap2")

    val mapRoot = org.scalajs.dom.window.document.getElementById("newMapRoot")
    mapRoot.appendChild(mapElement)

    println(JSON.stringify(southwarkpark))

    val mapOptions=LMapOptions.zoom(13).center((51.505, -0.09))

    val lmap = L.map("newMap2", mapOptions)

    val mapPopup = L.popup()

    val mapPoked=(e: LeafletMouseEvent)=> {
      mapPopup.setLatLng(e.latlng).setContent("You clicked me at ${e.latlng}").openOn(lmap)
    }

    lmap.on(LMapEvent.click.toString, mapPoked)

    val tileLayer = L.tileLayer("https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=pk.eyJ1IjoiZmFuY2VsbHUiLCJhIjoiY2oxMHRzZm5zMDAyMDMycndyaTZyYnp6NSJ9.AJ3owakJtFAJaaRuYB7Ukw",
      TileLayerOptions.id("mapbox.streets").maxZoom(19).attribution("""Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors,
                                                                      |<a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>,
                                                                      |Imagery © <a href="http://mapbox.com">Mapbox</a>""".stripMargin))
    tileLayer.addTo(lmap)

    lmap
  }

  @JSExport
  def main() = {
    dom.render(org.scalajs.dom.document.getElementById("newMapRoot"), renderMap(literal().asInstanceOf[LMapOptions]))
//    dom.render(org.scalajs.dom.document.body, renderMap(literal().asInstanceOf[LMapOptions]))
  }
}
