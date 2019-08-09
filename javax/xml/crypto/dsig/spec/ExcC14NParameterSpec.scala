package javax.xml.crypto.dsig.spec

import java.lang.{Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** Parameters for the W3C Recommendation:
 *  
 *  Exclusive XML Canonicalization (C14N) algorithm. The
 *  parameters include an optional inclusive namespace prefix list. The XML
 *  Schema Definition of the Exclusive XML Canonicalization parameters is
 *  defined as:
 *  
 *  <schema xmlns="http://www.w3.org/2001/XMLSchema"
 *          xmlns:ec="http://www.w3.org/2001/10/xml-exc-c14n#"
 *          targetNamespace="http://www.w3.org/2001/10/xml-exc-c14n#"
 *          version="0.1" elementFormDefault="qualified">
 * 
 *  <element name="InclusiveNamespaces" type="ec:InclusiveNamespaces"/>
 *  <complexType name="InclusiveNamespaces">
 *    <attribute name="PrefixList" type="xsd:string"/>
 *  </complexType>
 *  </schema>
 *  
 */
final class ExcC14NParameterSpec extends Object with C14NMethodParameterSpec {

    /** Creates a ExcC14NParameterSpec with an empty prefix
     *  list.
     */
    @stub
    def this() = ???

    /** Creates a ExcC14NParameterSpec with the specified list
     *  of prefixes.
     */
    @stub
    def this(prefixList: List) = ???

    /** Returns the inclusive namespace prefix list. */
    @stub
    def getPrefixList(): List = ???
}

object ExcC14NParameterSpec {
    /** Indicates the default namespace ("#default"). */
    @stub
    val DEFAULT: String = ???
}
