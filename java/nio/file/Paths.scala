package java.nio.file

import java.lang.{Object, String}

// This class consists exclusively of static methods that return a Path
// by converting a path string or URI.
final class Paths extends Object {
}

object Paths {
    @stub
    // Converts a path string, or a sequence of strings that when joined form
    // a path string, to a Path.
    def get(first: String, more: String*): Path = ???
}
