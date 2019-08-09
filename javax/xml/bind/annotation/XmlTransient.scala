package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** 
 *  Prevents the mapping of a JavaBean property/type to XML representation.
 *  
 *  The @XmlTransient annotation is useful for resolving name
 *  collisions between a JavaBean property name and a field name or
 *  preventing the mapping of a field/property. A name collision can
 *  occur when the decapitalized JavaBean property name and a field
 *  name are the same. If the JavaBean property refers to the field,
 *  then the name collision can be resolved by preventing the
 *  mapping of either the field or the JavaBean property using the
 *  @XmlTransient annotation.
 * 
 *  
 *  When placed on a class, it indicates that the class shouldn't be mapped
 *  to XML by itself. Properties on such class will be mapped to XML along
 *  with its derived classes, as if the class is inlined.
 * 
 *  Usage
 *   The @XmlTransient annotation can be used with the following
 *      program elements:
 *  
 *     a JavaBean property 
 *     field 
 *     class 
 *  
 * 
 *  @XmlTransientis mutually exclusive with all other
 *  JAXB defined annotations. 
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  Example: Resolve name collision between JavaBean property and
 *      field name 
 * 
 *  
 *    // Example: Code fragment
 *    public class USAddress {
 * 
 *        // The field name "name" collides with the property name
 *        // obtained by bean decapitalization of getName() below
 *        @XmlTransient public String name;
 * 
 *        String getName() {..};
 *        String setName() {..};
 *    }
 * 
 * 
 *    <!-- Example: XML Schema fragment -->
 *    <xs:complexType name="USAddress">
 *      <xs:sequence>
 *        <xs:element name="name" type="xs:string"/>
 *      </xs:sequence>
 *    </xs:complexType>
 *  
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD , TYPE } ) 
 final class XmlTransient extends StaticAnnotation {
}
