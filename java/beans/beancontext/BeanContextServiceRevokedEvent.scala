package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.EventObject

// 
// This event type is used by the
// BeanContextServiceRevokedListener in order to
// identify the service being revoked.
// 
class BeanContextServiceRevokedEvent extends BeanContextEvent {

    @stub
    // Gets the service class that is the subject of this notification
    def getServiceClass(): Class = ???

    @stub
    // Gets the source as a reference of type BeanContextServices
    def getSourceAsBeanContextServices(): BeanContextServices = ???

    @stub
    // Reports if the current service is being forcibly revoked,
    // in which case the references are now invalidated and unusable.
    def isCurrentServiceInvalidNow(): Boolean = ???
}
