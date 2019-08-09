package java.security

import java.lang.{Object, String}

// The description of a security service. It encapsulates the properties
// of a service and contains a factory method to obtain new implementation
// instances of this service.
//
// Each service has a provider that offers the service, a type,
// an algorithm name, and the name of the class that implements the
// service. Optionally, it also includes a list of alternate algorithm
// names for this service (aliases) and attributes, which are a map of
// (name, value) String pairs.
//
// This class defines the methods supportsParameter() and newInstance()
// which are used by the Java security framework when it searches for
// suitable services and instantiates them. The valid arguments to those
// methods depend on the type of service. For the service types defined
// within Java SE, see the
// 
// Java Cryptography Architecture API Specification & Reference 
// for the valid values.
// Note that components outside of Java SE can define additional types of
// services and their behavior.
//
// Instances of this class are immutable.
object Provider.Service extends Object {

    @stub
    // Return the name of the algorithm of this service.
    def getAlgorithm(): String = ???

    @stub
    // Return the value of the specified attribute or null if this
    // attribute is not set for this Service.
    def getAttribute(name: String): String = ???

    @stub
    // Return the name of the class implementing this service.
    def getClassName(): String = ???

    @stub
    // Return the Provider of this service.
    def getProvider(): Provider = ???

    @stub
    // Get the type of this service.
    def getType(): String = ???

    @stub
    // Return a new instance of the implementation described by this
    // service.
    def newInstance(constructorParameter: Object): Object = ???

    @stub
    // Test whether this Service can use the specified parameter.
    def supportsParameter(parameter: Object): Boolean = ???
}
