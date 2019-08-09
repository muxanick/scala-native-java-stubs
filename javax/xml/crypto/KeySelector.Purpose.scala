package javax.xml.crypto

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The purpose of the key that is to be selected. */
object KeySelector.Purpose extends Object {

    /** A key for decrypting. */
    @stub
    val DECRYPT: KeySelector.Purpose = ???

    /** A key for encrypting. */
    @stub
    val ENCRYPT: KeySelector.Purpose = ???

    /** A key for signing. */
    @stub
    val SIGN: KeySelector.Purpose = ???

    /** A key for verifying. */
    @stub
    val VERIFY: KeySelector.Purpose = ???

    /** Returns a string representation of this purpose ("sign",
     *  "verify", "encrypt", or "decrypt").
     */
    @stub
    def toString(): String = ???
}
