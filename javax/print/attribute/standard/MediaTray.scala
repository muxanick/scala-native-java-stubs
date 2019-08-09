package javax.print.attribute.standard

import java.lang.Object
import javax.print.attribute.{Attribute, EnumSyntax}

/** Class MediaTray is a subclass of Media.
 *  Class MediaTray is a printing attribute class, an enumeration, that
 *  specifies the media tray or bin for the job.
 *  This attribute can be used instead of specifying MediaSize or MediaName.
 *  
 *  Class MediaTray declares keywords for standard media kind values.
 *  Implementation- or site-defined names for a media kind attribute may also
 *  be created by defining a subclass of class MediaTray.
 *  
 *  IPP Compatibility: MediaTray is a representation class for
 *  values of the IPP "media" attribute which name paper trays.
 *  
 */
class MediaTray extends Media with Attribute {

    /** Returns the enumeration value table for class MediaTray. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???
}

object MediaTray {
    /** The bottom input tray in the printer. */
    @stub
    val BOTTOM: MediaTray = ???

    /** The envelope input tray in the printer. */
    @stub
    val ENVELOPE: MediaTray = ???

    /** The large capacity input tray in the printer. */
    @stub
    val LARGE_CAPACITY: MediaTray = ???

    /** The main input tray in the printer. */
    @stub
    val MAIN: MediaTray = ???

    /** The manual feed input tray in the printer. */
    @stub
    val MANUAL: MediaTray = ???

    /** The middle input tray in the printer. */
    @stub
    val MIDDLE: MediaTray = ???

    /** The side input tray. */
    @stub
    val SIDE: MediaTray = ???
}
