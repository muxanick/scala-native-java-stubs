package javax.net.ssl

import java.lang.{Object, String}

/** Extends the SSLSession interface to support additional
 *  session attributes.
 */
abstract class ExtendedSSLSession extends Object with SSLSession {

    /** Obtains an array of supported signature algorithms that the local side
     *  is willing to use.
     */
    def getLocalSupportedSignatureAlgorithms(): Array[String]

    /** Obtains an array of supported signature algorithms that the peer is
     *  able to use.
     */
    def getPeerSupportedSignatureAlgorithms(): Array[String]
}
