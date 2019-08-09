package java.awt

import java.lang.Object

// A type-safe enumeration of possible multiple copy handling states.
// It is used to control how the sheets of multiple copies of a single
// document are collated.
object final JobAttributes.MultipleDocumentHandlingType extends Object {

    @stub
    // The MultipleDocumentHandlingType instance to use for specifying
    // that the job should be divided into separate, collated copies.
    def SEPARATE_DOCUMENTS_COLLATED_COPIES: JobAttributes.MultipleDocumentHandlingType = ???

    @stub
    // Returns a hash code value for the object.
    def hashCode(): Int = ???
}
