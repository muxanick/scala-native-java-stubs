package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, ActionListener, ComponentAdapter, ComponentEvent}
import java.lang.Object
import javax.swing.{JScrollBar, JScrollPane, Timer}
import scala.scalanative.annotation.stub

/** Updates the preferred size when scrolling (if necessary). */
class BasicTreeUI_ComponentHandler extends ComponentAdapter with ActionListener {

    /**  */
    @stub
    def ComponentHandler() = ???

    /** ScrollBar that is being adjusted. */
    @stub
    protected val scrollBar: JScrollBar = ???

    /** Timer used when inside a scrollpane and the scrollbar is
     *  adjusting.
     */
    @stub
    protected val timer: Timer = ???

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

    /** Creates, if necessary, and starts a Timer to check if need to
     *  resize the bounds.
     */
    @stub
    protected def startTimer(): Unit = ???
}
