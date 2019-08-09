package java.lang.management

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

// The permission which the SecurityManager will check when code
// that is running with a SecurityManager calls methods defined
// in the management interface for the Java platform.
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
//   control
//   Ability to control the runtime characteristics of the Java virtual
//       machine, for example, enabling and disabling the verbose output for
//       the class loading or memory system, setting the threshold of a memory
//       pool, and enabling and disabling the thread contention monitoring
//       support. Some actions controlled by this permission can disclose
//       information about the running application, like the -verbose:class
//       flag.
//   
//   This allows an attacker to control the runtime characteristics
//       of the Java virtual machine and cause the system to misbehave. An
//       attacker can also access some information related to the running
//       application.
//   
// 
// 
//   monitor
//   Ability to retrieve runtime information about
//       the Java virtual machine such as thread
//       stack trace, a list of all loaded class names, and input arguments
//       to the Java virtual machine.
//   This allows malicious code to monitor runtime information and
//       uncover vulnerabilities.
// 
//
// 
//
// 
// Programmers do not normally create ManagementPermission objects directly.
// Instead they are created by the security policy code based on reading
// the security policy file.
final class ManagementPermission extends BasicPermission {

    @stub
    // Constructs a ManagementPermission with the specified name.
    def this(name: String) = ???
}
