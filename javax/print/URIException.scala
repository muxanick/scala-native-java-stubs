package javax.print

import java.net.URI
import scala.scalanative.annotation.stub

/** Interface URIException is a mixin interface which a subclass of PrintException can implement to report an error condition
 *  involving a URI address. The Print Service API does not define any print
 *  exception classes that implement interface URIException, that being left to
 *  the Print Service implementor's discretion.
 */
trait URIException {

    /** Return the reason for the event. */
    @stub
    def getReason(): Int = ???

    /** Return the URI. */
    @stub
    def getUnsupportedURI(): URI = ???
}

object URIException {
    /** Indicates that the printer cannot access the URI address. */
    @stub
    val URIInaccessible: Int = ???

    /** Indicates any kind of problem not specifically identified
     *  by the other reasons.
     */
    @stub
    val URIOtherProblem: Int = ???

    /** Indicates that the printer does not support the URI
     *  scheme ("http", "ftp", etc.) in the URI address.
     */
    @stub
    val URISchemeNotSupported: Int = ???
}
