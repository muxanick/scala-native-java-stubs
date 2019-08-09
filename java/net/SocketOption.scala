package java.net

import java.lang.String

// A socket option associated with a socket.
//
//  In the channels package, the NetworkChannel interface defines the setOption
// and getOption
// methods to set and query the channel's socket options.
trait SocketOption[T] {

    @stub
    // Returns the name of the socket option.
    def name(): String = ???
}
