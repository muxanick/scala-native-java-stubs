package java.nio.file.attribute

import scala.scalanative.annotation.stub

/** An attribute view that is a read-only or updatable view of non-opaque
 *  values associated with a file in a filesystem. This interface is extended or
 *  implemented by specific file attribute views that define methods to read
 *  and/or update the attributes of a file.
 */
trait FileAttributeView extends AttributeView {
}
