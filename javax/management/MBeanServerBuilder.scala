package javax.management

import java.lang.{Object, String}

// This class represents a builder that creates a default
// MBeanServer implementation.
// The JMX MBeanServerFactory allows
// applications to provide their custom MBeanServer
// implementation by providing a subclass of this class.
class MBeanServerBuilder extends Object {

    @stub
    // This method creates a new MBeanServer implementation object.
    def newMBeanServer(defaultDomain: String, outer: MBeanServer, delegate: MBeanServerDelegate): MBeanServer = ???
}
