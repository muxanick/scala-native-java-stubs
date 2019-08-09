package javax.swing

import java.awt.Component
import java.awt.event.ActionListener
import java.lang.Object
import scala.scalanative.annotation.stub

/** The editor component used for JComboBox components. */
trait ComboBoxEditor {

    /** Add an ActionListener. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Return the component that should be added to the tree hierarchy for
     *  this editor
     */
    @stub
    def getEditorComponent(): Component = ???

    /** Return the edited item */
    @stub
    def getItem(): Object = ???

    /** Remove an ActionListener */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Ask the editor to start editing and to select everything */
    @stub
    def selectAll(): Unit = ???

    /** Set the item that should be edited. */
    @stub
    def setItem(anObject: Object): Unit = ???
}
