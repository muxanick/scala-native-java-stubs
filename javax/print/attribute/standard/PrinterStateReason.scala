package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, EnumSyntax}

// Class PrinterStateReason is a printing attribute class, an enumeration,
// that provides additional information about the printer's current state,
// i.e., information that augments the value of the printer's
// PrinterState attribute.
// Class PrinterStateReason defines standard printer
// state reason values. A Print Service implementation only needs to report
// those printer state reasons which are appropriate for the particular
// implementation; it does not have to report every defined printer state
// reason.
// 
// Instances of PrinterStateReason do not appear in a Print Service's
// attribute set directly.
// Rather, a PrinterStateReasons
// attribute appears in the Print Service's attribute set. The PrinterStateReasons attribute contains zero, one, or
// more than one PrinterStateReason objects which pertain to the
// Print Service's status, and each PrinterStateReason object is
// associated with a Severity level of REPORT (least severe),
// WARNING, or ERROR (most severe). The printer adds a PrinterStateReason
// object to the Print Service's
// PrinterStateReasons attribute when the
// corresponding condition becomes true of the printer, and the printer
// removes the PrinterStateReason object again when the corresponding
// condition becomes false, regardless of whether the Print Service's overall
// PrinterState also changed.
// 
// IPP Compatibility:
// The string values returned by each individual PrinterStateReason and
// associated Severity object's toString()
// methods, concatenated together with a hyphen ("-") in
// between, gives the IPP keyword value for a PrinterStateReasons.
// The category name returned by getName() gives the IPP
// attribute name.
// 
class PrinterStateReason extends EnumSyntax with Attribute {

    @stub
    // Get the printing attribute class which is to be used as the "category"
    // for this printing attribute value.
    def getCategory(): Class[_ <: Attribute] = ???

    @stub
    // Returns the enumeration value table for class PrinterStateReason.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    @stub
    // Get the name of the category of which this attribute value is an
    // instance.
    def getName(): String = ???
}

object PrinterStateReason {
    @stub
    // The printer has scheduled a job on the output device and is in the
    // process of connecting to a shared network output device (and might not
    // be able to actually start printing the job for an arbitrarily long time
    // depending on the usage of the output device by other servers on the
    // network).
    def CONNECTING_TO_DEVICE: PrinterStateReason = ???

    @stub
    // One or more covers on the device are open.
    def COVER_OPEN: PrinterStateReason = ???

    @stub
    // The device is out of developer.
    def DEVELOPER_EMPTY: PrinterStateReason = ???

    @stub
    // The device is low on developer.
    def DEVELOPER_LOW: PrinterStateReason = ???

    @stub
    // One or more doors on the device are open.
    def DOOR_OPEN: PrinterStateReason = ???

    @stub
    // The fuser temperature is above normal.
    def FUSER_OVER_TEMP: PrinterStateReason = ???

    @stub
    // The fuser temperature is below normal.
    def FUSER_UNDER_TEMP: PrinterStateReason = ???

    @stub
    // One or more input trays are not in the device.
    def INPUT_TRAY_MISSING: PrinterStateReason = ???

    @stub
    // One or more interlock devices on the printer are unlocked.
    def INTERLOCK_OPEN: PrinterStateReason = ???

    @stub
    // An interpreter resource is unavailable (e.g., font, form).
    def INTERPRETER_RESOURCE_UNAVAILABLE: PrinterStateReason = ???

    @stub
    // The device is out of at least one marker supply (e.g.
    def MARKER_SUPPLY_EMPTY: PrinterStateReason = ???

    @stub
    // The device is low on at least one marker supply (e.g.
    def MARKER_SUPPLY_LOW: PrinterStateReason = ???

    @stub
    // The device marker supply waste receptacle is almost full.
    def MARKER_WASTE_ALMOST_FULL: PrinterStateReason = ???

    @stub
    // The device marker supply waste receptacle is full.
    def MARKER_WASTE_FULL: PrinterStateReason = ???

    @stub
    // At least one input tray is empty.
    def MEDIA_EMPTY: PrinterStateReason = ???

    @stub
    // The device has a media jam.
    def MEDIA_JAM: PrinterStateReason = ???

    @stub
    // At least one input tray is low on media.
    def MEDIA_LOW: PrinterStateReason = ???

    @stub
    // A tray has run out of media.
    def MEDIA_NEEDED: PrinterStateReason = ???

    @stub
    // Someone has paused the printer, but the device(s) are taking an
    // appreciable time to stop.
    def MOVING_TO_PAUSED: PrinterStateReason = ???

    @stub
    // The optical photo conductor is no longer functioning.
    def OPC_LIFE_OVER: PrinterStateReason = ???

    @stub
    // The optical photo conductor is near end of life.
    def OPC_NEAR_EOL: PrinterStateReason = ???

    @stub
    // The printer has detected an error other than ones listed below.
    def OTHER: PrinterStateReason = ???

    @stub
    // One or more output areas are almost full
    // (e.g.
    def OUTPUT_AREA_ALMOST_FULL: PrinterStateReason = ???

    @stub
    // One or more output areas are full (e.g.
    def OUTPUT_AREA_FULL: PrinterStateReason = ???

    @stub
    // One or more output trays are not in the device.
    def OUTPUT_TRAY_MISSING: PrinterStateReason = ???

    @stub
    // Someone has paused the printer and the printer's PrinterState is STOPPED.
    def PAUSED: PrinterStateReason = ???

    @stub
    // Someone has removed a printer from service, and the device may be
    // powered down or physically removed.
    def SHUTDOWN: PrinterStateReason = ???

    @stub
    // The limit of persistent storage allocated for spooling has been
    // reached.
    def SPOOL_AREA_FULL: PrinterStateReason = ???

    @stub
    // When a printer controls more than one output device, this reason
    // indicates that one or more output devices are stopped.
    def STOPPED_PARTLY: PrinterStateReason = ???

    @stub
    // The printer is in the process of stopping the device and will be
    // stopped in a while.
    def STOPPING: PrinterStateReason = ???

    @stub
    // The server was able to connect to the output device (or is always
    // connected), but was unable to get a response from the output device.
    def TIMED_OUT: PrinterStateReason = ???

    @stub
    // The device is out of toner.
    def TONER_EMPTY: PrinterStateReason = ???
}
