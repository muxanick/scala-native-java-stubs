package java.awt

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration of available window types.
 * 
 *  A window type defines the generic visual appearance and behavior of a
 *  top-level window. For example, the type may affect the kind of
 *  decorations of a decorated Frame or Dialog instance.
 *  
 *  Some platforms may not fully support a certain window type. Depending on
 *  the level of support, some properties of the window type may be
 *  disobeyed.
 */
class Window_Type private (name: String, ordinal: Int) extends Enum[Window.Type](name, ordinal) {
}

object Window_Type {
    /** Represents a normal window. */
    final val NORMAL = new Window.Type(NORMAL, 0)

    /** Represents a popup window. */
    final val POPUP = new Window.Type(POPUP, 1)

    /** Represents a utility window. */
    final val UTILITY = new Window.Type(UTILITY, 2)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): Window.Type = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[Window.Type] = ???
}
