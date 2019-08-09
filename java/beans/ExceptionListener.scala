package java.beans

import java.lang.Exception
import scala.scalanative.annotation.stub

/** An ExceptionListener is notified of internal exceptions. */
trait ExceptionListener {

    /** This method is called when a recoverable exception has
     *  been caught.
     */
    @stub
    def exceptionThrown(e: Exception): Unit = ???
}
