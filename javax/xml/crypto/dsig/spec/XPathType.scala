package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}
import java.util.Map
import scala.scalanative.annotation.stub

/** The XML Schema Definition of the XPath element as defined in the
 *  
 *  W3C Recommendation for XML-Signature XPath Filter 2.0:
 *  
 *  <schema xmlns="http://www.w3.org/2001/XMLSchema"
 *          xmlns:xf="http://www.w3.org/2002/06/xmldsig-filter2"
 *          targetNamespace="http://www.w3.org/2002/06/xmldsig-filter2"
 *          version="0.1" elementFormDefault="qualified">
 * 
 *  <element name="XPath"
 *           type="xf:XPathType"/>
 * 
 *  <complexType name="XPathType">
 *    <simpleContent>
 *      <extension base="string">
 *        <attribute name="Filter">
 *          <simpleType>
 *            <restriction base="string">
 *              <enumeration value="intersect"/>
 *              <enumeration value="subtract"/>
 *              <enumeration value="union"/>
 *            </restriction>
 *          </simpleType>
 *        </attribute>
 *      </extension>
 *    </simpleContent>
 *  </complexType>
 *  
 */
class XPathType extends Object {

    /** Creates an XPathType instance with the specified XPath
     *  expression and filter.
     */
    @stub
    def this(expression: String, filter: XPathType.Filter) = ???

    /** Creates an XPathType instance with the specified XPath
     *  expression, filter, and namespace map.
     */
    @stub
    def this(expression: String, filter: XPathType.Filter, namespaceMap: Map) = ???

    /** Returns the XPath expression to be evaluated. */
    @stub
    def getExpression(): String = ???

    /** Returns the filter operation. */
    @stub
    def getFilter(): XPathType.Filter = ???

    /** Returns a map of namespace prefixes. */
    @stub
    def getNamespaceMap(): Map = ???
}

object XPathType {
    /** Represents the filter set operation. */
    type Filter = XPathType_Filter
}
