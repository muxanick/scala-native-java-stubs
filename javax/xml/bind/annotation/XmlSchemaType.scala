package javax.xml.bind.annotation

import java.lang.String
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// Maps a Java type to a simple schema built-in type.
//
//  Usage 
// 
// @XmlSchemaType annotation can be used with the following program
// elements:
// 
//    a JavaBean property 
//    field 
//    package
// 
//
//  @XmlSchemaType annotation defined for Java type
// applies to all references to the Java type from a property/field.
// A @XmlSchemaType annotation specified on the
// property/field overrides the @XmlSchemaType annotation
// specified at the package level.
//
//  This annotation can be used with the following annotations:
// XmlElement,  XmlAttribute.
// 
// Example 1:  Customize mapping of XMLGregorianCalendar on the
//  field.
//
// 
//     //Example: Code fragment
//     public class USPrice {
//         @XmlElement
//         @XmlSchemaType(name="date")
//         public XMLGregorianCalendar date;
//     }
//
//     <!-- Example: Local XML Schema element -->
//     <xs:complexType name="USPrice"/>
//       <xs:sequence>
//         <xs:element name="date" type="xs:date"/>
//       </sequence>
//     </xs:complexType>
// 
//
//   Example 2:  Customize mapping of XMLGregorianCalendar at package
//     level 
// 
//     package foo;
//     @javax.xml.bind.annotation.XmlSchemaType(
//          name="date", type=javax.xml.datatype.XMLGregorianCalendar.class)
//     }
// 
@Retention ( value = RUNTIME ) @Target ( value ={ FIELD , METHOD , PACKAGE } ) @interface XmlSchemaType {

    @stub
    // 
    def namespace: String = ???
}
