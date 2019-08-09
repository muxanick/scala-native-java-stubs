package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}

// Class JobImpressionsCompleted is an integer valued printing attribute class
// that specifies the number of impressions completed for the job so far. For
// printing devices, the impressions completed includes interpreting, marking,
// and stacking the output.
// 
// The JobImpressionsCompleted attribute describes the progress of the job. This
// attribute is intended to be a counter. That is, the JobImpressionsCompleted
// value for a job that has not started processing must be 0. When the job's
// JobState is PROCESSING or PROCESSING_STOPPED, the
// JobImpressionsCompleted value is intended to increase as the job is
// processed; it indicates the amount of the job that has been processed at the
// time the Print Job's attribute set is queried or at the time a print job
// event is reported. When the job enters the COMPLETED, CANCELED, or ABORTED
// states, the JobImpressionsCompleted value is the final value for the job.
// 
// IPP Compatibility: The integer value gives the IPP integer value. The
// category name returned by getName() gives the IPP attribute
// name.
// 
final class JobImpressionsCompleted extends IntegerSyntax with PrintJobAttribute {

    @stub
    // Returns whether this job impressions completed attribute is equivalent
    // tp the passed in object.
    def equals(object: Object): Boolean = ???

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???
}
