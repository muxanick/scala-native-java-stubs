package javax.swing.plaf

import java.lang.Object
import javax.swing.JComboBox

// Pluggable look and feel interface for JComboBox.
abstract class ComboBoxUI extends ComponentUI {

    // Determine whether or not the combo box itself is traversable
    def isFocusTraversable(c: JComboBox): Boolean

    // Determine the visibility of the popup
    def isPopupVisible(c: JComboBox): Boolean
}
