package java.security

import java.io.InputStream
import java.lang.{Object, String}
import java.util.{Collection, Dictionary, Enumeration, Hashtable, List, Map, Map.Entry, Properties, Set}
import java.util.function.{BiConsumer, BiFunction, Function}
import scala.scalanative.annotation.stub

/** This class represents a "provider" for the
 *  Java Security API, where a provider implements some or all parts of
 *  Java Security. Services that a provider may implement include:
 * 
 *  
 * 
 *  Algorithms (such as DSA, RSA, MD5 or SHA-1).
 * 
 *  Key generation, conversion, and management facilities (such as for
 *  algorithm-specific keys).
 * 
 * 
 * 
 *  Each provider has a name and a version number, and is configured
 *  in each runtime it is installed in.
 * 
 *  See The Provider Class
 *  in the "Java Cryptography Architecture API Specification & Reference"
 *  for information about how a particular type of provider, the
 *  cryptographic service provider, works and is installed. However,
 *  please note that a provider can be used to implement any security
 *  service in Java that uses a pluggable architecture with a choice
 *  of implementations that fit underneath.
 * 
 *  Some provider implementations may encounter unrecoverable internal
 *  errors during their operation, for example a failure to communicate with a
 *  security token. A ProviderException should be used to indicate
 *  such errors.
 * 
 *  The service type Provider is reserved for use by the
 *  security framework. Services of this type cannot be added, removed,
 *  or modified by applications.
 *  The following attributes are automatically placed in each Provider object:
 *  
 *  Attributes Automatically Placed in a Provider Object
 *  NameValue
 *  Provider.id name
 *     String.valueOf(provider.getName())
 *  Provider.id version
 *      String.valueOf(provider.getVersion())
 *  Provider.id info
 *        String.valueOf(provider.getInfo())
 *  Provider.id className
 *      provider.getClass().getName()
 *  
 */
abstract class Provider extends Properties {

    /** Constructs a provider with the specified name, version number,
     *  and information.
     */
    @stub
    protected def this(name: String, version: Double, info: String) = ???

    /** Clears this provider so that it no longer contains the properties
     *  used to look up facilities implemented by the provider.
     */
    def clear(): Unit

    /** Attempts to compute a mapping for the specified key and its
     *  current mapped value (or null if there is no current
     *  mapping).
     */
    def compute(key: Any, remappingFunction: BiFunction[_ >: Object, _ >: Object, _ <: Object]): Any

    /** If the specified key is not already associated with a value (or
     *  is mapped to null), attempts to compute its value using
     *  the given mapping function and enters it into this map unless
     *  null.
     */
    def computeIfAbsent(key: Any, mappingFunction: Function[_ >: Object, _ <: Object]): Any

    /** If the value for the specified key is present and non-null, attempts to
     *  compute a new mapping given the key and its current mapped value.
     */
    def computeIfPresent(key: Any, remappingFunction: BiFunction[_ >: Object, _ >: Object, _ <: Object]): Any

    /** Returns an enumeration of the values in this hashtable. */
    def elements(): Enumeration[Object]

    /** Returns an unmodifiable Set view of the property entries contained
     *  in this Provider.
     */
    def entrySet(): Set[Map.Entry[Object, Object]]

    /** Performs the given action for each entry in this map until all entries
     *  have been processed or the action throws an exception.
     */
    def forEach(action: BiConsumer[_ >: Object, _ >: Object]): Unit

    /** Returns the value to which the specified key is mapped,
     *  or null if this map contains no mapping for the key.
     */
    def get(key: Any): Any

    /** Returns a human-readable description of the provider and its
     *  services.
     */
    def getInfo(): String

    /** Returns the name of this provider. */
    def getName(): String

    /** Returns the value to which the specified key is mapped, or
     *  defaultValue if this map contains no mapping for the key.
     */
    def getOrDefault(key: Any, defaultValue: Any): Any

    /** Searches for the property with the specified key in this property list. */
    def getProperty(key: String): String

    /** Get the service describing this Provider's implementation of the
     *  specified type of this algorithm or alias.
     */
    def getService(type: String, algorithm: String): Provider.Service

    /** Get an unmodifiable Set of all services supported by
     *  this Provider.
     */
    def getServices(): Set[Provider.Service]

