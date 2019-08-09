package javax.swing.plaf

import java.lang.Object
import javax.swing.JOptionPane

// Pluggable look and feel interface for JOptionPane.
abstract class OptionPaneUI extends ComponentUI {

    // Returns true if the user has supplied instances of Component for
    // either the options or message.
    def containsCustomComponents(op: JOptionPane): Boolean
}
