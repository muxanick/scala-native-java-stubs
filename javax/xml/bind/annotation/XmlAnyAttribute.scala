package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  Maps a JavaBean property to a map of wildcard attributes.
 * 
 *   Usage 
 *  
 *  The @XmlAnyAttribute annotation can be used with the
 *  following program elements:
 *  
 *     JavaBean property 
 *     non static, non transient field 
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  The usage is subject to the following constraints:
 *  
 *     At most one field or property in a class can be annotated
 *         with @XmlAnyAttribute.  
 *     The type of the property or the field must java.util.Map 
 *  
 * 
 *  
 *  While processing attributes to be unmarshalled into a value class,
 *  each attribute that is not statically associated with another
 *  JavaBean property, via XmlAttribute, is entered into the
 *  wildcard attribute map represented by
 *  Map<QName,Object>. The attribute QName is the
 *  map's key. The key's value is the String value of the attribute.
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlAnyAttribute extends StaticAnnotation {
}
