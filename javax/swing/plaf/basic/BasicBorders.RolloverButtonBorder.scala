package javax.swing.plaf.basic

import java.awt.{Color, Component, Graphics}
import java.lang.Object
import javax.swing.border.AbstractBorder
import scala.scalanative.annotation.stub

/** Special thin border for rollover toolbar buttons. */
object BasicBorders.RolloverButtonBorder extends BasicBorders.ButtonBorder {

    /**  */
    @stub
    def RolloverButtonBorder(shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color) = ???

    /** This default implementation does no painting. */
    @stub
    def paintBorder(c: Component, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}
