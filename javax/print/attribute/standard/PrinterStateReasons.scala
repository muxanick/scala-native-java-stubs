package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import java.util.{AbstractMap, HashMap, Set}
import javax.print.attribute.{Attribute, PrintServiceAttribute}

/** Class PrinterStateReasons is a printing attribute class, a set of
 *  enumeration values, that provides additional information about the
 *  printer's current state, i.e., information that augments the value of the
 *  printer's PrinterState attribute.
 *  
 *  Instances of PrinterStateReason do not appear in
 *   a Print Service's attribute set directly. Rather, a PrinterStateReasons
 *  attribute appears in the Print Service's attribute set. The
 *  PrinterStateReasons attribute contains zero, one, or more than one PrinterStateReason objects which pertain to the Print
 *  Service's status, and each PrinterStateReason
 *  object is associated with a Severity level of REPORT
 *   (least severe), WARNING, or ERROR (most severe). The printer adds a PrinterStateReason object to the Print Service's
 *  PrinterStateReasons attribute when the corresponding condition becomes true
 *  of the printer, and the printer removes the PrinterStateReason object again when the corresponding condition becomes
 *  false, regardless of whether the Print Service's overall
 *  PrinterState also changed.
 *  
 *  Class PrinterStateReasons inherits its implementation from class java.util.HashMap. Each entry in the map consists of a
 *  PrinterStateReason object (key) mapping to a
 *  Severity object (value):
 *  
 *  Unlike most printing attributes which are immutable once constructed, class
 *  PrinterStateReasons is designed to be mutable; you can add PrinterStateReason objects to an existing
 *  PrinterStateReasons object and remove them again. However, like class
 *   java.util.HashMap, class PrinterStateReasons is
 *  not multiple thread safe. If a PrinterStateReasons object will be used by
 *  multiple threads, be sure to synchronize its operations (e.g., using a
 *  synchronized map view obtained from class java.util.Collections).
 *  
 *  IPP Compatibility: The string values returned by each individual
 *  PrinterStateReason object's and the associated
 *  Severity object's toString() methods,
 *  concatenated
 *  together with a hyphen ("-") in between, gives the IPP keyword
 *  value. The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
final class PrinterStateReasons extends HashMap[PrinterStateReason, Severity] with PrintServiceAttribute {

    /** Construct a new, empty printer state reasons attribute; the underlying
     *  hash map has the default initial capacity and load factor.
     */
    @stub
    def this() = ???

    /** super a new, empty printer state reasons attribute; the underlying
     *  hash map has the given initial capacity and the default load factor.
     */
    @stub
    def this(initialCapacity: Int) = ???

    /** Construct a new, empty printer state reasons attribute; the underlying
     *  hash map has the given initial capacity and load factor.
     */
    @stub
    def this(initialCapacity: Int, loadFactor: Float) = ???

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

    /** Obtain an unmodifiable set view of the individual printer state reason
     *  attributes at the given severity level in this PrinterStateReasons
     *  attribute.
     */
    @stub
    def printerStateReasonSet(severity: Severity): Set[PrinterStateReason] = ???
}
