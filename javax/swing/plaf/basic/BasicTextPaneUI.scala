package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}

// Provides the look and feel for a styled text editor.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicTextPaneUI extends BasicEditorPaneUI {

    @stub
    // Fetches the name used as a key to lookup properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???

    @stub
    // Installs the UI for a component.
    def installUI(c: JComponent): Unit = ???
}

object BasicTextPaneUI {
    @stub
    // Creates a UI for the JTextPane.
    def createUI(c: JComponent): ComponentUI = ???
}
