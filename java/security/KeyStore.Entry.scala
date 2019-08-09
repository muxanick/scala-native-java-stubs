package java.security

import java.util.Set
import scala.scalanative.annotation.stub

/** A marker interface for KeyStore entry types. */
object trait KeyStore.Entry {

    /** An attribute associated with a keystore entry. */
    @stub
    trait Attribute extends KeyStore.Entry.Attribute

    /** Retrieves the attributes associated with an entry. */
    @stub
    val Set[KeyStore.Entry.Attribute]: default = ???
}
