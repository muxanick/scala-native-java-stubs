package java.awt

import java.lang.{Cloneable, Object, String}
import scala.scalanative.annotation.stub

/** A set of attributes which control the output of a printed page.
 *  
 *  Instances of this class control the color state, paper size (media type),
 *  orientation, logical origin, print quality, and resolution of every
 *  page which uses the instance. Attribute names are compliant with the
 *  Internet Printing Protocol (IPP) 1.1 where possible. Attribute values
 *  are partially compliant where possible.
 *  
 *  To use a method which takes an inner class type, pass a reference to
 *  one of the constant fields of the inner class. Client code cannot create
 *  new instances of the inner class types because none of those classes
 *  has a public constructor. For example, to set the color state to
 *  monochrome, use the following code:
 *  
 *  import java.awt.PageAttributes;
 * 
 *  public class MonochromeExample {
 *      public void setMonochrome(PageAttributes pageAttributes) {
 *          pageAttributes.setColor(PageAttributes.ColorType.MONOCHROME);
 *      }
 *  }
 *  
 *  
 *  Every IPP attribute which supports an attributeName-default value
 *  has a corresponding setattributeNameToDefault method.
 *  Default value fields are not provided.
 */
final class PageAttributes extends Object with Cloneable {

    /** Constructs a PageAttributes instance with default values for every
     *  attribute.
     */
    @stub
    def this() = ???

    /** Constructs a PageAttributes instance with the specified values for
     *  every attribute.
     */
    @stub
    def this(color: PageAttributes.ColorType, media: PageAttributes.MediaType, orientationRequested: PageAttributes.OrientationRequestedType, origin: PageAttributes.OriginType, printQuality: PageAttributes.PrintQualityType, printerResolution: Array[Int]) = ???

    /** Constructs a PageAttributes instance which is a copy of the supplied
     *  PageAttributes.
     */
    @stub
    def this(obj: PageAttributes) = ???

    /** Creates and returns a copy of this PageAttributes. */
    @stub
    def clone(): Any = ???

    /** Determines whether two PageAttributes are equal to each other. */
    @stub
    def equals(obj: Any): Boolean = ???

    /** Returns whether pages using these attributes will be rendered in
     *  color or monochrome.
     */
    @stub
    def getColor(): PageAttributes.ColorType = ???

    /** Returns the paper size for pages using these attributes. */
    @stub
    def getMedia(): PageAttributes.MediaType = ???

    /** Returns the print orientation for pages using these attributes. */
    @stub
    def getOrientationRequested(): PageAttributes.OrientationRequestedType = ???

    /** Returns whether drawing at (0, 0) to pages using these attributes
     *  draws at the upper-left corner of the physical page, or at the
     *  upper-left corner of the printable area.
     */
    @stub
    def getOrigin(): PageAttributes.OriginType = ???

    /** Returns the print resolution for pages using these attributes. */
    @stub
    def getPrinterResolution(): Array[Int] = ???

    /** Returns the print quality for pages using these attributes. */
    @stub
    def getPrintQuality(): PageAttributes.PrintQualityType = ???

    /** Returns a hash code value for this PageAttributes. */
    @stub
    def hashCode(): Int = ???

    /** Sets all of the attributes of this PageAttributes to the same values as
     *  the attributes of obj.
     */
    @stub
    def set(obj: PageAttributes): Unit = ???

    /** Specifies whether pages using these attributes will be rendered in
     *  color or monochrome.
     */
    @stub
    def setColor(color: PageAttributes.ColorType): Unit = ???

    /** Specifies the desired paper size for pages using these attributes. */
    @stub
    def setMedia(media: PageAttributes.MediaType): Unit = ???

    /** Sets the paper size for pages using these attributes to the default
     *  size for the default locale.
     */
    @stub
    def setMediaToDefault(): Unit = ???

    /** Specifies the print orientation for pages using these attributes. */
    @stub
    def setOrientationRequested(orientationRequested: Int): Unit = ???

    /** Specifies the print orientation for pages using these attributes. */
    @stub
    def setOrientationRequested(orientationRequested: PageAttributes.OrientationRequestedType): Unit = ???

    /** Sets the print orientation for pages using these attributes to the
     *  default.
     */
    @stub
    def setOrientationRequestedToDefault(): Unit = ???

    /** Specifies whether drawing at (0, 0) to pages using these attributes
     *  draws at the upper-left corner of the physical page, or at the
     *  upper-left corner of the printable area.
     */
    @stub
    def setOrigin(origin: PageAttributes.OriginType): Unit = ???

