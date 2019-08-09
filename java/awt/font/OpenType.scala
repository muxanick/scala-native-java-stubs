package java.awt.font

import java.lang.String

// The OpenType interface represents OpenType and
// TrueType fonts.  This interface makes it possible to obtain
// sfnt tables from the font.  A particular
// Font object can implement this interface.
// 
// For more information on TrueType and OpenType fonts, see the
// OpenType specification.
// ( http://www.microsoft.com/typography/otspec/ ).
trait OpenType {

    @stub
    // Returns the table as an array of bytes for a specified tag.
    def getFontTable(sfntTag: Int): Array[Byte] = ???

    @stub
    // Returns a subset of the table as an array of bytes
    // for a specified tag.
    def getFontTable(sfntTag: Int, offset: Int, count: Int): Array[Byte] = ???

    @stub
    // Returns the table as an array of bytes for a specified tag.
    def getFontTable(strSfntTag: String): Array[Byte] = ???

    @stub
    // Returns a subset of the table as an array of bytes
    // for a specified tag.
    def getFontTable(strSfntTag: String, offset: Int, count: Int): Array[Byte] = ???

    @stub
    // Returns the size of the table for a specified tag.
    def getFontTableSize(sfntTag: Int): Int = ???

    @stub
    // Returns the size of the table for a specified tag.
    def getFontTableSize(strSfntTag: String): Int = ???
}

object OpenType {
    @stub
    // Accent attachment.
    def TAG_ACNT: Int = ???

    @stub
    // Axis variation.
    def TAG_AVAR: Int = ???

    @stub
    // Baseline data.
    def TAG_BASE: Int = ???

    @stub
    // Bitmap data.
    def TAG_BDAT: Int = ???

    @stub
    // Bitmap location.
    def TAG_BLOC: Int = ???

    @stub
    // Baseline table.
    def TAG_BSLN: Int = ???

    @stub
    // Compact font format (Type1 font).
    def TAG_CFF: Int = ???

    @stub
    // Character to glyph mapping.
    def TAG_CMAP: Int = ???

    @stub
    // CVT variation.
    def TAG_CVAR: Int = ???

    @stub
    // Control value table.
    def TAG_CVT: Int = ???

    @stub
    // Digital signature.
    def TAG_DSIG: Int = ???

    @stub
    // Embedded bitmap data.
    def TAG_EBDT: Int = ???

    @stub
    // Embedded bitmap location.
    def TAG_EBLC: Int = ???

    @stub
    // Embedded bitmap scaling.
    def TAG_EBSC: Int = ???

    @stub
    // Font descriptors.
    def TAG_FDSC: Int = ???

    @stub
    // Feature name.
    def TAG_FEAT: Int = ???

    @stub
    // Font metrics.
    def TAG_FMTX: Int = ???

    @stub
    // Font program.
    def TAG_FPGM: Int = ???

    @stub
    // Font variation.
    def TAG_FVAR: Int = ???

    @stub
    // Grid-fitting and scan conversion procedure.
    def TAG_GASP: Int = ???

    @stub
    // Glyph definition.
    def TAG_GDEF: Int = ???

    @stub
    // Glyph data.
    def TAG_GLYF: Int = ???

    @stub
    // Glyph positioning.
    def TAG_GPOS: Int = ???

    @stub
    // Glyph substitution.
    def TAG_GSUB: Int = ???

    @stub
    // Glyph variation.
    def TAG_GVAR: Int = ???

    @stub
    // Horizontal device metrics.
    def TAG_HDMX: Int = ???

    @stub
    // Font header.
    def TAG_HEAD: Int = ???

    @stub
    // Horizontal metrics header.
    def TAG_HHEA: Int = ???

    @stub
    // Horizontal metrics.
    def TAG_HMTX: Int = ???

    @stub
    // Justification.
    def TAG_JSTF: Int = ???

    @stub
    // Justification.
    def TAG_JUST: Int = ???

    @stub
    // Kerning.
    def TAG_KERN: Int = ???

    @stub
    // Ligature caret.
    def TAG_LCAR: Int = ???

    @stub
    // Index to location.
    def TAG_LOCA: Int = ???

    @stub
    // Linear threshold.
    def TAG_LTSH: Int = ???

    @stub
    // Maximum profile.
    def TAG_MAXP: Int = ???

    @stub
    // Multiple master font metrics.
    def TAG_MMFX: Int = ???

    @stub
    // Multiple master supplementary data.
    def TAG_MMSD: Int = ???

    @stub
    // Glyph metamorphosis.
    def TAG_MORT: Int = ???

    @stub
    // Naming table.
    def TAG_NAME: Int = ???

    @stub
    // Optical bounds.
    def TAG_OPBD: Int = ???

    @stub
    // OS/2 and Windows specific metrics.
    def TAG_OS2: Int = ???

    @stub
    // PCL 5 data.
    def TAG_PCLT: Int = ???

    @stub
    // PostScript Information.
    def TAG_POST: Int = ???

    @stub
    // CVT preprogram.
    def TAG_PREP: Int = ???

    @stub
    // Glyph properties.
    def TAG_PROP: Int = ???

    @stub
    // Tracking.
    def TAG_TRAK: Int = ???

    @stub
    // Adobe Type 1 font data.
    def TAG_TYP1: Int = ???

    @stub
    // Vertical device metrics.
    def TAG_VDMX: Int = ???

    @stub
    // Vertical metrics header.
    def TAG_VHEA: Int = ???
}
