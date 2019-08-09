package javax.print.attribute.standard

import java.lang.Object
import javax.print.attribute.EnumSyntax

// Class MediaSizeName is a subclass of Media.
// 
// This attribute can be used instead of specifying MediaName or MediaTray.
// 
// Class MediaSizeName currently declares a few standard media
// name values.
// 
// IPP Compatibility: MediaSizeName is a representation class for
// values of the IPP "media" attribute which names media sizes.
// The names of the media sizes correspond to those in the IPP 1.1 RFC
// RFC 2911
// 
class MediaSizeName extends Media {

    @stub
    // Returns the enumeration value table for class MediaSizeName.
    protected def getEnumValueTable(): Array[EnumSyntax] = ???
}

object MediaSizeName {
    @stub
    // A size .
    def A: MediaSizeName = ???

    @stub
    // B size .
    def B: MediaSizeName = ???

    @stub
    // C size .
    def C: MediaSizeName = ???

    @stub
    // D size .
    def D: MediaSizeName = ???

    @stub
    // E size .
    def E: MediaSizeName = ???

    @stub
    // executive size .
    def EXECUTIVE: MediaSizeName = ???

    @stub
    // folio size .
    def FOLIO: MediaSizeName = ???

    @stub
    // invoice size .
    def INVOICE: MediaSizeName = ???

    @stub
    // A0 size.
    def ISO_A0: MediaSizeName = ???

    @stub
    // A1 size.
    def ISO_A1: MediaSizeName = ???

    @stub
    // A10 size.
    def ISO_A10: MediaSizeName = ???

    @stub
    // A2 size.
    def ISO_A2: MediaSizeName = ???

    @stub
    // A3 size.
    def ISO_A3: MediaSizeName = ???

    @stub
    // A4 size.
    def ISO_A4: MediaSizeName = ???

    @stub
    // A5 size.
    def ISO_A5: MediaSizeName = ???

    @stub
    // A6 size.
    def ISO_A6: MediaSizeName = ???

    @stub
    // A7 size.
    def ISO_A7: MediaSizeName = ???

    @stub
    // A8 size.
    def ISO_A8: MediaSizeName = ???

    @stub
    // A9 size.
    def ISO_A9: MediaSizeName = ???

    @stub
    // ISO B0 size.
    def ISO_B0: MediaSizeName = ???

    @stub
    // ISO B1 size.
    def ISO_B1: MediaSizeName = ???

    @stub
    // ISO B10 size.
    def ISO_B10: MediaSizeName = ???

    @stub
    // ISO B2 size.
    def ISO_B2: MediaSizeName = ???

    @stub
    // ISO B3 size.
    def ISO_B3: MediaSizeName = ???

    @stub
    // ISO B4 size.
    def ISO_B4: MediaSizeName = ???

    @stub
    // ISO B5 size.
    def ISO_B5: MediaSizeName = ???

    @stub
    // ISO B6 size.
    def ISO_B6: MediaSizeName = ???

    @stub
    // ISO B7 size.
    def ISO_B7: MediaSizeName = ???

    @stub
    // ISO B8 size.
    def ISO_B8: MediaSizeName = ???

    @stub
    // ISO B9 size.
    def ISO_B9: MediaSizeName = ???

    @stub
    // ISO C0 size.
    def ISO_C0: MediaSizeName = ???

    @stub
    // ISO C1 size.
    def ISO_C1: MediaSizeName = ???

    @stub
    // ISO C2 size.
    def ISO_C2: MediaSizeName = ???

    @stub
    // ISO C3 size.
    def ISO_C3: MediaSizeName = ???

    @stub
    // ISO C4 size.
    def ISO_C4: MediaSizeName = ???

    @stub
    // ISO C5 size.
    def ISO_C5: MediaSizeName = ???

    @stub
    // letter size.
    def ISO_C6: MediaSizeName = ???

    @stub
    // ISO designated long size .
    def ISO_DESIGNATED_LONG: MediaSizeName = ???

    @stub
    // Italy envelope size .
    def ITALY_ENVELOPE: MediaSizeName = ???

    @stub
    // Japanese Double Postcard size.
    def JAPANESE_DOUBLE_POSTCARD: MediaSizeName = ???

    @stub
    // Japanese Postcard size.
    def JAPANESE_POSTCARD: MediaSizeName = ???

    @stub
    // JIS B0 size.
    def JIS_B0: MediaSizeName = ???

    @stub
    // JIS B1 size.
    def JIS_B1: MediaSizeName = ???

    @stub
    // JIS B10 size.
    def JIS_B10: MediaSizeName = ???

    @stub
    // JIS B2 size.
    def JIS_B2: MediaSizeName = ???

    @stub
    // JIS B3 size.
    def JIS_B3: MediaSizeName = ???

    @stub
    // JIS B4 size.
    def JIS_B4: MediaSizeName = ???

    @stub
    // JIS B5 size.
    def JIS_B5: MediaSizeName = ???

    @stub
    // JIS B6 size.
    def JIS_B6: MediaSizeName = ???

    @stub
    // JIS B7 size.
    def JIS_B7: MediaSizeName = ???

    @stub
    // JIS B8 size.
    def JIS_B8: MediaSizeName = ???

    @stub
    // JIS B9 size.
    def JIS_B9: MediaSizeName = ???

    @stub
    // ledger size .
    def LEDGER: MediaSizeName = ???

    @stub
    // monarch envelope size .
    def MONARCH_ENVELOPE: MediaSizeName = ???

    @stub
    // 10x13 North American envelope size .
    def NA_10X13_ENVELOPE: MediaSizeName = ???

    @stub
    // 10x14North American  envelope size .
    def NA_10X14_ENVELOPE: MediaSizeName = ???

    @stub
    // 10x15 North American envelope size.
    def NA_10X15_ENVELOPE: MediaSizeName = ???

    @stub
    // 5x7 North American paper.
    def NA_5X7: MediaSizeName = ???

    @stub
    // 6x9 North American envelope size.
    def NA_6X9_ENVELOPE: MediaSizeName = ???

    @stub
    // 7x9 North American envelope size.
    def NA_7X9_ENVELOPE: MediaSizeName = ???

    @stub
    // 8x10 North American paper.
    def NA_8X10: MediaSizeName = ???

    @stub
    // 9x11 North American envelope size.
    def NA_9X11_ENVELOPE: MediaSizeName = ???

    @stub
    // 9x12 North American envelope size.
    def NA_9X12_ENVELOPE: MediaSizeName = ???

    @stub
    // legal size .
    def NA_LEGAL: MediaSizeName = ???

    @stub
    // letter size.
    def NA_LETTER: MediaSizeName = ???

    @stub
    // number 10 envelope size .
    def NA_NUMBER_10_ENVELOPE: MediaSizeName = ???

    @stub
    // number 11 envelope size .
    def NA_NUMBER_11_ENVELOPE: MediaSizeName = ???

    @stub
    // number 12 envelope size .
    def NA_NUMBER_12_ENVELOPE: MediaSizeName = ???

    @stub
    // number 14 envelope size .
    def NA_NUMBER_14_ENVELOPE: MediaSizeName = ???

    @stub
    // number 9 envelope size .
    def NA_NUMBER_9_ENVELOPE: MediaSizeName = ???

    @stub
    // personal envelope size .
    def PERSONAL_ENVELOPE: MediaSizeName = ???

    @stub
    // quarto size .
    def QUARTO: MediaSizeName = ???
}
