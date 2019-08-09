package java.beans.beancontext

import java.lang.{Class, Object}
import java.util.{EventObject, Iterator}
import scala.scalanative.annotation.stub

/** 
 *  This event type is used by the BeanContextServicesListener in order to
 *  identify the service being registered.
 *  
 */
class BeanContextServiceAvailableEvent extends BeanContextEvent {

    /** Construct a BeanContextAvailableServiceEvent. */
    @stub
    def this(bcs: BeanContextServices, sc: Class) = ???

    /** A Class reference to the newly available service */
    @stub
    protected val serviceClass: Class = ???

    /** Gets the list of service dependent selectors. */
    @stub
    def getCurrentServiceSelectors(): Iterator = ???

    /** Gets the service class that is the subject of this notification. */
    @stub
    def getServiceClass(): Class = ???

    /** Gets the source as a reference of type BeanContextServices. */
    @stub
    def getSourceAsBeanContextServices(): BeanContextServices = ???
}
