package javax.print.attribute.standard

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, Size2DSyntax}
import scala.scalanative.annotation.stub

/** Class MediaSize is a two-dimensional size valued printing attribute class
 *  that indicates the dimensions of the medium in a portrait orientation, with
 *  the X dimension running along the bottom edge and the Y dimension running
 *  along the left edge. Thus, the Y dimension must be greater than or equal to
 *  the X dimension. Class MediaSize declares many standard media size
 *  values, organized into nested classes for ISO, JIS, North American,
 *  engineering, and other media.
 *  
 *  MediaSize is not yet used to specify media. Its current role is
 *  as a mapping for named media (see MediaSizeName).
 *  Clients can use the mapping method
 *  MediaSize.getMediaSizeForName(MediaSizeName)
 *  to find the physical dimensions of the MediaSizeName instances
 *  enumerated in this API. This is useful for clients which need this
 *  information to format & paginate printing.
 *  
 */
class MediaSize extends Size2DSyntax with Attribute {

    /** Construct a new media size attribute from the given floating-point
     *  values.
     */
    @stub
    def this(x: Float, y: Float, units: Int) = ???

    /** Construct a new media size attribute from the given floating-point
     *  values.
     */
    @stub
    def this(x: Float, y: Float, units: Int, media: MediaSizeName) = ???

    /** Construct a new media size attribute from the given integer values. */
    @stub
    def this(x: Int, y: Int, units: Int) = ???

    /** Construct a new media size attribute from the given integer values. */
    @stub
    def this(x: Int, y: Int, units: Int, media: MediaSizeName) = ???

    /** Returns whether this media size attribute is equivalent to the passed
     *  in object.
     */
    @stub
    def equals(object: Any): Boolean = ???

    /** Get the printing attribute class which is to be used as the "category"
     *  for this printing attribute value.
     */
    @stub
    def getCategory(): Class[_ <: Attribute] = ???

    /** Get the media name, if any, for this size. */
    @stub
    def getMediaSizeName(): MediaSizeName = ???

    /** Get the name of the category of which this attribute value is an
     *  instance.
     */
    @stub
    def getName(): String = ???
}

object MediaSize {
    /** Class MediaSize.Engineering includes MediaSize values
     *  for engineering media.
     */
    final object Engineering extends Object {

        /** Specifies the engineering A size, 8.5 inch by 11 inch. */
        @stub
        val A: MediaSize = ???

        /** Specifies the engineering B size, 11 inch by 17 inch. */
        @stub
        val B: MediaSize = ???

        /** Specifies the engineering C size, 17 inch by 22 inch. */
        @stub
        val C: MediaSize = ???

        /** Specifies the engineering D size, 22 inch by 34 inch. */
        @stub
        val D: MediaSize = ???

        /** Specifies the engineering E size, 34 inch by 44 inch. */
        @stub
        val E: MediaSize = ???
    }


    /** Class MediaSize.ISO includes MediaSize values for ISO
     *  media.
     *  
     */
    final object ISO extends Object {

        /** Specifies the ISO A0 size, 841 mm by 1189 mm. */
        @stub
        val A0: MediaSize = ???

        /** Specifies the ISO A1 size, 594 mm by 841 mm. */
        @stub
        val A1: MediaSize = ???

        /** Specifies the ISO A10 size, 26 mm by 37 mm. */
        @stub
        val A10: MediaSize = ???

        /** Specifies the ISO A2 size, 420 mm by 594 mm. */
        @stub
        val A2: MediaSize = ???

        /** Specifies the ISO A3 size, 297 mm by 420 mm. */
        @stub
        val A3: MediaSize = ???

        /** Specifies the ISO A4 size, 210 mm by 297 mm. */
        @stub
        val A4: MediaSize = ???

        /** Specifies the ISO A5 size, 148 mm by 210 mm. */
        @stub
        val A5: MediaSize = ???

        /** Specifies the ISO A6 size, 105 mm by 148 mm. */
        @stub
        val A6: MediaSize = ???

