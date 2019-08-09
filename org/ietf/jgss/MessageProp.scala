package org.ietf.jgss

import java.lang.{Object, String}

// This is a utility class used within the per-message GSSContext
// methods to convey per-message properties.
//
// When used with the GSSContext interface's wrap and getMIC methods, an
// instance of this class is used to indicate the desired
// Quality-of-Protection (QOP) and to request if confidentiality services
// are to be applied to caller supplied data (wrap only).  To request
// default QOP, the value of 0 should be used for QOP.
//
// When used with the unwrap and verifyMIC methods of the GSSContext
// interface, an instance of this class will be used to indicate the
// applied QOP and confidentiality services over the supplied message.
// In the case of verifyMIC, the confidentiality state will always be
// false.  Upon return from these methods, this object will also
// contain any supplementary status values applicable to the processed
// token.  The supplementary status values can indicate old tokens, out
// of sequence tokens, gap tokens or duplicate tokens.
class MessageProp extends Object {

    @stub
    // Constructor which sets the desired privacy state.
    def this(privState: Boolean) = ???

    @stub
    // Retrieves the minor status code that the underlying mechanism might
    // have set for this per-message operation.
    def getMinorStatus(): Int = ???

    @stub
    // Retrieves a string explaining the minor status code.
    def getMinorString(): String = ???

    @stub
    // Retrieves the privacy state.
    def getPrivacy(): Boolean = ???

    @stub
    // Retrieves the QOP value.
    def getQOP(): Int = ???

    @stub
    // Tests if this is a duplicate of an earlier token.
    def isDuplicateToken(): Boolean = ???

    @stub
    // Tests if an expected token was not received, i.e., one or more
    // predecessor tokens have not yet been successfully processed.
    def isGapToken(): Boolean = ???

    @stub
    // Tests if this token's validity period has expired, i.e., the token
    // is too old to be checked for duplication.
    def isOldToken(): Boolean = ???

    @stub
    // Tests if a later token had already been processed.
    def isUnseqToken(): Boolean = ???

    @stub
    // Sets the privacy state.
    def setPrivacy(privState: Boolean): Unit = ???

    @stub
    // Sets the QOP value.
    def setQOP(qop: Int): Unit = ???
}
