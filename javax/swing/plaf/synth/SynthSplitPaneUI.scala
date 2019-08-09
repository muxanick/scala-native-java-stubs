package javax.swing.plaf.synth

import java.awt.{Component, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSplitPane}
import javax.swing.plaf.{ComponentUI, SplitPaneUI}
import javax.swing.plaf.basic.{BasicSplitPaneDivider, BasicSplitPaneUI}

// Provides the Synth L&F UI delegate for
// JSplitPane.
class SynthSplitPaneUI extends BasicSplitPaneUI with PropertyChangeListener, with SynthUI {

    @stub
    // Creates the default divider.
    def createDefaultDivider(): BasicSplitPaneDivider = ???

    @stub
    // Returns the default non continuous layout divider, which is an
    // instance of Canvas that fills in the background with dark gray.
    protected def createDefaultNonContinuousLayoutDivider(): Component = ???

    @stub
    // Called when the specified split pane has finished painting
    // its children.
    def finishedPaintingChildren(jc: JSplitPane, g: Graphics): Unit = ???

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Installs the UI defaults.
    protected def installDefaults(): Unit = ???

    @stub
    // Installs the event listeners for the UI.
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
    // Uninstalls the UI defaults.
    protected def uninstallDefaults(): Unit = ???

    @stub
    // Uninstalls the event listeners from the UI.
    protected def uninstallListeners(): Unit = ???
}

object SynthSplitPaneUI {
    @stub
    // Creates a new SynthSplitPaneUI instance
    def createUI(x: JComponent): ComponentUI = ???
}