        /** Specifies the ISO A7 size, 74 mm by 105 mm. */
        @stub
        val A7: MediaSize = ???

        /** Specifies the ISO A8 size, 52 mm by 74 mm. */
        @stub
        val A8: MediaSize = ???

        /** Specifies the ISO A9 size, 37 mm by 52 mm. */
        @stub
        val A9: MediaSize = ???

        /** Specifies the ISO B0 size, 1000 mm by 1414 mm. */
        @stub
        val B0: MediaSize = ???

        /** Specifies the ISO B1 size, 707 mm by 1000 mm. */
        @stub
        val B1: MediaSize = ???

        /** Specifies the ISO B10 size, 31 mm by 44 mm. */
        @stub
        val B10: MediaSize = ???

        /** Specifies the ISO B2 size, 500 mm by 707 mm. */
        @stub
        val B2: MediaSize = ???

        /** Specifies the ISO B3 size, 353 mm by 500 mm. */
        @stub
        val B3: MediaSize = ???

        /** Specifies the ISO B4 size, 250 mm by 353 mm. */
        @stub
        val B4: MediaSize = ???

        /** Specifies the ISO B5 size, 176 mm by 250 mm. */
        @stub
        val B5: MediaSize = ???

        /** Specifies the ISO B6 size, 125 mm by 176 mm. */
        @stub
        val B6: MediaSize = ???

        /** Specifies the ISO B7 size, 88 mm by 125 mm. */
        @stub
        val B7: MediaSize = ???

        /** Specifies the ISO B8 size, 62 mm by 88 mm. */
        @stub
        val B8: MediaSize = ???

        /** Specifies the ISO B9 size, 44 mm by 62 mm. */
        @stub
        val B9: MediaSize = ???

        /** Specifies the ISO C3 size, 324 mm by 458 mm. */
        @stub
        val C3: MediaSize = ???

        /** Specifies the ISO C4 size, 229 mm by 324 mm. */
        @stub
        val C4: MediaSize = ???

        /** Specifies the ISO C5 size, 162 mm by 229 mm. */
        @stub
        val C5: MediaSize = ???

        /** Specifies the ISO C6 size, 114 mm by 162 mm. */
        @stub
        val C6: MediaSize = ???

        /** Specifies the ISO Designated Long size, 110 mm by 220 mm. */
        @stub
        val DESIGNATED_LONG: MediaSize = ???
    }


    /** Class MediaSize.JIS includes MediaSize values for JIS
     *  (Japanese) media.      *
     */
    final object JIS extends Object {

        /** Specifies the JIS B0 size, 1030 mm by 1456 mm. */
        @stub
        val B0: MediaSize = ???

        /** Specifies the JIS B1 size, 728 mm by 1030 mm. */
        @stub
        val B1: MediaSize = ???

        /** Specifies the JIS B10 size, 32 mm by 45 mm. */
        @stub
        val B10: MediaSize = ???

        /** Specifies the JIS B2 size, 515 mm by 728 mm. */
        @stub
        val B2: MediaSize = ???

        /** Specifies the JIS B3 size, 364 mm by 515 mm. */
        @stub
        val B3: MediaSize = ???

        /** Specifies the JIS B4 size, 257 mm by 364 mm. */
        @stub
        val B4: MediaSize = ???

        /** Specifies the JIS B5 size, 182 mm by 257 mm. */
        @stub
        val B5: MediaSize = ???

        /** Specifies the JIS B6 size, 128 mm by 182 mm. */
        @stub
        val B6: MediaSize = ???

        /** Specifies the JIS B7 size, 91 mm by 128 mm. */
        @stub
        val B7: MediaSize = ???

        /** Specifies the JIS B8 size, 64 mm by 91 mm. */
        @stub
        val B8: MediaSize = ???

        /** Specifies the JIS B9 size, 45 mm by 64 mm. */
        @stub
        val B9: MediaSize = ???

