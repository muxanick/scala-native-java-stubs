package java.awt

import java.io.Serializable
import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** The GridBagConstraints class specifies constraints
 *  for components that are laid out using the
 *  GridBagLayout class.
 */
class GridBagConstraints extends Object with Cloneable with Serializable {

    /** Creates a GridBagConstraint object with
     *  all of its fields set to their default value.
     */
    @stub
    def this() = ???

    /** Creates a GridBagConstraints object with
     *  all of its fields set to the passed-in arguments.
     */
    @stub
    def this(gridx: Int, gridy: Int, gridwidth: Int, gridheight: Int, weightx: Double, weighty: Double, anchor: Int, fill: Int, insets: Insets, ipadx: Int, ipady: Int) = ???

    /** This field is used when the component is smaller than its
     *  display area.
     */
    @stub
    val anchor: Int = ???

    /** This field is used when the component's display area is larger
     *  than the component's requested size.
     */
    @stub
    val fill: Int = ???

    /** Specifies the number of cells in a column for the component's
     *  display area.
     */
    @stub
    val gridheight: Int = ???

    /** Specifies the number of cells in a row for the component's
     *  display area.
     */
    @stub
    val gridwidth: Int = ???

    /** Specifies the cell containing the leading edge of the component's
     *  display area, where the first cell in a row has gridx=0.
     */
    @stub
    val gridx: Int = ???

    /** Specifies the cell at the top of the component's display area,
     *  where the topmost cell has gridy=0.
     */
    @stub
    val gridy: Int = ???

    /** This field specifies the external padding of the component, the
     *  minimum amount of space between the component and the edges of its
     *  display area.
     */
    @stub
    val insets: Insets = ???

    /** This field specifies the internal padding of the component, how much
     *  space to add to the minimum width of the component.
     */
    @stub
    val ipadx: Int = ???

    /** This field specifies the internal padding, that is, how much
     *  space to add to the minimum height of the component.
     */
    @stub
    val ipady: Int = ???

    /** Specifies how to distribute extra horizontal space. */
    @stub
    val weightx: Double = ???

    /** Specifies how to distribute extra vertical space. */
    @stub
    val weighty: Double = ???

    /** Creates a copy of this grid bag constraint. */
    @stub
    def clone(): Any = ???
}

object GridBagConstraints {
    /** Possible value for the anchor field. */
    @stub
    val ABOVE_BASELINE: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val ABOVE_BASELINE_LEADING: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val ABOVE_BASELINE_TRAILING: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BASELINE: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BASELINE_LEADING: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BASELINE_TRAILING: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BELOW_BASELINE: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BELOW_BASELINE_LEADING: Int = ???

    /** Possible value for the anchor field. */
    @stub
    val BELOW_BASELINE_TRAILING: Int = ???

    /** Resize the component both horizontally and vertically. */
    @stub
    val BOTH: Int = ???

    /** Put the component in the center of its display area. */
    @stub
    val CENTER: Int = ???

    /** Put the component on the right side of its display area,
     *  centered vertically.
     */
    @stub
    val EAST: Int = ???

    /** Place the component in the corner of its display area where
     *  the first line of text on a page would normally end for the current
     *  ComponentOrientation.
     */
    @stub
    val FIRST_LINE_END: Int = ???

    /** Place the component in the corner of its display area where
     *  the first line of text on a page would normally begin for the current
     *  ComponentOrientation.
     */
    @stub
    val FIRST_LINE_START: Int = ???

    /** Resize the component horizontally but not vertically. */
    @stub
    val HORIZONTAL: Int = ???

    /** Place the component in the corner of its display area where
     *  the last line of text on a page would normally end for the current
     *  ComponentOrientation.
     */
    @stub
    val LAST_LINE_END: Int = ???

    /** Place the component in the corner of its display area where
     *  the last line of text on a page would normally start for the current
     *  ComponentOrientation.
     */
    @stub
    val LAST_LINE_START: Int = ???

    /** Place the component centered along the edge of its display area where
     *  lines of text would normally end for the current
     *  ComponentOrientation.
     */
    @stub
    val LINE_END: Int = ???

    /** Place the component centered along the edge of its display area where
     *  lines of text would normally begin for the current
     *  ComponentOrientation.
     */
    @stub
    val LINE_START: Int = ???

    /** Do not resize the component. */
    @stub
    val NONE: Int = ???

    /** Put the component at the top of its display area,
     *  centered horizontally.
     */
    @stub
    val NORTH: Int = ???

    /** Put the component at the top-right corner of its display area. */
    @stub
    val NORTHEAST: Int = ???

    /** Put the component at the top-left corner of its display area. */
    @stub
    val NORTHWEST: Int = ???

    /** Place the component centered along the edge of its display area
     *  associated with the end of a page for the current
     *  ComponentOrientation.
     */
    @stub
    val PAGE_END: Int = ???

    /** Place the component centered along the edge of its display area
     *  associated with the start of a page for the current
     *  ComponentOrientation.
     */
    @stub
    val PAGE_START: Int = ???

    /** Specifies that this component is the next-to-last component in its
     *  column or row (gridwidth, gridheight),
     *  or that this component be placed next to the previously added
     *  component (gridx, gridy).
     */
    @stub
    val RELATIVE: Int = ???

    /** Specifies that this component is the
     *  last component in its column or row.
     */
    @stub
    val REMAINDER: Int = ???

    /** Put the component at the bottom of its display area, centered
     *  horizontally.
     */
    @stub
    val SOUTH: Int = ???

    /** Put the component at the bottom-right corner of its display area. */
    @stub
    val SOUTHEAST: Int = ???

    /** Put the component at the bottom-left corner of its display area. */
    @stub
    val SOUTHWEST: Int = ???

    /** Resize the component vertically but not horizontally. */
    @stub
    val VERTICAL: Int = ???

    /** Put the component on the left side of its display area,
     *  centered vertically.
     */
    @stub
    val WEST: Int = ???
}
