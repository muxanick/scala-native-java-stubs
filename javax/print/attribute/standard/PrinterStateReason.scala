package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}

/** Class PrinterStateReason is a printing attribute class, an enumeration,
 *  that provides additional information about the printer's current state,
 *  i.e., information that augments the value of the printer's
 *  PrinterState attribute.
 *  Class PrinterStateReason defines standard printer
 *  state reason values. A Print Service implementation only needs to report
 *  those printer state reasons which are appropriate for the particular
 *  implementation; it does not have to report every defined printer state
 *  reason.
 *  
 *  Instances of PrinterStateReason do not appear in a Print Service's
 *  attribute set directly.
 *  Rather, a PrinterStateReasons
 *  attribute appears in the Print Service's attribute set. The PrinterStateReasons attribute contains zero, one, or
 *  more than one PrinterStateReason objects which pertain to the
 *  Print Service's status, and each PrinterStateReason object is
 *  associated with a Severity level of REPORT (least severe),
 *  WARNING, or ERROR (most severe). The printer adds a PrinterStateReason
 *  object to the Print Service's
 *  PrinterStateReasons attribute when the
 *  corresponding condition becomes true of the printer, and the printer
 *  removes the PrinterStateReason object again when the corresponding
 *  condition becomes false, regardless of whether the Print Service's overall
 *  PrinterState also changed.
 *  
 *  IPP Compatibility:
 *  The string values returned by each individual PrinterStateReason and
 *  associated Severity object's toString()
 *  methods, concatenated together with a hyphen ("-") in
 *  between, gives the IPP keyword value for a PrinterStateReasons.
 *  The category name returned by getName() gives the IPP
 *  attribute name.
 *  
 */
class PrinterStateReason extends EnumSyntax with Attribute {

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Returns the enumeration value table for class PrinterStateReason. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object PrinterStateReason {
    /** The printer has scheduled a job on the output device and is in the
     *  process of connecting to a shared network output device (and might not
     *  be able to actually start printing the job for an arbitrarily long time
     *  depending on the usage of the output device by other servers on the
     *  network).
     */
    @stub
    val CONNECTING_TO_DEVICE: PrinterStateReason = ???

    /** One or more covers on the device are open. */
    @stub
    val COVER_OPEN: PrinterStateReason = ???

    /** The device is out of developer. */
    @stub
    val DEVELOPER_EMPTY: PrinterStateReason = ???

    /** The device is low on developer. */
    @stub
    val DEVELOPER_LOW: PrinterStateReason = ???

    /** One or more doors on the device are open. */
    @stub
    val DOOR_OPEN: PrinterStateReason = ???

    /** The fuser temperature is above normal. */
    @stub
    val FUSER_OVER_TEMP: PrinterStateReason = ???

    /** The fuser temperature is below normal. */
    @stub
    val FUSER_UNDER_TEMP: PrinterStateReason = ???

    /** One or more input trays are not in the device. */
    @stub
    val INPUT_TRAY_MISSING: PrinterStateReason = ???

    /** One or more interlock devices on the printer are unlocked. */
    @stub
    val INTERLOCK_OPEN: PrinterStateReason = ???

    /** An interpreter resource is unavailable (e.g., font, form). */
    @stub
    val INTERPRETER_RESOURCE_UNAVAILABLE: PrinterStateReason = ???

    /** The device is out of at least one marker supply (e.g. */
    @stub
    val MARKER_SUPPLY_EMPTY: PrinterStateReason = ???

    /** The device is low on at least one marker supply (e.g. */
    @stub
    val MARKER_SUPPLY_LOW: PrinterStateReason = ???

    /** The device marker supply waste receptacle is almost full. */
    @stub
    val MARKER_WASTE_ALMOST_FULL: PrinterStateReason = ???

    /** The device marker supply waste receptacle is full. */
    @stub
    val MARKER_WASTE_FULL: PrinterStateReason = ???

    /** At least one input tray is empty. */
    @stub
    val MEDIA_EMPTY: PrinterStateReason = ???

    /** The device has a media jam. */
    @stub
    val MEDIA_JAM: PrinterStateReason = ???

    /** At least one input tray is low on media. */
    @stub
    val MEDIA_LOW: PrinterStateReason = ???

    /** A tray has run out of media. */
    @stub
    val MEDIA_NEEDED: PrinterStateReason = ???

    /** Someone has paused the printer, but the device(s) are taking an
     *  appreciable time to stop.
     */
    @stub
    val MOVING_TO_PAUSED: PrinterStateReason = ???

    /** The optical photo conductor is no longer functioning. */
    @stub
    val OPC_LIFE_OVER: PrinterStateReason = ???

    /** The optical photo conductor is near end of life. */
    @stub
    val OPC_NEAR_EOL: PrinterStateReason = ???

    /** The printer has detected an error other than ones listed below. */
    @stub
    val OTHER: PrinterStateReason = ???

    /** One or more output areas are almost full
     *  (e.g.
     */
    @stub
    val OUTPUT_AREA_ALMOST_FULL: PrinterStateReason = ???

    /** One or more output areas are full (e.g. */
    @stub
    val OUTPUT_AREA_FULL: PrinterStateReason = ???

    /** One or more output trays are not in the device. */
    @stub
    val OUTPUT_TRAY_MISSING: PrinterStateReason = ???

    /** Someone has paused the printer and the printer's PrinterState is STOPPED. */
    @stub
    val PAUSED: PrinterStateReason = ???

    /** Someone has removed a printer from service, and the device may be
     *  powered down or physically removed.
     */
    @stub
    val SHUTDOWN: PrinterStateReason = ???

    /** The limit of persistent storage allocated for spooling has been
     *  reached.
     */
    @stub
    val SPOOL_AREA_FULL: PrinterStateReason = ???

    /** When a printer controls more than one output device, this reason
     *  indicates that one or more output devices are stopped.
     */
    @stub
    val STOPPED_PARTLY: PrinterStateReason = ???

    /** The printer is in the process of stopping the device and will be
     *  stopped in a while.
     */
    @stub
    val STOPPING: PrinterStateReason = ???

    /** The server was able to connect to the output device (or is always
     *  connected), but was unable to get a response from the output device.
     */
    @stub
    val TIMED_OUT: PrinterStateReason = ???

    /** The device is out of toner. */
    @stub
    val TONER_EMPTY: PrinterStateReason = ???
}
