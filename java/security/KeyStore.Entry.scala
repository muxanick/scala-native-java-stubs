package java.security

import java.util.Set
import scala.scalanative.annotation.stub

/** A marker interface for KeyStore entry types. */
trait KeyStore_Entry {

    /** Retrieves the attributes associated with an entry. */
    @stub
    def getAttributes(): Set[KeyStore.Entry.Attribute] = ???
}

object KeyStore_Entry {
    /** An attribute associated with a keystore entry. */
    type Attribute = KeyStore_Entry_Attribute
}
