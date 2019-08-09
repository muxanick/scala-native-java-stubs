package java.sql

import java.lang.{Enum, Object, String}
import scala.scalanative.annotation.stub

/** Enumeration for RowId life-time values. */
class RowIdLifetime private (name: String, ordinal: Int) extends Enum[RowIdLifetime](name, ordinal) {
}

object RowIdLifetime {
    /** Indicates that this data source does not support the ROWID type. */
    final val ROWID_UNSUPPORTED = new RowIdLifetime(ROWID_UNSUPPORTED, 0)

    /** Indicates that the lifetime of a RowId from this data source is, effectively,
     *  unlimited.
     */
    final val ROWID_VALID_FOREVER = new RowIdLifetime(ROWID_VALID_FOREVER, 1)

    /** Indicates that the lifetime of a RowId from this data source is indeterminate;
     *  but not one of ROWID_VALID_TRANSACTION, ROWID_VALID_SESSION, or,
     *  ROWID_VALID_FOREVER.
     */
    final val ROWID_VALID_OTHER = new RowIdLifetime(ROWID_VALID_OTHER, 2)

    /** Indicates that the lifetime of a RowId from this data source is at least the
     *  containing session.
     */
    final val ROWID_VALID_SESSION = new RowIdLifetime(ROWID_VALID_SESSION, 3)

    /** Indicates that the lifetime of a RowId from this data source is at least the
     *  containing transaction.
     */
    final val ROWID_VALID_TRANSACTION = new RowIdLifetime(ROWID_VALID_TRANSACTION, 4)

    /** Returns the enum constant of this type with the specified name. */
    @stub
    def valueOf(name: String): RowIdLifetime = ???

    /** Returns an array containing the constants of this enum type, in
     * the order they are declared.
     */
    @stub
    def values(): Array[RowIdLifetime] = ???
}
