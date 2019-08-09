package javax.swing.plaf.basic

import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Element, View}

// Provides the Windows look and feel for a password field.
// The only difference from the standard text field is that
// the view of the text is simply a string of the echo
// character as specified in JPasswordField, rather than the
// real text contained in the field.
class BasicPasswordFieldUI extends BasicTextFieldUI {

    @stub
    // Creates a view (PasswordView) for an element.
    def create(elem: Element): View = ???

    @stub
    // Fetches the name used as a key to look up properties through the
    // UIManager.
    protected def getPropertyPrefix(): String = ???
}

object BasicPasswordFieldUI {
    @stub
    // Creates a UI for a JPasswordField.
    def createUI(c: JComponent): ComponentUI = ???
}
