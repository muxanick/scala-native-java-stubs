package javax.swing.plaf.basic

import java.beans.PropertyChangeEvent
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{EditorKit, JTextComponent}

// Provides the look and feel for a JEditorPane.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class BasicEditorPaneUI extends BasicTextUI {

    @stub
    // Fetches the EditorKit for the UI.
    def getEditorKit(tc: JTextComponent): EditorKit = ???

    @stub
    // Fetches the name used as a key to lookup properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???

    @stub
    // Installs the UI for a component.
    def installUI(c: JComponent): Unit = ???

    @stub
    // This method gets called when a bound property is changed
    // on the associated JTextComponent.
    protected def propertyChange(evt: PropertyChangeEvent): Unit = ???
}

object BasicEditorPaneUI {
    @stub
    // Creates a UI for the JTextPane.
    def createUI(c: JComponent): ComponentUI = ???
}
