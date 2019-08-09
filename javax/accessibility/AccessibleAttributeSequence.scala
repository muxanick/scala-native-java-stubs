package javax.accessibility

import java.lang.Object
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** This class collects together the span of text that share the same
 *  contiguous set of attributes, along with that set of attributes.  It
 *  is used by implementors of the class AccessibleContext in
 *  order to generate ACCESSIBLE_TEXT_ATTRIBUTES_CHANGED events.
 */
class AccessibleAttributeSequence extends Object {

    /** Constructs an AccessibleAttributeSequence with the given
     *  parameters.
     */
    @stub
    def this(start: Int, end: Int, attr: AttributeSet) = ???

    /** The text attributes */
    @stub
    val attributes: AttributeSet = ???

    /** The end index of the text sequence */
    @stub
    val endIndex: Int = ???

    /** The start index of the text sequence */
    @stub
    val startIndex: Int = ???
}
