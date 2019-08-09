package javax.print.attribute.standard

import java.lang.Object
import javax.print.attribute.{Attribute, EnumSyntax}

/** Class MediaName is a subclass of Media, a printing attribute class (an
 *  enumeration) that specifies the media for a print job as a name.
 *  
 *  This attribute can be used instead of specifying MediaSize or MediaTray.
 *  
 *  Class MediaName currently declares a few standard media names.
 *  Implementation- or site-defined names for a media name attribute may also
 *  be created by defining a subclass of class MediaName.
 *  
 *  IPP Compatibility: MediaName is a representation class for
 *  values of the IPP "media" attribute which names media.
 *  
 */
class MediaName extends Media with Attribute {

    /** Returns the enumeration value table for class MediaTray. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???
}

object MediaName {
    /** A4 transparency. */
    @stub
    val ISO_A4_TRANSPARENT: MediaName = ???

    /** white A4 paper. */
    @stub
    val ISO_A4_WHITE: MediaName = ???

    /** letter transparency. */
    @stub
    val NA_LETTER_TRANSPARENT: MediaName = ???
}
