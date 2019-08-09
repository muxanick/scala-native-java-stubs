package javax.swing.text.html

import java.awt.Component
import java.awt.event.{ActionEvent, ActionListener}
import java.lang.{Object, String}
import javax.swing.text.{ComponentView, View}

// Component decorator that implements the view interface
// for form elements, <input>, <textarea>,
// and <select>.  The model for the component is stored
// as an attribute of the the element (using StyleConstants.ModelAttribute),
// and is used to build the component of the view.  The type
// of the model is assumed to of the type that would be set by
// HTMLDocument.HTMLReader.FormAction.  If there are
// multiple views mapped over the document, they will share the
// embedded component models.
// 
// The following table shows what components get built
// by this view.
// 
// 
//   Element Type
//   Component built
// 
// 
//   input, type button
//   JButton
// 
// 
//   input, type checkbox
//   JCheckBox
// 
// 
//   input, type image
//   JButton
// 
// 
//   input, type password
//   JPasswordField
// 
// 
//   input, type radio
//   JRadioButton
// 
// 
//   input, type reset
//   JButton
// 
// 
//   input, type submit
//   JButton
// 
// 
//   input, type text
//   JTextField
// 
// 
//   select, size > 1 or multiple attribute defined
//   JList in a JScrollPane
// 
// 
//   select, size unspecified or 1
//   JComboBox
// 
// 
//   textarea
//   JTextArea in a JScrollPane
// 
// 
//   input, type file
//   JTextField
// 
// 
class FormView extends ComponentView with ActionListener {

    @stub
    // Responsible for processing the ActionEvent.
    def actionPerformed(evt: ActionEvent): Unit = ???

    @stub
    // Create the component.
    protected def createComponent(): Component = ???

    @stub
    // Determines the maximum span for this view along an
    // axis.
    def getMaximumSpan(axis: Int): float = ???

    @stub
    // This method is called to submit a form in response
    // to a click on an image -- an <INPUT> form
    // element of type "image".
    protected def imageSubmit(imageData: String): Unit = ???
}

object FormView {
    @stub
    // Deprecated. 
    //As of 1.3, value comes from UIManager UIManager property
    //             FormView.resetButtonText
    //
    def RESET: String = ???
}
