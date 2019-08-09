package javax.xml.bind.annotation.adapters

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** Use an adapter that implements XmlAdapter for custom marshaling.
 * 
 *    Usage:  
 * 
 *   The @XmlJavaTypeAdapter annotation can be used with the
 *  following program elements:
 *  
 *     a JavaBean property 
 *     field 
 *     parameter 
 *     package 
 *     from within XmlJavaTypeAdapters 
 *  
 * 
 *   When @XmlJavaTypeAdapter annotation is defined on a
 *  class, it applies to all references to the class.
 *   When @XmlJavaTypeAdapter annotation is defined at the
 *  package level it applies to all references from within the package
 *  to @XmlJavaTypeAdapter.type().
 *   When @XmlJavaTypeAdapter annotation is defined on the
 *  field, property or parameter, then the annotation applies to the
 *  field, property or the parameter only.
 *   A @XmlJavaTypeAdapter annotation on a field, property
 *  or parameter overrides the @XmlJavaTypeAdapter annotation
 *  associated with the class being referenced by the field, property
 *  or parameter.
 *   A @XmlJavaTypeAdapter annotation on a class overrides
 *  the @XmlJavaTypeAdapter annotation specified at the
 *  package level for that class.
 * 
 *  This annotation can be used with the following other annotations:
 *  XmlElement, XmlAttribute, XmlElementRef,
 *  XmlElementRefs, XmlAnyElement. This can also be
 *  used at the package level with the following annotations:
 *  XmlAccessorType, XmlSchema, XmlSchemaType,
 *  XmlSchemaTypes.
 * 
 *   Example:  See example in XmlAdapter
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ PACKAGE , FIELD , METHOD , TYPE , PARAMETER } ) 
 final class XmlJavaTypeAdapter extends StaticAnnotation {
}
