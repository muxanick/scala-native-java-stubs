package java.security.acl

import java.lang.{Exception, Object, Throwable}

/** This is an exception that is thrown whenever an attempt is made to delete
 *  the last owner of an Access Control List.
 */
class LastOwnerException extends Exception {
}
