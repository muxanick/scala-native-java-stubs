package org.ietf.jgss

import java.lang.{Exception, Object, String, Throwable}

// This exception is thrown whenever a GSS-API error occurs, including
// any mechanism specific error.  It may contain both the major and the
// minor GSS-API status codes.  Major error codes are those defined at the
// GSS-API level in this class. Minor error codes are mechanism specific
// error codes that can provide additional information. The underlying
// mechanism implementation is responsible for setting appropriate minor
// status codes when throwing this exception.  Aside from delivering the
// numeric error codes to the caller, this class performs the mapping from
// their numeric values to textual representations. 
class GSSException extends Exception {

    @stub
    // Creates a GSSException object with a specified major code.
    def this(majorCode: Int) = ???

    @stub
    // Returns the GSS-API level major error code for the problem causing
    // this exception to be thrown.
    def getMajor(): Int = ???

    @stub
    // Returns a string explaining the GSS-API level major error code in
    // this exception.
    def getMajorString(): String = ???

    @stub
    // Returns a textual representation of both the major and the minor
    // status codes.
    def getMessage(): String = ???

    @stub
    // Returns the mechanism level error code for the problem causing this
    // exception to be thrown.
    def getMinor(): Int = ???

    @stub
    // Returns a string explaining the mechanism specific error code.
    def getMinorString(): String = ???

    @stub
    // Used by the exception thrower to set the mechanism
    // level minor error code and its string explanation.
    def setMinor(minorCode: Int, message: String): Unit = ???
}

object GSSException {
    @stub
    // Channel bindings mismatch.
    def BAD_BINDINGS: Int = ???

    @stub
    // Unsupported mechanism requested.
    def BAD_MECH: Int = ???

    @stub
    // Token had invalid integrity check.
    def BAD_MIC: Int = ???

    @stub
    // Invalid name provided.
    def BAD_NAME: Int = ???

    @stub
    // Name of unsupported type provided.
    def BAD_NAMETYPE: Int = ???

    @stub
    // Unsupported QOP value.
    def BAD_QOP: Int = ???

    @stub
    // Invalid status code.
    def BAD_STATUS: Int = ???

    @stub
    // Security context expired.
    def CONTEXT_EXPIRED: Int = ???

    @stub
    // Expired credentials.
    def CREDENTIALS_EXPIRED: Int = ???

    @stub
    // Defective credentials.
    def DEFECTIVE_CREDENTIAL: Int = ???

    @stub
    // Defective token.
    def DEFECTIVE_TOKEN: Int = ???

    @stub
    // Duplicate credential element requested.
    def DUPLICATE_ELEMENT: Int = ???

    @stub
    // The token was a duplicate of an earlier token.
    def DUPLICATE_TOKEN: Int = ???

    @stub
    // General failure, unspecified at GSS-API level.
    def FAILURE: Int = ???

    @stub
    // An expected per-message token was not received.
    def GAP_TOKEN: Int = ???

    @stub
    // Name contains multi-mechanism elements.
    def NAME_NOT_MN: Int = ???

    @stub
    // Invalid security context.
    def NO_CONTEXT: Int = ???

    @stub
    // Invalid credentials.
    def NO_CRED: Int = ???

    @stub
    // The token's validity period has expired.
    def OLD_TOKEN: Int = ???

    @stub
    // Operation unauthorized.
    def UNAUTHORIZED: Int = ???

    @stub
    // Operation unavailable.
    def UNAVAILABLE: Int = ???
}
