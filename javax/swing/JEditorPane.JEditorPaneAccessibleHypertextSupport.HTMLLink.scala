package javax.swing

import java.lang.{Object, String}
import javax.accessibility.AccessibleHyperlink
import javax.swing.text.Element
import scala.scalanative.annotation.stub

/**  */
class JEditorPane_JEditorPaneAccessibleHypertextSupport_HTMLLink extends AccessibleHyperlink {

    /**  */
    @stub
    def HTMLLink(e: Element) = ???

    /** Perform the specified Action on the object */
    @stub
    def doAccessibleAction(i: Int): Boolean = ???

    /** Return an object that represents the link anchor,
     *  as appropriate for that link.
     */
    @stub
    def getAccessibleActionAnchor(i: Int): Any = ???

    /** Returns the number of accessible actions available in this Link
     *  If there are more than one, the first one is NOT considered the
     *  "default" action of this LINK object (e.g.
     */
    @stub
    def getAccessibleActionCount(): Int = ???

    /** Return a String description of this particular
     *  link action.
     */
    @stub
    def getAccessibleActionDescription(i: Int): String = ???

    /** Returns a URL object that represents the link. */
    @stub
    def getAccessibleActionObject(i: Int): Any = ???

    /** Get the index with the hypertext document at which this
     *  link ends
     */
    @stub
    def getEndIndex(): Int = ???

    /** Get the index with the hypertext document at which this
     *  link begins
     */
    @stub
    def getStartIndex(): Int = ???

    /** Since the document a link is associated with may have
     *  changed, this method returns whether this Link is valid
     *  anymore (with respect to the document it references).
     */
    @stub
    def isValid(): Boolean = ???
}
