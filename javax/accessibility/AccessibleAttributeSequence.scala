package javax.accessibility

import java.lang.Object
import javax.swing.text.AttributeSet

// This class collects together the span of text that share the same
// contiguous set of attributes, along with that set of attributes.  It
// is used by implementors of the class AccessibleContext in
// order to generate ACCESSIBLE_TEXT_ATTRIBUTES_CHANGED events.
class AccessibleAttributeSequence extends Object {

    @stub
    // The text attributes
    def attributes: AttributeSet = ???

    @stub
    // The end index of the text sequence
    def endIndex: Int = ???
}
