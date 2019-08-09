package javax.swing.text

import scala.scalanative.annotation.stub

/** A factory to create a view of some portion of document subject.
 *  This is intended to enable customization of how views get
 *  mapped over a document model.
 */
trait ViewFactory {

    /** Creates a view from the given structural element of a
     *  document.
     */
    @stub
    def create(elem: Element): View = ???
}
