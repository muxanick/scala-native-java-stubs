package javax.print.attribute.standard

import java.lang.{Object, String}
import javax.print.attribute.EnumSyntax
import scala.scalanative.annotation.stub

/** Class MediaSizeName is a subclass of Media.
 *  
 *  This attribute can be used instead of specifying MediaName or MediaTray.
 *  
 *  Class MediaSizeName currently declares a few standard media
 *  name values.
 *  
 *  IPP Compatibility: MediaSizeName is a representation class for
 *  values of the IPP "media" attribute which names media sizes.
 *  The names of the media sizes correspond to those in the IPP 1.1 RFC
 *  RFC 2911
 *  
 */
class MediaSizeName extends Media {

    /** Construct a new media size enumeration value with the given integer
     *  value.
     */
    @stub
    protected def this(value: Int) = ???

    /** Returns the enumeration value table for class MediaSizeName. */
    @stub
    protected def getEnumValueTable(): Array[EnumSyntax] = ???

    /** Returns the string table for class MediaSizeName. */
    @stub
    protected def getStringTable(): Array[String] = ???
}

object MediaSizeName {
    /** A size . */
    @stub
    val A: MediaSizeName = ???

    /** B size . */
    @stub
    val B: MediaSizeName = ???

    /** C size . */
    @stub
    val C: MediaSizeName = ???

    /** D size . */
    @stub
    val D: MediaSizeName = ???

    /** E size . */
    @stub
    val E: MediaSizeName = ???

    /** executive size . */
    @stub
    val EXECUTIVE: MediaSizeName = ???

    /** folio size . */
    @stub
    val FOLIO: MediaSizeName = ???

    /** invoice size . */
    @stub
    val INVOICE: MediaSizeName = ???

    /** A0 size. */
    @stub
    val ISO_A0: MediaSizeName = ???

    /** A1 size. */
    @stub
    val ISO_A1: MediaSizeName = ???

    /** A10 size. */
    @stub
    val ISO_A10: MediaSizeName = ???

    /** A2 size. */
    @stub
    val ISO_A2: MediaSizeName = ???

    /** A3 size. */
    @stub
    val ISO_A3: MediaSizeName = ???

    /** A4 size. */
    @stub
    val ISO_A4: MediaSizeName = ???

    /** A5 size. */
    @stub
    val ISO_A5: MediaSizeName = ???

    /** A6 size. */
    @stub
    val ISO_A6: MediaSizeName = ???

    /** A7 size. */
    @stub
    val ISO_A7: MediaSizeName = ???

    /** A8 size. */
    @stub
    val ISO_A8: MediaSizeName = ???

    /** A9 size. */
    @stub
    val ISO_A9: MediaSizeName = ???

    /** ISO B0 size. */
    @stub
    val ISO_B0: MediaSizeName = ???

    /** ISO B1 size. */
    @stub
    val ISO_B1: MediaSizeName = ???

    /** ISO B10 size. */
    @stub
    val ISO_B10: MediaSizeName = ???

    /** ISO B2 size. */
    @stub
    val ISO_B2: MediaSizeName = ???

    /** ISO B3 size. */
    @stub
    val ISO_B3: MediaSizeName = ???

    /** ISO B4 size. */
    @stub
    val ISO_B4: MediaSizeName = ???

    /** ISO B5 size. */
    @stub
    val ISO_B5: MediaSizeName = ???

    /** ISO B6 size. */
    @stub
    val ISO_B6: MediaSizeName = ???

    /** ISO B7 size. */
    @stub
    val ISO_B7: MediaSizeName = ???

    /** ISO B8 size. */
    @stub
    val ISO_B8: MediaSizeName = ???

    /** ISO B9 size. */
    @stub
    val ISO_B9: MediaSizeName = ???

    /** ISO C0 size. */
    @stub
    val ISO_C0: MediaSizeName = ???

    /** ISO C1 size. */
    @stub
    val ISO_C1: MediaSizeName = ???

    /** ISO C2 size. */
    @stub
    val ISO_C2: MediaSizeName = ???

    /** ISO C3 size. */
    @stub
    val ISO_C3: MediaSizeName = ???

