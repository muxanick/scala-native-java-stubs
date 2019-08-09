package javax.xml.crypto

import java.util.Iterator
import scala.scalanative.annotation.stub

/** An abstract representation of a Data type containing a
 *  node-set. The type (class) and ordering of the nodes contained in the set
 *  are not defined by this class; instead that behavior should be
 *  defined by NodeSetData subclasses.
 */
trait NodeSetData extends Data {

    /** Returns a read-only iterator over the nodes contained in this
     *  NodeSetData in
     *  
     *  document order.
     */
    @stub
    def iterator(): Iterator = ???
}
