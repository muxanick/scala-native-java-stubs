package javax.swing.text

import java.lang.String
import javax.swing.event.ChangeListener
import scala.scalanative.annotation.stub

/** A collection of attributes to associate with an element in a document.
 *  Since these are typically used to associate character and paragraph
 *  styles with the element, operations for this are provided.  Other
 *  customized attributes that get associated with the element will
 *  effectively be name-value pairs that live in a hierarchy and if a name
 *  (key) is not found locally, the request is forwarded to the parent.
 *  Commonly used attributes are separated out to facilitate alternative
 *  implementations that are more efficient.
 */
trait Style extends MutableAttributeSet {

    /** Adds a listener to track whenever an attribute
     *  has been changed.
     */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Fetches the name of the style. */
    @stub
    def getName(): String = ???

    /** Removes a listener that was tracking attribute changes. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???
}
