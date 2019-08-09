package javax.swing

import java.awt.{BasicStroke, Color, Font, Paint}
import java.lang.{Object, String}
import javax.swing.border.{Border, CompoundBorder, MatteBorder, TitledBorder}
import scala.scalanative.annotation.stub

/** Factory class for vending standard Border objects.  Wherever
 *  possible, this factory will hand out references to shared
 *  Border instances.
 *  For further information and examples see
 *  How
 *  to Use Borders,
 *  a section in The Java Tutorial.
 */
class BorderFactory extends Object {
}

object BorderFactory {
    /** Creates a beveled border of the specified type, using
     *  brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createBevelBorder(type: Int): Border = ???

    /** Creates a beveled border of the specified type, using
     *  the specified highlighting and shadowing.
     */
    @stub
    def createBevelBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    /** Creates a beveled border of the specified type, using
     *  the specified colors for the inner and outer highlight
     *  and shadow areas.
     */
    @stub
    def createBevelBorder(type: Int, highlightOuter: Color, highlightInner: Color, shadowOuter: Color, shadowInner: Color): Border = ???

    /** Creates a compound border with a null inside edge and a
     *  null outside edge.
     */
    @stub
    def createCompoundBorder(): CompoundBorder = ???

    /** Creates a compound border specifying the border objects to use
     *  for the outside and inside edges.
     */
    @stub
    def createCompoundBorder(outsideBorder: Border, insideBorder: Border): CompoundBorder = ???

    /** Creates a dashed border of the specified paint. */
    @stub
    def createDashedBorder(paint: Paint): Border = ???

    /** Creates a dashed border of the specified paint,
     *  relative length, and relative spacing.
     */
    @stub
    def createDashedBorder(paint: Paint, length: Float, spacing: Float): Border = ???

    /** Creates a dashed border of the specified paint, thickness,
     *  line shape, relative length, and relative spacing.
     */
    @stub
    def createDashedBorder(paint: Paint, thickness: Float, length: Float, spacing: Float, rounded: Boolean): Border = ???

    /** Creates an empty border that takes up no space. */
    @stub
    def createEmptyBorder(): Border = ???

    /** Creates an empty border that takes up space but which does
     *  no drawing, specifying the width of the top, left, bottom, and
     *  right sides.
     */
    @stub
    def createEmptyBorder(top: Int, left: Int, bottom: Int, right: Int): Border = ???

    /** Creates a border with an "etched" look using
     *  the component's current background color for
     *  highlighting and shading.
     */
    @stub
    def createEtchedBorder(): Border = ???

    /** Creates a border with an "etched" look using
     *  the specified highlighting and shading colors.
     */
    @stub
    def createEtchedBorder(highlight: Color, shadow: Color): Border = ???

    /** Creates a border with an "etched" look using
     *  the component's current background color for
     *  highlighting and shading.
     */
    @stub
    def createEtchedBorder(type: Int): Border = ???

    /** Creates a border with an "etched" look using
     *  the specified highlighting and shading colors.
     */
    @stub
    def createEtchedBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    /** Creates a line border withe the specified color. */
    @stub
    def createLineBorder(color: Color): Border = ???

    /** Creates a line border with the specified color
     *  and width.
     */
    @stub
    def createLineBorder(color: Color, thickness: Int): Border = ???

    /** Creates a line border with the specified color, thickness, and corner shape. */
    @stub
    def createLineBorder(color: Color, thickness: Int, rounded: Boolean): Border = ???

    /** Creates a border with a lowered beveled edge, using
     *  brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createLoweredBevelBorder(): Border = ???

    /** Creates a beveled border with a lowered edge and softened corners,
     *  using brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createLoweredSoftBevelBorder(): Border = ???

    /** Creates a matte-look border using a solid color. */
    @stub
    def createMatteBorder(top: Int, left: Int, bottom: Int, right: Int, color: Color): MatteBorder = ???

    /** Creates a matte-look border that consists of multiple tiles of a
     *  specified icon.
     */
    @stub
    def createMatteBorder(top: Int, left: Int, bottom: Int, right: Int, tileIcon: Icon): MatteBorder = ???

    /** Creates a border with a raised beveled edge, using
     *  brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createRaisedBevelBorder(): Border = ???

    /** Creates a beveled border with a raised edge and softened corners,
     *  using brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createRaisedSoftBevelBorder(): Border = ???

    /** Creates a beveled border of the specified type with softened corners,
     *  using brighter shades of the component's current background color
     *  for highlighting, and darker shading for shadows.
     */
    @stub
    def createSoftBevelBorder(type: Int): Border = ???

    /** Creates a beveled border of the specified type with softened corners,
     *  using the specified highlighting and shadowing.
     */
    @stub
    def createSoftBevelBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    /** Creates a beveled border of the specified type with softened corners,
     *  using the specified colors for the inner and outer edges
     *  of the highlight and the shadow areas.
     */
    @stub
    def createSoftBevelBorder(type: Int, highlightOuter: Color, highlightInner: Color, shadowOuter: Color, shadowInner: Color): Border = ???

    /** Creates a border of the specified stroke. */
    @stub
    def createStrokeBorder(stroke: BasicStroke): Border = ???

    /** Creates a border of the specified stroke and paint. */
    @stub
    def createStrokeBorder(stroke: BasicStroke, paint: Paint): Border = ???

    /** Creates a new titled border with an empty title,
     *  the specified border object,
     *  the default text position (determined by the current look and feel),
     *  the default justification (leading), and the default
     *  font and text color (determined by the current look and feel).
     */
    @stub
    def createTitledBorder(border: Border): TitledBorder = ???

    /** Adds a title to an existing border,
     *  with default positioning (determined by the current look and feel),
     *  default justification (leading) and the default
     *  font and text color (determined by the current look and feel).
     */
    @stub
    def createTitledBorder(border: Border, title: String): TitledBorder = ???

    /** Adds a title to an existing border, with the specified
     *  positioning and using the default
     *  font and text color (determined by the current look and feel).
     */
    @stub
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int): TitledBorder = ???

    /** Adds a title to an existing border, with the specified
     *  positioning and font, and using the default text color
     *  (determined by the current look and feel).
     */
    @stub
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font): TitledBorder = ???

    /** Adds a title to an existing border, with the specified
     *  positioning, font and color.
     */
    @stub
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font, titleColor: Color): TitledBorder = ???

    /** Creates a new titled border with the specified title,
     *  the default border type (determined by the current look and feel),
     *  the default text position (determined by the current look and feel),
     *  the default justification (leading), and the default
     *  font and text color (determined by the current look and feel).
     */
    @stub
    def createTitledBorder(title: String): TitledBorder = ???
}
