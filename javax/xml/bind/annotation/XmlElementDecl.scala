package javax.xml.bind.annotation

import java.lang.{Class, String}
import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// Maps a factory method to a XML element.
//
//  Usage 
//
// The annotation creates a mapping between an XML schema element
// declaration and a  element factory method  that returns a
// JAXBElement instance representing the element
// declaration. Typically, the element factory method is generated
// (and annotated) from a schema into the ObjectFactory class in a
// Java package that represents the binding of the element
// declaration's target namespace. Thus, while the annotation syntax
// allows @XmlElementDecl to be used on any method, semantically
// its use is restricted to annotation of element factory method.
//
// The usage is subject to the following constraints:
//
// 
//    The class containing the element factory method annotated
//        with @XmlElementDecl must be marked with XmlRegistry. 
//    The element factory method must take one parameter
//        assignable to Object.
// 
//
// Example 1: Annotation on a factory method
// 
//     // Example: code fragment
//     @XmlRegistry
//     class ObjectFactory {
//         @XmlElementDecl(name="foo")
//         JAXBElement<String> createFoo(String s) { ... }
//     }
// 
// 
//     <!-- XML input -->
//       <foo>string
//
//     // Example: code fragment corresponding to XML input
//     JAXBElement o =
//     (JAXBElement)unmarshaller.unmarshal(aboveDocument);
//     // print JAXBElement instance to show values
//     System.out.println(o.getName());   // prints  "{}foo"
//     System.out.println(o.getValue());  // prints  "string"
//     System.out.println(o.getValue().getClass()); // prints "java.lang.String"
//
//     <!-- Example: XML schema definition -->
//     <xs:element name="foo" type="xs:string"/>
// 
//
// Example 2:  Element declaration with non local scope
// 
// The following example illustrates the use of scope annotation
// parameter in binding of element declaration in schema derived
// code.
// 
// The following example may be replaced in a future revision of
// this javadoc.
//
// 
//     <!-- Example: XML schema definition -->
//     <xs:schema>
//       <xs:complexType name="pea">
//         <xs:choice maxOccurs="unbounded">
//           <xs:element name="foo" type="xs:string"/>
//           <xs:element name="bar" type="xs:string"/>
//         </xs:choice>
//       </xs:complexType>
//       <xs:element name="foo" type="xs:int"/>
//     </xs:schema>
// 
// 
//     // Example: expected default binding
//     class Pea {
//         @XmlElementRefs({
//             @XmlElementRef(name="foo",type=JAXBElement.class)
//             @XmlElementRef(name="bar",type=JAXBElement.class)
//         })
//         List<JAXBElement<String>> fooOrBar;
//     }
//
//     @XmlRegistry
//     class ObjectFactory {
//         @XmlElementDecl(scope=Pea.class,name="foo")
//         JAXBElement createPeaFoo(String s);
//
//         @XmlElementDecl(scope=Pea.class,name="bar")
//         JAXBElement createPeaBar(String s);
//
//         @XmlElementDecl(name="foo")
//         JAXBElement createFoo(Integer i);
//     }
//
// 
// Without scope createFoo and createPeaFoo would become ambiguous
// since both of them map to a XML schema element with the same local
// name "foo".
@Retention ( value = RUNTIME ) @Target ( value = METHOD ) @interface XmlElementDecl {

    @stub
    // Default value of this element.
    def defaultValue: String = ???

    @stub
    // namespace name of the XML element.
    def namespace: String = ???

    @stub
    // scope of the mapping.
    def scope: Class = ???

    @stub
    // XML local name of a substitution group's head element.
    def substitutionHeadName: String = ???
}
