package javax.swing.plaf.basic

import java.awt.Component
import java.awt.event.{ActionListener, FocusEvent, FocusListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JTextField}
import scala.scalanative.annotation.stub

/** The default editor for editable combo boxes. The editor is implemented as a JTextField. */
class BasicComboBoxEditor extends Object with ComboBoxEditor with FocusListener {

    /**  */
    @stub
    def this() = ???

    /**  */
    @stub
    protected val editor: JTextField = ???

    /** Add an ActionListener. */
    @stub
    def addActionListener(l: ActionListener): Unit = ???

    /** Creates the internal editor component. */
    @stub
    protected def createEditorComponent(): JTextField = ???

    /** Invoked when a component gains the keyboard focus. */
    @stub
    def focusGained(e: FocusEvent): Unit = ???

    /** Invoked when a component loses the keyboard focus. */
    @stub
    def focusLost(e: FocusEvent): Unit = ???

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

    /** Sets the item that should be edited. */
    @stub
    def setItem(anObject: Object): Unit = ???
}

object BasicComboBoxEditor {
    /** A subclass of BasicComboBoxEditor that implements UIResource. */
    @stub
    object UIResource extends BasicComboBoxEditor.UIResource
}
