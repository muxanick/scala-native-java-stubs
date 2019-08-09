package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener, ComponentAdapter, ComponentEvent}
import java.lang.Object
import javax.swing.{JScrollBar, JScrollPane}

/** Updates the preferred size when scrolling (if necessary). */
class BasicTreeUI.ComponentHandler extends ComponentAdapter with ActionListener {

    /** ScrollBar that is being adjusted. */
    @stub
    protected val scrollBar: JScrollBar = ???

    /** Public as a result of Timer. */
    @stub
    def actionPerformed(ae: ActionEvent): Unit = ???

    /** Invoked when the component's position changes. */
    @stub
    def componentMoved(e: ComponentEvent): Unit = ???

    /** Returns the JScrollPane housing the JTree, or null if one isn't
     *  found.
     */
    @stub
    protected def getScrollPane(): JScrollPane = ???
}
