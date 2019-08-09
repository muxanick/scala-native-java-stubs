package java.beans.beancontext

import java.awt.Component
import scala.scalanative.annotation.stub

/** 
 *  This interface is implemented by
 *  BeanContextChildren that have an AWT Component
 *  associated with them.
 *  
 */
trait BeanContextChildComponentProxy {

    /** Gets the java.awt.Component associated with
     *  this BeanContextChild.
     */
    @stub
    def getComponent(): Component = ???
}
