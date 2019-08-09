package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}
import scala.scalanative.annotation.stub

/** Class Severity is a printing attribute class, an enumeration, that denotes
 *  the severity of a PrinterStateReason attribute.
 *  
 *  Instances of Severity do not appear in a Print Service's attribute set
 *  directly. Rather, a PrinterStateReasons
 *  attribute appears in the Print Service's attribute set.
 *   The PrinterStateReasons attribute contains zero, one, or more than one PrinterStateReason objects which pertain to the Print
 *  Service's status, and each PrinterStateReason
 *  object is associated with a Severity level of REPORT (least severe),
 *  WARNING, or ERROR (most severe).
 *  The printer adds a PrinterStateReason object to the Print Service's
 *  PrinterStateReasons attribute when the
 *  corresponding condition becomes true
 *  of the printer, and the printer removes the PrinterStateReason object again when the corresponding condition becomes
 *  false, regardless of whether the Print Service's overall
 *  PrinterState also changed.
 *  
 *  IPP Compatibility:
 *  Severity.toString() returns either "error", "warning", or
 *  "report".  The string values returned by
 *  each individual PrinterStateReason and
 *  associated Severity object's toString()
 *  methods, concatenated together with a hyphen ("-") in
 *  between, gives the IPP keyword value for a PrinterStateReasons.
 *  The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
final class Severity extends EnumSyntax with Attribute {

    /** Construct a new severity enumeration value with the given integer
     *  value.
     */
    @stub
    protected def this(value: Int) = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class Severity. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???

    /** Returns the string table for class Severity. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object Severity {
    /** Indicates that the PrinterStateReason is an
     *  "error" (most severe).
     */
    @stub
    val ERROR: Severity = ???

    /** Indicates that the PrinterStateReason is a
     *  "report" (least severe).
     */
    @stub
    val REPORT: Severity = ???

    /** Indicates that the PrinterStateReason is a
     *  "warning." An implementation may choose to omit some or all warnings.
     */
    @stub
    val WARNING: Severity = ???
}
