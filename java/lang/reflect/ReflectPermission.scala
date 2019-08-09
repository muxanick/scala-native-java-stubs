package java.lang.reflect

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// The Permission class for reflective operations.
// 
// The following table
// provides a summary description of what the permission allows,
// and discusses the risks of granting code the permission.
//
// 
// 
// Permission Target Name
// What the Permission Allows
// Risks of Allowing this Permission
// 
//
// 
//   suppressAccessChecks
//   ability to suppress the standard Java language access checks
//       on fields and methods in a class; allow access not only public members
//       but also allow access to default (package) access, protected,
//       and private members.
//   This is dangerous in that information (possibly confidential) and
//       methods normally unavailable would be accessible to malicious code.
// 
// 
//   newProxyInPackage.{package name}
//   ability to create a proxy instance in the specified package of which
//       the non-public interface that the proxy class implements.
//   This gives code access to classes in packages to which it normally
//       does not have access and the dynamic proxy class is in the system
//       protection domain. Malicious code may use these classes to
//       help in its attempt to compromise security in the system.
// 
//
// 
final class ReflectPermission extends BasicPermission {

    @stub
    // Constructs a ReflectPermission with the specified name.
    def this(name: String) = ???
}
