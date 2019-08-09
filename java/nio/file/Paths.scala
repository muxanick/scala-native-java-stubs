package java.nio.file

import java.lang.{Object, String}
import java.net.URI
import scala.scalanative.annotation.stub

/** This class consists exclusively of static methods that return a Path
 *  by converting a path string or URI.
 */
final class Paths extends Object {
}

object Paths {
    /** Converts a path string, or a sequence of strings that when joined form
     *  a path string, to a Path.
     */
    @stub
    def get(first: String, more: String*): Path = ???

    /** Converts the given URI to a Path object. */
    @stub
    def get(uri: URI): Path = ???
}
