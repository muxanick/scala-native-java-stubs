package javax.swing.plaf.synth

import java.awt.{Dimension, Font, FontMetrics, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.Icon

// Wrapper for primitive graphics calls.
class SynthGraphicsUtils extends Object {

    @stub
    // Returns the size of the passed in string.
    def computeStringWidth(ss: SynthContext, font: Font, metrics: FontMetrics, text: String): Int = ???

    @stub
    // Draws a line between the two end points.
    def drawLine(context: SynthContext, paintKey: Object, g: Graphics, x1: Int, y1: Int, x2: Int, y2: Int): Unit = ???

    @stub
    // Draws a line between the two end points.
    def drawLine(context: SynthContext, paintKey: Object, g: Graphics, x1: Int, y1: Int, x2: Int, y2: Int, styleKey: Object): Unit = ???

    @stub
    // Returns the maximum height of the the Font from the passed in
    // SynthContext.
    def getMaximumCharHeight(context: SynthContext): Int = ???

    @stub
    // Returns the maximum size needed to properly render an icon and text.
    def getMaximumSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    @stub
    // Returns the minimum size needed to properly render an icon and text.
    def getMinimumSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    @stub
    // Returns the preferred size needed to properly render an icon and text.
    def getPreferredSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    @stub
    // Lays out text and an icon returning, by reference, the location to
    // place the icon and text.
    def layoutText(ss: SynthContext, fm: FontMetrics, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, iconTextGap: Int): String = ???

    @stub
    // Paints an icon and text.
    def paintText(ss: SynthContext, g: Graphics, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int, textOffset: Int): Unit = ???

    @stub
    // Paints text at the specified location.
    def paintText(ss: SynthContext, g: Graphics, text: String, x: Int, y: Int, mnemonicIndex: Int): Unit = ???
}
