package javax.swing.text

import java.lang.{Cloneable, Object}
import scala.scalanative.annotation.stub

/** 
 *  ElementIterator, as the name suggests, iterates over the Element
 *  tree.  The constructor can be invoked with either Document or an Element
 *  as an argument.  If the constructor is invoked with a Document as an
 *  argument then the root of the iteration is the return value of
 *  document.getDefaultRootElement().
 * 
 *  The iteration happens in a depth-first manner.  In terms of how
 *  boundary conditions are handled:
 *  a) if next() is called before first() or current(), the
 *     root will be returned.
 *  b) next() returns null to indicate the end of the list.
 *  c) previous() returns null when the current element is the root
 *     or next() has returned null.
 * 
 *  The ElementIterator does no locking of the Element tree. This means
 *  that it does not track any changes.  It is the responsibility of the
 *  user of this class, to ensure that no changes happen during element
 *  iteration.
 * 
 *  Simple usage example:
 * 
 *     public void iterate() {
 *         ElementIterator it = new ElementIterator(root);
 *         Element elem;
 *         while (true) {
 *            if ((elem = next()) != null) {
 *                // process element
 *                System.out.println("elem: " + elem.getName());
 *            } else {
 *                break;
 *            }
 *         }
 *     }
 */
class ElementIterator extends Object with Cloneable {

    /** Creates a new ElementIterator. */
    @stub
    def this(document: Document) = ???

    /** Creates a new ElementIterator. */
    @stub
    def this(root: Element) = ???

    /** Clones the ElementIterator. */
    @stub
    def clone(): Any = ???

    /** Fetches the current Element. */
    @stub
    def current(): Element = ???

    /** Fetches the current depth of element tree. */
    @stub
    def depth(): Int = ???

    /** Fetches the first element. */
    @stub
    def first(): Element = ???

    /** Fetches the next Element. */
    @stub
    def next(): Element = ???

    /** Fetches the previous Element. */
    @stub
    def previous(): Element = ???
}
