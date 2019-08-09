package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TableHeaderUI}
import javax.swing.plaf.basic.BasicTableHeaderUI

/** Provides the Synth L&F UI delegate for
 *  JTableHeader.
 */
class SynthTableHeaderUI extends BasicTableHeaderUI with PropertyChangeListener with SynthUI {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Initializes JTableHeader properties such as font, foreground, and background. */
    @stub
    protected def installDefaults(): Unit = ???

    /** Attaches listeners to the JTableHeader. */
    @stub
    protected def installListeners(): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed. */
    @stub
    def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /** This method gets called every time when a rollover column in the table
     *  header is updated.
     */
    @stub
    protected def rolloverColumnUpdated(oldColumn: Int, newColumn: Int): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthTableHeaderUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(h: JComponent): ComponentUI = ???
}
