package javax.xml.validation

import java.lang.{Object, String}
import javax.xml.transform.{Result, Source}
import scala.scalanative.annotation.stub

/** A processor that checks an XML document against Schema.
 * 
 *  
 *  A validator object is not thread-safe and not reentrant.
 *  In other words, it is the application's responsibility to make
 *  sure that one Validator object is not used from
 *  more than one thread at any given time, and while the validate
 *  method is invoked, applications may not recursively call
 *  the validate method.
 *  
 */
abstract class Validator extends Object {

    /** Constructor for derived classes. */
    @stub
    protected def this() = ???

    /** Gets the current ErrorHandler set to this Validator. */
    def getErrorHandler(): ErrorHandler

    /** Look up the value of a feature flag. */
    def getFeature(name: String): Boolean

    /** Look up the value of a property. */
    def getProperty(name: String): Any

    /** Gets the current LSResourceResolver set to this Validator. */
    def getResourceResolver(): LSResourceResolver

    /** Reset this Validator to its original configuration. */
    def reset(): Unit

    /** Sets the ErrorHandler to receive errors encountered
     *  during the validate method invocation.
     */
    def setErrorHandler(errorHandler: ErrorHandler): Unit

    /** Set the value of a feature flag. */
    def setFeature(name: String, value: Boolean): Unit

    /** Set the value of a property. */
    def setProperty(name: String, object: Any): Unit

    /** Sets the LSResourceResolver to customize
     *  resource resolution while in a validation episode.
     */
    def setResourceResolver(resourceResolver: LSResourceResolver): Unit

    /** Validates the specified input. */
    def validate(source: Source): Unit

    /** Validates the specified input and send the augmented validation
     *  result to the specified output.
     */
    def validate(source: Source, result: Result): Unit
}
