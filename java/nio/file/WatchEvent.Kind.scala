package java.nio.file

import java.lang.{Class, String}
import scala.scalanative.annotation.stub

/** An event kind, for the purposes of identification. */
trait WatchEvent_Kind[T] {

    /** Returns the name of the event kind. */
    @stub
    def name(): String = ???

    /** Returns the type of the context value. */
    @stub
    def type(): Class[T] = ???
}
