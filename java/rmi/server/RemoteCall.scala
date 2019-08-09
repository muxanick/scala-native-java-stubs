package java.rmi.server

import java.io.{ObjectInput, ObjectOutput}
import java.lang.Deprecated

// RemoteCall is an abstraction used solely by the RMI runtime
// (in conjunction with stubs and skeletons of remote objects) to carry out a
// call to a remote object.  The RemoteCall interface is
// deprecated because it is only used by deprecated methods of
// java.rmi.server.RemoteRef.
@Deprecated trait RemoteCall {

    @stub
    // Deprecated. 
    //no replacement
    //
    def done(): Unit = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def executeCall(): Unit = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def getInputStream(): ObjectInput = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def getOutputStream(): ObjectOutput = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def getResultStream(success: Boolean): ObjectOutput = ???

    @stub
    // Deprecated. 
    //no replacement
    //
    def releaseInputStream(): Unit = ???
}
