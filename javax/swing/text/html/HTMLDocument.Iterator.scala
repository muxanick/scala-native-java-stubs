package javax.swing.text.html

import java.lang.Object
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** An iterator to iterate over a particular type of
 *  tag.  The iterator is not thread safe.  If reliable
 *  access to the document is not already ensured by
 *  the context under which the iterator is being used,
 *  its use should be performed under the protection of
 *  Document.render.
 */
object abstract HTMLDocument_Iterator extends Object {

    /**  */
    @stub
    def Iterator() = ???

    /** Return the attributes for this tag. */
    def getAttributes(): AttributeSet

    /** Returns the end of the range for which the current occurrence of
     *  the tag is defined and has the same attributes.
     */
    def getEndOffset(): Int

    /** Returns the start of the range for which the current occurrence of
     *  the tag is defined and has the same attributes.
     */
    def getStartOffset(): Int

    /** Type of tag this iterator represents. */
    def getTag(): HTML.Tag

    /** Indicates if the iterator is currently
     *  representing an occurrence of a tag.
     */
    def isValid(): Boolean

    /** Move the iterator forward to the next occurrence
     *  of the tag it represents.
     */
    def next(): Unit
}
