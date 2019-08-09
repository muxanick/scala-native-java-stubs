package javax.crypto.interfaces

import javax.crypto.spec.DHParameterSpec
import scala.scalanative.annotation.stub

/** The interface to a Diffie-Hellman key. */
trait DHKey {

    /** Returns the key parameters. */
    @stub
    def getParams(): DHParameterSpec = ???
}
