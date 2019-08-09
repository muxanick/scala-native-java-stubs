package javax.xml.xpath

import java.lang.Object
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** XPathVariableResolver provides access to the set of user defined XPath variables.
 * 
 *  The XPathVariableResolver and the XPath evaluator must adhere to a contract that
 *  cannot be directly enforced by the API.  Although variables may be mutable,
 *  that is, an application may wish to evaluate the same XPath expression more
 *  than once with different variable values, in the course of evaluating any
 *  single XPath expression, a variable's value must
 *  not change.
 */
trait XPathVariableResolver {

    /** Find a variable in the set of available variables. */
    @stub
    def resolveVariable(variableName: QName): Object = ???
}
