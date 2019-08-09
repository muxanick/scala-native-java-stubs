package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.{JComponent, JRootPane}
import javax.swing.plaf.{ComponentUI, RootPaneUI}
import javax.swing.plaf.basic.BasicRootPaneUI

/** Provides the Synth L&F UI delegate for
 *  JRootPane.
 */
class SynthRootPaneUI extends BasicRootPaneUI with SynthUI {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def installDefaults(c: JRootPane): Unit = ???

    /** Paints the specified component according to the Look and Feel. */
    @stub
    def paint(g: Graphics, c: JComponent): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** Invoked when a property changes on the root pane. */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(root: JRootPane): Unit = ???
}

object SynthRootPaneUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
