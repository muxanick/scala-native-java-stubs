package java.rmi.server

import java.io.{Externalizable, ObjectOutput}
import java.lang.{Object, String}
import java.lang.reflect.Method
import java.rmi.Remote

// RemoteRef represents the handle for a remote object. A
// RemoteStub uses a remote reference to carry out a
// remote method invocation to a remote object.
trait RemoteRef extends Externalizable {

    @stub
    // Deprecated. 
    //1.2 style stubs no longer use this method. Instead of
    // using a sequence of method calls to the remote reference
    // (newCall, invoke, and done), a
    // stub uses a single method, invoke(Remote, Method, Object[],
    // int), on the remote reference to carry out parameter
    // marshalling, remote method executing and unmarshalling of the return
    // value.
    //
    def done(call: RemoteCall): Unit = ???

    @stub
    // Returns the class name of the ref type to be serialized onto
    // the stream 'out'.
    def getRefClass(out: ObjectOutput): String = ???

    @stub
    // Deprecated. 
    //1.2 style stubs no longer use this method. Instead of
    // using a sequence of method calls to the remote reference
    // (newCall, invoke, and done), a
    // stub uses a single method, invoke(Remote, Method, Object[],
    // int), on the remote reference to carry out parameter
    // marshalling, remote method executing and unmarshalling of the return
    // value.
    //
    def invoke(call: RemoteCall): Unit = ???

    @stub
    // Invoke a method.
    def invoke(obj: Remote, method: Method, params: Array[Object], opnum: Long): Object = ???

    @stub
    // Deprecated. 
    //1.2 style stubs no longer use this method. Instead of
    // using a sequence of method calls on the stub's the remote reference
    // (newCall, invoke, and done), a
    // stub uses a single method, invoke(Remote, Method, Object[],
    // int), on the remote reference to carry out parameter
    // marshalling, remote method executing and unmarshalling of the return
    // value.
    //
    def newCall(obj: RemoteObject, op: Array[Operation], opnum: Int, hash: Long): RemoteCall = ???

    @stub
    // Compares two remote objects for equality.
    def remoteEquals(obj: RemoteRef): Boolean = ???

    @stub
    // Returns a hashcode for a remote object.
    def remoteHashCode(): Int = ???
}

object RemoteRef {
    @stub
    // Initialize the server package prefix: assumes that the
    // implementation of server ref classes (e.g., UnicastRef,
    // UnicastServerRef) are located in the package defined by the
    // prefix.
    def packagePrefix: String = ???
}
