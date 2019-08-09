package javax.management

import java.lang.{Class, Deprecated, Object, String}

// Keeps the list of Class Loaders registered in the MBean Server.
// It provides the necessary methods to load classes using the registered
// Class Loaders.
//
// This deprecated class is maintained for compatibility.  In
// previous versions of the JMX API, there was one
// DefaultLoaderRepository shared by all MBean servers.
// As of version 1.2 of the JMX API, that functionality is
// approximated by using MBeanServerFactory.findMBeanServer(java.lang.String) to
// find all known MBean servers, and consulting the ClassLoaderRepository of each one.  It is strongly recommended
// that code referencing DefaultLoaderRepository be
// rewritten.
@Deprecated class DefaultLoaderRepository extends Object {
}

object DefaultLoaderRepository {
    @stub
    // Deprecated. 
    def loadClass(className: String): Class[_] = ???
}