        /** Specifies the JIS Chou ("long") #1 envelope size, 142 mm by 332 mm. */
        @stub
        val CHOU_1: MediaSize = ???

        /** Specifies the JIS Chou ("long") #2 envelope size, 119 mm by 277 mm. */
        @stub
        val CHOU_2: MediaSize = ???

        /** Specifies the JIS Chou ("long") #3 envelope size, 120 mm by 235 mm. */
        @stub
        val CHOU_3: MediaSize = ???

        /** Specifies the JIS Chou ("long") #30 envelope size, 92 mm by 235 mm. */
        @stub
        val CHOU_30: MediaSize = ???

        /** Specifies the JIS Chou ("long") #4 envelope size, 90 mm by 205 mm. */
        @stub
        val CHOU_4: MediaSize = ???

        /** Specifies the JIS Chou ("long") #40 envelope size, 90 mm by 225 mm. */
        @stub
        val CHOU_40: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #0 envelope size, 287 mm by 382 mm. */
        @stub
        val KAKU_0: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #1 envelope size, 270 mm by 382 mm. */
        @stub
        val KAKU_1: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #2 envelope size, 240 mm by 332 mm. */
        @stub
        val KAKU_2: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #20 envelope size, 229 mm by 324 mm. */
        @stub
        val KAKU_20: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #3 envelope size, 216 mm by 277 mm. */
        @stub
        val KAKU_3: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #4 envelope size, 197 mm by 267 mm. */
        @stub
        val KAKU_4: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #5 envelope size, 190 mm by 240 mm. */
        @stub
        val KAKU_5: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #6 envelope size, 162 mm by 229 mm. */
        @stub
        val KAKU_6: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #7 envelope size, 142 mm by 205 mm. */
        @stub
        val KAKU_7: MediaSize = ???

        /** Specifies the JIS Kaku ("square") #8 envelope size, 119 mm by 197 mm. */
        @stub
        val KAKU_8: MediaSize = ???

        /** Specifies the JIS Kaku ("square") A4 envelope size, 228 mm by 312 mm. */
        @stub
        val KAKU_A4: MediaSize = ???

        /** Specifies the JIS You ("Western") #1 envelope size, 120 mm by 176 mm. */
        @stub
        val YOU_1: MediaSize = ???

        /** Specifies the JIS You ("Western") #2 envelope size, 114 mm by 162 mm. */
        @stub
        val YOU_2: MediaSize = ???

        /** Specifies the JIS You ("Western") #3 envelope size, 98 mm by 148 mm. */
        @stub
        val YOU_3: MediaSize = ???

        /** Specifies the JIS You ("Western") #4 envelope size, 105 mm by 235 mm. */
        @stub
        val YOU_4: MediaSize = ???

        /** Specifies the JIS You ("Western") #5 envelope size, 95 mm by 217 mm. */
        @stub
        val YOU_5: MediaSize = ???

        /** Specifies the JIS You ("Western") #6 envelope size, 98 mm by 190 mm. */
        @stub
        val YOU_6: MediaSize = ???

        /** Specifies the JIS You ("Western") #7 envelope size, 92 mm by 165 mm. */
        @stub
        val YOU_7: MediaSize = ???
    }


    /** Class MediaSize.NA includes MediaSize values for North
     *  American media.
     */
    final object NA extends Object {

        /** Specifies the North American legal size, 8.5 inches by 14 inches. */
        @stub
        val LEGAL: MediaSize = ???

        /** Specifies the North American letter size, 8.5 inches by 11 inches. */
        @stub
        val LETTER: MediaSize = ???

        /** Specifies the North American 10 inch by 13 inch envelope size. */
        @stub
        val NA_10x13_ENVELOPE: MediaSize = ???

        /** Specifies the North American 10 inch by 14 inch envelope size. */
        @stub
        val NA_10x14_ENVELOPE: MediaSize = ???

        /** Specifies the North American 10 inch by 15 inch envelope size. */
        @stub
        val NA_10X15_ENVELOPE: MediaSize = ???

