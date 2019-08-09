package javax.swing.tree

import java.awt.{Component, Container, Dimension, Font}
import java.lang.Object
import javax.swing.{JComponent, JTextField}
import javax.swing.border.Border
import javax.swing.text.JTextComponent

// TextField used when no editor is supplied.
// This textfield locks into the border it is constructed with.
// It also prefers its parents font over its font. And if the
// renderer is not null and no font
// has been specified the preferred height is that of the renderer.
class DefaultTreeCellEditor.DefaultTextField extends JTextField {

    @stub
    // Overrides JComponent.getBorder to
    // returns the current border.
    def getBorder(): Border = ???

    @stub
    // Gets the font of this component.
    def getFont(): Font = ???

    @stub
    // Overrides JTextField.getPreferredSize to
    // return the preferred size based on current font, if set,
    // or else use renderer's font.
    def getPreferredSize(): Dimension = ???
}
