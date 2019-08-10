package javax.xml.bind.annotation

import java.lang.{Class, String}
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Maps a JavaBean property to a XML element derived from property name.
 * 
 *   Usage 
 *  
 *  @XmlElement annotation can be used with the following program
 *  elements:
 *  
 *     a JavaBean property 
 *     non static, non transient field 
 *     within XmlElements
 *  
 * 
 *  
 * 
 *  The usage is subject to the following constraints:
 *  
 *     This annotation can be used with following annotations:
 *             XmlID,
 *             XmlIDREF,
 *             XmlList,
 *             XmlSchemaType,
 *             XmlValue,
 *             XmlAttachmentRef,
 *             XmlMimeType,
 *             XmlInlineBinaryData,
 *             XmlElementWrapper,
 *             XmlJavaTypeAdapter
 *     if the type of JavaBean property is a collection type of
 *         array, an indexed property, or a parameterized list, and
 *         this annotation is used with XmlElements then,
 *         @XmlElement.type() must be DEFAULT.class since the
 *         collection item type is already known. 
 *  
 * 
 *  
 *  A JavaBean property, when annotated with @XmlElement annotation
 *  is mapped to a local element in the XML Schema complex type to
 *  which the containing class is mapped.
 * 
 *  
 *  Example 1:  Map a public non static non final field to local
 *  element
 *  
 *      //Example: Code fragment
 *      public class USPrice {
 *          @XmlElement(name="itemprice")
 *          public java.math.BigDecimal price;
 *      }
 * 
 *      <!-- Example: Local XML Schema element -->
 *      <xs:complexType name="USPrice"/>
 *        <xs:sequence>
 *          <xs:element name="itemprice" type="xs:decimal" minOccurs="0"/>
 *        </sequence>
 *      </xs:complexType>
 *    
 *  
 * 
 *   Example 2:  Map a field to a nillable element.
 *    
 * 
 *      //Example: Code fragment
 *      public class USPrice {
 *          @XmlElement(nillable=true)
 *          public java.math.BigDecimal price;
 *      }
 * 
 *      <!-- Example: Local XML Schema element -->
 *      <xs:complexType name="USPrice">
 *        <xs:sequence>
 *          <xs:element name="price" type="xs:decimal" nillable="true" minOccurs="0"/>
 *        </sequence>
 *      </xs:complexType>
 *    
 *  
 *   Example 3:  Map a field to a nillable, required element.
 *    
 * 
 *      //Example: Code fragment
 *      public class USPrice {
 *          @XmlElement(nillable=true, required=true)
 *          public java.math.BigDecimal price;
 *      }
 * 
 *      <!-- Example: Local XML Schema element -->
 *      <xs:complexType name="USPrice">
 *        <xs:sequence>
 *          <xs:element name="price" type="xs:decimal" nillable="true" minOccurs="1"/>
 *        </sequence>
 *      </xs:complexType>
 *    
 *  
 * 
 *   Example 4: Map a JavaBean property to an XML element
 *  with anonymous type.
 *  
 *  See Example 6 in @XmlType.
 * 
 *  
 */
@Retention(value=RUNTIME)
@Target(value={FIELD,METHOD,PARAMETER})
final class XmlElement extends StaticAnnotation {

    /** Default value of this element. */
    @stub
    val defaultValue: String = ???

    /** Name of the XML Schema element. */
    @stub
    val name: String = ???

    /** XML target namespace of the XML Schema element. */
    @stub
    val namespace: String = ???

    /** Customize the element declaration to be nillable. */
    @stub
    val nillable: Boolean = ???

    /** Customize the element declaration to be required. */
    @stub
    val required: Boolean = ???

    /** The Java class being referenced. */
    @stub
    val type: Class = ???
}
