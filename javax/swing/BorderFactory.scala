package javax.swing

import java.awt.{BasicStroke, Color, Font, Paint}
import java.lang.{Object, String}
import javax.swing.border.{Border, CompoundBorder, MatteBorder, TitledBorder}

// Factory class for vending standard Border objects.  Wherever
// possible, this factory will hand out references to shared
// Border instances.
// For further information and examples see
// How
// to Use Borders,
// a section in The Java Tutorial.
class BorderFactory extends Object {
}

object BorderFactory {
    @stub
    // Creates a beveled border of the specified type, using
    // brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createBevelBorder(type: Int): Border = ???

    @stub
    // Creates a beveled border of the specified type, using
    // the specified highlighting and shadowing.
    def createBevelBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    @stub
    // Creates a beveled border of the specified type, using
    // the specified colors for the inner and outer highlight
    // and shadow areas.
    def createBevelBorder(type: Int, highlightOuter: Color, highlightInner: Color, shadowOuter: Color, shadowInner: Color): Border = ???

    @stub
    // Creates a compound border with a null inside edge and a
    // null outside edge.
    def createCompoundBorder(): CompoundBorder = ???

    @stub
    // Creates a compound border specifying the border objects to use
    // for the outside and inside edges.
    def createCompoundBorder(outsideBorder: Border, insideBorder: Border): CompoundBorder = ???

    @stub
    // Creates a dashed border of the specified paint.
    def createDashedBorder(paint: Paint): Border = ???

    @stub
    // Creates a dashed border of the specified paint,
    // relative length, and relative spacing.
    def createDashedBorder(paint: Paint, length: float, spacing: float): Border = ???

    @stub
    // Creates a dashed border of the specified paint, thickness,
    // line shape, relative length, and relative spacing.
    def createDashedBorder(paint: Paint, thickness: float, length: float, spacing: float, rounded: Boolean): Border = ???

    @stub
    // Creates an empty border that takes up no space.
    def createEmptyBorder(): Border = ???

    @stub
    // Creates an empty border that takes up space but which does
    // no drawing, specifying the width of the top, left, bottom, and
    // right sides.
    def createEmptyBorder(top: Int, left: Int, bottom: Int, right: Int): Border = ???

    @stub
    // Creates a border with an "etched" look using
    // the component's current background color for
    // highlighting and shading.
    def createEtchedBorder(): Border = ???

    @stub
    // Creates a border with an "etched" look using
    // the specified highlighting and shading colors.
    def createEtchedBorder(highlight: Color, shadow: Color): Border = ???

    @stub
    // Creates a border with an "etched" look using
    // the component's current background color for
    // highlighting and shading.
    def createEtchedBorder(type: Int): Border = ???

    @stub
    // Creates a border with an "etched" look using
    // the specified highlighting and shading colors.
    def createEtchedBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    @stub
    // Creates a line border withe the specified color.
    def createLineBorder(color: Color): Border = ???

    @stub
    // Creates a line border with the specified color
    // and width.
    def createLineBorder(color: Color, thickness: Int): Border = ???

    @stub
    // Creates a line border with the specified color, thickness, and corner shape.
    def createLineBorder(color: Color, thickness: Int, rounded: Boolean): Border = ???

    @stub
    // Creates a border with a lowered beveled edge, using
    // brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createLoweredBevelBorder(): Border = ???

    @stub
    // Creates a beveled border with a lowered edge and softened corners,
    // using brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createLoweredSoftBevelBorder(): Border = ???

    @stub
    // Creates a matte-look border using a solid color.
    def createMatteBorder(top: Int, left: Int, bottom: Int, right: Int, color: Color): MatteBorder = ???

    @stub
    // Creates a matte-look border that consists of multiple tiles of a
    // specified icon.
    def createMatteBorder(top: Int, left: Int, bottom: Int, right: Int, tileIcon: Icon): MatteBorder = ???

    @stub
    // Creates a border with a raised beveled edge, using
    // brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createRaisedBevelBorder(): Border = ???

    @stub
    // Creates a beveled border with a raised edge and softened corners,
    // using brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createRaisedSoftBevelBorder(): Border = ???

    @stub
    // Creates a beveled border of the specified type with softened corners,
    // using brighter shades of the component's current background color
    // for highlighting, and darker shading for shadows.
    def createSoftBevelBorder(type: Int): Border = ???

    @stub
    // Creates a beveled border of the specified type with softened corners,
    // using the specified highlighting and shadowing.
    def createSoftBevelBorder(type: Int, highlight: Color, shadow: Color): Border = ???

    @stub
    // Creates a beveled border of the specified type with softened corners,
    // using the specified colors for the inner and outer edges
    // of the highlight and the shadow areas.
    def createSoftBevelBorder(type: Int, highlightOuter: Color, highlightInner: Color, shadowOuter: Color, shadowInner: Color): Border = ???

    @stub
    // Creates a border of the specified stroke.
    def createStrokeBorder(stroke: BasicStroke): Border = ???

    @stub
    // Creates a border of the specified stroke and paint.
    def createStrokeBorder(stroke: BasicStroke, paint: Paint): Border = ???

    @stub
    // Creates a new titled border with an empty title,
    // the specified border object,
    // the default text position (determined by the current look and feel),
    // the default justification (leading), and the default
    // font and text color (determined by the current look and feel).
    def createTitledBorder(border: Border): TitledBorder = ???

    @stub
    // Adds a title to an existing border,
    // with default positioning (determined by the current look and feel),
    // default justification (leading) and the default
    // font and text color (determined by the current look and feel).
    def createTitledBorder(border: Border, title: String): TitledBorder = ???

    @stub
    // Adds a title to an existing border, with the specified
    // positioning and using the default
    // font and text color (determined by the current look and feel).
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int): TitledBorder = ???

    @stub
    // Adds a title to an existing border, with the specified
    // positioning and font, and using the default text color
    // (determined by the current look and feel).
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font): TitledBorder = ???

    @stub
    // Adds a title to an existing border, with the specified
    // positioning, font and color.
    def createTitledBorder(border: Border, title: String, titleJustification: Int, titlePosition: Int, titleFont: Font, titleColor: Color): TitledBorder = ???
}
