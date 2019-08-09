package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object

// Scroll-event listener.
//
// This class should be treated as a "protected" inner class.
// Instantiate it only within subclasses of Foo.
class BasicSliderUI.ScrollListener extends Object with ActionListener {

    @stub
    // 
    def ScrollListener() = ???

    @stub
    // Invoked when an action occurs.
    def actionPerformed(e: ActionEvent): Unit = ???

    @stub
    // 
    def setDirection(direction: Int): Unit = ???
}
