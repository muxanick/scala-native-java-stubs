package java.beans.beancontext

import java.util.EventListener

// 
// Compliant BeanContexts fire events on this interface when the state of
// the membership of the BeanContext changes.
// 
trait BeanContextMembershipListener extends EventListener {

    @stub
    // Called when a child or list of children is added to a
    // BeanContext that this listener is registered with.
    def childrenAdded(bcme: BeanContextMembershipEvent): Unit = ???
}
