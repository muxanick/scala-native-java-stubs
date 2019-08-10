package javax.naming

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Enumeration, Vector}
import scala.scalanative.annotation.stub

/** This class represents a reference to an object that is found outside of
 *  the naming/directory system.
 * 
 *  Reference provides a way of recording address information about
 *  objects which themselves are not directly bound to the naming/directory system.
 * 
 *  A Reference consists of an ordered list of addresses and class information
 *  about the object being referenced.
 *  Each address in the list identifies a communications endpoint
 *  for the same conceptual object.  The "communications endpoint"
 *  is information that indicates how to contact the object. It could
 *  be, for example, a network address, a location in memory on the
 *  local machine, another process on the same machine, etc.
 *  The order of the addresses in the list may be of significance
 *  to object factories that interpret the reference.
 * 
 *  Multiple addresses may arise for
 *  various reasons, such as replication or the object offering interfaces
 *  over more than one communication mechanism.  The addresses are indexed
 *  starting with zero.
 * 
 *  A Reference also contains information to assist in creating an instance
 *  of the object to which this Reference refers.  It contains the class name
 *  of that object, and the class name and location of the factory to be used
 *  to create the object.
 *  The class factory location is a space-separated list of URLs representing
 *  the class path used to load the factory.  When the factory class (or
 *  any class or resource upon which it depends) needs to be loaded,
 *  each URL is used (in order) to attempt to load the class.
 * 
 *  A Reference instance is not synchronized against concurrent access by multiple
 *  threads. Threads that need to access a single Reference concurrently should
 *  synchronize amongst themselves and provide the necessary locking.
 */
class Reference extends Object with Cloneable with Serializable {

    /** Constructs a new reference for an object with class name 'className'. */
    @stub
    def this(className: String) = ???

    /** Constructs a new reference for an object with class name 'className' and
     *  an address.
     */
    @stub
    def this(className: String, addr: RefAddr) = ???

    /** Constructs a new reference for an object with class name 'className',
     *  the class name and location of the object's factory, and the address for
     *  the object.
     */
    @stub
    def this(className: String, addr: RefAddr, factory: String, factoryLocation: String) = ???

    /** Constructs a new reference for an object with class name 'className',
     *  and the class name and location of the object's factory.
     */
    @stub
    def this(className: String, factory: String, factoryLocation: String) = ???

    /** Contains the addresses contained in this Reference. */
    @stub
    protected val addrs: Vector[RefAddr] = ???

    /** Contains the name of the factory class for creating
     *  an instance of the object to which this Reference refers.
     */
    @stub
    protected val classFactory: String = ???

    /** Contains the location of the factory class. */
    @stub
    protected val classFactoryLocation: String = ???

    /** Contains the fully-qualified name of the class of the object to which
     *  this Reference refers.
     */
    @stub
    protected val className: String = ???

    /** Adds an address to the list of addresses at index posn. */
    @stub
    def add(posn: Int, addr: RefAddr): Unit = ???

    /** Adds an address to the end of the list of addresses. */
    @stub
    def add(addr: RefAddr): Unit = ???

    /** Deletes all addresses from this reference. */
    @stub
    def clear(): Unit = ???

    /** Makes a copy of this reference using its class name
     *  list of addresses, class factory name and class factory location.
     */
    @stub
    def clone(): Any = ???

    /** Determines whether obj is a reference with the same addresses
     *  (in same order) as this reference.
     */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Retrieves the address at index posn. */
    @stub
    def get(posn: Int): RefAddr = ???

    /** Retrieves the first address that has the address type 'addrType'. */
    @stub
    def get(addrType: String): RefAddr = ???

    /** Retrieves an enumeration of the addresses in this reference. */
    @stub
    def getAll(): Enumeration[RefAddr] = ???

    /** Retrieves the class name of the object to which this reference refers. */
    @stub
    def getClassName(): String = ???

    /** Retrieves the location of the factory of the object
     *  to which this reference refers.
     */
    @stub
    def getFactoryClassLocation(): String = ???

    /** Retrieves the class name of the factory of the object
     *  to which this reference refers.
     */
    @stub
    def getFactoryClassName(): String = ???

    /** Computes the hash code of this reference. */
    @stub
    def hashCode(): Int = ???

    /** Deletes the address at index posn from the list of addresses. */
    @stub
    def remove(posn: Int): Any = ???

    /** Retrieves the number of addresses in this reference. */
    @stub
    def size(): Int = ???

    /** Generates the string representation of this reference. */
    @stub
    def toString(): String = ???
}
