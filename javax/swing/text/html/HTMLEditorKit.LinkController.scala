package javax.swing.text.html

import java.awt.event.{MouseAdapter, MouseEvent, MouseMotionListener}
import java.io.Serializable
import java.lang.Object
import javax.swing.JEditorPane

/** Class to watch the associated component and fire
 *  hyperlink events on it when appropriate.
 */
object HTMLEditorKit.LinkController extends MouseAdapter with MouseMotionListener with Serializable {

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
}
