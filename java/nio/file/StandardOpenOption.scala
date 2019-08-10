package java.nio.file

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Defines the standard open options. */
class StandardOpenOption private (name: String, ordinal: Int) extends Enum[StandardOpenOption](name, ordinal) with OpenOption {
}

object StandardOpenOption {
    /** If the file is opened for WRITE access then bytes will be written
     *  to the end of the file rather than the beginning.
     */
    final val APPEND: StandardOpenOption = new StandardOpenOption("APPEND", 0)

    /** Create a new file if it does not exist. */
    final val CREATE: StandardOpenOption = new StandardOpenOption("CREATE", 1)

    /** Create a new file, failing if the file already exists. */
    final val CREATE_NEW: StandardOpenOption = new StandardOpenOption("CREATE_NEW", 2)

    /** Delete on close. */
    final val DELETE_ON_CLOSE: StandardOpenOption = new StandardOpenOption("DELETE_ON_CLOSE", 3)

    /** Requires that every update to the file's content be written
     *  synchronously to the underlying storage device.
     */
    final val DSYNC: StandardOpenOption = new StandardOpenOption("DSYNC", 4)

    /** Open for read access. */
    final val READ: StandardOpenOption = new StandardOpenOption("READ", 5)

    /** Sparse file. */
    final val SPARSE: StandardOpenOption = new StandardOpenOption("SPARSE", 6)

    /** Requires that every update to the file's content or metadata be written
     *  synchronously to the underlying storage device.
     */
    final val SYNC: StandardOpenOption = new StandardOpenOption("SYNC", 7)

    /** If the file already exists and it is opened for WRITE
     *  access, then its length is truncated to 0.
     */
    final val TRUNCATE_EXISTING: StandardOpenOption = new StandardOpenOption("TRUNCATE_EXISTING", 8)

    /** Open for write access. */
    final val WRITE: StandardOpenOption = new StandardOpenOption("WRITE", 9)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): StandardOpenOption = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[StandardOpenOption] = ???
}
