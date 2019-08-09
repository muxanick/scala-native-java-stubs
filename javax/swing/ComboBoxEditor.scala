package javax.swing

import java.awt.Component
import java.awt.event.ActionListener
import java.lang.Object

// The editor component used for JComboBox components.
trait ComboBoxEditor {

    @stub
    // Add an ActionListener.
    def addActionListener(l: ActionListener): Unit = ???

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
