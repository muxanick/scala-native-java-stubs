package java.beans.beancontext

import java.beans.{PropertyChangeListener, PropertyChangeSupport, VetoableChangeListener, VetoableChangeSupport}
import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** 
 *  This is a general support class to provide support for implementing the
 *  BeanContextChild protocol.
 * 
 *  This class may either be directly subclassed, or encapsulated and delegated
 *  to in order to implement this interface for a given component.
 *  
 */
class BeanContextChildSupport extends Object with BeanContextChild with BeanContextServicesListener with Serializable {

    /** construct a BeanContextChildSupport where this class has been
     *  subclassed in order to implement the JavaBean component itself.
     */
    @stub
    def this() = ???

    /** construct a BeanContextChildSupport where the JavaBean component
     *  itself implements BeanContextChild, and encapsulates this, delegating
     *  that interface to this implementation
     */
    @stub
    def this(bcc: BeanContextChild) = ???

    /** The bean context. */
    @stub
    protected val beanContext: BeanContext = ???

    /** The BeanContext in which
     *  this BeanContextChild is nested.
     */
    @stub
    val beanContextChildPeer: BeanContextChild = ???

    /** The PropertyChangeSupport associated with this
     *  BeanContextChildSupport.
     */
    @stub
    protected val pcSupport: PropertyChangeSupport = ???

    /** A flag indicating that there has been
     *  at least one PropertyChangeVetoException
     *  thrown for the attempted setBeanContext operation.
     */
    @stub
    protected val rejectedSetBCOnce: Boolean = ???

    /** The VetoableChangeSupport associated with this
     *  BeanContextChildSupport.
     */
    @stub
    protected val vcSupport: VetoableChangeSupport = ???

    /** Add a PropertyChangeListener for a specific property. */
    @stub
    def addPropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    /** Add a VetoableChangeListener for a specific property. */
    @stub
    def addVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    /** Report a bound property update to any registered listeners. */
    @stub
    def firePropertyChange(name: String, oldValue: Any, newValue: Any): Unit = ???

    /** Report a vetoable property update to any registered listeners. */
    @stub
    def fireVetoableChange(name: String, oldValue: Any, newValue: Any): Unit = ???

    /** Gets the nesting BeanContext
     *  for this BeanContextChildSupport.
     */
    @stub
    def getBeanContext(): BeanContext = ???

    /** Gets the BeanContextChild associated with this
     *  BeanContextChildSupport.
     */
    @stub
    def getBeanContextChildPeer(): BeanContextChild = ???

    /** This method may be overridden by subclasses to provide their own
     *  initialization behaviors.
     */
    @stub
    protected def initializeBeanContextResources(): Unit = ???

    /** Reports whether or not this class is a delegate of another. */
    @stub
    def isDelegated(): Boolean = ???

    /** This method may be overridden by subclasses to provide their own
     *  release behaviors.
     */
    @stub
    protected def releaseBeanContextResources(): Unit = ???

    /** Remove a PropertyChangeListener for a specific property. */
    @stub
    def removePropertyChangeListener(name: String, pcl: PropertyChangeListener): Unit = ???

    /** Removes a VetoableChangeListener. */
    @stub
    def removeVetoableChangeListener(name: String, vcl: VetoableChangeListener): Unit = ???

    /** A new service is available from the nesting BeanContext. */
    @stub
    def serviceAvailable(bcsae: BeanContextServiceAvailableEvent): Unit = ???

    /** A service provided by the nesting BeanContext has been revoked. */
    @stub
    def serviceRevoked(bcsre: BeanContextServiceRevokedEvent): Unit = ???

    /** Sets the BeanContext for
     *  this BeanContextChildSupport.
     */
    @stub
    def setBeanContext(bc: BeanContext): Unit = ???

    /** Called from setBeanContext to validate (or otherwise) the
     *  pending change in the nesting BeanContext property value.
     */
    @stub
    def validatePendingSetBeanContext(newValue: BeanContext): Boolean = ???
}
