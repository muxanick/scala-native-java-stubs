package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
// Maps a JavaBean property to XML ID.
//
// 
// To preserve referential integrity of an object graph across XML
// serialization followed by a XML deserialization, requires an object
// reference to be marshalled by reference or containment
// appropriately. Annotations @XmlID and @XmlIDREF
// together allow a customized mapping of a JavaBean property's
// type by containment or reference.
//
// Usage 
// The @XmlID annotation can be used with the following
// program elements:
// 
//    a JavaBean property 
//    non static, non transient field 
// 
//
// See "Package Specification" in javax.xml.bind.package javadoc for
// additional common information.
//
// The usage is subject to the following constraints:
// 
//    At most one field or property in a class can be annotated
//        with @XmlID.  
//    The JavaBean property's type must be java.lang.String.
//    The only other mapping annotations that can be used
//        with @XmlID
//        are:@XmlElement and @XmlAttribute.
// 
//
// Example: Map a JavaBean property's type to xs:ID
// 
//    // Example: code fragment
//    public class Customer {
//        @XmlAttribute
//        @XmlID
//        public String getCustomerID();
//        public void setCustomerID(String id);
//        .... other properties not shown
//    }
//
//    <!-- Example: XML Schema fragment -->
//    <xs:complexType name="Customer">
//      <xs:complexContent>
//        <xs:sequence>
//          ....
//        </xs:sequence>
//        <xs:attribute name="customerID" type="xs:ID"/>
//      </xs:complexContent>
//    </xs:complexType>
// 
@Retention ( value = RUNTIME ) @Target ( value ={ FIELD , METHOD } ) @interface XmlID {
}
