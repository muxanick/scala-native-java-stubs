package javax.swing.plaf.basic

import java.awt.event.{MouseAdapter, MouseEvent}
import java.lang.Object
import javax.swing.JList
import scala.scalanative.annotation.stub

/**  */
protected class BasicFileChooserUI.DoubleClickListener extends MouseAdapter {

    /**  */
    @stub
    def DoubleClickListener(list: JList) = ???

    /** Invoked when the mouse button has been clicked (pressed
     *  and released) on a component.
     */
    @stub
    def mouseClicked(e: MouseEvent): Unit = ???

    /** The JList used for representing the files is created by subclasses, but the
     *  selection is monitored in this class.
     */
    @stub
    def mouseEntered(e: MouseEvent): Unit = ???
}
