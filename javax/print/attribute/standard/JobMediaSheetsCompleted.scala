package javax.print.attribute.standard

import java.lang.{Class, Object}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}

/** Class JobMediaSheetsCompleted is an integer valued printing attribute class
 *  that specifies the number of media sheets which have completed marking and
 *  stacking for the entire job so far, whether those sheets have been processed
 *  on one side or on both.
 *  
 *  The JobMediaSheetsCompleted attribute describes the progress of the job. This
 *  attribute is intended to be a counter. That is, the JobMediaSheetsCompleted
 *  value for a job that has not started processing must be 0. When the job's
 *  JobState is PROCESSING or PROCESSING_STOPPED, the
 *  JobMediaSheetsCompleted value is intended to increase as the job is
 *  processed; it indicates the amount of the job that has been processed at the
 *  time the Print Job's attribute set is queried or at the time a print job
 *  event is reported. When the job enters the COMPLETED, CANCELED, or ABORTED
 *  states, the JobMediaSheetsCompleted value is the final value for the job.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class JobMediaSheetsCompleted extends IntegerSyntax with PrintJobAttribute {

    /** Returns whether this job media sheets completed attribute is equivalent
     *  to the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???
}
