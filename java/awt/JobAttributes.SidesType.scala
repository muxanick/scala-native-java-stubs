package java.awt

import java.lang.Object

// A type-safe enumeration of possible multi-page impositions. These
// impositions are in compliance with IPP 1.1.
object final JobAttributes.SidesType extends Object {

    @stub
    // The SidesType instance to use for specifying that
    // consecutive job pages should be printed upon the same side of
    // consecutive media sheets.
    def ONE_SIDED: JobAttributes.SidesType = ???

    @stub
    // The SidesType instance to use for specifying that
    // consecutive job pages should be printed upon front and back sides
    // of consecutive media sheets, such that the orientation of each pair
    // of pages on the medium would be correct for the reader as if for
    // binding on the long edge.
    def TWO_SIDED_LONG_EDGE: JobAttributes.SidesType = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
