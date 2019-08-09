package java.rmi.server

import java.io.{Externalizable, ObjectOutput}
import java.lang.{Object, String}
import java.lang.reflect.Method
import java.rmi.Remote

/** RemoteRef represents the handle for a remote object. A
 *  RemoteStub uses a remote reference to carry out a
 *  remote method invocation to a remote object.
 */
trait RemoteRef extends Externalizable {

    /** Deprecated. 
     * 1.2 style stubs no longer use this method. Instead of
     *  using a sequence of method calls to the remote reference
     *  (newCall, invoke, and done), a
     *  stub uses a single method, invoke(Remote, Method, Object[],
     *  int), on the remote reference to carry out parameter
     *  marshalling, remote method executing and unmarshalling of the return
     *  value.
     * 
     */
    @stub
    def done(call: RemoteCall): Unit = ???

    /** Returns the class name of the ref type to be serialized onto
     *  the stream 'out'.
     */
    @stub
    def getRefClass(out: ObjectOutput): String = ???

    /** Deprecated. 
     * 1.2 style stubs no longer use this method. Instead of
     *  using a sequence of method calls to the remote reference
     *  (newCall, invoke, and done), a
     *  stub uses a single method, invoke(Remote, Method, Object[],
     *  int), on the remote reference to carry out parameter
     *  marshalling, remote method executing and unmarshalling of the return
     *  value.
     * 
     */
    @stub
    def invoke(call: RemoteCall): Unit = ???

    /** Invoke a method. */
    @stub
    def invoke(obj: Remote, method: Method, params: Array[Object], opnum: Long): Object = ???

    /** Deprecated. 
     * 1.2 style stubs no longer use this method. Instead of
     *  using a sequence of method calls on the stub's the remote reference
     *  (newCall, invoke, and done), a
     *  stub uses a single method, invoke(Remote, Method, Object[],
     *  int), on the remote reference to carry out parameter
     *  marshalling, remote method executing and unmarshalling of the return
     *  value.
     * 
     */
    @stub
    def newCall(obj: RemoteObject, op: Array[Operation], opnum: Int, hash: Long): RemoteCall = ???

    /** Compares two remote objects for equality. */
    @stub
    def remoteEquals(obj: RemoteRef): Boolean = ???

    /** Returns a hashcode for a remote object. */
    @stub
    def remoteHashCode(): Int = ???
}

object RemoteRef {
    /** Initialize the server package prefix: assumes that the
     *  implementation of server ref classes (e.g., UnicastRef,
     *  UnicastServerRef) are located in the package defined by the
     *  prefix.
     */
    @stub
    val packagePrefix: String = ???
}
