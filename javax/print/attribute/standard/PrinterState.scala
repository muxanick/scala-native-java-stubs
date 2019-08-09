package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax, PrintServiceAttribute}

/** Class PrinterState is a printing attribute class, an enumeration, that
 *  identifies the current state of a printer. Class PrinterState defines
 *  standard printer state values. A Print Service implementation only needs
 *  to report those printer states which are appropriate for the particular
 *  implementation; it does not have to report every defined printer state. The
 *  PrinterStateReasons attribute augments the
 *  PrinterState attribute to give more detailed information about the printer
 *  in  given printer state.
 *  
 *  IPP Compatibility: The category name returned by
 *  getName() is the IPP attribute name.  The enumeration's
 *  integer value is the IPP enum value.  The toString() method
 *  returns the IPP string representation of the attribute value.
 *  
 */
final class PrinterState extends EnumSyntax with PrintServiceAttribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PrinterState. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object PrinterState {
    /** Indicates that new jobs can start processing without waiting. */
    @stub
    val IDLE: PrinterState = ???

    /** Indicates that jobs are processing;
     *  new jobs will wait before processing.
     */
    @stub
    val PROCESSING: PrinterState = ???

    /** Indicates that no jobs can be processed and intervention is required. */
    @stub
    val STOPPED: PrinterState = ???
}
