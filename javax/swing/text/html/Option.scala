package javax.swing.text.html

import java.io.Serializable
import java.lang.{Object, String}
import javax.swing.text.AttributeSet

// Value for the ListModel used to represent
// <option> elements.  This is the object
// installed as items of the DefaultComboBoxModel
// used to represent the <select> element.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class Option extends Object with Serializable {

    @stub
    // Fetch the attributes associated with this option.
    def getAttributes(): AttributeSet = ???

    @stub
    // Fetch the label associated with the option.
    def getLabel(): String = ???

    @stub
    // Convenience method to return the string associated
    // with the value attribute.
    def getValue(): String = ???

    @stub
    // Fetches the selection state associated with this option.
    def isSelected(): Boolean = ???

    @stub
    // Sets the label to be used for the option.
    def setLabel(label: String): Unit = ???

    @stub
    // Sets the selected state.
    protected def setSelection(state: Boolean): Unit = ???
}
