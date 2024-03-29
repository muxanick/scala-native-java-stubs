package java.nio.file.attribute

import java.lang.String
import scala.scalanative.annotation.stub

/** A file attribute view that supports reading or updating the owner of a file.
 *  This file attribute view is intended for file system implementations that
 *  support a file attribute that represents an identity that is the owner of
 *  the file. Often the owner of a file is the identity of the entity that
 *  created the file.
 * 
 *   The getOwner or setOwner methods may
 *  be used to read or update the owner of the file.
 * 
 *   The getAttribute and
 *  setAttribute methods may also be
 *  used to read or update the owner. In that case, the owner attribute is
 *  identified by the name "owner", and the value of the attribute is
 *  a UserPrincipal.
 */
trait FileOwnerAttributeView extends FileAttributeView {

    /** Read the file owner. */
    @stub
    def getOwner(): UserPrincipal = ???

    /** Returns the name of the attribute view. */
    @stub
    def name(): String = ???

    /** Updates the file owner. */
    @stub
    def setOwner(owner: UserPrincipal): Unit = ???
}
