package javax.xml.transform

import scala.scalanative.annotation.stub

/** To provide customized error handling, implement this interface and
 *  use the setErrorListener method to register an instance of the
 *  implmentation with the Transformer.  The
 *  Transformer then reports all errors and warnings through this
 *  interface.
 * 
 *  If an application does not register its own custom
 *  ErrorListener, the default ErrorListener
 *  is used which reports all warnings and errors to System.err
 *  and does not throw any Exceptions.
 *  Applications are strongly encouraged to register and use
 *  ErrorListeners that insure proper behavior for warnings and
 *  errors.
 * 
 *  For transformation errors, a Transformer must use this
 *  interface instead of throwing an Exception: it is up to the
 *  application to decide whether to throw an Exception for
 *  different types of errors and warnings.  Note however that the
 *  Transformer is not required to continue with the transformation
 *  after a call to fatalError(TransformerException exception).
 * 
 *  Transformers may use this mechanism to report XML parsing
 *  errors as well as transformation errors.
 */
trait ErrorListener {

    /** Receive notification of a recoverable error. */
    @stub
    def error(exception: TransformerException): Unit = ???

    /** Receive notification of a non-recoverable error. */
    @stub
    def fatalError(exception: TransformerException): Unit = ???

    /** Receive notification of a warning. */
    @stub
    def warning(exception: TransformerException): Unit = ???
}
