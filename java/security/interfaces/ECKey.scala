package java.security.interfaces

import java.security.spec.ECParameterSpec
import scala.scalanative.annotation.stub

/** The interface to an elliptic curve (EC) key. */
trait ECKey {

    /** Returns the domain parameters associated
     *  with this key.
     */
    @stub
    def getParams(): ECParameterSpec = ???
}
