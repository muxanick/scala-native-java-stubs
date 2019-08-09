package java.beans

import java.awt.Image
import scala.scalanative.annotation.stub

/** Use the BeanInfo interface
 *  to create a BeanInfo class
 *  and provide explicit information about the methods,
 *  properties, events, and other features of your beans.
 *  
 *  When developing your bean, you can implement
 *  the bean features required for your application task
 *  omitting the rest of the BeanInfo features.
 *  They will be obtained through the automatic analysis
 *  by using the low-level reflection of the bean methods
 *  and applying standard design patterns.
 *  You have an opportunity to provide additional bean information
 *  through various descriptor classes.
 *  
 *  See the SimpleBeanInfo class that is
 *  a convenient basic class for BeanInfo classes.
 *  You can override the methods and properties of
 *  the SimpleBeanInfo class to define specific information.
 *  
 *  See also the Introspector class to learn more about bean behavior.
 */
trait BeanInfo {

    /** This method enables the current BeanInfo object
     *  to return an arbitrary collection of other BeanInfo objects
     *  that provide additional information about the current bean.
     */
    @stub
    def getAdditionalBeanInfo(): Array[BeanInfo] = ???

    /** Returns the bean descriptor
     *  that provides overall information about the bean,
     *  such as its display name or its customizer.
     */
    @stub
    def getBeanDescriptor(): BeanDescriptor = ???

    /** A bean may have a default event typically applied when this bean is used. */
    @stub
    def getDefaultEventIndex(): Int = ???

    /** A bean may have a default property commonly updated when this bean is customized. */
    @stub
    def getDefaultPropertyIndex(): Int = ???

    /** Returns the event descriptors of the bean
     *  that define the types of events fired by this bean.
     */
    @stub
    def getEventSetDescriptors(): Array[EventSetDescriptor] = ???

    /** Returns an image that can be used to represent the bean in toolboxes or toolbars. */
    @stub
    def getIcon(iconKind: Int): Image = ???

    /** Returns the method descriptors of the bean
     *  that define the externally visible methods supported by this bean.
     */
    @stub
    def getMethodDescriptors(): Array[MethodDescriptor] = ???

    /** Returns descriptors for all properties of the bean. */
    @stub
    def getPropertyDescriptors(): Array[PropertyDescriptor] = ???
}

object BeanInfo {
    /** Constant to indicate a 16 x 16 color icon. */
    @stub
    val ICON_COLOR_16x16: Int = ???

    /** Constant to indicate a 32 x 32 color icon. */
    @stub
    val ICON_COLOR_32x32: Int = ???

    /** Constant to indicate a 16 x 16 monochrome icon. */
    @stub
    val ICON_MONO_16x16: Int = ???

    /** Constant to indicate a 32 x 32 monochrome icon. */
    @stub
    val ICON_MONO_32x32: Int = ???
}
