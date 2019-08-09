package javax.management.remote

import javax.management.MBeanServer

// An object of this class implements the MBeanServer interface and
// wraps another object that also implements that interface.
// Typically, an implementation of this interface performs some action
// in some or all methods of the MBeanServer interface
// before and/or after forwarding the method to the wrapped object.
// Examples include security checking and logging.
trait MBeanServerForwarder extends MBeanServer {

    @stub
    // Returns the MBeanServer object to which requests will be forwarded.
    def getMBeanServer(): MBeanServer = ???
}