    /** Returns the version number for this provider. */
    def getVersion(): Double

    /** Returns an enumeration of the keys in this hashtable. */
    def keys(): Enumeration[Object]

    /** Returns an unmodifiable Set view of the property keys contained in
     *  this provider.
     */
    def keySet(): Set[Object]

    /** Reads a property list (key and element pairs) from the input stream. */
    def load(inStream: InputStream): Unit

    /** If the specified key is not already associated with a value or is
     *  associated with null, associates it with the given value.
     */
    def merge(key: Any, value: Any, remappingFunction: BiFunction[_ >: Object, _ >: Object, _ <: Object]): Any

    /** Sets the key property to have the specified
     *  value.
     */
    def put(key: Any, value: Any): Any

    /** Copies all of the mappings from the specified Map to this provider. */
    def putAll(t: Map[_, _]): Unit

    /** If the specified key is not already associated with a value (or is mapped
     *  to null) associates it with the given value and returns
     *  null, else returns the current value.
     */
    def putIfAbsent(key: Any, value: Any): Any

    /** Add a service. */
    protected def putService(s: Provider.Service): Unit

    /** Removes the key property (and its corresponding
     *  value).
     */
    def remove(key: Any): Any

    /** Removes the entry for the specified key only if it is currently
     *  mapped to the specified value.
     */
    def remove(key: Any, value: Any): Boolean

    /** Remove a service previously added using
     *  putService().
     */
    protected def removeService(s: Provider.Service): Unit

    /** Replaces the entry for the specified key only if it is
     *  currently mapped to some value.
     */
    def replace(key: Any, value: Any): Any

    /** Replaces the entry for the specified key only if currently
     *  mapped to the specified value.
     */
    def replace(key: Any, oldValue: Any, newValue: Any): Boolean

    /** Replaces each entry's value with the result of invoking the given
     *  function on that entry, in the order entries are returned by an entry
     *  set iterator, until all entries have been processed or the function
     *  throws an exception.
     */
    def replaceAll(function: BiFunction[_ >: Object, _ >: Object, _ <: Object]): Unit

    /** Returns a string with the name and the version number
     *  of this provider.
     */
    def toString(): String

    /** Returns an unmodifiable Collection view of the property values
     *  contained in this provider.
     */
    def values(): Collection[Object]
}

object Provider {
    /** The description of a security service. It encapsulates the properties
     *  of a service and contains a factory method to obtain new implementation
     *  instances of this service.
     * 
     *  Each service has a provider that offers the service, a type,
     *  an algorithm name, and the name of the class that implements the
     *  service. Optionally, it also includes a list of alternate algorithm
     *  names for this service (aliases) and attributes, which are a map of
     *  (name, value) String pairs.
     * 
     *  This class defines the methods supportsParameter() and newInstance()
     *  which are used by the Java security framework when it searches for
     *  suitable services and instantiates them. The valid arguments to those
     *  methods depend on the type of service. For the service types defined
     *  within Java SE, see the
     *  
     *  Java Cryptography Architecture API Specification & Reference 
     *  for the valid values.
     *  Note that components outside of Java SE can define additional types of
     *  services and their behavior.
     * 
     *  Instances of this class are immutable.
     */
    object Service extends Object {

        /** Construct a new service. */
        @stub
        def apply(provider: Provider, type: String, algorithm: String, className: String, aliases: List[String], attributes: Map[String, String]) = ???

        /** Return the name of the algorithm of this service. */
        @stub
        def getAlgorithm(): String = ???

        /** Return the value of the specified attribute or null if this
         *  attribute is not set for this Service.
         */
        @stub
        def getAttribute(name: String): String = ???

        /** Return the name of the class implementing this service. */
        @stub
        def getClassName(): String = ???

        /** Return the Provider of this service. */
        @stub
        def getProvider(): Provider = ???

        /** Get the type of this service. */
        @stub
        def getType(): String = ???

        /** Return a new instance of the implementation described by this
         *  service.
         */
        @stub
        def newInstance(constructorParameter: Any): Any = ???

        /** Test whether this Service can use the specified parameter. */
        @stub
        def supportsParameter(parameter: Any): Boolean = ???

        /** Return a String representation of this service. */
        @stub
        def toString(): String = ???
    }

}
