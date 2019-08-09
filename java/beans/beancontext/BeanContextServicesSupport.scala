package java.beans.beancontext

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.lang.{Class, Object}
import java.util.{ArrayList, Iterator, Locale}

// 
// This helper class provides a utility implementation of the
// java.beans.beancontext.BeanContextServices interface.
// 
// 
// Since this class directly implements the BeanContextServices interface,
// the class can, and is intended to be used either by subclassing this
// implementation, or via delegation of an instance of this class
// from another through the BeanContextProxy interface.
// 
class BeanContextServicesSupport extends BeanContextSupport with BeanContextServices {

    @stub
    // Create an instance that is not a delegate of another object
    def this() = ???

    @stub
    // Create an instance with a peer
    def this(peer: BeanContextServices) = ???

    @stub
    // Create an instance using the specified locale
    def this(peer: BeanContextServices, lcle: Locale) = ???

    @stub
    // Create an instance using the specified Locale and design mode.
    def this(peer: BeanContextServices, lcle: Locale, dtime: Boolean) = ???

    @stub
    // 
    protected def BeanContextServicesSupport.BCSSChild: class = ???

    @stub
    // 
    protected def BeanContextServicesSupport.BCSSProxyServiceProvider: class = ???

    @stub
    // List of BeanContextServicesListener objects.
    protected def bcsListeners: ArrayList = ???

    @stub
    // Delegate for the BeanContextServiceProvider.
    protected def proxy: BeanContextServicesSupport.BCSSProxyServiceProvider = ???

    @stub
    // The number of instances of a serializable BeanContextServceProvider.
    protected def serializable: Int = ???

    @stub
    // add a BeanContextServicesListener
    def addBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???

    @stub
    // add a service
    def addService(serviceClass: Class, bcsp: BeanContextServiceProvider): Boolean = ???

    @stub
    // add a service
    protected def addService(serviceClass: Class, bcsp: BeanContextServiceProvider, fireEvent: Boolean): Boolean = ???

    @stub
    // called from BeanContextSupport readObject before it deserializes the
    // children ...
    protected def bcsPreDeserializationHook(ois: ObjectInputStream): Unit = ???

    @stub
    // called from BeanContextSupport writeObject before it serializes the
    // children ...
    protected def bcsPreSerializationHook(oos: ObjectOutputStream): Unit = ???

    @stub
    // called from superclass child removal operations after a child
    // has been successfully removed.
    protected def childJustRemovedHook(child: Object, bcsc: BeanContextSupport.BCSChild): Unit = ???

    @stub
    // 
    // Subclasses can override this method to insert their own subclass
    // of Child without having to override add() or the other Collection
    // methods that add children to the set.
    protected def createBCSChild(targetChild: Object, peer: Object): BeanContextSupport.BCSChild = ???

    @stub
    // subclasses can override this method to create new subclasses of
    // BCSSServiceProvider without having to override addService() in
    // order to instantiate.
    protected def createBCSSServiceProvider(sc: Class, bcsp: BeanContextServiceProvider): BeanContextServicesSupport.BCSSServiceProvider = ???

    @stub
    // Fires a BeanContextServiceAvailableEvent indicating that a new
    // service has become available.
    protected def fireServiceAdded(bcssae: BeanContextServiceAvailableEvent): Unit = ???

    @stub
    // Fires a BeanContextServiceEvent notifying of a new service.
    protected def fireServiceAdded(serviceClass: Class): Unit = ???

    @stub
    // Fires a BeanContextServiceEvent notifying of a service being revoked.
    protected def fireServiceRevoked(bcsre: BeanContextServiceRevokedEvent): Unit = ???

    @stub
    // Fires a BeanContextServiceRevokedEvent
    // indicating that a particular service is
    // no longer available.
    protected def fireServiceRevoked(serviceClass: Class, revokeNow: Boolean): Unit = ???

    @stub
    // Gets the BeanContextServices associated with this
    // BeanContextServicesSupport.
    def getBeanContextServicesPeer(): BeanContextServices = ???

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
    // obtain a service which may be delegated
    def getService(child: BeanContextChild, requestor: Object, serviceClass: Class, serviceSelector: Object, bcsrl: BeanContextServiceRevokedListener): Object = ???

    @stub
    // has a service, which may be delegated
    def hasService(serviceClass: Class): Boolean = ???

    @stub
    // called by BeanContextSupport superclass during construction and
    // deserialization to initialize subclass transient state.
    def initialize(): Unit = ???

    @stub
    // called from setBeanContext to notify a BeanContextChild
    // to allocate resources obtained from the nesting BeanContext.
    protected def initializeBeanContextResources(): Unit = ???

    @stub
    // called from setBeanContext to notify a BeanContextChild
    // to release resources obtained from the nesting BeanContext.
    protected def releaseBeanContextResources(): Unit = ???

    @stub
    // release a service
    def releaseService(child: BeanContextChild, requestor: Object, service: Object): Unit = ???

    @stub
    // remove a BeanContextServicesListener
    def removeBeanContextServicesListener(bcsl: BeanContextServicesListener): Unit = ???

    @stub
    // remove a service
    def revokeService(serviceClass: Class, bcsp: BeanContextServiceProvider, revokeCurrentServicesNow: Boolean): Unit = ???

    @stub
    // BeanContextServicesListener callback, propagates event to all
    // currently registered listeners and BeanContextServices children,
    // if this BeanContextService does not already implement this service
    // itself.
    def serviceAvailable(bcssae: BeanContextServiceAvailableEvent): Unit = ???
}

object BeanContextServicesSupport {
    @stub
    // Gets the BeanContextServicesListener (if any) of the specified
    // child.
    protected def getChildBeanContextServicesListener(child: Object): BeanContextServicesListener = ???
}
