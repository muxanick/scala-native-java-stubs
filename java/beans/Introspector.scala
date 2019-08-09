package java.beans

import java.lang.{Class, Object, String}

// The Introspector class provides a standard way for tools to learn about
// the properties, events, and methods supported by a target Java Bean.
// 
// For each of those three kinds of information, the Introspector will
// separately analyze the bean's class and superclasses looking for
// either explicit or implicit information and use that information to
// build a BeanInfo object that comprehensively describes the target bean.
// 
// For each class "Foo", explicit information may be available if there exists
// a corresponding "FooBeanInfo" class that provides a non-null value when
// queried for the information.   We first look for the BeanInfo class by
// taking the full package-qualified name of the target bean class and
// appending "BeanInfo" to form a new class name.  If this fails, then
// we take the final classname component of this name, and look for that
// class in each of the packages specified in the BeanInfo package search
// path.
// 
// Thus for a class such as "sun.xyz.OurButton" we would first look for a
// BeanInfo class called "sun.xyz.OurButtonBeanInfo" and if that failed we'd
// look in each package in the BeanInfo search path for an OurButtonBeanInfo
// class.  With the default search path, this would mean looking for
// "sun.beans.infos.OurButtonBeanInfo".
// 
// If a class provides explicit BeanInfo about itself then we add that to
// the BeanInfo information we obtained from analyzing any derived classes,
// but we regard the explicit information as being definitive for the current
// class and its base classes, and do not proceed any further up the superclass
// chain.
// 
// If we don't find explicit BeanInfo on a class, we use low-level
// reflection to study the methods of the class and apply standard design
// patterns to identify property accessors, event sources, or public
// methods.  We then proceed to analyze the class's superclass and add
// in the information from it (and possibly on up the superclass chain).
// 
// For more information about introspection and design patterns, please
// consult the
//  JavaBeans™ specification.
class Introspector extends Object {
}

object Introspector {
    @stub
    // Flag to indicate to ignore all beaninfo.
    def IGNORE_ALL_BEANINFO: Int = ???

    @stub
    // Flag to indicate to ignore immediate beaninfo.
    def IGNORE_IMMEDIATE_BEANINFO: Int = ???

    @stub
    // Utility method to take a string and convert it to normal Java variable
    // name capitalization.
    def decapitalize(name: String): String = ???

    @stub
    // Flush all of the Introspector's internal caches.
    def flushCaches(): Unit = ???

    @stub
    // Flush the Introspector's internal cached information for a given class.
    def flushFromCaches(clz: Class[_]): Unit = ???

    @stub
    // Introspect on a Java Bean and learn about all its properties, exposed
    // methods, and events.
    def getBeanInfo(beanClass: Class[_]): BeanInfo = ???

    @stub
    // Introspect on a Java bean and learn all about its properties, exposed
    // methods, below a given "stop" point.
    def getBeanInfo(beanClass: Class[_], stopClass: Class[_]): BeanInfo = ???

    @stub
    // Introspect on a Java Bean and learn about all its properties,
    // exposed methods and events, below a given stopClass point
    // subject to some control flags.
    def getBeanInfo(beanClass: Class[_], stopClass: Class[_], flags: Int): BeanInfo = ???

    @stub
    // Introspect on a Java bean and learn about all its properties, exposed
    // methods, and events, subject to some control flags.
    def getBeanInfo(beanClass: Class[_], flags: Int): BeanInfo = ???

    @stub
    // Gets the list of package names that will be used for
    //          finding BeanInfo classes.
    def getBeanInfoSearchPath(): Array[String] = ???
}
