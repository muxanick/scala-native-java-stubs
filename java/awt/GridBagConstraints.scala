package java.awt

import java.io.Serializable
import java.lang.{Cloneable, Object}

// The GridBagConstraints class specifies constraints
// for components that are laid out using the
// GridBagLayout class.
class GridBagConstraints extends Object with Cloneable, with Serializable {

    @stub
    // Creates a GridBagConstraint object with
    // all of its fields set to their default value.
    def this() = ???

    @stub
    // This field is used when the component is smaller than its
    // display area.
    def anchor: Int = ???

    @stub
    // This field is used when the component's display area is larger
    // than the component's requested size.
    def fill: Int = ???

    @stub
    // Specifies the number of cells in a column for the component's
    // display area.
    def gridheight: Int = ???

    @stub
    // Specifies the number of cells in a row for the component's
    // display area.
    def gridwidth: Int = ???

    @stub
    // Specifies the cell containing the leading edge of the component's
    // display area, where the first cell in a row has gridx=0.
    def gridx: Int = ???

    @stub
    // Specifies the cell at the top of the component's display area,
    // where the topmost cell has gridy=0.
    def gridy: Int = ???

    @stub
    // This field specifies the external padding of the component, the
    // minimum amount of space between the component and the edges of its
    // display area.
    def insets: Insets = ???

    @stub
    // This field specifies the internal padding of the component, how much
    // space to add to the minimum width of the component.
    def ipadx: Int = ???

    @stub
    // This field specifies the internal padding, that is, how much
    // space to add to the minimum height of the component.
    def ipady: Int = ???

    @stub
    // Specifies how to distribute extra horizontal space.
    def weightx: double = ???

    @stub
    // Specifies how to distribute extra vertical space.
    def weighty: double = ???
}

object GridBagConstraints {
    @stub
    // Possible value for the anchor field.
    def ABOVE_BASELINE: Int = ???

    @stub
    // Possible value for the anchor field.
    def ABOVE_BASELINE_LEADING: Int = ???

    @stub
    // Possible value for the anchor field.
    def ABOVE_BASELINE_TRAILING: Int = ???

    @stub
    // Possible value for the anchor field.
    def BASELINE: Int = ???

    @stub
    // Possible value for the anchor field.
    def BASELINE_LEADING: Int = ???

    @stub
    // Possible value for the anchor field.
    def BASELINE_TRAILING: Int = ???

    @stub
    // Possible value for the anchor field.
    def BELOW_BASELINE: Int = ???

    @stub
    // Possible value for the anchor field.
    def BELOW_BASELINE_LEADING: Int = ???

    @stub
    // Possible value for the anchor field.
    def BELOW_BASELINE_TRAILING: Int = ???

    @stub
    // Resize the component both horizontally and vertically.
    def BOTH: Int = ???

    @stub
    // Put the component in the center of its display area.
    def CENTER: Int = ???

    @stub
    // Put the component on the right side of its display area,
    // centered vertically.
    def EAST: Int = ???

    @stub
    // Place the component in the corner of its display area where
    // the first line of text on a page would normally end for the current
    // ComponentOrientation.
    def FIRST_LINE_END: Int = ???

    @stub
    // Place the component in the corner of its display area where
    // the first line of text on a page would normally begin for the current
    // ComponentOrientation.
    def FIRST_LINE_START: Int = ???

    @stub
    // Resize the component horizontally but not vertically.
    def HORIZONTAL: Int = ???

    @stub
    // Place the component in the corner of its display area where
    // the last line of text on a page would normally end for the current
    // ComponentOrientation.
    def LAST_LINE_END: Int = ???

    @stub
    // Place the component in the corner of its display area where
    // the last line of text on a page would normally start for the current
    // ComponentOrientation.
    def LAST_LINE_START: Int = ???

    @stub
    // Place the component centered along the edge of its display area where
    // lines of text would normally end for the current
    // ComponentOrientation.
    def LINE_END: Int = ???

    @stub
    // Place the component centered along the edge of its display area where
    // lines of text would normally begin for the current
    // ComponentOrientation.
    def LINE_START: Int = ???

    @stub
    // Do not resize the component.
    def NONE: Int = ???

    @stub
    // Put the component at the top of its display area,
    // centered horizontally.
    def NORTH: Int = ???

    @stub
    // Put the component at the top-right corner of its display area.
    def NORTHEAST: Int = ???

    @stub
    // Put the component at the top-left corner of its display area.
    def NORTHWEST: Int = ???

    @stub
    // Place the component centered along the edge of its display area
    // associated with the end of a page for the current
    // ComponentOrientation.
    def PAGE_END: Int = ???

    @stub
    // Place the component centered along the edge of its display area
    // associated with the start of a page for the current
    // ComponentOrientation.
    def PAGE_START: Int = ???

    @stub
    // Specifies that this component is the next-to-last component in its
    // column or row (gridwidth, gridheight),
    // or that this component be placed next to the previously added
    // component (gridx, gridy).
    def RELATIVE: Int = ???

    @stub
    // Specifies that this component is the
    // last component in its column or row.
    def REMAINDER: Int = ???

    @stub
    // Put the component at the bottom of its display area, centered
    // horizontally.
    def SOUTH: Int = ???

    @stub
    // Put the component at the bottom-right corner of its display area.
    def SOUTHEAST: Int = ???

    @stub
    // Put the component at the bottom-left corner of its display area.
    def SOUTHWEST: Int = ???

    @stub
    // Resize the component vertically but not horizontally.
    def VERTICAL: Int = ???
}
