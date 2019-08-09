package javax.rmi

import java.lang.{Class, Object}
import java.rmi.Remote

// Server implementation objects may either inherit from
// javax.rmi.PortableRemoteObject or they may implement a remote interface
// and then use the exportObject method to register themselves as a server object.
// The toStub method takes a server implementation and returns a stub that
// can be used to access that server object.
// The connect method makes a Remote object ready for remote communication.
// The unexportObject method is used to deregister a server object, allowing it to become
// available for garbage collection.
// The narrow method takes an object reference or abstract interface type and
// attempts to narrow it to conform to
// the given interface. If the operation is successful the result will be an
// object of the specified type, otherwise an exception will be thrown.
class PortableRemoteObject extends Object {
}

object PortableRemoteObject {
    @stub
    // Makes a Remote object ready for remote communication.
    def connect(target: Remote, source: Remote): Unit = ???

    @stub
    // Makes a server object ready to receive remote calls.
    def exportObject(obj: Remote): Unit = ???

    @stub
    // Checks to ensure that an object of a remote or abstract interface type
    // can be cast to a desired type.
    def narrow(narrowFrom: Object, narrowTo: Class): Object = ???

    @stub
    // Returns a stub for the given server object.
    def toStub(obj: Remote): Remote = ???
}
