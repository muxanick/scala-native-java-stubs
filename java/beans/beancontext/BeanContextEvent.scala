package java.beans.beancontext

import java.lang.Object
import java.util.EventObject
import scala.scalanative.annotation.stub

/** 
 *  BeanContextEvent is the abstract root event class
 *  for all events emitted
 *  from, and pertaining to the semantics of, a BeanContext.
 *  This class introduces a mechanism to allow the propagation of
 *  BeanContextEvent subclasses through a hierarchy of
 *  BeanContexts. The setPropagatedFrom()
 *  and getPropagatedFrom() methods allow a
 *  BeanContext to identify itself as the source
 *  of a propagated event.
 *  
 */
abstract class BeanContextEvent extends EventObject {

    /** Contruct a BeanContextEvent */
    @stub
    protected def this(bc: BeanContext) = ???

    /** The BeanContext from which this event was propagated */
    protected val propagatedFrom: BeanContext

    /** Gets the BeanContext associated with this event. */
    def getBeanContext(): BeanContext

    /** Gets the BeanContext from which this event was propagated. */
    def getPropagatedFrom(): BeanContext

    /** Reports whether or not this event is
     *  propagated from some other BeanContext.
     */
    def isPropagated(): Boolean

    /** Sets the BeanContext from which this event was propagated. */
    def setPropagatedFrom(bc: BeanContext): Unit
}
