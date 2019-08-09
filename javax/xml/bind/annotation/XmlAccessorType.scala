package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Inherited, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/**  Controls whether fields or Javabean properties are serialized by default. 
 * 
 *    Usage  
 * 
 *   @XmlAccessorType annotation can be used with the following program elements:
 * 
 *  
 *     package
 *     a top level class 
 *  
 * 
 *   See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  This annotation provides control over the default serialization
 *  of properties and fields in a class.
 * 
 *  The annotation  @XmlAccessorType  on a package applies to
 *  all classes in the package. The following inheritance
 *  semantics apply:
 * 
 *  
 *     If there is a @XmlAccessorType on a class, then it
 *         is used. 
 *     Otherwise, if a @XmlAccessorType exists on one of
 *         its super classes, then it is inherited.
 *     Otherwise, the @XmlAccessorType  on a package is
 *         inherited.
 *  
 *    Defaulting Rules:  
 * 
 *  By default, if @XmlAccessorType  on a package is absent,
 *  then the following package level annotation is assumed.
 *  
 *    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
 *  
 *   By default, if @XmlAccessorType on a class is absent,
 *  and none of its super classes is annotated with
 *  @XmlAccessorType, then the following default on the class
 *  is assumed: 
 *  
 *    @XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
 *  
 *  This annotation can be used with the following annotations:
 *     XmlType, XmlRootElement, XmlAccessorOrder,
 *     XmlSchema, XmlSchemaType, XmlSchemaTypes,
 *     , XmlJavaTypeAdapter. It can also be used with the
 *     following annotations at the package level: XmlJavaTypeAdapter.
 */
@Inherited 
@Retention ( value = RUNTIME ) 
@Target ( value ={ PACKAGE , TYPE } ) 
 final class XmlAccessorType extends StaticAnnotation {

    /** Specifies whether fields or properties are serialized. */
    @stub
    val value: XmlAccessType = ???
}
