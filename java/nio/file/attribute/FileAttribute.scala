package java.nio.file.attribute

import java.lang.String
import scala.scalanative.annotation.stub

/** An object that encapsulates the value of a file attribute that can be set
 *  atomically when creating a new file or directory by invoking the createFile or createDirectory methods.
 */
trait FileAttribute[T] {

    /** Returns the attribute name. */
    @stub
    def name(): String = ???

    /** Returns the attribute value. */
    @stub
    def value(): T = ???
}
