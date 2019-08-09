package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import javax.swing.plaf.basic.BasicMenuItemUI

/** Provides the Synth L&F UI delegate for
 *  JMenuItem.
 */
class SynthMenuItemUI extends BasicMenuItemUI with PropertyChangeListener with SynthUI {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /**  */
    @stub
    protected def getPreferredMenuItemSize(c: JComponent, checkIcon: Icon, arrowIcon: Icon, defaultTextIconGap: Int): Dimension = ???

    /**  */
    @stub
    protected def installDefaults(): Unit = ???

    /**  */
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
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthMenuItemUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
