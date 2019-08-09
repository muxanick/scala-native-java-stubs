package java.beans.beancontext

import java.awt.Container
import scala.scalanative.annotation.stub

/** 
 *  This interface is implemented by BeanContexts' that have an AWT Container
 *  associated with them.
 *  
 */
trait BeanContextContainerProxy {

    /** Gets the java.awt.Container associated
     *  with this BeanContext.
     */
    @stub
    def getContainer(): Container = ???
}
