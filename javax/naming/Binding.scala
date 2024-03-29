package javax.naming

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a name-to-object binding found in a context.
 * 
 *  A context consists of name-to-object bindings.
 *  The Binding class represents such a binding.  It consists
 *  of a name and an object. The Context.listBindings()
 *  method returns an enumeration of Binding.
 * 
 *  Use subclassing for naming systems that generate contents of
 *  a binding dynamically.
 * 
 *  A Binding instance is not synchronized against concurrent access by multiple
 *  threads. Threads that need to access a Binding concurrently should
 *  synchronize amongst themselves and provide the necessary locking.
 */
class Binding extends NameClassPair {

    /** Constructs an instance of a Binding given its name and object. */
    @stub
    def this(name: String, obj: Any) = ???

    /** Constructs an instance of a Binding given its name, object, and whether
     *  the name is relative.
     */
    @stub
    def this(name: String, obj: Any, isRelative: Boolean) = ???

    /** Constructs an instance of a Binding given its name, class name, and object. */
    @stub
    def this(name: String, className: String, obj: Any) = ???

    /** Constructs an instance of a Binding given its
     *  name, class name, object, and whether the name is relative.
     */
    @stub
    def this(name: String, className: String, obj: Any, isRelative: Boolean) = ???

    /** Retrieves the class name of the object bound to the name of this binding. */
    @stub
    def getClassName(): String = ???

    /** Retrieves the object bound to the name of this binding. */
    @stub
    def getObject(): Any = ???

    /** Sets the object associated with this binding. */
    @stub
    def setObject(obj: Any): Unit = ???

    /** Generates the string representation of this binding. */
    @stub
    def toString(): String = ???
}