    /** Specifies the desired cross feed and feed print resolutions in dots per
     *  inch for pages using these attributes.
     */
    @stub
    def setPrinterResolution(printerResolution: Int): Unit = ???

    /** Specifies the desired print resolution for pages using these attributes. */
    @stub
    def setPrinterResolution(printerResolution: Array[Int]): Unit = ???

    /** Sets the printer resolution for pages using these attributes to the
     *  default.
     */
    @stub
    def setPrinterResolutionToDefault(): Unit = ???

    /** Specifies the print quality for pages using these attributes. */
    @stub
    def setPrintQuality(printQuality: Int): Unit = ???

    /** Specifies the print quality for pages using these attributes. */
    @stub
    def setPrintQuality(printQuality: PageAttributes.PrintQualityType): Unit = ???

    /** Sets the print quality for pages using these attributes to the default. */
    @stub
    def setPrintQualityToDefault(): Unit = ???

    /** Returns a string representation of this PageAttributes. */
    @stub
    def toString(): String = ???
}

object PageAttributes {
    /** A type-safe enumeration of possible color states. */
    final object ColorType extends Object {

        /** The ColorType instance to use for specifying color printing. */
        @stub
        val COLOR: ColorType = ???

        /** The ColorType instance to use for specifying monochrome printing. */
        @stub
        val MONOCHROME: ColorType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible paper sizes. These sizes are in
     *  compliance with IPP 1.1.
     */
    final object MediaType extends Object {

        /** The MediaType instance for Engineering A, 8 1/2 x 11 in. */
        @stub
        val A: MediaType = ???

        /** An alias for ISO_A0. */
        @stub
        val A0: MediaType = ???

        /** An alias for ISO_A1. */
        @stub
        val A1: MediaType = ???

        /** An alias for ISO_A10. */
        @stub
        val A10: MediaType = ???

        /** An alias for ISO_A2. */
        @stub
        val A2: MediaType = ???

        /** An alias for ISO_A3. */
        @stub
        val A3: MediaType = ???

        /** An alias for ISO_A4. */
        @stub
        val A4: MediaType = ???

        /** An alias for ISO_A5. */
        @stub
        val A5: MediaType = ???

        /** An alias for ISO_A6. */
        @stub
        val A6: MediaType = ???

        /** An alias for ISO_A7. */
        @stub
        val A7: MediaType = ???

        /** An alias for ISO_A8. */
        @stub
        val A8: MediaType = ???

        /** An alias for ISO_A9. */
        @stub
        val A9: MediaType = ???

        /** The MediaType instance for Engineering B, 11 x 17 in. */
        @stub
        val B: MediaType = ???

        /** An alias for ISO_B0. */
        @stub
        val B0: MediaType = ???

        /** An alias for ISO_B1. */
        @stub
        val B1: MediaType = ???

        /** An alias for ISO_B10. */
        @stub
        val B10: MediaType = ???

        /** An alias for ISO_B2. */
        @stub
        val B2: MediaType = ???

        /** An alias for ISO_B3. */
        @stub
        val B3: MediaType = ???

        /** An alias for ISO_B4. */
        @stub
        val B4: MediaType = ???

        /** An alias for ISO_B5. */
        @stub
        val B5: MediaType = ???

        /** An alias for ISO_B6. */
        @stub
        val B6: MediaType = ???

        /** An alias for ISO_B7. */
        @stub
        val B7: MediaType = ???

        /** An alias for ISO_B8. */
        @stub
        val B8: MediaType = ???

        /** An alias for ISO_B9. */
        @stub
        val B9: MediaType = ???

        /** The MediaType instance for Engineering C, 17 x 22 in. */
        @stub
        val C: MediaType = ???

        /** An alias for ISO_C0. */
        @stub
        val C0: MediaType = ???

        /** An alias for ISO_C1. */
        @stub
        val C1: MediaType = ???

        /** An alias for ISO_C10. */
        @stub
        val C10: MediaType = ???

        /** An alias for ISO_C2. */
        @stub
        val C2: MediaType = ???

        /** An alias for ISO_C3. */
        @stub
        val C3: MediaType = ???

        /** An alias for ISO_C4. */
        @stub
        val C4: MediaType = ???

        /** An alias for ISO_C5. */
        @stub
        val C5: MediaType = ???

        /** An alias for ISO_C6. */
        @stub
        val C6: MediaType = ???

        /** An alias for ISO_C7. */
        @stub
        val C7: MediaType = ???

        /** An alias for ISO_C8. */
        @stub
        val C8: MediaType = ???

        /** An alias for ISO_C9. */
        @stub
        val C9: MediaType = ???

