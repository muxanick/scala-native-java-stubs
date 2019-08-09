package java.beans

import java.lang.String
import scala.scalanative.annotation.stub

/** 
 *  This interface is intended to be implemented by, or delegated from, instances
 *  of java.beans.beancontext.BeanContext, in order to propagate to its nested hierarchy
 *  of java.beans.beancontext.BeanContextChild instances, the current "designTime" property.
 *  
 *  The JavaBeans™ specification defines the notion of design time as is a
 *  mode in which JavaBeans instances should function during their composition
 *  and customization in a interactive design, composition or construction tool,
 *  as opposed to runtime when the JavaBean is part of an applet, application,
 *  or other live Java executable abstraction.
 */
trait DesignMode {

    /** A value of true denotes that JavaBeans should behave in design time
     *  mode, a value of false denotes runtime behavior.
     */
    @stub
    def isDesignTime(): Boolean = ???

    /** Sets the "value" of the "designTime" property. */
    @stub
    def setDesignTime(designTime: Boolean): Unit = ???
}

object DesignMode {
    /** The standard value of the propertyName as fired from a BeanContext or
     *  other source of PropertyChangeEvents.
     */
    @stub
    val PROPERTYNAME: String = ???
}
