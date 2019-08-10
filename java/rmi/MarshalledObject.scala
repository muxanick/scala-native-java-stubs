package java.rmi

import java.io.Serializable
import java.lang.Object
import scala.scalanative.annotation.stub

/** A MarshalledObject contains a byte stream with the serialized
 *  representation of an object given to its constructor.  The get
 *  method returns a new copy of the original object, as deserialized from
 *  the contained byte stream.  The contained object is serialized and
 *  deserialized with the same serialization semantics used for marshaling
 *  and unmarshaling parameters and return values of RMI calls:  When the
 *  serialized form is created:
 * 
 *  
 *   classes are annotated with a codebase URL from where the class
 *       can be loaded (if available), and
 *   any remote object in the MarshalledObject is
 *       represented by a serialized instance of its stub.
 *  
 * 
 *  When copy of the object is retrieved (via the get method),
 *  if the class is not available locally, it will be loaded from the
 *  appropriate location (specified the URL annotated with the class descriptor
 *  when the class was serialized.
 * 
 *  MarshalledObject facilitates passing objects in RMI calls
 *  that are not automatically deserialized immediately by the remote peer.
 */
final class MarshalledObject[T] extends Object with Serializable {

    /** Creates a new MarshalledObject that contains the
     *  serialized representation of the current state of the supplied object.
     */
    @stub
    def this(obj: T) = ???

    /** Compares this MarshalledObject to another object. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns a new copy of the contained marshalledobject. */
    @stub
    def get(): T = ???

    /** Return a hash code for this MarshalledObject. */
    @stub
    def hashCode(): Int = ???
}
