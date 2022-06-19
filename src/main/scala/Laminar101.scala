package alvin

import com.raquo.laminar.api.L._
import org.scalajs.dom

object Laminar101 {

    def main(args: Array[String]): Unit = {

        // create a DIV with an H1 tag
        val rootElement: HtmlElement = div(
            h1("Hello, world")
        )

        // `#root` must match the `id` in index.html
        val containerNode = dom.document.querySelector("#root")

        // render the element in the container
        render(containerNode, rootElement)
    }

}
