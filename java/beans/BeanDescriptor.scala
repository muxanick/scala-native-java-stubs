package java.beans

import java.lang.{Class, Object}

// A BeanDescriptor provides global information about a "bean",
// including its Java class, its displayName, etc.
// 
// This is one of the kinds of descriptor returned by a BeanInfo object,
// which also returns descriptors for properties, method, and events.
class BeanDescriptor extends FeatureDescriptor {

    @stub
    // Create a BeanDescriptor for a bean that doesn't have a customizer.
    def this(beanClass: Class[_]) = ???

    @stub
    // Gets the bean's Class object.
    def getBeanClass(): Class[_] = ???
}
