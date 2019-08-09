package java.util.prefs

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** An event emitted by a Preferences node to indicate that
 *  a child of that node has been added or removed.
 * 
 *  Note, that although NodeChangeEvent inherits Serializable interface from
 *  java.util.EventObject, it is not intended to be Serializable. Appropriate
 *  serialization methods are implemented to throw NotSerializableException.
 */
class NodeChangeEvent extends EventObject {

    /** Constructs a new NodeChangeEvent instance. */
    @stub
    def this(parent: Preferences, child: Preferences) = ???

    /** Returns the node that was added or removed. */
    @stub
    def getChild(): Preferences = ???

    /** Returns the parent of the node that was added or removed. */
    @stub
    def getParent(): Preferences = ???
}
