package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.EventObject

/** 
 *  This event type is used by the
 *  BeanContextServiceRevokedListener in order to
 *  identify the service being revoked.
 *  
 */
class BeanContextServiceRevokedEvent extends BeanContextEvent {

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
}
