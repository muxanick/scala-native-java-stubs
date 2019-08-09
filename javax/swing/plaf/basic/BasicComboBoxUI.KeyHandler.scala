package javax.swing.plaf.basic

import java.awt.event.KeyAdapter
import java.lang.Object

// This listener checks to see if the key event isn't a navigation key.  If
// it finds a key event that wasn't a navigation key it dispatches it to
// JComboBox.selectWithKeyChar() so that it can do type-ahead.
//
// This public inner class should be treated as protected.
// Instantiate it only within subclasses of
// BasicComboBoxUI.
class BasicComboBoxUI.KeyHandler extends KeyAdapter {
}
