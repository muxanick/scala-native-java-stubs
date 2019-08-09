package java.beans

import java.beans.beancontext.BeanContext
import java.lang.{Class, ClassLoader, Object, String}
import scala.scalanative.annotation.stub

/** This class provides some general purpose beans control methods. */
class Beans extends Object {

    /**  */
    @stub
    def this() = ???
}

object Beans {
    /** From a given bean, obtain an object representing a specified
     *  type view of that source object.
     */
    @stub
    def getInstanceOf(bean: Object, targetType: Class[_]): Object = ???

    /** 
     *  Instantiate a JavaBean.
     */
    @stub
    def instantiate(cls: ClassLoader, beanName: String): Object = ???

    /** 
     *  Instantiate a JavaBean.
     */
    @stub
    def instantiate(cls: ClassLoader, beanName: String, beanContext: BeanContext): Object = ???

    /** Instantiate a bean. */
    @stub
    def instantiate(cls: ClassLoader, beanName: String, beanContext: BeanContext, initializer: AppletInitializer): Object = ???

    /** Test if we are in design-mode. */
    @stub
    def isDesignTime(): Boolean = ???

    /** Determines whether beans can assume a GUI is available. */
    @stub
    def isGuiAvailable(): Boolean = ???

    /** Check if a bean can be viewed as a given target type. */
    @stub
    def isInstanceOf(bean: Object, targetType: Class[_]): Boolean = ???

    /** Used to indicate whether of not we are running in an application
     *  builder environment.
     */
    @stub
    def setDesignTime(isDesignTime: Boolean): Unit = ???

    /** Used to indicate whether of not we are running in an environment
     *  where GUI interaction is available.
     */
    @stub
    def setGuiAvailable(isGuiAvailable: Boolean): Unit = ???
}
