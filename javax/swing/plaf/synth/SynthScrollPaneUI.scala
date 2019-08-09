package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JScrollPane}
import javax.swing.plaf.{ComponentUI, ScrollPaneUI}
import javax.swing.plaf.basic.BasicScrollPaneUI
import scala.scalanative.annotation.stub

/** Provides the Synth L&F UI delegate for
 *  JScrollPane.
 */
class SynthScrollPaneUI extends BasicScrollPaneUI with PropertyChangeListener with SynthUI {

    /**  */
    @stub
    def this() = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def installDefaults(scrollpane: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def installListeners(c: JScrollPane): Unit = ???

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
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(c: JScrollPane): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(c: JComponent): Unit = ???

    /** Notifies this UI delegate to repaint the specified component. */
    @stub
    def update(g: Graphics, c: JComponent): Unit = ???
}

object SynthScrollPaneUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
