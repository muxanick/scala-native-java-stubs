package javax.net.ssl

import java.lang.{Object, String}
import java.util.List
import scala.scalanative.annotation.stub

/** Extends the SSLSession interface to support additional
 *  session attributes.
 */
abstract class ExtendedSSLSession extends Object with SSLSession {

    /**  */
    @stub
    def this() = ???

    /** Obtains an array of supported signature algorithms that the local side
     *  is willing to use.
     */
    def getLocalSupportedSignatureAlgorithms(): Array[String]

    /** Obtains an array of supported signature algorithms that the peer is
     *  able to use.
     */
    def getPeerSupportedSignatureAlgorithms(): Array[String]

    /** Obtains a List containing all SNIServerNames
     *  of the requested Server Name Indication (SNI) extension.
     */
    def getRequestedServerNames(): List[SNIServerName]
}
