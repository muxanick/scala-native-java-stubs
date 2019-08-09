package javax.net.ssl

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// This class is for various network permissions.
// An SSLPermission contains a name (also referred to as a "target name") but
// no actions list; you either have the named permission
// or you don't.
// 
// The target name is the name of the network permission (see below). The naming
// convention follows the  hierarchical property naming convention.
// Also, an asterisk
// may appear at the end of the name, following a ".", or by itself, to
// signify a wildcard match. For example: "foo.*" and "*" signify a wildcard
// match, while "*foo" and "a*b" do not.
// 
// The following table lists all the possible SSLPermission target names,
// and for each provides a description of what the permission allows
// and a discussion of the risks of granting code the permission.
//
// 
// 
// Permission Target Name
// What the Permission Allows
// Risks of Allowing this Permission
// 
//
// 
//   setHostnameVerifier
//   The ability to set a callback which can decide whether to
// allow a mismatch between the host being connected to by
// an HttpsURLConnection and the common name field in
// server certificate.
//  
//   Malicious
// code can set a verifier that monitors host names visited by
// HttpsURLConnection requests or that allows server certificates
// with invalid common names.
// 
// 
//
// 
//   getSSLSessionContext
//   The ability to get the SSLSessionContext of an SSLSession.
// 
//   Malicious code may monitor sessions which have been established
// with SSL peers or might invalidate sessions to slow down performance.
// 
// 
//
// 
//   setDefaultSSLContext
//   The ability to set the default SSL context
// 
//   Malicious code can set a context that monitors the opening of
// connections or the plaintext data that is transmitted.
// 
// 
//
// 
final class SSLPermission extends BasicPermission {

    @stub
    // Creates a new SSLPermission with the specified name.
    def this(name: String) = ???
}
