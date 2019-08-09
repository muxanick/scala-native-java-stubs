package java.nio.file

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** An interface that is implemented by objects that perform match operations on
 *  paths.
 */
@FunctionalInterface trait PathMatcher {

    /** Tells if given path matches this matcher's pattern. */
    @stub
    def matches(path: Path): Boolean = ???
}
