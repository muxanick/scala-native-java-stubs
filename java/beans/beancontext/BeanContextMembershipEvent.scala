package java.beans.beancontext

import java.lang.Object
import java.util.{Collection, EventObject, Iterator}
import scala.scalanative.annotation.stub

/** A BeanContextMembershipEvent encapsulates
 *  the list of children added to, or removed from,
 *  the membership of a particular BeanContext.
 *  An instance of this event is fired whenever a successful
 *  add(), remove(), retainAll(), removeAll(), or clear() is
 *  invoked on a given BeanContext instance.
 *  Objects interested in receiving events of this type must
 *  implement the BeanContextMembershipListener
 *  interface, and must register their intent via the
 *  BeanContext's
 *  addBeanContextMembershipListener(BeanContextMembershipListener bcml)
 *   method.
 */
class BeanContextMembershipEvent extends BeanContextEvent {

    /** Contruct a BeanContextMembershipEvent */
    @stub
    def this(bc: BeanContext, changes: Collection) = ???

    /** Contruct a BeanContextMembershipEvent */
    @stub
    def this(bc: BeanContext, changes: Array[Object]) = ???

    /** The list of children affected by this
     *  event notification.
     */
    @stub
    protected val children: Collection = ???

    /** Is the child specified affected by the event? */
    @stub
    def contains(child: Any): Boolean = ???

    /** Gets the array of children affected by this event. */
    @stub
    def iterator(): Iterator = ???

    /** Gets the number of children affected by the notification. */
    @stub
    def size(): Int = ???

    /** Gets the array of children affected by this event. */
    @stub
    def toArray(): Array[Object] = ???
}
