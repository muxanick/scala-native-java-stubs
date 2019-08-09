package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintJobAttribute}

// JobState is a printing attribute class, an enumeration, that identifies
// the current state of a print job. Class JobState defines standard job state
// values. A  Print Service implementation only needs to report those job
// states which are appropriate for the particular implementation; it does not
// have to report every defined job state. The JobStateReasons attribute augments the JobState attribute to give more
// detailed information about the job in the given job state.
// 
// IPP Compatibility: The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
class JobState extends EnumSyntax with PrintJobAttribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class JobState.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object JobState {
    @stub
    // The job has been aborted by the system (usually while the job was in the
    // PROCESSING or PROCESSING_STOPPED state), the printer has completed
    // aborting the job, and all job status attributes have reached their final
    // values for the job.
    def ABORTED: JobState = ???

    @stub
    // The job has been canceled by some human agency, the printer has completed
    // canceling the job, and all job status attributes have reached their final
    // values for the job.
    def CANCELED: JobState = ???

    @stub
    // The job has completed successfully or with warnings or errors after
    // processing, all of the job media sheets have been successfully stacked in
    // the appropriate output bin(s), and all job status attributes have reached
    // their final values for the job.
    def COMPLETED: JobState = ???

    @stub
    // The job is a candidate to start processing, but is not yet processing.
    def PENDING: JobState = ???

    @stub
    // The job is not a candidate for processing for any number of reasons but
    // will return to the PENDING state as soon as the reasons are no longer
    // present.
    def PENDING_HELD: JobState = ???

    @stub
    // The job is processing.
    def PROCESSING: JobState = ???

    @stub
    // The job has stopped while processing for any number of reasons and will
    // return to the PROCESSING state as soon as the reasons are no longer
    // present.
    def PROCESSING_STOPPED: JobState = ???
}
