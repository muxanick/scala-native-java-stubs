package javax.swing.plaf.basic

import java.awt.{Color, Graphics, Insets}
import java.lang.{Object, String}

// 
class BasicGraphicsUtils extends Object {
}

object BasicGraphicsUtils {
    @stub
    // 
    def drawBezel(g: Graphics, x: Int, y: Int, w: Int, h: Int, isPressed: Boolean, isDefault: Boolean, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    @stub
    // 
    def drawDashedRect(g: Graphics, x: Int, y: Int, width: Int, height: Int): Unit = ???

    @stub
    // 
    def drawEtchedRect(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    @stub
    // 
    def drawGroove(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, highlight: Color): Unit = ???

    @stub
    // 
    def drawLoweredBezel(g: Graphics, x: Int, y: Int, w: Int, h: Int, shadow: Color, darkShadow: Color, highlight: Color, lightHighlight: Color): Unit = ???

    @stub
    // Draw a string with the graphics g at location (x,y)
    //  just like g.drawString would.
    def drawString(g: Graphics, text: String, underlinedChar: Int, x: Int, y: Int): Unit = ???

    @stub
    // Draw a string with the graphics g at location
    // (x, y)
    // just like g.drawString would.
    def drawStringUnderlineCharAt(g: Graphics, text: String, underlinedIndex: Int, x: Int, y: Int): Unit = ???

    @stub
    // Returns the amount of space taken up by a border drawn by
    // drawEtchedRect()
    def getEtchedInsets(): Insets = ???

    @stub
    // Returns the amount of space taken up by a border drawn by
    // drawGroove()
    def getGrooveInsets(): Insets = ???
}
