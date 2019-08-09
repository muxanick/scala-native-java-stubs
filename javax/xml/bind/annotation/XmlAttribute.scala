package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** 
 *  Maps a JavaBean property to a XML attribute.
 * 
 *   Usage 
 *  
 *  The @XmlAttribute annotation can be used with the
 *  following program elements:
 *  
 *     JavaBean property 
 *     field 
 *  
 * 
 *   A static final field is mapped to a XML fixed attribute.
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  The usage is subject to the following constraints:
 *  
 *     If type of the field or the property is a collection
 *         type, then the collection item type must be mapped to schema
 *         simple type.
 *  
 *      // Examples
 *      @XmlAttribute List<Integer> items; //legal
 *      @XmlAttribute List<Bar> foo; // illegal if Bar does not map to a schema simple type
 *  
 *    
 *     If the type of the field or the property is a non
 *          collection type, then the type of the property or field
 *          must map to a simple schema type.
 *  
 *      // Examples
 *      @XmlAttribute int foo; // legal
 *      @XmlAttribute Foo foo; // illegal if Foo does not map to a schema simple type
 *  
 *    
 *     This annotation can be used with the following annotations:
 *             XmlID,
 *             XmlIDREF,
 *             XmlList,
 *             XmlSchemaType,
 *             XmlValue,
 *             XmlAttachmentRef,
 *             XmlMimeType,
 *             XmlInlineBinaryData,
 *             XmlJavaTypeAdapter.
 *  
 *  
 * 
 *   Example 1: Map a JavaBean property to an XML attribute.
 *  
 *      //Example: Code fragment
 *      public class USPrice {
 *          @XmlAttribute
 *          public java.math.BigDecimal getPrice() {...} ;
 *          public void setPrice(java.math.BigDecimal ) {...};
 *      }
 * 
 *      <!-- Example: XML Schema fragment -->
 *      <xs:complexType name="USPrice">
 *        <xs:sequence>
 *        </xs:sequence>
 *        <xs:attribute name="price" type="xs:decimal"/>
 *      </xs:complexType>
 *  
 * 
 *   Example 2: Map a JavaBean property to an XML attribute with anonymous type.
 *  See Example 7 in @XmlType.
 * 
 *   Example 3: Map a JavaBean collection property to an XML attribute.
 *  
 *      // Example: Code fragment
 *      class Foo {
 *          ...
 *          @XmlAttribute List<Integer> items;
 *      }
 * 
 *      <!-- Example: XML Schema fragment -->
 *      <xs:complexType name="foo">
 *        ...
 *        <xs:attribute name="items">
 *          <xs:simpleType>
 *            <xs:list itemType="xs:int"/>
 *          </xs:simpleType>
 *      </xs:complexType>
 * 
 *  
 */
@Retention ( value = RUNTIME ) 
@Target ( value ={ FIELD , METHOD } ) 
 final class XmlAttribute extends StaticAnnotation {

    /** Name of the XML Schema attribute. */
    @stub
    val name: String = ???

    /** Specifies the XML target namespace of the XML Schema
     *  attribute.
     */
    @stub
    val namespace: String = ???

    /** Specifies if the XML Schema attribute is optional or
     *  required.
     */
    @stub
    val required: Boolean = ???
}
