package java.beans

import java.beans.beancontext.BeanContext
import java.lang.{Class, ClassLoader, Object, String}

// This class provides some general purpose beans control methods.
class Beans extends Object {
}

object Beans {
    @stub
    // From a given bean, obtain an object representing a specified
    // type view of that source object.
    def getInstanceOf(bean: Object, targetType: Class[_]): Object = ???

    @stub
    // 
    // Instantiate a JavaBean.
    def instantiate(cls: ClassLoader, beanName: String): Object = ???

    @stub
    // 
    // Instantiate a JavaBean.
    def instantiate(cls: ClassLoader, beanName: String, beanContext: BeanContext): Object = ???

    @stub
    // Instantiate a bean.
    def instantiate(cls: ClassLoader, beanName: String, beanContext: BeanContext, initializer: AppletInitializer): Object = ???

    @stub
    // Test if we are in design-mode.
    def isDesignTime(): Boolean = ???

    @stub
    // Determines whether beans can assume a GUI is available.
    def isGuiAvailable(): Boolean = ???

    @stub
    // Check if a bean can be viewed as a given target type.
    def isInstanceOf(bean: Object, targetType: Class[_]): Boolean = ???

    @stub
    // Used to indicate whether of not we are running in an application
    // builder environment.
    def setDesignTime(isDesignTime: Boolean): Unit = ???
}
