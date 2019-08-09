package javax.security.auth.kerberos

import java.io.File
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** This class encapsulates a keytab file.
 *  
 *  A Kerberos JAAS login module that obtains long term secret keys from a
 *  keytab file should use this class. The login module will store
 *  an instance of this class in the private credential set of a
 *  Subject during the commit phase of the
 *  authentication process.
 *  
 *  If a KeyTab object is obtained from getUnboundInstance()
 *  or getUnboundInstance(java.io.File), it is unbound and thus can be
 *  used by any service principal. Otherwise, if it's obtained from
 *  getInstance(KerberosPrincipal) or
 *  getInstance(KerberosPrincipal, java.io.File), it is bound to the
 *  specific service principal and can only be used by it.
 *  
 *  Please note the constructors getInstance() and
 *  getInstance(java.io.File) were created when there was no support
 *  for unbound keytabs. These methods should not be used anymore. An object
 *  created with either of these methods are considered to be bound to an
 *  unknown principal, which means, its isBound() returns true and
 *  getPrincipal() returns null.
 *  
 *  It might be necessary for the application to be granted a
 *  PrivateCredentialPermission if it needs to access the KeyTab
 *  instance from a Subject. This permission is not needed when the
 *  application depends on the default JGSS Kerberos mechanism to access the
 *  KeyTab. In that case, however, the application will need an appropriate
 *  ServicePermission.
 *  
 *  The keytab file format is described at
 *  
 *  http://www.ioplex.com/utilities/keytab.txt.
 *  
 */
final class KeyTab extends Object {

    /** Compares the specified Object with this KeyTab for equality. */
    @stub
    def equals(other: Object): Boolean = ???

    /** Checks if the keytab file exists. */
    @stub
    def exists(): Boolean = ???

    /** Returns fresh keys for the given Kerberos principal. */
    @stub
    def getKeys(principal: KerberosPrincipal): Array[KerberosKey] = ???

    /** Returns the service principal this KeyTab object
     *  is bound to.
     */
    @stub
    def getPrincipal(): KerberosPrincipal = ???

    /** Returns a hashcode for this KeyTab. */
    @stub
    def hashCode(): Int = ???

    /** Returns if the keytab is bound to a principal */
    @stub
    def isBound(): Boolean = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}

object KeyTab {
    /** Returns the default KeyTab instance that is bound
     *  to an unknown service principal.
     */
    @stub
    def getInstance(): KeyTab = ???

    /** Returns a KeyTab instance from a File object
     *  that is bound to an unknown service principal.
     */
    @stub
    def getInstance(file: File): KeyTab = ???

    /** Returns the default KeyTab instance that is bound
     *  to the specified service principal.
     */
    @stub
    def getInstance(princ: KerberosPrincipal): KeyTab = ???

    /** Returns a KeyTab instance from a File object
     *  that is bound to the specified service principal.
     */
    @stub
    def getInstance(princ: KerberosPrincipal, file: File): KeyTab = ???

    /** Returns the default unbound KeyTab instance. */
    @stub
    def getUnboundInstance(): KeyTab = ???

    /** Returns an unbound KeyTab instance from a File
     *  object.
     */
    @stub
    def getUnboundInstance(file: File): KeyTab = ???
}
