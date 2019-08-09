package javax.swing.text.html

import java.lang.Object
import javax.swing.text.AttributeSet

// An iterator to iterate over a particular type of
// tag.  The iterator is not thread safe.  If reliable
// access to the document is not already ensured by
// the context under which the iterator is being used,
// its use should be performed under the protection of
// Document.render.
object abstract HTMLDocument.Iterator extends Object {

    @stub
    // Return the attributes for this tag.
    def getAttributes(): AttributeSet

    @stub
    // Returns the end of the range for which the current occurrence of
    // the tag is defined and has the same attributes.
    def getEndOffset(): Int

    @stub
    // Returns the start of the range for which the current occurrence of
    // the tag is defined and has the same attributes.
    def getStartOffset(): Int

    @stub
    // Type of tag this iterator represents.
    def getTag(): HTML.Tag

    @stub
    // Indicates if the iterator is currently
    // representing an occurrence of a tag.
    def isValid(): Boolean
}
