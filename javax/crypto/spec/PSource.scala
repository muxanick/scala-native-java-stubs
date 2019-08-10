package javax.crypto.spec

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class specifies the source for encoding input P in OAEP Padding,
 *  as defined in the
 *  PKCS #1
 *  standard.
 *  
 *  PKCS1PSourceAlgorithms    ALGORITHM-IDENTIFIER ::= {
 *    { OID id-pSpecified PARAMETERS OCTET STRING },
 *    ...  -- Allows for future expansion --
 *  }
 *  
 */
class PSource extends Object {

    /** Constructs a source of the encoding input P for OAEP
     *  padding as defined in the PKCS #1 standard using the
     *  specified PSource algorithm.
     */
    @stub
    protected def this(pSrcName: String) = ???

    /** Returns the PSource algorithm name. */
    @stub
    def getAlgorithm(): String = ???
}

object PSource {
    /** This class is used to explicitly specify the value for
     *  encoding input P in OAEP Padding.
     */
    final object PSpecified extends PSource {

        /** Constructs the source explicitly with the specified
         *  value p as the encoding input P.
         */
        @stub
        def apply(p: Array[Byte]) = ???

        /** The encoding input P whose value equals byte[0]. */
        @stub
        val DEFAULT: PSpecified = ???

        /** Returns the value of encoding input P. */
        @stub
        def getValue(): Array[Byte] = ???
    }

}
