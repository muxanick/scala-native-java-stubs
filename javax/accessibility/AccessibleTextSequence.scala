package javax.accessibility

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class collects together key details of a span of text.  It
 *  is used by implementors of the class AccessibleExtendedText in
 *  order to return the requested triplet of a String, and the
 *  start and end indicies/offsets into a larger body of text that the
 *  String comes from.
 */
class AccessibleTextSequence extends Object {

    /** Constructs an AccessibleTextSequence with the given
     *  parameters.
     */
    @stub
    def this(start: Int, end: Int, txt: String) = ???

    /** The end index of the text sequence */
    @stub
    val endIndex: Int = ???

    /** The start index of the text sequence */
    @stub
    val startIndex: Int = ???

    /** The text */
    @stub
    val text: String = ???
}
