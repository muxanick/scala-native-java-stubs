package javax.management.loading

import java.lang.{Class, ClassLoader, String}

/** Instances of this interface are used to keep the list of ClassLoaders
 *  registered in an MBean Server.
 *  They provide the necessary methods to load classes using the registered
 *  ClassLoaders.
 * 
 *  The first ClassLoader in a ClassLoaderRepository is
 *  always the MBean Server's own ClassLoader.
 * 
 *  When an MBean is registered in an MBean Server, if it is of a
 *  subclass of ClassLoader and if it does not
 *  implement the interface PrivateClassLoader, it is added to
 *  the end of the MBean Server's ClassLoaderRepository.
 *  If it is subsequently unregistered from the MBean Server, it is
 *  removed from the ClassLoaderRepository.
 * 
 *  The order of MBeans in the ClassLoaderRepository is
 *  significant.  For any two MBeans X and Y in the
 *  ClassLoaderRepository, X must appear before
 *  Y if the registration of X was completed before
 *  the registration of Y started.  If X and
 *  Y were registered concurrently, their order is
 *  indeterminate.  The registration of an MBean corresponds to the
 *  call to MBeanServer.registerMBean(java.lang.Object, javax.management.ObjectName) or one of the MBeanServer.createMBean methods.
 */
trait ClassLoaderRepository {

    /** Load the given class name through the list of class loaders. */
    @stub
    def loadClass(className: String): Class[_] = ???

    /** Load the given class name through the list of class loaders,
     *  stopping at the given one.
     */
    @stub
    def loadClassBefore(stop: ClassLoader, className: String): Class[_] = ???
}
