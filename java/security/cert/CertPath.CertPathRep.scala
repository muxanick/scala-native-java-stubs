package java.security.cert

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Alternate CertPath class for serialization. */
object protected CertPath_CertPathRep extends Object with Serializable {

    /** Creates a CertPathRep with the specified
     *  type and encoded form of a certification path.
     */
    @stub
    protected def CertPathRep(type: String, data: Array[Byte]) = ???

    /** Returns a CertPath constructed from the type and data. */
    @stub
    protected def readResolve(): Any = ???
}
