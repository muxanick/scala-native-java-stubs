package javax.naming.ldap

import java.lang.{Object, String}

// This class provides a basic implementation of the Control
// interface. It represents an LDAPv3 Control as defined in
// RFC 2251.
class BasicControl extends Object with Control {

    @stub
    // Constructs a non-critical control.
    def this(id: String) = ???

    @stub
    // The control's criticality.
    protected def criticality: Boolean = ???

    @stub
    // The control's object identifier string.
    protected def id: String = ???

    @stub
    // Retrieves the control's ASN.1 BER encoded value.
    def getEncodedValue(): Array[Byte] = ???

    @stub
    // Retrieves the control's object identifier string.
    def getID(): String = ???
}
