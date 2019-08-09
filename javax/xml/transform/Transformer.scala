package javax.xml.transform

import java.lang.{Object, String}
import java.util.Properties

/** An instance of this abstract class can transform a
 *  source tree into a result tree.
 * 
 *  An instance of this class can be obtained with the
 *  TransformerFactory.newTransformer
 *  method. This instance may then be used to process XML from a
 *  variety of sources and write the transformation output to a
 *  variety of sinks.
 * 
 *  An object of this class may not be used in multiple threads
 *  running concurrently.  Different Transformers may be used
 *  concurrently by different threads.
 * 
 *  A Transformer may be used multiple times.  Parameters and
 *  output properties are preserved across transformations.
 */
abstract class Transformer extends Object {

    /** Clear all parameters set with setParameter. */
    def clearParameters(): Unit

    /** Get the error event handler in effect for the transformation. */
    def getErrorListener(): ErrorListener

    /** Get a copy of the output properties for the transformation. */
    def getOutputProperties(): Properties

    /** Get an output property that is in effect for the transformer. */
    def getOutputProperty(name: String): String

    /** Get a parameter that was explicitly set with setParameter. */
    def getParameter(name: String): Object

    /** Get an object that will be used to resolve URIs used in
     *  document().
     */
    def getURIResolver(): URIResolver

    /** Reset this Transformer to its original configuration. */
    def reset(): Unit

    /** Set the error event listener in effect for the transformation. */
    def setErrorListener(listener: ErrorListener): Unit

    /** Set the output properties for the transformation. */
    def setOutputProperties(oformat: Properties): Unit

    /** Set an output property that will be in effect for the
     *  transformation.
     */
    def setOutputProperty(name: String, value: String): Unit

    /** Add a parameter for the transformation. */
    def setParameter(name: String, value: Object): Unit

    /** Set an object that will be used to resolve URIs used in
     *  document().
     */
    def setURIResolver(resolver: URIResolver): Unit
}
