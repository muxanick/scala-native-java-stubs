package java.beans

import java.awt.Image

// Use the BeanInfo interface
// to create a BeanInfo class
// and provide explicit information about the methods,
// properties, events, and other features of your beans.
// 
// When developing your bean, you can implement
// the bean features required for your application task
// omitting the rest of the BeanInfo features.
// They will be obtained through the automatic analysis
// by using the low-level reflection of the bean methods
// and applying standard design patterns.
// You have an opportunity to provide additional bean information
// through various descriptor classes.
// 
// See the SimpleBeanInfo class that is
// a convenient basic class for BeanInfo classes.
// You can override the methods and properties of
// the SimpleBeanInfo class to define specific information.
// 
// See also the Introspector class to learn more about bean behavior.
trait BeanInfo {

    @stub
    // This method enables the current BeanInfo object
    // to return an arbitrary collection of other BeanInfo objects
    // that provide additional information about the current bean.
    def getAdditionalBeanInfo(): Array[BeanInfo] = ???

    @stub
    // Returns the bean descriptor
    // that provides overall information about the bean,
    // such as its display name or its customizer.
    def getBeanDescriptor(): BeanDescriptor = ???

    @stub
    // A bean may have a default event typically applied when this bean is used.
    def getDefaultEventIndex(): Int = ???

    @stub
    // A bean may have a default property commonly updated when this bean is customized.
    def getDefaultPropertyIndex(): Int = ???

    @stub
    // Returns the event descriptors of the bean
    // that define the types of events fired by this bean.
    def getEventSetDescriptors(): Array[EventSetDescriptor] = ???

    @stub
    // Returns an image that can be used to represent the bean in toolboxes or toolbars.
    def getIcon(iconKind: Int): Image = ???

    @stub
    // Returns the method descriptors of the bean
    // that define the externally visible methods supported by this bean.
    def getMethodDescriptors(): Array[MethodDescriptor] = ???
}

object BeanInfo {
    @stub
    // Constant to indicate a 16 x 16 color icon.
    def ICON_COLOR_16x16: Int = ???

    @stub
    // Constant to indicate a 32 x 32 color icon.
    def ICON_COLOR_32x32: Int = ???

    @stub
    // Constant to indicate a 16 x 16 monochrome icon.
    def ICON_MONO_16x16: Int = ???
}
