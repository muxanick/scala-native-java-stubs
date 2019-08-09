package java.nio.file

import java.lang.{Object, String}
import java.security.{BasicPermission, Permission}

/** The Permission class for link creation operations.
 * 
 *   The following table provides a summary description of what the permission
 *  allows, and discusses the risks of granting code the permission.
 * 
 *  
 *  
 *  Permission Target Name
 *  What the Permission Allows
 *  Risks of Allowing this Permission
 *  
 *  
 *    hard
 *     Ability to add an existing file to a directory. This is sometimes
 *    known as creating a link, or hard link. 
 *     Extreme care should be taken when granting this permission. It allows
 *    linking to any file or directory in the file system thus allowing the
 *    attacker access to all files. 
 *  
 *  
 *    symbolic
 *     Ability to create symbolic links. 
 *     Extreme care should be taken when granting this permission. It allows
 *    linking to any file or directory in the file system thus allowing the
 *    attacker to access to all files. 
 *  
 *  
 */
final class LinkPermission extends BasicPermission {

    /** Constructs a LinkPermission with the specified name. */
    @stub
    def this(name: String) = ???
}
