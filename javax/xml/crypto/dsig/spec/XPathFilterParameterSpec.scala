package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

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

    /** Creates an XPathFilterParameterSpec with the specified
     *  XPath expression and namespace map.
     */
    @stub
    def this(xPath: String, namespaceMap: Map) = ???

    /** Returns a map of namespace prefixes. */
    @stub
    def getNamespaceMap(): Map = ???

    /** Returns the XPath expression to be evaluated. */
    @stub
    def getXPath(): String = ???
}
