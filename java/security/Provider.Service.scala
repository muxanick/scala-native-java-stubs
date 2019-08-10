package java.security

import java.lang.{Object, String}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

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
object Provider_Service extends Object {

    /** Construct a new service. */
    @stub
    def Service(provider: Provider, type: String, algorithm: String, className: String, aliases: List[String], attributes: Map[String, String]) = ???

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
