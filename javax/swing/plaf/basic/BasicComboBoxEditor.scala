package javax.swing.plaf.basic

import java.awt.Component
import java.awt.event.{ActionListener, FocusEvent, FocusListener}
import java.lang.Object
import javax.swing.{ComboBoxEditor, JTextField}
import javax.swing.plaf.UIResource
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
    def getItem(): Any = ???

    /** Remove an ActionListener */
    @stub
    def removeActionListener(l: ActionListener): Unit = ???

    /** Ask the editor to start editing and to select everything */
    @stub
    def selectAll(): Unit = ???

    /** Sets the item that should be edited. */
    @stub
    def setItem(anObject: Any): Unit = ???
}

object BasicComboBoxEditor {
    /** A subclass of BasicComboBoxEditor that implements UIResource.
     *  BasicComboBoxEditor doesn't implement UIResource
     *  directly so that applications can safely override the
     *  cellRenderer property with BasicListCellRenderer subclasses.
     *  
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    object UIResource extends BasicComboBoxEditor with UIResource {

        /**  */
        @stub
        def apply() = ???

}
