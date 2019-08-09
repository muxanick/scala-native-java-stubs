package java.rmi.server

import java.io.{ObjectInput, ObjectOutput}
import java.lang.Deprecated

/** RemoteCall is an abstraction used solely by the RMI runtime
 *  (in conjunction with stubs and skeletons of remote objects) to carry out a
 *  call to a remote object.  The RemoteCall interface is
 *  deprecated because it is only used by deprecated methods of
 *  java.rmi.server.RemoteRef.
 */
@Deprecated trait RemoteCall {

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def done(): Unit = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def executeCall(): Unit = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getInputStream(): ObjectInput = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getOutputStream(): ObjectOutput = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def getResultStream(success: Boolean): ObjectOutput = ???

    /** Deprecated. 
     * no replacement
     * 
     */
    @stub
    def releaseInputStream(): Unit = ???
}
