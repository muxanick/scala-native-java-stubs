package java.beans.beancontext

import java.beans.{DesignMode, Visibility}
import java.io.InputStream
import java.lang.{Object, String}
import java.net.URL
import java.util.Collection
import scala.scalanative.annotation.stub

/** 
 *  The BeanContext acts a logical hierarchical container for JavaBeans.
 *  
 */
trait BeanContext extends BeanContextChild with Collection with DesignMode with Visibility {

    /** Adds the specified BeanContextMembershipListener
     *  to receive BeanContextMembershipEvents from
     *  this BeanContext whenever it adds
     *  or removes a child Component(s).
     */
    @stub
    def addBeanContextMembershipListener(bcml: BeanContextMembershipListener): Unit = ???

    /** Analagous to java.lang.ClassLoader.getResource(), this
     *  method allows a BeanContext implementation to interpose
     *  behavior between the child Component
     *  and underlying ClassLoader.
     */
    @stub
    def getResource(name: String, bcc: BeanContextChild): URL = ???

    /** Analagous to java.lang.ClassLoader.getResourceAsStream(),
     *  this method allows a BeanContext implementation
     *  to interpose behavior between the child Component
     *  and underlying ClassLoader.
     */
    @stub
    def getResourceAsStream(name: String, bcc: BeanContextChild): InputStream = ???

    /** Instantiate the javaBean named as a
     *  child of this BeanContext.
     */
    @stub
    def instantiateChild(beanName: String): Any = ???

    /** Removes the specified BeanContextMembershipListener
     *  so that it no longer receives BeanContextMembershipEvents
     *  when the child Component(s) are added or removed.
     */
    @stub
    def removeBeanContextMembershipListener(bcml: BeanContextMembershipListener): Unit = ???
}

object BeanContext {
    /** This global lock is used by both BeanContext
     *  and BeanContextServices implementors
     *  to serialize changes in a BeanContext
     *  hierarchy and any service requests etc.
     */
    @stub
    val globalHierarchyLock: Any = ???
}
