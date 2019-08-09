package java.beans

import java.awt.Image
import java.lang.Object

// This is a support class to make it easier for people to provide
// BeanInfo classes.
// 
// It defaults to providing "noop" information, and can be selectively
// overriden to provide more explicit information on chosen topics.
// When the introspector sees the "noop" values, it will apply low
// level introspection and design patterns to automatically analyze
// the target bean.
class SimpleBeanInfo extends Object with BeanInfo {

    @stub
    // Claim there are no other relevant BeanInfo objects.
    def getAdditionalBeanInfo(): Array[BeanInfo] = ???

    @stub
    // Deny knowledge about the class and customizer of the bean.
    def getBeanDescriptor(): BeanDescriptor = ???

    @stub
    // Deny knowledge of a default event.
    def getDefaultEventIndex(): Int = ???

    @stub
    // Deny knowledge of a default property.
    def getDefaultPropertyIndex(): Int = ???

    @stub
    // Deny knowledge of event sets.
    def getEventSetDescriptors(): Array[EventSetDescriptor] = ???

    @stub
    // Claim there are no icons available.
    def getIcon(iconKind: Int): Image = ???

    @stub
    // Deny knowledge of methods.
    def getMethodDescriptors(): Array[MethodDescriptor] = ???

    @stub
    // Deny knowledge of properties.
    def getPropertyDescriptors(): Array[PropertyDescriptor] = ???
}
