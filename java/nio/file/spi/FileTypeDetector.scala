package java.nio.file.spi

import java.lang.{Object, String}
import java.nio.file.Path
import scala.scalanative.annotation.stub

/** A file type detector for probing a file to guess its file type.
 * 
 *   A file type detector is a concrete implementation of this class, has a
 *  zero-argument constructor, and implements the abstract methods specified
 *  below.
 * 
 *   The means by which a file type detector determines the file type is
 *  highly implementation specific. A simple implementation might examine the
 *  file extension (a convention used in some platforms) and map it to
 *  a file type. In other cases, the file type may be stored as a file  attribute or the bytes in a
 *  file may be examined to guess its file type.
 */
abstract class FileTypeDetector extends Object {

    /** Initializes a new instance of this class. */
    @stub
    protected def this() = ???

    /** Probes the given file to guess its content type. */
    def probeContentType(path: Path): String
}
