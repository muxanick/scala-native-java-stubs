package java.security.acl

import java.lang.{Exception, Object, Throwable}

/** This is an exception that is thrown whenever the modification of an object
 *  (such as an Access Control List) is only allowed to be done by an owner of
 *  the object, but the Principal attempting the modification is not an owner.
 */
class NotOwnerException extends Exception {
}
