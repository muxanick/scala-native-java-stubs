package javax.management

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a builder that creates a default
 *  MBeanServer implementation.
 *  The JMX MBeanServerFactory allows
 *  applications to provide their custom MBeanServer
 *  implementation by providing a subclass of this class.
 */
class MBeanServerBuilder extends Object {

    /** Public default constructor. */
    @stub
    def this() = ???

    /** This method creates a new MBeanServer implementation object. */
    @stub
    def newMBeanServer(defaultDomain: String, outer: MBeanServer, delegate: MBeanServerDelegate): MBeanServer = ???

    /** This method creates a new MBeanServerDelegate for a new MBeanServer. */
    @stub
    def newMBeanServerDelegate(): MBeanServerDelegate = ???
}
