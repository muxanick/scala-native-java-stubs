package java.security.spec

import scala.scalanative.annotation.stub

/** This interface represents an elliptic curve (EC) finite field.
 *  All specialized EC fields must implements this interface.
 */
trait ECField {

    /** Returns the field size in bits. */
    @stub
    def getFieldSize(): Int = ???
}
