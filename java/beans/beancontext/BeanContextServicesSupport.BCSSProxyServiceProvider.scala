package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.Iterator

// 
protected class BeanContextServicesSupport.BCSSProxyServiceProvider extends Object with BeanContextServiceProvider, with BeanContextServiceRevokedListener {

    @stub
    // Invoked by BeanContextServices, this method
    // gets the current service selectors for the specified service.
    def getCurrentServiceSelectors(bcs: BeanContextServices, serviceClass: Class): Iterator = ???

    @stub
    // Invoked by BeanContextServices, this method
    // requests an instance of a
    // service from this BeanContextServiceProvider.
    def getService(bcs: BeanContextServices, requestor: Object, serviceClass: Class, serviceSelector: Object): Object = ???

    @stub
    // Invoked by BeanContextServices,
    // this method releases a nested BeanContextChild's
    // (or any arbitrary object associated with a
    // BeanContextChild) reference to the specified service.
    def releaseService(bcs: BeanContextServices, requestor: Object, service: Object): Unit = ???
}