        /** Specifies the North American 5 inch by 7 inch paper. */
        @stub
        val NA_5X7: MediaSize = ???

        /** Specifies the North American 6 inch by 9 inch envelope size. */
        @stub
        val NA_6X9_ENVELOPE: MediaSize = ???

        /** Specifies the North American 7 inch by 9 inch envelope size. */
        @stub
        val NA_7X9_ENVELOPE: MediaSize = ???

        /** Specifies the North American 8 inch by 10 inch paper. */
        @stub
        val NA_8X10: MediaSize = ???

        /** Specifies the North American 9 inch by 11 inch envelope size. */
        @stub
        val NA_9x11_ENVELOPE: MediaSize = ???

        /** Specifies the North American 9 inch by 12 inch envelope size. */
        @stub
        val NA_9x12_ENVELOPE: MediaSize = ???

        /** Specifies the North American Number 10 business envelope size,
         *  4.125 inches by 9.5 inches.
         */
        @stub
        val NA_NUMBER_10_ENVELOPE: MediaSize = ???

        /** Specifies the North American Number 11 business envelope size,
         *  4.5 inches by 10.375 inches.
         */
        @stub
        val NA_NUMBER_11_ENVELOPE: MediaSize = ???

        /** Specifies the North American Number 12 business envelope size,
         *  4.75 inches by 11 inches.
         */
        @stub
        val NA_NUMBER_12_ENVELOPE: MediaSize = ???

        /** Specifies the North American Number 14 business envelope size,
         *  5 inches by 11.5 inches.
         */
        @stub
        val NA_NUMBER_14_ENVELOPE: MediaSize = ???

        /** Specifies the North American Number 9 business envelope size,
         *  3.875 inches by 8.875 inches.
         */
        @stub
        val NA_NUMBER_9_ENVELOPE: MediaSize = ???
    }


    /** Class MediaSize.Other includes MediaSize values for
     *  miscellaneous media.
     */
    final object Other extends Object {

        /** Specifies the executive size, 7.25 inches by 10.5 inches. */
        @stub
        val EXECUTIVE: MediaSize = ???

        /** Specifies the folio size, 8.5 inches by 13 inches. */
        @stub
        val FOLIO: MediaSize = ???

        /** Specifies the invoice size, 5.5 inches by 8.5 inches. */
        @stub
        val INVOICE: MediaSize = ???

        /** Specifies the Italy envelope size, 110 mm by 230 mm. */
        @stub
        val ITALY_ENVELOPE: MediaSize = ???

        /** Specifies the Japanese Double postcard size, 148 mm by 200 mm. */
        @stub
        val JAPANESE_DOUBLE_POSTCARD: MediaSize = ???

        /** Specifies the Japanese postcard size, 100 mm by 148 mm. */
        @stub
        val JAPANESE_POSTCARD: MediaSize = ???

        /** Specifies the ledger size, 11 inches by 17 inches. */
        @stub
        val LEDGER: MediaSize = ???

        /** Specifies the Monarch envelope size, 3.87 inch by 7.5 inch. */
        @stub
        val MONARCH_ENVELOPE: MediaSize = ???

        /** Specifies the Personal envelope size, 3.625 inch by 6.5 inch. */
        @stub
        val PERSONAL_ENVELOPE: MediaSize = ???

        /** Specifies the quarto size, 8.5 inches by 10.83 inches. */
        @stub
        val QUARTO: MediaSize = ???

        /** Specifies the tabloid size, 11 inches by 17 inches. */
        @stub
        val TABLOID: MediaSize = ???
    }


    /** The specified dimensions are used to locate a matching MediaSize
     *  instance from amongst all the standard MediaSize instances.
     */
    @stub
    def findMedia(x: Float, y: Float, units: Int): MediaSizeName = ???

    /** Get the MediaSize for the specified named media. */
    @stub
    def getMediaSizeForName(media: MediaSizeName): MediaSize = ???
}
