package javax.swing.plaf.synth

import java.awt.Graphics
import java.beans.PropertyChangeEvent
import java.lang.Object
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicTextAreaUI, BasicTextUI}

// Provides the look and feel for a plain text editor in the
// Synth look and feel. In this implementation the default UI
// is extended to act as a simple view factory.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SynthTextAreaUI extends BasicTextAreaUI with SynthUI {

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

object SynthTextAreaUI {
    @stub
    // Creates a UI object for a JTextArea.
    def createUI(ta: JComponent): ComponentUI = ???
}