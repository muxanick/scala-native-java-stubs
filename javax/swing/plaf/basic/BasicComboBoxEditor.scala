package javax.swing.plaf.basic

import java.awt.Component
import java.awt.event.{ActionListener, FocusEvent, FocusListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JTextField}

// The default editor for editable combo boxes. The editor is implemented as a JTextField.
class BasicComboBoxEditor extends Object with ComboBoxEditor, with FocusListener {

    @stub
    // Add an ActionListener.
    def addActionListener(l: ActionListener): Unit = ???

    @stub
    // Creates the internal editor component.
    protected def createEditorComponent(): JTextField = ???

    @stub
    // Invoked when a component gains the keyboard focus.
    def focusGained(e: FocusEvent): Unit = ???

    @stub
    // Invoked when a component loses the keyboard focus.
    def focusLost(e: FocusEvent): Unit = ???

    @stub
    // Return the component that should be added to the tree hierarchy for
    // this editor
    def getEditorComponent(): Component = ???

    @stub
    // Return the edited item
    def getItem(): Object = ???

    @stub
    // Remove an ActionListener
    def removeActionListener(l: ActionListener): Unit = ???

    @stub
    // Ask the editor to start editing and to select everything
    def selectAll(): Unit = ???
}
