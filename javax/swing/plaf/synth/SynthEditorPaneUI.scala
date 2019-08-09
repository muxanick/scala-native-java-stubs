package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicEditorPaneUI, BasicTextUI}

// Provides the Synth L&F UI delegate for
// JEditorPane.
class SynthEditorPaneUI extends BasicEditorPaneUI with SynthUI {

    @stub
    // Returns the Context for the specified component.
    def getContext(c: JComponent): SynthContext = ???

    @stub
    // Initializes component properties, such as font, foreground,
    // background, caret color, selection color, selected text color,
    // disabled text color, and border color.
    protected def installDefaults(): Unit = ???

    @stub
    // Paints the specified component.
    protected def paint(context: SynthContext, g: Graphics): Unit = ???

    @stub
    // Paints a background for the view.
    protected def paintBackground(g: Graphics): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???

    @stub
    // This method gets called when a bound property is changed
    // on the associated JTextComponent.
    protected def propertyChange(evt: PropertyChangeEvent): Unit = ???

    @stub
    // Sets the component properties that have not been explicitly overridden
    // to null.
    protected def uninstallDefaults(): Unit = ???
}

object SynthEditorPaneUI {
    @stub
    // Creates a new UI object for the given component.
    def createUI(c: JComponent): ComponentUI = ???
}
