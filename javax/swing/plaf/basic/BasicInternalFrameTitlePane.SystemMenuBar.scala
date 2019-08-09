package javax.swing.plaf.basic

import java.awt.{Component, Container, Graphics}
import java.lang.Object
import javax.swing.{JComponent, JMenuBar}

/** This class should be treated as a "protected" inner class.
 *  Instantiate it only within subclasses of Foo.
 */
class BasicInternalFrameTitlePane.SystemMenuBar extends JMenuBar {

    /** Returns whether this Component can become the focus
     *  owner.
     */
    @stub
    def isFocusTraversable(): Boolean = ???

    /** Returns true if this component is completely opaque. */
    @stub
    def isOpaque(): Boolean = ???

    /** Invoked by Swing to draw components. */
    @stub
    def paint(g: Graphics): Unit = ???
}
