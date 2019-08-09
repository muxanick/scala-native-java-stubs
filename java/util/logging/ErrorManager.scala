package java.util.logging

import java.lang.{Exception, Object, String}
import scala.scalanative.annotation.stub

/** ErrorManager objects can be attached to Handlers to process
 *  any error that occurs on a Handler during Logging.
 *  
 *  When processing logging output, if a Handler encounters problems
 *  then rather than throwing an Exception back to the issuer of
 *  the logging call (who is unlikely to be interested) the Handler
 *  should call its associated ErrorManager.
 */
class ErrorManager extends Object {

    /**  */
    @stub
    def this() = ???

    /** The error method is called when a Handler failure occurs. */
    @stub
    def error(msg: String, ex: Exception, code: Int): Unit = ???
}

object ErrorManager {
    /** CLOSE_FAILURE is used when a close of an output stream fails. */
    @stub
    val CLOSE_FAILURE: Int = ???

    /** FLUSH_FAILURE is used when a flush to an output stream fails. */
    @stub
    val FLUSH_FAILURE: Int = ???

    /** FORMAT_FAILURE is used when formatting fails for any reason. */
    @stub
    val FORMAT_FAILURE: Int = ???

    /** GENERIC_FAILURE is used for failure that don't fit
     *  into one of the other categories.
     */
    @stub
    val GENERIC_FAILURE: Int = ???

    /** OPEN_FAILURE is used when an open of an output stream fails. */
    @stub
    val OPEN_FAILURE: Int = ???

    /** WRITE_FAILURE is used when a write to an output stream fails. */
    @stub
    val WRITE_FAILURE: Int = ???
}