    /** ISO C4 size. */
    @stub
    val ISO_C4: MediaSizeName = ???

    /** ISO C5 size. */
    @stub
    val ISO_C5: MediaSizeName = ???

    /** letter size. */
    @stub
    val ISO_C6: MediaSizeName = ???

    /** ISO designated long size . */
    @stub
    val ISO_DESIGNATED_LONG: MediaSizeName = ???

    /** Italy envelope size . */
    @stub
    val ITALY_ENVELOPE: MediaSizeName = ???

    /** Japanese Double Postcard size. */
    @stub
    val JAPANESE_DOUBLE_POSTCARD: MediaSizeName = ???

    /** Japanese Postcard size. */
    @stub
    val JAPANESE_POSTCARD: MediaSizeName = ???

    /** JIS B0 size. */
    @stub
    val JIS_B0: MediaSizeName = ???

    /** JIS B1 size. */
    @stub
    val JIS_B1: MediaSizeName = ???

    /** JIS B10 size. */
    @stub
    val JIS_B10: MediaSizeName = ???

    /** JIS B2 size. */
    @stub
    val JIS_B2: MediaSizeName = ???

    /** JIS B3 size. */
    @stub
    val JIS_B3: MediaSizeName = ???

    /** JIS B4 size. */
    @stub
    val JIS_B4: MediaSizeName = ???

    /** JIS B5 size. */
    @stub
    val JIS_B5: MediaSizeName = ???

    /** JIS B6 size. */
    @stub
    val JIS_B6: MediaSizeName = ???

    /** JIS B7 size. */
    @stub
    val JIS_B7: MediaSizeName = ???

    /** JIS B8 size. */
    @stub
    val JIS_B8: MediaSizeName = ???

    /** JIS B9 size. */
    @stub
    val JIS_B9: MediaSizeName = ???

    /** ledger size . */
    @stub
    val LEDGER: MediaSizeName = ???

    /** monarch envelope size . */
    @stub
    val MONARCH_ENVELOPE: MediaSizeName = ???

    /** 10x13 North American envelope size . */
    @stub
    val NA_10X13_ENVELOPE: MediaSizeName = ???

    /** 10x14North American  envelope size . */
    @stub
    val NA_10X14_ENVELOPE: MediaSizeName = ???

    /** 10x15 North American envelope size. */
    @stub
    val NA_10X15_ENVELOPE: MediaSizeName = ???

    /** 5x7 North American paper. */
    @stub
    val NA_5X7: MediaSizeName = ???

    /** 6x9 North American envelope size. */
    @stub
    val NA_6X9_ENVELOPE: MediaSizeName = ???

    /** 7x9 North American envelope size. */
    @stub
    val NA_7X9_ENVELOPE: MediaSizeName = ???

    /** 8x10 North American paper. */
    @stub
    val NA_8X10: MediaSizeName = ???

    /** 9x11 North American envelope size. */
    @stub
    val NA_9X11_ENVELOPE: MediaSizeName = ???

    /** 9x12 North American envelope size. */
    @stub
    val NA_9X12_ENVELOPE: MediaSizeName = ???

    /** legal size . */
    @stub
    val NA_LEGAL: MediaSizeName = ???

    /** letter size. */
    @stub
    val NA_LETTER: MediaSizeName = ???

    /** number 10 envelope size . */
    @stub
    val NA_NUMBER_10_ENVELOPE: MediaSizeName = ???

    /** number 11 envelope size . */
    @stub
    val NA_NUMBER_11_ENVELOPE: MediaSizeName = ???

    /** number 12 envelope size . */
    @stub
    val NA_NUMBER_12_ENVELOPE: MediaSizeName = ???

    /** number 14 envelope size . */
    @stub
    val NA_NUMBER_14_ENVELOPE: MediaSizeName = ???

    /** number 9 envelope size . */
    @stub
    val NA_NUMBER_9_ENVELOPE: MediaSizeName = ???

    /** personal envelope size . */
    @stub
    val PERSONAL_ENVELOPE: MediaSizeName = ???

    /** quarto size . */
    @stub
    val QUARTO: MediaSizeName = ???

    /** tabloid size . */
    @stub
    val TABLOID: MediaSizeName = ???
}
