package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute}
import scala.scalanative.annotation.stub

/** JobState is a printing attribute class, an enumeration, that identifies
 *  the current state of a print job. Class JobState defines standard job state
 *  values. A  Print Service implementation only needs to report those job
 *  states which are appropriate for the particular implementation; it does not
 *  have to report every defined job state. The JobStateReasons attribute augments the JobState attribute to give more
 *  detailed information about the job in the given job state.
 *  
 *  IPP Compatibility: The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
class JobState extends EnumSyntax with PrintJobAttribute {

    /** Construct a new job state enumeration value with the given integer value. */
    @stub
    protected def this(value: Int) = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class JobState. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class JobState. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object JobState {
    /** The job has been aborted by the system (usually while the job was in the
     *  PROCESSING or PROCESSING_STOPPED state), the printer has completed
     *  aborting the job, and all job status attributes have reached their final
     *  values for the job.
     */
    @stub
    val ABORTED: JobState = ???

    /** The job has been canceled by some human agency, the printer has completed
     *  canceling the job, and all job status attributes have reached their final
     *  values for the job.
     */
    @stub
    val CANCELED: JobState = ???

    /** The job has completed successfully or with warnings or errors after
     *  processing, all of the job media sheets have been successfully stacked in
     *  the appropriate output bin(s), and all job status attributes have reached
     *  their final values for the job.
     */
    @stub
    val COMPLETED: JobState = ???

    /** The job is a candidate to start processing, but is not yet processing. */
    @stub
    val PENDING: JobState = ???

    /** The job is not a candidate for processing for any number of reasons but
     *  will return to the PENDING state as soon as the reasons are no longer
     *  present.
     */
    @stub
    val PENDING_HELD: JobState = ???

    /** The job is processing. */
    @stub
    val PROCESSING: JobState = ???

    /** The job has stopped while processing for any number of reasons and will
     *  return to the PROCESSING state as soon as the reasons are no longer
     *  present.
     */
    @stub
    val PROCESSING_STOPPED: JobState = ???

    /** The job state is unknown. */
    @stub
    val UNKNOWN: JobState = ???
}
