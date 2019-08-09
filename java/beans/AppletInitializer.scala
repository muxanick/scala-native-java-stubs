package java.beans

import java.applet.Applet
import java.beans.beancontext.BeanContext
import scala.scalanative.annotation.stub

/** 
 *  This interface is designed to work in collusion with java.beans.Beans.instantiate.
 *  The interface is intended to provide mechanism to allow the proper
 *  initialization of JavaBeans that are also Applets, during their
 *  instantiation by java.beans.Beans.instantiate().
 *  
 */
trait AppletInitializer {

    /** 
     *  Activate, and/or mark Applet active.
     */
    @stub
    def activate(newApplet: Applet): Unit = ???

    /** 
     *  If passed to the appropriate variant of java.beans.Beans.instantiate
     *  this method will be called in order to associate the newly instantiated
     *  Applet (JavaBean) with its AppletContext, AppletStub, and Container.
     */
    @stub
    def initialize(newAppletBean: Applet, bCtxt: BeanContext): Unit = ???
}
