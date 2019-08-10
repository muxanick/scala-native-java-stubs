package javax.swing.text.html

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.io.Serializable
import java.lang.Object
import javax.swing.JEditorPane
import scala.scalanative.annotation.stub

/** Class to watch the associated component and fire
 *  hyperlink events on it when appropriate.
 */
object HTMLEditorKit_LinkController extends MouseAdapter with MouseMotionListener with Serializable {

    /**  */
    @stub
    def LinkController() = ???

    /** Calls linkActivated on the associated JEditorPane
     *  if the given position represents a link.
     */
    @stub
    protected def activateLink(pos: Int, editor: JEditorPane): Unit = ???

    /** Called for a mouse click event. */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** Invoked when a mouse button is pressed on a component and then
     *  dragged.
     */
    @stub
    def mouseDragged(e: MouseEvent): Unit = ???

    /** Invoked when the mouse cursor has been moved onto a component
     *  but no buttons have been pushed.
     */
    @stub
    def mouseMoved(e: MouseEvent): Unit = ???
}
