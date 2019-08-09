package java.net

import java.lang.{Class, String}
import scala.scalanative.annotation.stub

/** A socket option associated with a socket.
 * 
 *   In the channels package, the NetworkChannel interface defines the setOption
 *  and getOption
 *  methods to set and query the channel's socket options.
 */
trait SocketOption[T] {

    /** Returns the name of the socket option. */
    @stub
    def name(): String = ???

    /** Returns the type of the socket option value. */
    @stub
    def type(): Class[T] = ???
}
