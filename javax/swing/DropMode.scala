package javax.swing

import java.lang.{Enum, Object, String}

// Drop modes, used to determine the method by which a component
// tracks and indicates a drop location during drag and drop.
class DropMode private (name: String, ordinal: Int) extends Enum[DropMode](name, ordinal) {
}

object DropMode {
    // The drop location should be tracked in terms of the position
    // where new data should be inserted.
    final val INSERT = new DropMode(INSERT, 0)

    // The drop location should be tracked in terms of the column index
    // where new columns should be inserted to accommodate the dropped
    // data.
    final val INSERT_COLS = new DropMode(INSERT_COLS, 1)

    // The drop location should be tracked in terms of the row index
    // where new rows should be inserted to accommodate the dropped
    // data.
    final val INSERT_ROWS = new DropMode(INSERT_ROWS, 2)

    // The drop location should be tracked in terms of the index of
    // existing items.
    final val ON = new DropMode(ON, 3)

    // This mode is a combination of ON
    // and INSERT, specifying that data can be
    // dropped on existing items, or in insert locations
    // as specified by INSERT.
    final val ON_OR_INSERT = new DropMode(ON_OR_INSERT, 4)

    // This mode is a combination of ON
    // and INSERT_COLS, specifying that data can be
    // dropped on existing items, or as insert columns
    // as specified by INSERT_COLS.
    final val ON_OR_INSERT_COLS = new DropMode(ON_OR_INSERT_COLS, 5)

    // This mode is a combination of ON
    // and INSERT_ROWS, specifying that data can be
    // dropped on existing items, or as insert rows
    // as specified by INSERT_ROWS.
    final val ON_OR_INSERT_ROWS = new DropMode(ON_OR_INSERT_ROWS, 6)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): DropMode = ???
}
