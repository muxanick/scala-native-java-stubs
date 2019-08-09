package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener}
import java.lang.Object

// Listener for scrolling events initiated in the
// ScrollPane.
protected class BasicScrollBarUI.ScrollListener extends Object with ActionListener {

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
