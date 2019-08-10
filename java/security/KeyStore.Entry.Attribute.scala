package java.security

import java.lang.String
import scala.scalanative.annotation.stub

/** An attribute associated with a keystore entry.
 *  It comprises a name and one or more values.
 */
trait KeyStore_Entry_Attribute {

    /** Returns the attribute's name. */
    @stub
    def getName(): String = ???

    /** Returns the attribute's value. */
    @stub
    def getValue(): String = ???
}
