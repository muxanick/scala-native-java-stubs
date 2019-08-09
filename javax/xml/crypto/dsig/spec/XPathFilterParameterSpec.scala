package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}
import java.util.Map

/** Parameters for the 
 *  XPath Filtering Transform Algorithm.
 *  The parameters include the XPath expression and an optional Map
 *  of additional namespace prefix mappings. The XML Schema Definition of
 *  the XPath Filtering transform parameters is defined as:
 *  
 *  <element name="XPath" type="string"/>
 *  
 */
final class XPathFilterParameterSpec extends Object with TransformParameterSpec {

    /** Creates an XPathFilterParameterSpec with the specified
     *  XPath expression.
     */
    @stub
    def this(xPath: String) = ???

    /** Returns a map of namespace prefixes. */
    @stub
    def getNamespaceMap(): Map = ???
}
