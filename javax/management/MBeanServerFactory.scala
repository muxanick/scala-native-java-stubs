package javax.management

import java.lang.{Object, String}
import java.util.ArrayList
import javax.management.loading.ClassLoaderRepository

/** Provides MBean server references.  There are no instances of
 *  this class.
 * 
 *  Since JMX 1.2 this class makes it possible to replace the default
 *  MBeanServer implementation. This is done using the
 *  MBeanServerBuilder class.
 *  The class of the initial MBeanServerBuilder to be
 *  instantiated can be specified through the
 *  javax.management.builder.initial system property.
 *  The specified class must be a public subclass of
 *  MBeanServerBuilder, and must have a public
 *  empty constructor.
 *  By default, if no value for that property is specified, an instance of
 *  javax.management.MBeanServerBuilder
 *  is created. Otherwise, the MBeanServerFactory attempts to load the
 *  specified class using
 *  Thread.currentThread().getContextClassLoader(), or if that is null,
 *  Class.forName(). Then
 *  it creates an initial instance of that Class using
 *  Class.newInstance(). If any checked exception
 *  is raised during this process (e.g.
 *  ClassNotFoundException,
 *  InstantiationException) the MBeanServerFactory
 *  will propagate this exception from within a RuntimeException.
 * 
 *  The javax.management.builder.initial system property is
 *  consulted every time a new MBeanServer needs to be created, and the
 *  class pointed to by that property is loaded. If that class is different
 *  from that of the current MBeanServerBuilder, then a new MBeanServerBuilder
 *  is created. Otherwise, the MBeanServerFactory may create a new
 *  MBeanServerBuilder or reuse the current one.
 * 
 *  If the class pointed to by the property cannot be
 *  loaded, or does not correspond to a valid subclass of MBeanServerBuilder
 *  then an exception is propagated, and no MBeanServer can be created until
 *  the javax.management.builder.initial system property is reset to
 *  valid value.
 * 
 *  The MBeanServerBuilder makes it possible to wrap the MBeanServers
 *  returned by the default MBeanServerBuilder implementation, for the purpose
 *  of e.g. adding an additional security layer.
 */
class MBeanServerFactory extends Object {
}

object MBeanServerFactory {
    /** Return a new object implementing the MBeanServer interface
     *  with a standard default domain name.
     */
    @stub
    def createMBeanServer(): MBeanServer = ???

    /** Return a new object implementing the MBeanServer
     *  interface with the specified default domain name.
     */
    @stub
    def createMBeanServer(domain: String): MBeanServer = ???

    /** Return a list of registered MBeanServer objects. */
    @stub
    def findMBeanServer(agentId: String): ArrayList[MBeanServer] = ???

    /** Return the ClassLoaderRepository used by the given MBeanServer. */
    @stub
    def getClassLoaderRepository(server: MBeanServer): ClassLoaderRepository = ???

    /** Return a new object implementing the MBeanServer interface
     *  with a standard default domain name, without keeping an
     *  internal reference to this new object.
     */
    @stub
    def newMBeanServer(): MBeanServer = ???

    /** Return a new object implementing the MBeanServer interface
     *  with the specified default domain name, without keeping an
     *  internal reference to this new object.
     */
    @stub
    def newMBeanServer(domain: String): MBeanServer = ???
}
