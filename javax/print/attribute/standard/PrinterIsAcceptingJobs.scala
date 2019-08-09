package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintServiceAttribute}
import scala.scalanative.annotation.stub

/** Class PrinterIsAcceptingJobs is a printing attribute class, an enumeration,
 *  that indicates whether the printer is currently able to accept jobs. This
 *  value is independent of the PrinterState and PrinterStateReasons attributes because its value does
 *  not affect the current job; rather it affects future jobs. If the value is
 *  NOT_ACCEPTING_JOBS, the printer will reject jobs even when the PrinterState is IDLE. If value is ACCEPTING_JOBS, the Printer
 *  will accept jobs even when the PrinterState is STOPPED.
 *  
 *  IPP Compatibility: The IPP boolean value is "true" for ACCEPTING_JOBS
 *  and "false" for NOT_ACCEPTING_JOBS. The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
final class PrinterIsAcceptingJobs extends EnumSyntax with PrintServiceAttribute {

    /** Construct a new printer is accepting jobs enumeration value with the
     *  given integer value.
     */
    @stub
    protected def this(value: Int) = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PrinterIsAcceptingJobs. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class PrinterIsAcceptingJobs. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object PrinterIsAcceptingJobs {
    /** The printer is currently accepting jobs. */
    @stub
    val ACCEPTING_JOBS: PrinterIsAcceptingJobs = ???

    /** The printer is currently rejecting any jobs sent to it. */
    @stub
    val NOT_ACCEPTING_JOBS: PrinterIsAcceptingJobs = ???
}
