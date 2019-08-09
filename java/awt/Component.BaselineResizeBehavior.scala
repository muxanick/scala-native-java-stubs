package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of the common ways the baseline of a component can
 *  change as the size changes.  The baseline resize behavior is
 *  primarily for layout managers that need to know how the
 *  position of the baseline changes as the component size changes.
 *  In general the baseline resize behavior will be valid for sizes
 *  greater than or equal to the minimum size (the actual minimum
 *  size; not a developer specified minimum size).  For sizes
 *  smaller than the minimum size the baseline may change in a way
 *  other than the baseline resize behavior indicates.  Similarly,
 *  as the size approaches Integer.MAX_VALUE and/or
 *  Short.MAX_VALUE the baseline may change in a way
 *  other than the baseline resize behavior indicates.
 */
class Component.BaselineResizeBehavior private (name: String, ordinal: Int) extends Enum[Component.BaselineResizeBehavior](name, ordinal) {
}

object Component.BaselineResizeBehavior {
    /** Indicates the baseline remains a fixed distance from
     *  the center of the component.
     */
    final val CENTER_OFFSET = new Component.BaselineResizeBehavior(CENTER_OFFSET, 0)

    /** Indicates the baseline remains fixed relative to the
     *  y-origin.
     */
    final val CONSTANT_ASCENT = new Component.BaselineResizeBehavior(CONSTANT_ASCENT, 1)

    /** Indicates the baseline remains fixed relative to the height
     *  and does not change as the width is varied.
     */
    final val CONSTANT_DESCENT = new Component.BaselineResizeBehavior(CONSTANT_DESCENT, 2)

    /** Indicates the baseline resize behavior can not be expressed using
     *  any of the other constants.
     */
    final val OTHER = new Component.BaselineResizeBehavior(OTHER, 3)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Component.BaselineResizeBehavior = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Component.BaselineResizeBehavior] = ???
}
