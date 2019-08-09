package javax.swing

import java.awt.{Component, Graphics}
import scala.scalanative.annotation.stub

/** A small fixed size picture, typically used to decorate components. */
trait Icon {

    /** Returns the icon's height. */
    @stub
    def getIconHeight(): Int = ???

    /** Returns the icon's width. */
    @stub
    def getIconWidth(): Int = ???

    /** Draw the icon at the specified location. */
    @stub
    def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
}
