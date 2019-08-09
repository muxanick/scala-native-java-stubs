package java.net

import java.io.Serializable
import java.lang.Object

// This class represents a Socket Address with no protocol attachment.
// As an abstract class, it is meant to be subclassed with a specific,
// protocol dependent, implementation.
// 
// It provides an immutable object used by sockets for binding, connecting, or
// as returned values.
abstract class SocketAddress extends Object with Serializable {
}
