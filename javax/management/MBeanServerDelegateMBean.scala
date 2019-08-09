package javax.management

import java.lang.String
import scala.scalanative.annotation.stub

/** Defines the management interface  of an object of class MBeanServerDelegate. */
trait MBeanServerDelegateMBean {

    /** Returns the JMX implementation name (the name of this product). */
    @stub
    def getImplementationName(): String = ???

    /** Returns the JMX implementation vendor (the vendor of this product). */
    @stub
    def getImplementationVendor(): String = ???

    /** Returns the JMX implementation version (the version of this product). */
    @stub
    def getImplementationVersion(): String = ???

    /** Returns the MBean server agent identity. */
    @stub
    def getMBeanServerId(): String = ???

    /** Returns the full name of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationName(): String = ???

    /** Returns the vendor of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationVendor(): String = ???

    /** Returns the version of the JMX specification implemented
     *  by this product.
     */
    @stub
    def getSpecificationVersion(): String = ???
}
