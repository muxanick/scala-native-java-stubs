package java.security.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class represents a public or private key in encoded format. */
abstract class EncodedKeySpec extends Object with KeySpec {

    /** Creates a new EncodedKeySpec with the given encoded key. */
    @stub
    def this(encodedKey: Array[Byte]) = ???

    /** Returns the encoded key. */
    def getEncoded(): Array[Byte]

    /** Returns the name of the encoding format associated with this
     *  key specification.
     */
    def getFormat(): String
}
