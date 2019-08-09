package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Inherited, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  Controls the ordering of fields and properties in a class. 
 * 
 *  Usage 
 * 
 *    @XmlAccessorOrder  annotation can be used with the following
 *  program elements:
 * 
 *  
 *     package
 *     a top level class 
 *  
 * 
 *   See "Package Specification" in javax.xml.bind package javadoc for
 *  additional common information.
 * 
 *  The effective XmlAccessOrder on a class is determined
 *  as follows:
 * 
 *  
 *     If there is a @XmlAccessorOrder on a class, then
 *         it is used. 
 *     Otherwise, if a @XmlAccessorOrder  exists on one of
 *         its super classes, then it is inherited (by the virtue of
 *         Inherited)
 *     Otherwise, the @XmlAccessorOrder on the package
 *         of the class is used, if it's there.
 *     Otherwise XmlAccessOrder.UNDEFINED.
 *  
 * 
 *  This annotation can be used with the following annotations:
 *     XmlType, XmlRootElement, XmlAccessorType,
 *     XmlSchema, XmlSchemaType, XmlSchemaTypes,
 *     , XmlJavaTypeAdapter. It can also be used with the
 *     following annotations at the package level: XmlJavaTypeAdapter.
 */
@Inherited 
@Retention ( value = RUNTIME ) 
@Target ( value ={ PACKAGE , TYPE } ) 
 final class XmlAccessorOrder extends StaticAnnotation {

    /**  */
    @stub
    val value: XmlAccessOrder = ???
}
