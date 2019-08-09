package javax.xml.crypto.dsig.spec

import java.lang.Object

// Parameters for the W3C Recommendation:
// 
// Exclusive XML Canonicalization (C14N) algorithm. The
// parameters include an optional inclusive namespace prefix list. The XML
// Schema Definition of the Exclusive XML Canonicalization parameters is
// defined as:
// 
// <schema xmlns="http://www.w3.org/2001/XMLSchema"
//         xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#"
//         targetNamespace="http://www.w3.org/2001/10/xml-exc-c14n#"
//         version="0.1" elementFormDefault="qualified">
//
// <element name="InclusiveNamespaces" type="ec:InclusiveNamespaces"/>
// <complexType name="InclusiveNamespaces">
//   <attribute name="PrefixList" type="xsd:string"/>
// </complexType>
// </schema>
// 
final class ExcC14NParameterSpec extends Object with C14NMethodParameterSpec {

    @stub
    // Creates a ExcC14NParameterSpec with an empty prefix
    // list.
    def this() = ???
}
