package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener, ComponentAdapter, ComponentEvent}
import java.lang.Object
import javax.swing.{JScrollBar, JScrollPane}

// Updates the preferred size when scrolling (if necessary).
class BasicTreeUI.ComponentHandler extends ComponentAdapter with ActionListener {

    @stub
    // ScrollBar that is being adjusted.
    protected def scrollBar: JScrollBar = ???

    @stub
    // Public as a result of Timer.
    def actionPerformed(ae: ActionEvent): Unit = ???

    @stub
    // Invoked when the component's position changes.
    def componentMoved(e: ComponentEvent): Unit = ???

    @stub
    // Returns the JScrollPane housing the JTree, or null if one isn't
    // found.
    protected def getScrollPane(): JScrollPane = ???
}
