package javax.swing.plaf.synth

import java.awt.Graphics
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.plaf.basic.{BasicEditorPaneUI, BasicTextUI}

// Provides the look and feel for a styled text editor in the
// Synth look and feel.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class SynthTextPaneUI extends SynthEditorPaneUI {

    @stub
    // Fetches the name used as a key to lookup properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???

    @stub
    // Installs the UI for a component.
    def installUI(c: JComponent): Unit = ???

    @stub
    // Paints the border.
    def paintBorder(context: SynthContext, g: Graphics, x: Int, y: Int, w: Int, h: Int): Unit = ???
}

object SynthTextPaneUI {
    @stub
    // Creates a UI for the JTextPane.
    def createUI(c: JComponent): ComponentUI = ???
}
