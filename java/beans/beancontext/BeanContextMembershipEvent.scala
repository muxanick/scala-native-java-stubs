package java.beans.beancontext

import java.lang.Object
import java.util.{Collection, EventObject, Iterator}

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

    /** Is the child specified affected by the event? */
    @stub
    def contains(child: Object): Boolean = ???

    /** Gets the array of children affected by this event. */
    @stub
    def iterator(): Iterator = ???

    /** Gets the number of children affected by the notification. */
    @stub
    def size(): Int = ???
}
