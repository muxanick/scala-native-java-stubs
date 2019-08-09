package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.EventObject
import scala.scalanative.annotation.stub

/** 
 *  This event type is used by the
 *  BeanContextServiceRevokedListener in order to
 *  identify the service being revoked.
 *  
 */
class BeanContextServiceRevokedEvent extends BeanContextEvent {

    /** Construct a BeanContextServiceEvent. */
    @stub
    def this(bcs: BeanContextServices, sc: Class, invalidate: Boolean) = ???

    /** A Class reference to the service that is being revoked. */
    @stub
    protected val serviceClass: Class = ???

    /** Gets the service class that is the subject of this notification */
    @stub
    def getServiceClass(): Class = ???

    /** Gets the source as a reference of type BeanContextServices */
    @stub
    def getSourceAsBeanContextServices(): BeanContextServices = ???

    /** Reports if the current service is being forcibly revoked,
     *  in which case the references are now invalidated and unusable.
     */
    @stub
    def isCurrentServiceInvalidNow(): Boolean = ???

    /** Checks this event to determine whether or not
     *  the service being revoked is of a particular class.
     */
    @stub
    def isServiceClass(service: Class): Boolean = ???
}