        /** The MediaType instance for Engineering D, 22 x 34 in. */
        @stub
        val D: MediaType = ???

        /** The MediaType instance for Engineering E, 34 x 44 in. */
        @stub
        val E: MediaType = ???

        /** An alias for NA_NUMBER_10_ENVELOPE. */
        @stub
        val ENV_10: MediaType = ???

        /** An alias for NA_10X13_ENVELOPE. */
        @stub
        val ENV_10X13: MediaType = ???

        /** An alias for NA_10X14_ENVELOPE. */
        @stub
        val ENV_10X14: MediaType = ???

        /** An alias for NA_10X15_ENVELOPE. */
        @stub
        val ENV_10X15: MediaType = ???

        /** An alias for NA_NUMBER_11_ENVELOPE. */
        @stub
        val ENV_11: MediaType = ???

        /** An alias for NA_NUMBER_12_ENVELOPE. */
        @stub
        val ENV_12: MediaType = ???

        /** An alias for NA_NUMBER_14_ENVELOPE. */
        @stub
        val ENV_14: MediaType = ???

        /** An alias for NA_6X9_ENVELOPE. */
        @stub
        val ENV_6X9: MediaType = ???

        /** An alias for NA_7X9_ENVELOPE. */
        @stub
        val ENV_7X9: MediaType = ???

        /** An alias for NA_NUMBER_9_ENVELOPE. */
        @stub
        val ENV_9: MediaType = ???

        /** An alias for NA_9X11_ENVELOPE. */
        @stub
        val ENV_9X11: MediaType = ???

        /** An alias for NA_9X12_ENVELOPE. */
        @stub
        val ENV_9X12: MediaType = ???

        /** An alias for INVITE_ENVELOPE. */
        @stub
        val ENV_INVITE: MediaType = ???

        /** An alias for ITALY_ENVELOPE. */
        @stub
        val ENV_ITALY: MediaType = ???

        /** An alias for MONARCH_ENVELOPE. */
        @stub
        val ENV_MONARCH: MediaType = ???

        /** An alias for PERSONAL_ENVELOPE. */
        @stub
        val ENV_PERSONAL: MediaType = ???

        /** The MediaType instance for Executive, 7 1/4 x 10 1/2 in. */
        @stub
        val EXECUTIVE: MediaType = ???

        /** The MediaType instance for Folio, 8 1/2 x 13 in. */
        @stub
        val FOLIO: MediaType = ???

        /** An alias for INVITE_ENVELOPE. */
        @stub
        val INVITE: MediaType = ???

        /** The MediaType instance for Invitation Envelope, 220 x 220 mm. */
        @stub
        val INVITE_ENVELOPE: MediaType = ???

        /** The MediaType instance for Invoice, 5 1/2 x 8 1/2 in. */
        @stub
        val INVOICE: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS 2A0, 1189 x 1682 mm. */
        @stub
        val ISO_2A0: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS 4A0, 1682 x 2378 mm. */
        @stub
        val ISO_4A0: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A0, 841 x 1189 mm. */
        @stub
        val ISO_A0: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A1, 594 x 841 mm. */
        @stub
        val ISO_A1: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A10, 26 x 37 mm. */
        @stub
        val ISO_A10: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A2, 420 x 594 mm. */
        @stub
        val ISO_A2: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A3, 297 x 420 mm. */
        @stub
        val ISO_A3: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A4, 210 x 297 mm. */
        @stub
        val ISO_A4: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A5, 148 x 210 mm. */
        @stub
        val ISO_A5: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A6, 105 x 148 mm. */
        @stub
        val ISO_A6: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A7, 74 x 105 mm. */
        @stub
        val ISO_A7: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A8, 52 x 74 mm. */
        @stub
        val ISO_A8: MediaType = ???

        /** The MediaType instance for ISO/DIN and JIS A9, 37 x 52 mm. */
        @stub
        val ISO_A9: MediaType = ???

        /** The MediaType instance for ISO/DIN B0, 1000 x 1414 mm. */
        @stub
        val ISO_B0: MediaType = ???

        /** The MediaType instance for ISO/DIN B1, 707 x 1000 mm. */
        @stub
        val ISO_B1: MediaType = ???

        /** The MediaType instance for ISO/DIN B10, 31 x 44 mm. */
        @stub
        val ISO_B10: MediaType = ???

        /** The MediaType instance for ISO/DIN B2, 500 x 707 mm. */
        @stub
        val ISO_B2: MediaType = ???

        /** The MediaType instance for ISO/DIN B3, 353 x 500 mm. */
        @stub
        val ISO_B3: MediaType = ???

