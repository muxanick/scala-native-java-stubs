package java.rmi.server

import java.io.IOException
import java.lang.{Deprecated, Exception, Object, String, Throwable}
import java.rmi.RemoteException
import scala.scalanative.annotation.stub

/** A SkeletonNotFoundException is thrown if the
 *  Skeleton corresponding to the remote object being
 *  exported is not found.  Skeletons are no longer required, so this
 *  exception is never thrown.
 */
@Deprecated
class SkeletonNotFoundException extends RemoteException {

    /** Deprecated.  */
    @stub
    def this(s: String) = ???

    /** Deprecated.  */
    @stub
    def this(s: String, ex: Exception) = ???
}
