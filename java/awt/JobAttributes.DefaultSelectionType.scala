package java.awt

import java.lang.Object

// A type-safe enumeration of possible default selection states.
object final JobAttributes.DefaultSelectionType extends Object {

    @stub
    // The DefaultSelectionType instance to use for
    // specifying that all pages of the job should be printed.
    def ALL: JobAttributes.DefaultSelectionType = ???

    @stub
    // The DefaultSelectionType instance to use for
    // specifying that a range of pages of the job should be printed.
    def RANGE: JobAttributes.DefaultSelectionType = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