        /** The MediaType instance for ISO/DIN B4, 250 x 353 mm. */
        @stub
        val ISO_B4: MediaType = ???

        /** An alias for ISO_B4. */
        @stub
        val ISO_B4_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN B5, 176 x 250 mm. */
        @stub
        val ISO_B5: MediaType = ???

        /** An alias for ISO_B5. */
        @stub
        val ISO_B5_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN B6, 125 x 176 mm. */
        @stub
        val ISO_B6: MediaType = ???

        /** The MediaType instance for ISO/DIN B7, 88 x 125 mm. */
        @stub
        val ISO_B7: MediaType = ???

        /** The MediaType instance for ISO/DIN B8, 62 x 88 mm. */
        @stub
        val ISO_B8: MediaType = ???

        /** The MediaType instance for ISO/DIN B9, 44 x 62 mm. */
        @stub
        val ISO_B9: MediaType = ???

        /** The MediaType instance for ISO/DIN C0, 917 x 1297 mm. */
        @stub
        val ISO_C0: MediaType = ???

        /** An alias for ISO_C0. */
        @stub
        val ISO_C0_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C1, 648 x 917 mm. */
        @stub
        val ISO_C1: MediaType = ???

        /** An alias for ISO_C1. */
        @stub
        val ISO_C1_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C10, 28 x 40 mm. */
        @stub
        val ISO_C10: MediaType = ???

        /** An alias for ISO_C10. */
        @stub
        val ISO_C10_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C2, 458 x 648 mm. */
        @stub
        val ISO_C2: MediaType = ???

        /** An alias for ISO_C2. */
        @stub
        val ISO_C2_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C3, 324 x 458 mm. */
        @stub
        val ISO_C3: MediaType = ???

        /** An alias for ISO_C3. */
        @stub
        val ISO_C3_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C4, 229 x 324 mm. */
        @stub
        val ISO_C4: MediaType = ???

        /** An alias for ISO_C4. */
        @stub
        val ISO_C4_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C5, 162 x 229 mm. */
        @stub
        val ISO_C5: MediaType = ???

        /** An alias for ISO_C5. */
        @stub
        val ISO_C5_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C6, 114 x 162 mm. */
        @stub
        val ISO_C6: MediaType = ???

        /** An alias for ISO_C6. */
        @stub
        val ISO_C6_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C7, 81 x 114 mm. */
        @stub
        val ISO_C7: MediaType = ???

        /** An alias for ISO_C7. */
        @stub
        val ISO_C7_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C8, 57 x 81 mm. */
        @stub
        val ISO_C8: MediaType = ???

        /** An alias for ISO_C8. */
        @stub
        val ISO_C8_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO/DIN C9, 40 x 57 mm. */
        @stub
        val ISO_C9: MediaType = ???

        /** An alias for ISO_C9. */
        @stub
        val ISO_C9_ENVELOPE: MediaType = ???

        /** The MediaType instance for ISO Designated Long, 110 x 220 mm. */
        @stub
        val ISO_DESIGNATED_LONG: MediaType = ???

        /** An alias for ISO_DESIGNATED_LONG. */
        @stub
        val ISO_DESIGNATED_LONG_ENVELOPE: MediaType = ???

        /** An alias for ITALY_ENVELOPE. */
        @stub
        val ITALY: MediaType = ???

        /** The MediaType instance for Italy Envelope, 110 x 230 mm. */
        @stub
        val ITALY_ENVELOPE: MediaType = ???

        /** The MediaType instance for JIS B0, 1030 x 1456 mm. */
        @stub
        val JIS_B0: MediaType = ???

        /** The MediaType instance for JIS B1, 728 x 1030 mm. */
        @stub
        val JIS_B1: MediaType = ???

        /** The MediaType instance for JIS B10, 32 x 45 mm. */
        @stub
        val JIS_B10: MediaType = ???

        /** The MediaType instance for JIS B2, 515 x 728 mm. */
        @stub
        val JIS_B2: MediaType = ???

        /** The MediaType instance for JIS B3, 364 x 515 mm. */
        @stub
        val JIS_B3: MediaType = ???

        /** The MediaType instance for JIS B4, 257 x 364 mm. */
        @stub
        val JIS_B4: MediaType = ???

        /** The MediaType instance for JIS B5, 182 x 257 mm. */
        @stub
        val JIS_B5: MediaType = ???

        /** The MediaType instance for JIS B6, 128 x 182 mm. */
        @stub
        val JIS_B6: MediaType = ???

