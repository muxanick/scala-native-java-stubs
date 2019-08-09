package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, IntegerSyntax, PrintJobAttribute}
import scala.scalanative.annotation.stub

/** Class JobKOctetsProcessed is an integer valued printing attribute class that
 *  specifies the total number of print data octets processed so far in K octets,
 *  i.e., in units of 1024 octets. The value must be rounded up, so that a job
 *  between 1 and 1024 octets inclusive must be indicated as being 1K octets,
 *  1025 to 2048 inclusive must be 2K, etc. For a multidoc print job (a job with
 *  multiple documents), the JobKOctetsProcessed value is computed by adding up
 *  the individual documents' number of octets processed so far, then rounding up
 *  to the next K octets value.
 *  
 *  The JobKOctetsProcessed attribute describes the progress of the job. This
 *  attribute is intended to be a counter. That is, the JobKOctetsProcessed value
 *  for a job that has not started processing must be 0. When the job's JobState is PROCESSING or PROCESSING_STOPPED, the
 *  JobKOctetsProcessed value is intended to increase as the job is processed; it
 *  indicates the amount of the job that has been processed at the time the Print
 *  Job's attribute set is queried or at the time a print job event is reported.
 *  When the job enters the COMPLETED, CANCELED, or ABORTED states, the
 *  JobKOctetsProcessed value is the final value for the job.
 *  
 *  For implementations where multiple copies are produced by the interpreter
 *  with only a single pass over the data, the final value of the
 *  JobKOctetsProcessed attribute must be equal to the value of the JobKOctets attribute. For implementations where multiple copies
 *  are produced by the interpreter by processing the data for each copy, the
 *  final value must be a multiple of the value of the JobKOctets attribute.
 *  
 *  IPP Compatibility: The integer value gives the IPP integer value. The
 *  category name returned by getName() gives the IPP attribute
 *  name.
 *  
 */
final class JobKOctetsProcessed extends IntegerSyntax with PrintJobAttribute {

    /** Construct a new job K octets processed attribute with the given integer
     *  value.
     */
    @stub
    def this(value: Int) = ???

    /** Returns whether this job K octets processed attribute is equivalent to
     *  the passed in object.
     */
    @stub
    def equals(object: Object): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}
