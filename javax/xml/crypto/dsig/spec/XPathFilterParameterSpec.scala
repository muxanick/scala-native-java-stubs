package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}
import java.util.Map

// Parameters for the 
// XPath Filtering Transform Algorithm.
// The parameters include the XPath expression and an optional Map
// of additional namespace prefix mappings. The XML Schema Definition of
// the XPath Filtering transform parameters is defined as:
// 
// <element name="XPath" type="string"/>
// 
final class XPathFilterParameterSpec extends Object with TransformParameterSpec {

    @stub
    // Creates an XPathFilterParameterSpec with the specified
    // XPath expression.
    def this(xPath: String) = ???

    @stub
    // Returns a map of namespace prefixes.
    def getNamespaceMap(): Map = ???
}
