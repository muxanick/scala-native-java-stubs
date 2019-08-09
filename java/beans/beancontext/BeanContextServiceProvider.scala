package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.Iterator

/** 
 *  One of the primary functions of a BeanContext is to act a as rendezvous
 *  between JavaBeans, and BeanContextServiceProviders.
 *  
 *  
 *  A JavaBean nested within a BeanContext, may ask that BeanContext to
 *  provide an instance of a "service", based upon a reference to a Java
 *  Class object that represents that service.
 *  
 *  
 *  If such a service has been registered with the context, or one of its
 *  nesting context's, in the case where a context delegate to its context
 *  to satisfy a service request, then the BeanContextServiceProvider associated with
 *  the service is asked to provide an instance of that service.
 *  
 *  
 *  The ServcieProvider may always return the same instance, or it may
 *  construct a new instance for each request.
 *  
 */
trait BeanContextServiceProvider {

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
    def getService(bcs: BeanContextServices, requestor: Object, serviceClass: Class, serviceSelector: Object): Object = ???
}
