package java.nio.file

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}

/** Checked exception thrown when a file system operation is denied, typically
 *  due to a file permission or other access check.
 * 
 *   This exception is not related to the AccessControlException or SecurityException thrown by access controllers or security managers when
 *  access to a file is denied.
 */
class AccessDeniedException extends FileSystemException {

    /** Constructs an instance of this class. */
    @stub
    def this(file: String) = ???
}
