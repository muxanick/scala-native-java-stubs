package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.Iterator
import scala.scalanative.annotation.stub

/**  */
protected class BeanContextServicesSupport_BCSSProxyServiceProvider extends Object with BeanContextServiceProvider with BeanContextServiceRevokedListener {

    /** Invoked by BeanContextServices, this method
     *  gets the current service selectors for the specified service.
     */
    @stub
    def getCurrentServiceSelectors(bcs: BeanContextServices, serviceClass: Class): Iterator = ???

    /** Invoked by BeanContextServices, this method
     *  requests an instance of a
     *  service from this BeanContextServiceProvider.
     */
    @stub
    def getService(bcs: BeanContextServices, requestor: Any, serviceClass: Class, serviceSelector: Any): Any = ???

    /** Invoked by BeanContextServices,
     *  this method releases a nested BeanContextChild's
     *  (or any arbitrary object associated with a
     *  BeanContextChild) reference to the specified service.
     */
    @stub
    def releaseService(bcs: BeanContextServices, requestor: Any, service: Any): Unit = ???

    /** The service named has been revoked. */
    @stub
    def serviceRevoked(bcsre: BeanContextServiceRevokedEvent): Unit = ???
}
