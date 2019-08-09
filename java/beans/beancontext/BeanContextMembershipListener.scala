package java.beans.beancontext

import java.util.EventListener
import scala.scalanative.annotation.stub

/** 
 *  Compliant BeanContexts fire events on this interface when the state of
 *  the membership of the BeanContext changes.
 *  
 */
trait BeanContextMembershipListener extends EventListener {

    /** Called when a child or list of children is added to a
     *  BeanContext that this listener is registered with.
     */
    @stub
    def childrenAdded(bcme: BeanContextMembershipEvent): Unit = ???

    /** Called when a child or list of children is removed
     *  from a BeanContext that this listener
     *  is registered with.
     */
    @stub
    def childrenRemoved(bcme: BeanContextMembershipEvent): Unit = ???
}
