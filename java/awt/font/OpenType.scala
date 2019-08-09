package java.awt.font

import java.lang.String
import scala.scalanative.annotation.stub

/** The OpenType interface represents OpenType and
 *  TrueType fonts.  This interface makes it possible to obtain
 *  sfnt tables from the font.  A particular
 *  Font object can implement this interface.
 *  
 *  For more information on TrueType and OpenType fonts, see the
 *  OpenType specification.
 *  ( http://www.microsoft.com/typography/otspec/ ).
 */
trait OpenType {

    /** Returns the table as an array of bytes for a specified tag. */
    @stub
    def getFontTable(sfntTag: Int): Array[Byte] = ???

    /** Returns a subset of the table as an array of bytes
     *  for a specified tag.
     */
    @stub
    def getFontTable(sfntTag: Int, offset: Int, count: Int): Array[Byte] = ???

    /** Returns the table as an array of bytes for a specified tag. */
    @stub
    def getFontTable(strSfntTag: String): Array[Byte] = ???

    /** Returns a subset of the table as an array of bytes
     *  for a specified tag.
     */
    @stub
    def getFontTable(strSfntTag: String, offset: Int, count: Int): Array[Byte] = ???

    /** Returns the size of the table for a specified tag. */
    @stub
    def getFontTableSize(sfntTag: Int): Int = ???

    /** Returns the size of the table for a specified tag. */
    @stub
    def getFontTableSize(strSfntTag: String): Int = ???

    /** Returns the version of the OpenType font. */
    @stub
    def getVersion(): Int = ???
}

object OpenType {
    /** Accent attachment. */
    @stub
    val TAG_ACNT: Int = ???

    /** Axis variation. */
    @stub
    val TAG_AVAR: Int = ???

    /** Baseline data. */
    @stub
    val TAG_BASE: Int = ???

    /** Bitmap data. */
    @stub
    val TAG_BDAT: Int = ???

    /** Bitmap location. */
    @stub
    val TAG_BLOC: Int = ???

    /** Baseline table. */
    @stub
    val TAG_BSLN: Int = ???

    /** Compact font format (Type1 font). */
    @stub
    val TAG_CFF: Int = ???

    /** Character to glyph mapping. */
    @stub
    val TAG_CMAP: Int = ???

    /** CVT variation. */
    @stub
    val TAG_CVAR: Int = ???

    /** Control value table. */
    @stub
    val TAG_CVT: Int = ???

    /** Digital signature. */
    @stub
    val TAG_DSIG: Int = ???

    /** Embedded bitmap data. */
    @stub
    val TAG_EBDT: Int = ???

    /** Embedded bitmap location. */
    @stub
    val TAG_EBLC: Int = ???

    /** Embedded bitmap scaling. */
    @stub
    val TAG_EBSC: Int = ???

    /** Font descriptors. */
    @stub
    val TAG_FDSC: Int = ???

    /** Feature name. */
    @stub
    val TAG_FEAT: Int = ???

    /** Font metrics. */
    @stub
    val TAG_FMTX: Int = ???

    /** Font program. */
    @stub
    val TAG_FPGM: Int = ???

    /** Font variation. */
    @stub
    val TAG_FVAR: Int = ???

    /** Grid-fitting and scan conversion procedure. */
    @stub
    val TAG_GASP: Int = ???

    /** Glyph definition. */
    @stub
    val TAG_GDEF: Int = ???

    /** Glyph data. */
    @stub
    val TAG_GLYF: Int = ???

    /** Glyph positioning. */
    @stub
    val TAG_GPOS: Int = ???

    /** Glyph substitution. */
    @stub
    val TAG_GSUB: Int = ???

    /** Glyph variation. */
    @stub
    val TAG_GVAR: Int = ???

    /** Horizontal device metrics. */
    @stub
    val TAG_HDMX: Int = ???

    /** Font header. */
    @stub
    val TAG_HEAD: Int = ???

    /** Horizontal metrics header. */
    @stub
    val TAG_HHEA: Int = ???

    /** Horizontal metrics. */
    @stub
    val TAG_HMTX: Int = ???

    /** Justification. */
    @stub
    val TAG_JSTF: Int = ???

    /** Justification. */
    @stub
    val TAG_JUST: Int = ???

    /** Kerning. */
    @stub
    val TAG_KERN: Int = ???

    /** Ligature caret. */
    @stub
    val TAG_LCAR: Int = ???

    /** Index to location. */
    @stub
    val TAG_LOCA: Int = ???

    /** Linear threshold. */
    @stub
    val TAG_LTSH: Int = ???

    /** Maximum profile. */
    @stub
    val TAG_MAXP: Int = ???

    /** Multiple master font metrics. */
    @stub
    val TAG_MMFX: Int = ???

    /** Multiple master supplementary data. */
    @stub
    val TAG_MMSD: Int = ???

    /** Glyph metamorphosis. */
    @stub
    val TAG_MORT: Int = ???

    /** Naming table. */
    @stub
    val TAG_NAME: Int = ???

    /** Optical bounds. */
    @stub
    val TAG_OPBD: Int = ???

    /** OS/2 and Windows specific metrics. */
    @stub
    val TAG_OS2: Int = ???

    /** PCL 5 data. */
    @stub
    val TAG_PCLT: Int = ???

    /** PostScript Information. */
    @stub
    val TAG_POST: Int = ???

    /** CVT preprogram. */
    @stub
    val TAG_PREP: Int = ???

    /** Glyph properties. */
    @stub
    val TAG_PROP: Int = ???

    /** Tracking. */
    @stub
    val TAG_TRAK: Int = ???

    /** Adobe Type 1 font data. */
    @stub
    val TAG_TYP1: Int = ???

    /** Vertical device metrics. */
    @stub
    val TAG_VDMX: Int = ???

    /** Vertical metrics header. */
    @stub
    val TAG_VHEA: Int = ???

    /** Vertical metrics. */
    @stub
    val TAG_VMTX: Int = ???
}
