package javax.swing

import java.lang.{Enum, Object, String}

/** ComponentPlacement is an enumeration of the
 *  possible ways two components can be placed relative to each
 *  other.  ComponentPlacement is used by the
 *  LayoutStyle method getPreferredGap.  Refer to
 *  LayoutStyle for more information.
 */
class LayoutStyle.ComponentPlacement private (name: String, ordinal: Int) extends Enum[LayoutStyle.ComponentPlacement](name, ordinal) {
}

object LayoutStyle.ComponentPlacement {
    /** Enumeration value indicating the distance to indent a component
     *  is being requested.
     */
    final val INDENT = new LayoutStyle.ComponentPlacement(INDENT, 0)

    /** Enumeration value indicating the two components are
     *  visually related and will be placed in the same parent.
     */
    final val RELATED = new LayoutStyle.ComponentPlacement(RELATED, 1)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): LayoutStyle.ComponentPlacement = ???
}
