package javax.swing.text.html

import java.awt.Component
import java.awt.event.{ActionEvent, ActionListener}
import java.lang.{Object, String}
import javax.swing.text.{ComponentView, Element, View}
import scala.scalanative.annotation.stub

/** Component decorator that implements the view interface
 *  for form elements, <input>, <textarea>,
 *  and <select>.  The model for the component is stored
 *  as an attribute of the the element (using StyleConstants.ModelAttribute),
 *  and is used to build the component of the view.  The type
 *  of the model is assumed to of the type that would be set by
 *  HTMLDocument.HTMLReader.FormAction.  If there are
 *  multiple views mapped over the document, they will share the
 *  embedded component models.
 *  
 *  The following table shows what components get built
 *  by this view.
 *  
 *  
 *    Element Type
 *    Component built
 *  
 *  
 *    input, type button
 *    JButton
 *  
 *  
 *    input, type checkbox
 *    JCheckBox
 *  
 *  
 *    input, type image
 *    JButton
 *  
 *  
 *    input, type password
 *    JPasswordField
 *  
 *  
 *    input, type radio
 *    JRadioButton
 *  
 *  
 *    input, type reset
 *    JButton
 *  
 *  
 *    input, type submit
 *    JButton
 *  
 *  
 *    input, type text
 *    JTextField
 *  
 *  
 *    select, size > 1 or multiple attribute defined
 *    JList in a JScrollPane
 *  
 *  
 *    select, size unspecified or 1
 *    JComboBox
 *  
 *  
 *    textarea
 *    JTextArea in a JScrollPane
 *  
 *  
 *    input, type file
 *    JTextField
 *  
 *  
 */
class FormView extends ComponentView with ActionListener {

    /** Creates a new FormView object. */
    @stub
    def this(elem: Element) = ???

    /** MouseEventListener class to handle form submissions when
     *  an input with type equal to image is clicked on.
     */
    @stub
    protected object MouseEventListener extends FormView.MouseEventListener

    /** Responsible for processing the ActionEvent. */
    @stub
    def actionPerformed(evt: ActionEvent): Unit = ???

    /** Create the component. */
    @stub
    protected def createComponent(): Component = ???

    /** Determines the maximum span for this view along an
     *  axis.
     */
    @stub
    def getMaximumSpan(axis: Int): Float = ???

    /** This method is called to submit a form in response
     *  to a click on an image -- an <INPUT> form
     *  element of type "image".
     */
    @stub
    protected def imageSubmit(imageData: String): Unit = ???

    /** This method is responsible for submitting the form data. */
    @stub
    protected def submitData(data: String): Unit = ???
}

object FormView {
    /** Deprecated. 
     * As of 1.3, value comes from UIManager UIManager property
     *              FormView.resetButtonText
     * 
     */
    @stub
    val RESET: String = ???

    /** Deprecated. 
     * As of 1.3, value now comes from UIManager property
     *              FormView.submitButtonText
     * 
     */
    @stub
    val SUBMIT: String = ???
}