        /** The MediaType instance for JIS B7, 91 x 128 mm. */
        @stub
        val JIS_B7: MediaType = ???

        /** The MediaType instance for JIS B8, 64 x 91 mm. */
        @stub
        val JIS_B8: MediaType = ???

        /** The MediaType instance for JIS B9, 45 x 64 mm. */
        @stub
        val JIS_B9: MediaType = ???

        /** The MediaType instance for Ledger, 11 x 17 in. */
        @stub
        val LEDGER: MediaType = ???

        /** An alias for NA_LEGAL. */
        @stub
        val LEGAL: MediaType = ???

        /** An alias for NA_LETTER. */
        @stub
        val LETTER: MediaType = ???

        /** An alias for MONARCH_ENVELOPE. */
        @stub
        val MONARCH: MediaType = ???

        /** The MediaType instance for Monarch Envelope, 3 7/8 x 7 1/2 in. */
        @stub
        val MONARCH_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 10 x 13 in. */
        @stub
        val NA_10X13_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 10 x 14 in. */
        @stub
        val NA_10X14_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 10 x 15 in. */
        @stub
        val NA_10X15_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 6 x 9 in. */
        @stub
        val NA_6X9_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 7 x 9 in. */
        @stub
        val NA_7X9_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 9 x 11 in. */
        @stub
        val NA_9X11_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American 9 x 12 in. */
        @stub
        val NA_9X12_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American Legal, 8 1/2 x 14 in. */
        @stub
        val NA_LEGAL: MediaType = ???

        /** The MediaType instance for North American Letter, 8 1/2 x 11 in. */
        @stub
        val NA_LETTER: MediaType = ???

        /** The MediaType instance for North American #10 Business Envelope,
         *  4 1/8 x 9 1/2 in.
         */
        @stub
        val NA_NUMBER_10_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American #11 Business Envelope,
         *  4 1/2 x 10 3/8 in.
         */
        @stub
        val NA_NUMBER_11_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American #12 Business Envelope,
         *  4 3/4 x 11 in.
         */
        @stub
        val NA_NUMBER_12_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American #14 Business Envelope,
         *  5 x 11 1/2 in.
         */
        @stub
        val NA_NUMBER_14_ENVELOPE: MediaType = ???

        /** The MediaType instance for North American #9 Business Envelope,
         *  3 7/8 x 8 7/8 in.
         */
        @stub
        val NA_NUMBER_9_ENVELOPE: MediaType = ???

        /** An alias for NA_LETTER. */
        @stub
        val NOTE: MediaType = ???

        /** An alias for PERSONAL_ENVELOPE. */
        @stub
        val PERSONAL: MediaType = ???

        /** The MediaType instance for 6 3/4 envelope, 3 5/8 x 6 1/2 in. */
        @stub
        val PERSONAL_ENVELOPE: MediaType = ???

        /** The MediaType instance for Quarto, 215 x 275 mm. */
        @stub
        val QUARTO: MediaType = ???

        /** An alias for INVOICE. */
        @stub
        val STATEMENT: MediaType = ???

        /** An alias for LEDGER. */
        @stub
        val TABLOID: MediaType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible orientations. These orientations
     *  are in partial compliance with IPP 1.1.
     */
    final object OrientationRequestedType extends Object {

        /** The OrientationRequestedType instance to use for specifying a
         *  landscape orientation.
         */
        @stub
        val LANDSCAPE: OrientationRequestedType = ???

        /** The OrientationRequestedType instance to use for specifying a
         *  portrait orientation.
         */
        @stub
        val PORTRAIT: OrientationRequestedType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible origins. */
    final object OriginType extends Object {

        /** The OriginType instance to use for specifying a physical origin. */
        @stub
        val PHYSICAL: OriginType = ???

        /** The OriginType instance to use for specifying a printable origin. */
        @stub
        val PRINTABLE: OriginType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }


    /** A type-safe enumeration of possible print qualities. These print
     *  qualities are in compliance with IPP 1.1.
     */
    final object PrintQualityType extends Object {

        /** The PrintQualityType instance to use for specifying a draft print
         *  quality.
         */
        @stub
        val DRAFT: PrintQualityType = ???

        /** The PrintQualityType instance to use for specifying a high print
         *  quality.
         */
        @stub
        val HIGH: PrintQualityType = ???

        /** The PrintQualityType instance to use for specifying a normal print
         *  quality.
         */
        @stub
        val NORMAL: PrintQualityType = ???

        /** Returns a hash code value for the object. */
        @stub
        def hashCode(): Int = ???

        /** Returns a string representation of the object. */
        @stub
        def toString(): String = ???
    }

}
