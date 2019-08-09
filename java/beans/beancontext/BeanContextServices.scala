package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.Iterator

// 
// The BeanContextServices interface provides a mechanism for a BeanContext
// to expose generic "services" to the BeanContextChild objects within.
// 
trait BeanContextServices extends BeanContext , BeanContextServicesListener {

    @stub
    // Adds a BeanContextServicesListener to this BeanContext
    def addBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???

    @stub
    // Adds a service to this BeanContext.
    def addService(serviceClass: Class, serviceProvider: BeanContextServiceProvider): Boolean = ???

    @stub
    // Gets the currently available services for this context.
    def getCurrentServiceClasses(): Iterator = ???

    @stub
    // Gets the list of service dependent service parameters
    // (Service Selectors) for the specified service, by
    // calling getCurrentServiceSelectors() on the
    // underlying BeanContextServiceProvider.
    def getCurrentServiceSelectors(serviceClass: Class): Iterator = ???

    @stub
    // A BeanContextChild, or any arbitrary object
    // associated with a BeanContextChild, may obtain
    // a reference to a currently registered service from its
    // nesting BeanContextServices
    // via invocation of this method.
    def getService(child: BeanContextChild, requestor: Object, serviceClass: Class, serviceSelector: Object, bcsrl: BeanContextServiceRevokedListener): Object = ???

    @stub
    // Reports whether or not a given service is
    // currently available from this context.
    def hasService(serviceClass: Class): Boolean = ???

    @stub
    // Releases a BeanContextChild's
    // (or any arbitrary object associated with a BeanContextChild)
    // reference to the specified service by calling releaseService()
    // on the underlying BeanContextServiceProvider.
    def releaseService(child: BeanContextChild, requestor: Object, service: Object): Unit = ???

    @stub
    // Removes a BeanContextServicesListener
    // from this BeanContext
    def removeBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???
}
