package java.beans.beancontext

import java.beans.{PropertyChangeListener, PropertyChangeSupport, VetoableChangeListener}
import java.io.Serializable
import java.lang.{Object, String}

// 
// This is a general support class to provide support for implementing the
// BeanContextChild protocol.
//
// This class may either be directly subclassed, or encapsulated and delegated
// to in order to implement this interface for a given component.
// 
class BeanContextChildSupport extends Object with BeanContextChild, with BeanContextServicesListener, with Serializable {

    @stub
    // construct a BeanContextChildSupport where this class has been
    // subclassed in order to implement the JavaBean component itself.
    def this() = ???

    @stub
    // The bean context.
    protected def beanContext: BeanContext = ???

    @stub
    // The BeanContext in which
    // this BeanContextChild is nested.
    def beanContextChildPeer: BeanContextChild = ???

    @stub
    // The PropertyChangeSupport associated with this
    // BeanContextChildSupport.
    protected def pcSupport: PropertyChangeSupport = ???

    @stub
    // A flag indicating that there has been
    // at least one PropertyChangeVetoException
    // thrown for the attempted setBeanContext operation.
    protected def rejectedSetBCOnce: Boolean = ???

    @stub
    // Add a PropertyChangeListener for a specific property.
    def addPropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    @stub
    // Add a VetoableChangeListener for a specific property.
    def addVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    @stub
    // Report a bound property update to any registered listeners.
    def firePropertyChange(name: String, oldValue: Object, newValue: Object): Unit = ???

    @stub
    // Report a vetoable property update to any registered listeners.
    def fireVetoableChange(name: String, oldValue: Object, newValue: Object): Unit = ???

    @stub
    // Gets the nesting BeanContext
    // for this BeanContextChildSupport.
    def getBeanContext(): BeanContext = ???

    @stub
    // Gets the BeanContextChild associated with this
    // BeanContextChildSupport.
    def getBeanContextChildPeer(): BeanContextChild = ???

    @stub
    // This method may be overridden by subclasses to provide their own
    // initialization behaviors.
    protected def initializeBeanContextResources(): Unit = ???

    @stub
    // Reports whether or not this class is a delegate of another.
    def isDelegated(): Boolean = ???

    @stub
    // This method may be overridden by subclasses to provide their own
    // release behaviors.
    protected def releaseBeanContextResources(): Unit = ???

    @stub
    // Remove a PropertyChangeListener for a specific property.
    def removePropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    @stub
    // Removes a VetoableChangeListener.
    def removeVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    @stub
    // A new service is available from the nesting BeanContext.
    def serviceAvailable(bcsae: BeanContextServiceAvailableEvent): Unit = ???

    @stub
    // A service provided by the nesting BeanContext has been revoked.
    def serviceRevoked(bcsre: BeanContextServiceRevokedEvent): Unit = ???

    @stub
    // Sets the BeanContext for
    // this BeanContextChildSupport.
    def setBeanContext(bc: BeanContext): Unit = ???
}
