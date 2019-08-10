package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}
import scala.annotation.StaticAnnotation
import scala.scalanative.annotation.stub

/** Maps an enum constant in Enum type to XML representation.
 * 
 *   Usage 
 * 
 *   The @XmlEnumValue annotation can be used with the
 *      following program elements:
 *  
 *    enum constant
 *  
 * 
 *  See "Package Specification" in javax.xml.bind.package javadoc for
 *  additional common information.
 * 
 *  This annotation, together with XmlEnum provides a
 *  mapping of enum type to XML representation.
 * 
 *  An enum type is mapped to a schema simple type with enumeration
 *  facets. The schema type is derived from the Java type specified in
 *  @XmlEnum.value(). Each enum constant @XmlEnumValue
 *  must have a valid lexical representation for the type
 *  @XmlEnum.value()
 * 
 *   In the absence of this annotation, Enum.name() is used
 *  as the XML representation.
 * 
 *   Example 1: Map enum constant name -> enumeration facet
 *  
 *      //Example: Code fragment
 *      @XmlEnum(String.class)
 *      public enum Card { CLUBS, DIAMONDS, HEARTS, SPADES }
 * 
 *      <!-- Example: XML Schema fragment -->
 *      <xs:simpleType name="Card">
 *        <xs:restriction base="xs:string"/>
 *          <xs:enumeration value="CLUBS"/>
 *          <xs:enumeration value="DIAMONDS"/>
 *          <xs:enumeration value="HEARTS"/>
 *          <xs:enumeration value="SPADES"/>
 *      </xs:simpleType>
 *  
 * 
 *  Example 2: Map enum constant name(value) -> enumeration facet 
 *  
 *      //Example: code fragment
 *      @XmlType
 *      @XmlEnum(Integer.class)
 *      public enum Coin {
 *          @XmlEnumValue("1") PENNY(1),
 *          @XmlEnumValue("5") NICKEL(5),
 *          @XmlEnumValue("10") DIME(10),
 *          @XmlEnumValue("25") QUARTER(25) }
 * 
 *      <!-- Example: XML Schema fragment -->
 *      <xs:simpleType name="Coin">
 *        <xs:restriction base="xs:int">
 *          <xs:enumeration value="1"/>
 *          <xs:enumeration value="5"/>
 *          <xs:enumeration value="10"/>
 *          <xs:enumeration value="25"/>
 *        </xs:restriction>
 *      </xs:simpleType>
 *  
 * 
 *  Example 3: Map enum constant name -> enumeration facet 
 * 
 *  
 *      //Code fragment
 *      @XmlType
 *      @XmlEnum(Integer.class)
 *      public enum Code {
 *          @XmlEnumValue("1") ONE,
 *          @XmlEnumValue("2") TWO;
 *      }
 * 
 *      <!-- Example: XML Schema fragment -->
 *      <xs:simpleType name="Code">
 *        <xs:restriction base="xs:int">
 *          <xs:enumeration value="1"/>
 *          <xs:enumeration value="2"/>
 *        </xs:restriction>
 *      </xs:simpleType>
 *  
 */
@Retention(value=RUNTIME)
@Target(value=FIELD)
final class XmlEnumValue extends StaticAnnotation {

    /**  */
    @stub
    val value: String = ???
}
