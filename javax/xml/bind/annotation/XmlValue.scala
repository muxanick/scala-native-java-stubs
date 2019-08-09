package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation

/** 
 *  Enables mapping a class to a  XML Schema complex type with a
 *  simpleContent or a XML Schema simple type.
 *  
 * 
 *  
 *   Usage: 
 *  
 *  The @XmlValue annotation can be used with the following program
 *  elements:
 *  
 *     a JavaBean property.
 *     non static, non transient field.
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  The usage is subject to the following usage constraints:
 *  
 *    At most one field or property can be annotated with the
 *        @XmlValue annotation. 
 * 
 *    @XmlValue can be used with the following
 *    annotations: XmlList. However this is redundant since
 *    XmlList maps a type to a simple schema type that derives by
 *    list just as XmlValue would. 
 * 
 *    If the type of the field or property is a collection type,
 *        then the collection item type must map to a simple schema
 *        type.  
 * 
 *    If the type of the field or property is not a collection
 *        type, then the type must map to a XML Schema simple type. 
 * 
 *  
 *  
 *  
 *  If the annotated JavaBean property is the sole class member being
 *  mapped to XML Schema construct, then the class is mapped to a
 *  simple type.
 * 
 *  If there are additional JavaBean properties (other than the
 *  JavaBean property annotated with @XmlValue annotation)
 *  that are mapped to XML attributes, then the class is mapped to a
 *  complex type with simpleContent.
 *  
 * 
 *    Example 1:  Map a class to XML Schema simpleType
 * 
 *    
 * 
 *      // Example 1: Code fragment
 *      public class USPrice {
 *          @XmlValue
 *          public java.math.BigDecimal price;
 *      }
 * 
 *      <!-- Example 1: XML Schema fragment -->
 *      <xs:simpleType name="USPrice">
 *        <xs:restriction base="xs:decimal"/>
 *      </xs:simpleType>
 * 
 *    
 * 
 *   Example 2:  Map a class to XML Schema complexType with
 *         with simpleContent.
 * 
 *    
 * 
 *    // Example 2: Code fragment
 *    public class InternationalPrice {
 *        @XmlValue
 *        public java.math.BigDecimal price;
 * 
 *        @XmlAttribute
 *        public String currency;
 *    }
 * 
 *    <!-- Example 2: XML Schema fragment -->
 *    <xs:complexType name="InternationalPrice">
 *      <xs:simpleContent>
 *        <xs:extension base="xs:decimal">
 *          <xs:attribute name="currency" type="xs:string"/>
 *        </xs:extension>
 *      </xs:simpleContent>
 *    </xs:complexType>
 * 
 *    
 *  
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlValue extends StaticAnnotation {
}
