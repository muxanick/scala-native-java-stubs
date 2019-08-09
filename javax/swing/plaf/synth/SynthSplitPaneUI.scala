package javax.swing.plaf.synth

import java.awt.{Component, Graphics}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.Object
import javax.swing.{JComponent, JSplitPane}
import javax.swing.plaf.{ComponentUI, SplitPaneUI}
import javax.swing.plaf.basic.{BasicSplitPaneDivider, BasicSplitPaneUI}

/** Provides the Synth L&F UI delegate for
 *  JSplitPane.
 */
class SynthSplitPaneUI extends BasicSplitPaneUI with PropertyChangeListener with SynthUI {

    /** Creates the default divider. */
    @stub
    def createDefaultDivider(): BasicSplitPaneDivider = ???

    /** Returns the default non continuous layout divider, which is an
     *  instance of Canvas that fills in the background with dark gray.
     */
    @stub
    protected def createDefaultNonContinuousLayoutDivider(): Component = ???

    /** Called when the specified split pane has finished painting
     *  its children.
     */
    @stub
    def finishedPaintingChildren(jc: JSplitPane, g: Graphics): Unit = ???

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Installs the UI defaults. */
    @stub
    protected def installDefaults(): Unit = ???

    /** Installs the event listeners for the UI. */
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

    /** Uninstalls the UI defaults. */
    @stub
    protected def uninstallDefaults(): Unit = ???

    /** Uninstalls the event listeners from the UI. */
    @stub
    protected def uninstallListeners(): Unit = ???
}

object SynthSplitPaneUI {
    /** Creates a new SynthSplitPaneUI instance */
    @stub
    def createUI(x: JComponent): ComponentUI = ???
}
