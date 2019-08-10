package javax.xml.xpath

import java.lang.{Object, String}
import javax.xml.namespace.QName
import scala.scalanative.annotation.stub

/** XPathExpression provides access to compiled XPath expressions.
 * 
 *  
 *  
 *    
 *      
 *        Evaluation of XPath Expressions.
 *      
 *    
 *    
 *      
 *        context
 *        
 *          If a request is made to evaluate the expression in the absence
 *  of a context item, an empty document node will be used for the context.
 *  For the purposes of evaluating XPath expressions, a DocumentFragment
 *  is treated like a Document node.
 *       
 *     
 *     
 *       variables
 *       
 *         If the expression contains a variable reference, its value will be found through the XPathVariableResolver.
 *         An XPathExpressionException is raised if the variable resolver is undefined or
 *         the resolver returns null for the variable.
 *         The value of a variable must be immutable through the course of any single evaluation.
 *       
 *     
 *     
 *       functions
 *       
 *         If the expression contains a function reference, the function will be found through the XPathFunctionResolver.
 *         An XPathExpressionException is raised if the function resolver is undefined or
 *         the function resolver returns null for the function.
 *       
 *     
 *     
 *       QNames
 *       
 *         QNames in the expression are resolved against the XPath namespace context.
 *       
 *     
 *     
 *       result
 *       
 *         This result of evaluating an expression is converted to an instance of the desired return type.
 *         Valid return types are defined in XPathConstants.
 *         Conversion to the return type follows XPath conversion rules.
 *       
 *     
 *  
 * 
 *  An XPath expression is not thread-safe and not reentrant.
 *  In other words, it is the application's responsibility to make
 *  sure that one XPathExpression object is not used from
 *  more than one thread at any given time, and while the evaluate
 *  method is invoked, applications may not recursively call
 *  the evaluate method.
 *  
 */
trait XPathExpression {

    /** Evaluate the compiled XPath expression in the context of the specified InputSource and return the result as a
     *  String.
     */
    @stub
    def evaluate(source: InputSource): String = ???

    /** Evaluate the compiled XPath expression in the context of the specified InputSource and return the result as the
     *  specified type.
     */
    @stub
    def evaluate(source: InputSource, returnType: QName): Any = ???

    /** Evaluate the compiled XPath expression in the specified context and return the result as a String. */
    @stub
    def evaluate(item: Any): String = ???

    /** Evaluate the compiled XPath expression in the specified context and return the result as the specified type. */
    @stub
    def evaluate(item: Any, returnType: QName): Any = ???
}
