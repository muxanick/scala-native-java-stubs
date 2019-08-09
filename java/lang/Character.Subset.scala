package java.lang

// Instances of this class represent particular subsets of the Unicode
// character set.  The only family of subsets defined in the
// Character class is Character.UnicodeBlock.
// Other portions of the Java API may define other subsets for their
// own purposes.
object Character.Subset extends Object {

    @stub
    // Compares two Subset objects for equality.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the standard hash code as defined by the
    // Object.hashCode() method.
    def hashCode(): Int = ???
}
