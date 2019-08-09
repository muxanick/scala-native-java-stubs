package javax.naming.ldap

import java.lang.{Object, String}

/** This class provides a basic implementation of the Control
 *  interface. It represents an LDAPv3 Control as defined in
 *  RFC 2251.
 */
class BasicControl extends Object with Control {

    /** Constructs a non-critical control. */
    @stub
    def this(id: String) = ???

    /** The control's criticality. */
    @stub
    protected val criticality: Boolean = ???

    /** The control's object identifier string. */
    @stub
    protected val id: String = ???

    /** Retrieves the control's ASN.1 BER encoded value. */
    @stub
    def getEncodedValue(): Array[Byte] = ???

    /** Retrieves the control's object identifier string. */
    @stub
    def getID(): String = ???
}
