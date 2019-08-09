package javax.xml.xpath

import java.lang.Object
import java.util.List
import scala.scalanative.annotation.stub

/** XPathFunction provides access to XPath functions.
 * 
 *  Functions are identified by QName and arity in XPath.
 */
trait XPathFunction {

    /** Evaluate the function with the specified arguments. */
    @stub
    def evaluate(args: List): Object = ???
}
