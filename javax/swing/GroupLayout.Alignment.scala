package javax.swing

import java.lang.{Enum, Object, String}

// Enumeration of the possible ways ParallelGroup can align
// its children.
class GroupLayout.Alignment private (name: String, ordinal: Int) extends Enum[GroupLayout.Alignment](name, ordinal) {
}

object GroupLayout.Alignment {
    // Indicates the elements should be aligned along
    // their baseline.
    final val BASELINE = new GroupLayout.Alignment(BASELINE, 0)

    // Indicates the elements should be centered in
    // the region.
    final val CENTER = new GroupLayout.Alignment(CENTER, 1)

    // Indicates the elements should be
    // aligned to the origin.
    final val LEADING = new GroupLayout.Alignment(LEADING, 2)

    @stub
    // Returns the enum constant of this type with the specified name.
    def valueOf(name: String): GroupLayout.Alignment = ???
}
