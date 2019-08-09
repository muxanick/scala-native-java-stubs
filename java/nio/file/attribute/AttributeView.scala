package java.nio.file.attribute

import java.lang.String
import scala.scalanative.annotation.stub

/** An object that provides a read-only or updatable view of non-opaque
 *  values associated with an object in a filesystem. This interface is extended
 *  or implemented by specific attribute views that define the attributes
 *  supported by the view. A specific attribute view will typically define
 *  type-safe methods to read or update the attributes that it supports.
 */
trait AttributeView {

    /** Returns the name of the attribute view. */
    @stub
    def name(): String = ???
}
