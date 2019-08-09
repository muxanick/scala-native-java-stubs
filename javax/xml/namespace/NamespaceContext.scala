package javax.xml.namespace

import java.lang.String

/** Interface for read only XML Namespace context processing.
 * 
 *  An XML Namespace has the properties:
 *  
 *    Namespace URI:
 *        Namespace name expressed as a URI to which the prefix is bound
 *    prefix: syntactically, this is the part of the attribute name
 *        following the XMLConstants.XMLNS_ATTRIBUTE
 *        ("xmlns") in the Namespace declaration
 *  
 *  example:
 *  <element xmlns:prefix="http://Namespace-name-URI">
 * 
 *  All get*(*) methods operate in the current scope
 *  for Namespace URI and prefix resolution.
 * 
 *  Note that a Namespace URI can be bound to
 *  multiple prefixes in the current scope.  This can
 *  occur when multiple XMLConstants.XMLNS_ATTRIBUTE
 *  ("xmlns") Namespace declarations occur in the same Start-Tag and
 *  refer to the same Namespace URI. e.g.
 *  
 *  <element xmlns:prefix1="http://Namespace-name-URI"
 *           xmlns:prefix2="http://Namespace-name-URI">
 *  
 *  This can also occur when the same Namespace URI is used in multiple
 *  XMLConstants.XMLNS_ATTRIBUTE ("xmlns") Namespace
 *  declarations in the logical parent element hierarchy.  e.g.
 *  
 *  <parent xmlns:prefix1="http://Namespace-name-URI">
 *    <child xmlns:prefix2="http://Namespace-name-URI">
 *      ...
 *    </child>
 *  </parent>
 *  
 * 
 *  A prefix can only be bound to a single
 *  Namespace URI in the current scope.
 */
trait NamespaceContext {

    /** Get Namespace URI bound to a prefix in the current scope. */
    @stub
    def getNamespaceURI(prefix: String): String = ???

    /** Get prefix bound to Namespace URI in the current scope. */
    @stub
    def getPrefix(namespaceURI: String): String = ???
}
