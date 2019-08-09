package java.security.cert

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Alternate Certificate class for serialization. */
object protected Certificate.CertificateRep extends Object with Serializable {

    /** Construct the alternate Certificate class with the Certificate
     *  type and Certificate encoding bytes.
     */
    @stub
    protected def CertificateRep(type: String, data: Array[Byte]) = ???

    /** Resolve the Certificate Object. */
    @stub
    protected def readResolve(): Object = ???
}
