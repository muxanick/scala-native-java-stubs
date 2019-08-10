package javax.swing

import java.awt.Container
import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** LayoutStyle provides information about how to position
 *  components.  This class is primarily useful for visual tools and
 *  layout managers.  Most developers will not need to use this class.
 *  
 *  You typically don't set or create a
 *  LayoutStyle.  Instead use the static method
 *  getInstance to obtain the current instance.
 */
abstract class LayoutStyle extends Object {

    /** Creates a new LayoutStyle. */
    @stub
    def this() = ???

    /** Returns the amount of space to place between the component and specified
     *  edge of its parent.
     */
    def getContainerGap(component: JComponent, position: Int, parent: Container): Int

    /** Returns the amount of space to use between two components. */
    def getPreferredGap(component1: JComponent, component2: JComponent, type: LayoutStyle.ComponentPlacement, position: Int, parent: Container): Int
}

object LayoutStyle {
    /** ComponentPlacement is an enumeration of the
     *  possible ways two components can be placed relative to each
     *  other.  ComponentPlacement is used by the
     *  LayoutStyle method getPreferredGap.  Refer to
     *  LayoutStyle for more information.
     */
    class ComponentPlacement private (name: String, ordinal: Int) extends Enum[ComponentPlacement](name, ordinal) {
    }

    object ComponentPlacement {
        /** Enumeration value indicating the distance to indent a component
         *  is being requested.
         */
        final val INDENT: ComponentPlacement = new ComponentPlacement("INDENT", 0)

        /** Enumeration value indicating the two components are
         *  visually related and will be placed in the same parent.
         */
        final val RELATED: ComponentPlacement = new ComponentPlacement("RELATED", 1)

        /** Enumeration value indicating the two components are
         *  visually unrelated and will be placed in the same parent.
         */
        final val UNRELATED: ComponentPlacement = new ComponentPlacement("UNRELATED", 2)

        /** Returns the enum constant of this type with the specified name. */
        @stub
        def valueOf(name: String): ComponentPlacement = ???

        /** Returns an array containing the constants of this enum type, in
         * the order they are declared.
         */
        @stub
        def values(): Array[ComponentPlacement] = ???
    }


    /** Returns the shared instance of LayoutStyle. */
    @stub
    def getInstance(): LayoutStyle = ???

    /** Sets the shared instance of LayoutStyle. */
    @stub
    def setInstance(style: LayoutStyle): Unit = ???
}
