package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, ListUI}
import javax.swing.plaf.basic.BasicListUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JList.
 */
class SynthListUI extends BasicListUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Initializes list properties such as font, foreground, and background,
     *  and adds the CellRendererPane.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Creates and installs the listeners for the JList, its model, and its
     *  selectionModel.
     */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** Sets the list properties that have not been explicitly overridden to
     *  null.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Removes the listeners from the JList, its model, and its
     *  selectionModel.
     */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthListUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(list: JComponent): ComponentUI = ???
}
