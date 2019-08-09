package java.beans

import java.applet.Applet

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
}
