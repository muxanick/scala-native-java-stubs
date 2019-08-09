package javax.xml.xpath

import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** XPathFunctionResolver provides access to the set of user defined XPathFunctions.
 * 
 *  XPath functions are resolved by name and arity.
 *  The resolver is not needed for XPath built-in functions and the resolver
 *  cannot be used to override those functions.
 * 
 *  In particular, the resolver is only called for functions in an another
 *  namespace (functions with an explicit prefix). This means that you cannot
 *  use the XPathFunctionResolver to implement specifications
 *  like XML-Signature Syntax
 *  and Processing which extend the function library of XPath 1.0 in the
 *  same namespace. This is a consequence of the design of the resolver.
 * 
 *  If you wish to implement additional built-in functions, you will have to
 *  extend the underlying implementation directly.
 */
trait XPathFunctionResolver {

    /** Find a function in the set of available functions. */
    @stub
    def resolveFunction(functionName: QName, arity: Int): XPathFunction = ???
}
