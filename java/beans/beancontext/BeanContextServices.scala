package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.Iterator

/** 
 *  The BeanContextServices interface provides a mechanism for a BeanContext
 *  to expose generic "services" to the BeanContextChild objects within.
 *  
 */
trait BeanContextServices extends BeanContext with BeanContextServicesListener {

    /** Adds a BeanContextServicesListener to this BeanContext */
    @stub
    def addBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???

    /** Adds a service to this BeanContext. */
    @stub
    def addService(serviceClass: Class, serviceProvider: BeanContextServiceProvider): Boolean = ???

    /** Gets the currently available services for this context. */
    @stub
    def getCurrentServiceClasses(): Iterator = ???

    /** Gets the list of service dependent service parameters
     *  (Service Selectors) for the specified service, by
     *  calling getCurrentServiceSelectors() on the
     *  underlying BeanContextServiceProvider.
     */
    @stub
    def getCurrentServiceSelectors(serviceClass: Class): Iterator = ???

    /** A BeanContextChild, or any arbitrary object
     *  associated with a BeanContextChild, may obtain
     *  a reference to a currently registered service from its
     *  nesting BeanContextServices
     *  via invocation of this method.
     */
    @stub
    def getService(child: BeanContextChild, requestor: Object, serviceClass: Class, serviceSelector: Object, bcsrl: BeanContextServiceRevokedListener): Object = ???

    /** Reports whether or not a given service is
     *  currently available from this context.
     */
    @stub
    def hasService(serviceClass: Class): Boolean = ???

    /** Releases a BeanContextChild's
     *  (or any arbitrary object associated with a BeanContextChild)
     *  reference to the specified service by calling releaseService()
     *  on the underlying BeanContextServiceProvider.
     */
    @stub
    def releaseService(child: BeanContextChild, requestor: Object, service: Object): Unit = ???

    /** Removes a BeanContextServicesListener
     *  from this BeanContext
     */
    @stub
    def removeBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???
}
