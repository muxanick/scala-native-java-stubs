package javax.management

import java.lang.String

// Defines the management interface  of an object of class MBeanServerDelegate.
trait MBeanServerDelegateMBean {

    @stub
    // Returns the JMX implementation name (the name of this product).
    def getImplementationName(): String = ???

    @stub
    // Returns the JMX implementation vendor (the vendor of this product).
    def getImplementationVendor(): String = ???

    @stub
    // Returns the JMX implementation version (the version of this product).
    def getImplementationVersion(): String = ???

    @stub
    // Returns the MBean server agent identity.
    def getMBeanServerId(): String = ???

    @stub
    // Returns the full name of the JMX specification implemented
    // by this product.
    def getSpecificationName(): String = ???

    @stub
    // Returns the vendor of the JMX specification implemented
    // by this product.
    def getSpecificationVendor(): String = ???
}
