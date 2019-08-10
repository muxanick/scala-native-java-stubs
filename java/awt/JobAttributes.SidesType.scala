package java.awt

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A type-safe enumeration of possible multi-page impositions. These
 *  impositions are in compliance with IPP 1.1.
 */
final object JobAttributes_SidesType extends Object {

    /** The SidesType instance to use for specifying that
     *  consecutive job pages should be printed upon the same side of
     *  consecutive media sheets.
     */
    @stub
    val ONE_SIDED: JobAttributes.SidesType = ???

    /** The SidesType instance to use for specifying that
     *  consecutive job pages should be printed upon front and back sides
     *  of consecutive media sheets, such that the orientation of each pair
     *  of pages on the medium would be correct for the reader as if for
     *  binding on the long edge.
     */
    @stub
    val TWO_SIDED_LONG_EDGE: JobAttributes.SidesType = ???

    /** The SidesType instance to use for specifying that
     *  consecutive job pages should be printed upon front and back sides
     *  of consecutive media sheets, such that the orientation of each pair
     *  of pages on the medium would be correct for the reader as if for
     *  binding on the short edge.
     */
    @stub
    val TWO_SIDED_SHORT_EDGE: JobAttributes.SidesType = ???

    /** Returns a hash code value for the object. */
    @stub
    def hashCode(): Int = ???

    /** Returns a string representation of the object. */
    @stub
    def toString(): String = ???
}
