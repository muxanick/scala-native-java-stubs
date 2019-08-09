package javax.swing.plaf.basic

import java.awt.{Color, Dimension, Graphics, Insets}
import java.lang.{Object, String}
import javax.swing.AbstractButton
import scala.scalanative.annotation.stub

/**  */
class BasicGraphicsUtils extends Object {

    /**  */
    @stub
    def this() = ???
}

object BasicGraphicsUtils {
    /**  */
    @stub
    def drawBezel(g: Graphics, x: Int, y: Int, w: Int, h: Int, isPressed: Boolean, isDefault: Boolean, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    /**  */
    @stub
    def drawDashedRect(g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    /**  */
    @stub
    def drawEtchedRect(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    /**  */
    @stub
    def drawGroove(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, highlight: Color): Unit = ???

    /**  */
    @stub
    def drawLoweredBezel(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    /** Draw a string with the graphics g at location (x,y)
     *   just like g.drawString would.
     */
    @stub
    def drawString(g: Graphics, text: String, underlinedChar: Int, x: Int, y: Int): Unit = ???

    /** Draw a string with the graphics g at location
     *  (x, y)
     *  just like g.drawString would.
     */
    @stub
    def drawStringUnderlineCharAt(g: Graphics, text: String, underlinedIndex: Int, x: Int, y: Int): Unit = ???

    /** Returns the amount of space taken up by a border drawn by
     *  drawEtchedRect()
     */
    @stub
    def getEtchedInsets(): Insets = ???

    /** Returns the amount of space taken up by a border drawn by
     *  drawGroove()
     */
    @stub
    def getGrooveInsets(): Insets = ???

    /**  */
    @stub
    def getPreferredButtonSize(b: AbstractButton, textIconGap: Int): Dimension = ???
}
