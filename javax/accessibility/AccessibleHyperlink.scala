package javax.accessibility

import java.lang.{Object, String}

// Encapsulation of a link, or set of links (e.g. client side imagemap)
// in a Hypertext document
abstract class AccessibleHyperlink extends Object with AccessibleAction {

    // Performs the specified Action on the object
    def doAccessibleAction(i: Int): Boolean

    // Returns an object that represents the link anchor,
    // as appropriate for that link.
    def getAccessibleActionAnchor(i: Int): Object

    // Returns the number of accessible actions available in this Link
    // If there are more than one, the first one is NOT considered the
    // "default" action of this LINK object (e.g.
    def getAccessibleActionCount(): Int

    // Returns a String description of this particular
    // link action.
    def getAccessibleActionDescription(i: Int): String

    // Returns an object that represents the link action,
    // as appropriate for that link.
    def getAccessibleActionObject(i: Int): Object

    // Gets the index with the hypertext document at which this
    // link ends
    def getEndIndex(): Int

    // Gets the index with the hypertext document at which this
    // link begins
    def getStartIndex(): Int
}
