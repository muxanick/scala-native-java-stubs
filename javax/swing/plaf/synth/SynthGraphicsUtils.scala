package javax.swing.plaf.synth

import java.awt.{Dimension, Font, FontMetrics, Graphics, Rectangle}
import java.lang.{Object, String}
import javax.swing.Icon

/** Wrapper for primitive graphics calls. */
class SynthGraphicsUtils extends Object {

    /** Returns the size of the passed in string. */
    @stub
    def computeStringWidth(ss: SynthContext, font: Font, metrics: FontMetrics, text: String): Int = ???

    /** Draws a line between the two end points. */
    @stub
    def drawLine(context: SynthContext, paintKey: Object, g: Graphics, x1: Int, y1: Int, x2: Int, y2: Int): Unit = ???

    /** Draws a line between the two end points. */
    @stub
    def drawLine(context: SynthContext, paintKey: Object, g: Graphics, x1: Int, y1: Int, x2: Int, y2: Int, styleKey: Object): Unit = ???

    /** Returns the maximum height of the the Font from the passed in
     *  SynthContext.
     */
    @stub
    def getMaximumCharHeight(context: SynthContext): Int = ???

    /** Returns the maximum size needed to properly render an icon and text. */
    @stub
    def getMaximumSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    /** Returns the minimum size needed to properly render an icon and text. */
    @stub
    def getMinimumSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    /** Returns the preferred size needed to properly render an icon and text. */
    @stub
    def getPreferredSize(ss: SynthContext, font: Font, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int): Dimension = ???

    /** Lays out text and an icon returning, by reference, the location to
     *  place the icon and text.
     */
    @stub
    def layoutText(ss: SynthContext, fm: FontMetrics, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, viewR: Rectangle, iconR: Rectangle, textR: Rectangle, iconTextGap: Int): String = ???

    /** Paints an icon and text. */
    @stub
    def paintText(ss: SynthContext, g: Graphics, text: String, icon: Icon, hAlign: Int, vAlign: Int, hTextPosition: Int, vTextPosition: Int, iconTextGap: Int, mnemonicIndex: Int, textOffset: Int): Unit = ???

    /** Paints text at the specified location. */
    @stub
    def paintText(ss: SynthContext, g: Graphics, text: String, x: Int, y: Int, mnemonicIndex: Int): Unit = ???
}
