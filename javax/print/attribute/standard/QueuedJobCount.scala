package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintServiceAttribute}

// Class QueuedJobCount is an integer valued printing attribute that indicates
// the number of jobs in the printer whose JobState is either
// PENDING, PENDING_HELD, PROCESSING, or PROCESSING_STOPPED.
// 
// IPP Compatibility: The integer value gives the IPP integer value.
// The category name returned by getName() gives the IPP
// attribute name.
// 
final class QueuedJobCount extends IntegerSyntax with PrintServiceAttribute {

    @stub
    // Returns whether this queued job count attribute is equivalent to the
    // passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
