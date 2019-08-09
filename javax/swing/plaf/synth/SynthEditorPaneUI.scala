package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicEditorPaneUI, BasicTextUI}

/** Provides the Synth L&F UI delegate for
 *  JEditorPane.
 */
class SynthEditorPaneUI extends BasicEditorPaneUI with SynthUI {

    /** Returns the Context for the specified component. */
    @stub
    def getContext(c: JComponent): SynthContext = ???

    /** Initializes component properties, such as font, foreground,
     *  background, caret color, selection color, selected text color,
     *  disabled text color, and border color.
     */
    @stub
    protected def installDefaults(): Unit = ???

    /** Paints the specified component. */
    @stub
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    /** Paints a background for the view. */
    @stub
    protected def paintBackground(g: Graphics): Unit = ???

    /** Paints the border. */
    @stub
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    /** This method gets called when a bound property is changed
     *  on the associated JTextComponent.
     */
    @stub
    protected def propertyChange(evt: PropertyChangeEvent): Unit = ???

    /** Sets the component properties that have not been explicitly overridden
     *  to null.
     */
    @stub
    protected def uninstallDefaults(): Unit = ???
}

object SynthEditorPaneUI {
    /** Creates a new UI object for the given component. */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
