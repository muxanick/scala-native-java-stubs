package javax.swing.text.html

import java.lang.Object
import javax.swing.text.MutableAttributeSet
import scala.scalanative.annotation.stub

/** Action to support forms by building all of the elements
 *  used to represent form controls.  This will process
 *  the <INPUT>, <TEXTAREA>, <SELECT>,
 *  and <OPTION> tags.  The element created by
 *  this action is expected to have the attribute
 *  StyleConstants.ModelAttribute set to
 *  the model that holds the state for the form control.
 *  This enables multiple views, and allows document to
 *  be iterated over picking up the data of the form.
 *  The following are the model assignments for the
 *  various type of form elements.
 *  
 *  
 *    Element Type
 *    Model Type
 *  
 *    input, type button
 *    DefaultButtonModel
 *  
 *    input, type checkbox
 *    JToggleButton.ToggleButtonModel
 *  
 *    input, type image
 *    DefaultButtonModel
 *  
 *    input, type password
 *    PlainDocument
 *  
 *    input, type radio
 *    JToggleButton.ToggleButtonModel
 *  
 *    input, type reset
 *    DefaultButtonModel
 *  
 *    input, type submit
 *    DefaultButtonModel
 *  
 *    input, type text or type is null.
 *    PlainDocument
 *  
 *    select
 *    DefaultComboBoxModel or an DefaultListModel, with an item type of Option
 *  
 *    textarea
 *    PlainDocument
 *  
 */
class HTMLDocument.HTMLReader.FormAction extends HTMLDocument.HTMLReader.SpecialAction {

    /**  */
    @stub
    def FormAction() = ???

    /** Called when an end tag is seen for the
     *  type of tag this action was registered
     *  to.
     */
    @stub
    def end(t: HTML.Tag): Unit = ???

    /** Called when a start tag is seen for the
     *  type of tag this action was registered
     *  to.
     */
    @stub
    def start(t: HTML.Tag, attr: MutableAttributeSet): Unit = ???
}
