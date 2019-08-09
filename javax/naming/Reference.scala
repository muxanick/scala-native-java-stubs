package javax.naming

import java.io.Serializable
import java.lang.{Cloneable, Object, String}
import java.util.{Enumeration, Vector}

// This class represents a reference to an object that is found outside of
// the naming/directory system.
//
// Reference provides a way of recording address information about
// objects which themselves are not directly bound to the naming/directory system.
//
// A Reference consists of an ordered list of addresses and class information
// about the object being referenced.
// Each address in the list identifies a communications endpoint
// for the same conceptual object.  The "communications endpoint"
// is information that indicates how to contact the object. It could
// be, for example, a network address, a location in memory on the
// local machine, another process on the same machine, etc.
// The order of the addresses in the list may be of significance
// to object factories that interpret the reference.
//
// Multiple addresses may arise for
// various reasons, such as replication or the object offering interfaces
// over more than one communication mechanism.  The addresses are indexed
// starting with zero.
//
// A Reference also contains information to assist in creating an instance
// of the object to which this Reference refers.  It contains the class name
// of that object, and the class name and location of the factory to be used
// to create the object.
// The class factory location is a space-separated list of URLs representing
// the class path used to load the factory.  When the factory class (or
// any class or resource upon which it depends) needs to be loaded,
// each URL is used (in order) to attempt to load the class.
//
// A Reference instance is not synchronized against concurrent access by multiple
// threads. Threads that need to access a single Reference concurrently should
// synchronize amongst themselves and provide the necessary locking.
class Reference extends Object with Cloneable, with Serializable {

    @stub
    // Constructs a new reference for an object with class name 'className'.
    def this(className: String) = ???

    @stub
    // Constructs a new reference for an object with class name 'className' and
    // an address.
    def this(className: String, addr: RefAddr) = ???

    @stub
    // Constructs a new reference for an object with class name 'className',
    // the class name and location of the object's factory, and the address for
    // the object.
    def this(className: String, addr: RefAddr, factory: String, factoryLocation: String) = ???

    @stub
    // Contains the addresses contained in this Reference.
    protected def addrs: Vector[RefAddr] = ???

    @stub
    // Contains the name of the factory class for creating
    // an instance of the object to which this Reference refers.
    protected def classFactory: String = ???

    @stub
    // Contains the location of the factory class.
    protected def classFactoryLocation: String = ???

    @stub
    // Adds an address to the list of addresses at index posn.
    def add(posn: Int, addr: RefAddr): Unit = ???

    @stub
    // Adds an address to the end of the list of addresses.
    def add(addr: RefAddr): Unit = ???

    @stub
    // Deletes all addresses from this reference.
    def clear(): Unit = ???

    @stub
    // Makes a copy of this reference using its class name
    // list of addresses, class factory name and class factory location.
    def clone(): Object = ???

    @stub
    // Determines whether obj is a reference with the same addresses
    // (in same order) as this reference.
    def equals(obj: Object): Boolean = ???

    @stub
    // Retrieves the address at index posn.
    def get(posn: Int): RefAddr = ???

    @stub
    // Retrieves the first address that has the address type 'addrType'.
    def get(addrType: String): RefAddr = ???

    @stub
    // Retrieves an enumeration of the addresses in this reference.
    def getAll(): Enumeration[RefAddr] = ???

    @stub
    // Retrieves the class name of the object to which this reference refers.
    def getClassName(): String = ???

    @stub
    // Retrieves the location of the factory of the object
    // to which this reference refers.
    def getFactoryClassLocation(): String = ???

    @stub
    // Retrieves the class name of the factory of the object
    // to which this reference refers.
    def getFactoryClassName(): String = ???

    @stub
    // Computes the hash code of this reference.
    def hashCode(): Int = ???

    @stub
    // Deletes the address at index posn from the list of addresses.
    def remove(posn: Int): Object = ???

    @stub
    // Retrieves the number of addresses in this reference.
    def size(): Int = ???
}
