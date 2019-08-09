package java.awt

import java.lang.{Enum, Object, String}

// Enumeration of available window types.
//
// A window type defines the generic visual appearance and behavior of a
// top-level window. For example, the type may affect the kind of
// decorations of a decorated Frame or Dialog instance.
// 
// Some platforms may not fully support a certain window type. Depending on
// the level of support, some properties of the window type may be
// disobeyed.
class Window.Type private (name: String, ordinal: Int) extends Enum[Window.Type](name, ordinal) {
}

object Window.Type {
    // Represents a normal window.
    final val NORMAL = new Window.Type(NORMAL, 0)

    // Represents a popup window.
    final val POPUP = new Window.Type(POPUP, 1)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): Window.Type = ???
}
