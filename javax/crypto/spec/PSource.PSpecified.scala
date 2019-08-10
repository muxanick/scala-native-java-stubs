package javax.crypto.spec

import java.lang.Object
import scala.scalanative.annotation.stub

/** This class is used to explicitly specify the value for
 *  encoding input P in OAEP Padding.
 */
final object PSource_PSpecified extends PSource {

    /** Constructs the source explicitly with the specified
     *  value p as the encoding input P.
     */
    @stub
    def PSpecified(p: Array[Byte]) = ???

    /** The encoding input P whose value equals byte[0]. */
    @stub
    val DEFAULT: PSource.PSpecified = ???

    /** Returns the value of encoding input P. */
    @stub
    def getValue(): Array[Byte] = ???
}
