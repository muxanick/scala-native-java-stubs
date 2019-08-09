package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}

// The XML Schema Definition of the XPath element as defined in the
// 
// W3C Recommendation for XML-Signature XPath Filter 2.0:
// 
// <schema xmlns="http://www.w3.org/2001/XMLSchema"
//         xmlns:xf="http://www.w3.org/2002/06/xmldsig-filter2"
//         targetNamespace="http://www.w3.org/2002/06/xmldsig-filter2"
//         version="0.1" elementFormDefault="qualified">
//
// <element name="XPath"
//          type="xf:XPathType"/>
//
// <complexType name="XPathType">
//   <simpleContent>
//     <extension base="string">
//       <attribute name="Filter">
//         <simpleType>
//           <restriction base="string">
//             <enumeration value="intersect"/>
//             <enumeration value="subtract"/>
//             <enumeration value="union"/>
//           </restriction>
//         </simpleType>
//       </attribute>
//     </extension>
//   </simpleContent>
// </complexType>
// 
class XPathType extends Object {

    @stub
    // Creates an XPathType instance with the specified XPath
    // expression and filter.
    def this(expression: String, filter: XPathType.Filter) = ???

    @stub
    // Returns the XPath expression to be evaluated.
    def getExpression(): String = ???

    @stub
    // Returns the filter operation.
    def getFilter(): XPathType.Filter = ???
}
