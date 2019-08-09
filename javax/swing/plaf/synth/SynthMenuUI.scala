package javax.swing.plaf.synth

import java.awt.{Dimension, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{Icon, JComponent}
import javax.swing.plaf.{ButtonUI, ComponentUI, MenuItemUI}
import javax.swing.plaf.basic.{BasicMenuItemUI, BasicMenuUI}

// Provides the Synth L&F UI delegate for
// JMenu.
class SynthMenuUI extends BasicMenuUI with PropertyChangeListener, with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // 
    protected def getPreferredMenuItemSize(c: JComponent, checkIcon: Icon, arrowIcon: Icon, defaultTextIconGap: Int): Dimension = ???

    @stub
    // 
    protected def installDefaults(): Unit = ???

    @stub
    // 
    protected def installListeners(): Unit = ???

    @stub
    // Paints the specified component according to the Look and Feel.
    def paint(g: Graphics, c: JComponent): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // 
    protected def uninstallDefaults(): Unit = ???

    @stub
    // 
    protected def uninstallListeners(): Unit = ???

    @stub
    // Reverses configuration which was done on the specified component during
    // installUI.
    def uninstallUI(c: JComponent): Unit = ???
}

object SynthMenuUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(x: JComponent): ComponentUI = ???
}
