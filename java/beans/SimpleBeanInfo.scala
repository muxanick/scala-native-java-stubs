package java.beans

import java.awt.Image
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This is a support class to make it easier for people to provide
 *  BeanInfo classes.
 *  
 *  It defaults to providing "noop" information, and can be selectively
 *  overriden to provide more explicit information on chosen topics.
 *  When the introspector sees the "noop" values, it will apply low
 *  level introspection and design patterns to automatically analyze
 *  the target bean.
 */
class SimpleBeanInfo extends Object with BeanInfo {

    /**  */
    @stub
    def this() = ???

    /** Claim there are no other relevant BeanInfo objects. */
    @stub
    def getAdditionalBeanInfo(): Array[BeanInfo] = ???

    /** Deny knowledge about the class and customizer of the bean. */
    @stub
    def getBeanDescriptor(): BeanDescriptor = ???

    /** Deny knowledge of a default event. */
    @stub
    def getDefaultEventIndex(): Int = ???

    /** Deny knowledge of a default property. */
    @stub
    def getDefaultPropertyIndex(): Int = ???

    /** Deny knowledge of event sets. */
    @stub
    def getEventSetDescriptors(): Array[EventSetDescriptor] = ???

    /** Claim there are no icons available. */
    @stub
    def getIcon(iconKind: Int): Image = ???

    /** Deny knowledge of methods. */
    @stub
    def getMethodDescriptors(): Array[MethodDescriptor] = ???

    /** Deny knowledge of properties. */
    @stub
    def getPropertyDescriptors(): Array[PropertyDescriptor] = ???

    /** This is a utility method to help in loading icon images. */
    @stub
    def loadImage(resourceName: String): Image = ???
}
