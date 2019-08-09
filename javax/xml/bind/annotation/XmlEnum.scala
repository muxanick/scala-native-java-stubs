package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  Maps an enum type Enum to XML representation.
 * 
 *  This annotation, together with XmlEnumValue provides a
 *  mapping of enum type to XML representation.
 * 
 *   Usage 
 *  
 *  The @XmlEnum annotation can be used with the
 *  following program elements:
 *  
 *    enum type
 *  
 * 
 *   The usage is subject to the following constraints:
 *  
 *     This annotation can be used the following other annotations:
 *          XmlType,
 *          XmlRootElement 
 *  
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information 
 * 
 *  An enum type is mapped to a schema simple type with enumeration
 *  facets. The schema type is derived from the Java type to which
 *  @XmlEnum.value(). Each enum constant @XmlEnumValue
 *  must have a valid lexical representation for the type
 *  @XmlEnum.value() .
 * 
 *  Examples: See examples in XmlEnumValue
 */
@Retention ( value = RUNTIME ) 
@Target ( value = TYPE ) 
 final class XmlEnum extends StaticAnnotation {
}
