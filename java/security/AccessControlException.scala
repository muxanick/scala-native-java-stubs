package java.security

import java.lang.{Exception, Object, RuntimeException, SecurityException, String, Throwable}

//  This exception is thrown by the AccessController to indicate
// that a requested access (to a critical system resource such as the
// file system or the network) is denied.
//
//  The reason to deny access can vary.  For example, the requested
// permission might be of an incorrect type,  contain an invalid
// value, or request access that is not allowed according to the
// security policy.  Such information should be given whenever
// possible at the time the exception is thrown.
class AccessControlException extends SecurityException {

    @stub
    // Constructs an AccessControlException with the
    // specified, detailed message.
    def this(s: String) = ???
}
