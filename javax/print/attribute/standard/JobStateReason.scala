package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}

// Class JobStateReason is a printing attribute class, an enumeration, that
// provides additional information about the job's current state, i.e.,
// information that augments the value of the job's JobState
// attribute. Class JobStateReason defines standard job state reason values. A
// Print Service implementation only needs to report those job state
// reasons which are appropriate for the particular implementation; it does not
// have to report every defined job state reason.
// 
// Instances of JobStateReason do not appear in a Print Job's attribute set
// directly. Rather, a JobStateReasons attribute appears
// in the Print Job's attribute set. The JobStateReasons
// attribute contains zero, one, or more than one JobStateReason objects which
// pertain to the Print Job's status. The printer adds a JobStateReason object
// to the Print Job's JobStateReasons attribute when the
// corresponding condition becomes true of the Print Job, and the printer
// removes the JobStateReason object again when the corresponding condition
// becomes false, regardless of whether the Print Job's overall JobState also changed.
// 
// IPP Compatibility: The category name returned by
// getName() is the IPP attribute name.  The enumeration's
// integer value is the IPP enum value.  The toString() method
// returns the IPP string representation of the attribute value.
// 
class JobStateReason extends EnumSyntax with Attribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class JobStateReason.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object JobStateReason {
    @stub
    // The job was aborted by the system.
    def ABORTED_BY_SYSTEM: JobStateReason = ???

    @stub
    // The job was aborted by the system because the printer encountered an
    // error in the document data while decompressing it.
    def COMPRESSION_ERROR: JobStateReason = ???

    @stub
    // The Printer could not access one or more documents passed by reference
    // (i.e., the print data representation object is a URL).
    def DOCUMENT_ACCESS_ERROR: JobStateReason = ???

    @stub
    // The job was aborted by the system because the printer encountered an
    // error in the document data while processing it.
    def DOCUMENT_FORMAT_ERROR: JobStateReason = ???

    @stub
    // The job was canceled by an unidentified local user, i.e., a user at a
    // console at the device.
    def JOB_CANCELED_AT_DEVICE: JobStateReason = ???

    @stub
    // The job was canceled by the operator, i.e., by a user who has been
    // authenticated as having operator privileges (whether local or remote).
    def JOB_CANCELED_BY_OPERATOR: JobStateReason = ???

    @stub
    // The job was canceled by the owner of the job, i.e., by a user whose
    // authenticated identity is the same as the value of the originating user
    // that created the Print Job, or by some other authorized end-user, such as
    // a member of the job owner's security group.
    def JOB_CANCELED_BY_USER: JobStateReason = ???

    @stub
    // The job completed successfully.
    def JOB_COMPLETED_SUCCESSFULLY: JobStateReason = ???

    @stub
    // The job completed with errors (and possibly warnings too).
    def JOB_COMPLETED_WITH_ERRORS: JobStateReason = ???

    @stub
    // The job completed with warnings.
    def JOB_COMPLETED_WITH_WARNINGS: JobStateReason = ???

    @stub
    // The printer has created the Print Job, but the printer is expecting
    // additional print data before it can move the job into the PROCESSING
    // state.
    def JOB_DATA_INSUFFICIENT: JobStateReason = ???

    @stub
    // The value of the job's JobHoldUntil attribute was
    // specified with a date-time that is still in the future.
    def JOB_HOLD_UNTIL_SPECIFIED: JobStateReason = ???

    @stub
    // The printer has created the Print Job, but the printer has not finished
    // accessing or accepting all the print data yet.
    def JOB_INCOMING: JobStateReason = ???

    @stub
    // The job is in the PROCESSING state, but more specifically, the printer
    // ia interpreting the document data.
    def JOB_INTERPRETING: JobStateReason = ???

    @stub
    // The printer is transmitting the job to the output device.
    def JOB_OUTGOING: JobStateReason = ???

    @stub
    // The output device is marking media.
    def JOB_PRINTING: JobStateReason = ???

    @stub
    // The job is in the PROCESSING state, but more specifically, the printer
    // has queued the document data.
    def JOB_QUEUED: JobStateReason = ???

    @stub
    // The job is in the PENDING_HELD, PENDING, or PROCESSING state, but more
    // specifically, the printer has completed enough processing of the document
    // to be able to start marking and the job is waiting for the marker.
    def JOB_QUEUED_FOR_MARKER: JobStateReason = ???

    @stub
    // This job is retained and is currently able to be restarted.
    def JOB_RESTARTABLE: JobStateReason = ???

    @stub
    // The job is in the PROCESSING state, but more specifically, the printer
    // is interpreting document data and producing another electronic
    // representation.
    def JOB_TRANSFORMING: JobStateReason = ???

    @stub
    // The value of the printer's PrinterState attribute
    // ia STOPPED.
    def PRINTER_STOPPED: JobStateReason = ???

    @stub
    // The value of the printer's PrinterStateReasons attribute contains a PrinterStateReason value of STOPPED_PARTLY.
    def PRINTER_STOPPED_PARTLY: JobStateReason = ???

    @stub
    // The requester has canceled the job or the printer has aborted the job,
    // but the printer is still performing some actions on the job until a
    // specified stop point occurs or job termination/cleanup is completed.
    def PROCESSING_TO_STOP_POINT: JobStateReason = ???

    @stub
    // The job has been forwarded to a device or print system that is unable to
    // send back status.
    def QUEUED_IN_DEVICE: JobStateReason = ???

    @stub
    // At least one of the resources needed by the job, such as media, fonts,
    // resource objects, etc., is not ready on any of the physical printers
    // for which the job is a candidate.
    def RESOURCES_ARE_NOT_READY: JobStateReason = ???

    @stub
    // The printer is off-line and accepting no jobs.
    def SERVICE_OFF_LINE: JobStateReason = ???

    @stub
    // The job was not completely submitted for some unforeseen reason.
    def SUBMISSION_INTERRUPTED: JobStateReason = ???

    @stub
    // The job was aborted by the system because the printer determined while
    // attempting to decompress the document's data that the compression is
    // actually not among those supported by the printer.
    def UNSUPPORTED_COMPRESSION: JobStateReason = ???
}
