package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, DesktopPaneUI}
import javax.swing.plaf.basic.BasicDesktopPaneUI

/** Provides the Synth L&F UI delegate for
 *  JDesktopPane.
 */
class SynthDesktopPaneUI extends BasicDesktopPaneUI with PropertyChangeListener with SynthUI {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
    @stub
    protected def installDesktopManager(): Unit = ???

    /** Installs the PropertyChangeListener returned from
     *  createPropertyChangeListener on the
     *  JDesktopPane.
     */
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

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallDesktopManager(): Unit = ???

    /** Uninstalls the PropertyChangeListener returned from
     *  createPropertyChangeListener from the
     *  JDesktopPane.
     */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthDesktopPaneUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
