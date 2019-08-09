package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.{EventObject, Iterator}

// 
// This event type is used by the BeanContextServicesListener in order to
// identify the service being registered.
// 
class BeanContextServiceAvailableEvent extends BeanContextEvent {

    @stub
    // Gets the list of service dependent selectors.
    def getCurrentServiceSelectors(): Iterator = ???

    @stub
    // Gets the service class that is the subject of this notification.
    def getServiceClass(): Class = ???
}