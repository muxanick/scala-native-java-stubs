package javax.print.attribute.standard

import java.lang.Object
import javax.print.attribute.{Attribute, EnumSyntax}

// Class MediaTray is a subclass of Media.
// Class MediaTray is a printing attribute class, an enumeration, that
// specifies the media tray or bin for the job.
// This attribute can be used instead of specifying MediaSize or MediaName.
// 
// Class MediaTray declares keywords for standard media kind values.
// Implementation- or site-defined names for a media kind attribute may also
// be created by defining a subclass of class MediaTray.
// 
// IPP Compatibility: MediaTray is a representation class for
// values of the IPP "media" attribute which name paper trays.
// 
class MediaTray extends Media with Attribute {

    @stub
    // Returns the enumeration value table for class MediaTray.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???
}

object MediaTray {
    @stub
    // The bottom input tray in the printer.
    def BOTTOM: MediaTray = ???

    @stub
    // The envelope input tray in the printer.
    def ENVELOPE: MediaTray = ???

    @stub
    // The large capacity input tray in the printer.
    def LARGE_CAPACITY: MediaTray = ???

    @stub
    // The main input tray in the printer.
    def MAIN: MediaTray = ???

    @stub
    // The manual feed input tray in the printer.
    def MANUAL: MediaTray = ???

    @stub
    // The middle input tray in the printer.
    def MIDDLE: MediaTray = ???

    @stub
    // The side input tray.
    def SIDE: MediaTray = ???
}
