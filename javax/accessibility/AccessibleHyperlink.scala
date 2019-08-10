package javax.accessibility

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Encapsulation of a link, or set of links (e.g. client side imagemap)
 *  in a Hypertext document
 */
abstract class AccessibleHyperlink extends Object with AccessibleAction {

    /**  */
    @stub
    def this() = ???

    /** Performs the specified Action on the object */
    def doAccessibleAction(i: Int): Boolean

    /** Returns an object that represents the link anchor,
     *  as appropriate for that link.
     */
    def getAccessibleActionAnchor(i: Int): Any

    /** Returns the number of accessible actions available in this Link
     *  If there are more than one, the first one is NOT considered the
     *  "default" action of this LINK object (e.g.
     */
    def getAccessibleActionCount(): Int

    /** Returns a String description of this particular
     *  link action.
     */
    def getAccessibleActionDescription(i: Int): String

    /** Returns an object that represents the link action,
     *  as appropriate for that link.
     */
    def getAccessibleActionObject(i: Int): Any

    /** Gets the index with the hypertext document at which this
     *  link ends
     */
    def getEndIndex(): Int

    /** Gets the index with the hypertext document at which this
     *  link begins
     */
    def getStartIndex(): Int

    /** Since the document a link is associated with may have
     *  changed, this method returns whether or not this Link is still valid
     *  (with respect to the document it references).
     */
    def isValid(): Boolean
}
