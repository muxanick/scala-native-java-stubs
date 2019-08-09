package javax.swing.text.html

import java.lang.Object
import javax.swing.{AbstractAction, JEditorPane}
import javax.swing.text.{Element, StyledEditorKit.StyledTextAction, TextAction}

/** An abstract Action providing some convenience methods that may
 *  be useful in inserting HTML into an existing document.
 *  NOTE: None of the convenience methods obtain a lock on the
 *  document. If you have another thread modifying the text these
 *  methods may have inconsistent behavior, or return the wrong thing.
 */
object abstract HTMLEditorKit.HTMLTextAction extends StyledEditorKit.StyledTextAction {

    /** Returns number of elements, starting at the deepest leaf, needed
     *  to get to an element representing tag.
     */
    @stub
    protected def elementCountToTag(doc: HTMLDocument, offset: Int, tag: HTML.Tag): Int = ???

    /** Returns the deepest element at offset matching
     *  tag.
     */
    @stub
    protected def findElementMatchingTag(doc: HTMLDocument, offset: Int, tag: HTML.Tag): Element = ???

    /** Returns an array of the Elements that contain offset. */
    @stub
    protected def getElementsAt(doc: HTMLDocument, offset: Int): Array[Element] = ???

    /**  */
    @stub
    protected def getHTMLDocument(e: JEditorPane): HTMLDocument = ???
}
