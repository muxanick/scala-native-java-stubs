package javax.swing.plaf.basic

import java.awt.{Component, Container, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JMenuBar}

// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of Foo.
class BasicInternalFrameTitlePane.SystemMenuBar extends JMenuBar {

    @stub
    // Returns whether this Component can become the focus
    // owner.
    def isFocusTraversable(): Boolean = ???

    @stub
    // Returns true if this component is completely opaque.
    def isOpaque(): Boolean = ???

    @stub
    // Invoked by Swing to draw components.
    def paint(g: Graphics): Unit = ???
}
