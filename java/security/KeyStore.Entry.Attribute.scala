package java.security

import java.lang.String

// An attribute associated with a keystore entry.
// It comprises a name and one or more values.
object trait KeyStore.Entry.Attribute {

    @stub
    // Returns the attribute's name.
    def getName(): String = ???
}