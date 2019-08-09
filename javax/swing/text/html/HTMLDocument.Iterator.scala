package javax.swing.text.html

import java.lang.Object
import javax.swing.text.AttributeSet

/** An iterator to iterate over a particular type of
 *  tag.  The iterator is not thread safe.  If reliable
 *  access to the document is not already ensured by
 *  the context under which the iterator is being used,
 *  its use should be performed under the protection of
 *  Document.render.
 */
object abstract HTMLDocument.Iterator extends Object {

    /** Return the attributes for this tag. */
    @stub
    def getAttributes(): AttributeSet

    /** Returns the end of the range for which the current occurrence of
     *  the tag is defined and has the same attributes.
     */
    @stub
    def getEndOffset(): Int

    /** Returns the start of the range for which the current occurrence of
     *  the tag is defined and has the same attributes.
     */
    @stub
    def getStartOffset(): Int

    /** Type of tag this iterator represents. */
    @stub
    def getTag(): HTML.Tag

    /** Indicates if the iterator is currently
     *  representing an occurrence of a tag.
     */
    @stub
    def isValid(): Boolean
}
