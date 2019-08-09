package java.nio.charset

import java.lang.{Comparable, Object, String}
import java.nio.{ByteBuffer, CharBuffer}
import java.util.{Locale, Set, SortedMap}
import scala.scalanative.annotation.stub

/** A named mapping between sequences of sixteen-bit Unicode code units and sequences of
 *  bytes.  This class defines methods for creating decoders and encoders and
 *  for retrieving the various names associated with a charset.  Instances of
 *  this class are immutable.
 * 
 *   This class also defines static methods for testing whether a particular
 *  charset is supported, for locating charset instances by name, and for
 *  constructing a map that contains every charset for which support is
 *  available in the current Java virtual machine.  Support for new charsets can
 *  be added via the service-provider interface defined in the CharsetProvider class.
 * 
 *   All of the methods defined in this class are safe for use by multiple
 *  concurrent threads.
 * 
 * 
 *  
 *  Charset names
 * 
 *   Charsets are named by strings composed of the following characters:
 * 
 *  
 * 
 *     The uppercase letters 'A' through 'Z'
 *         ('\u0041' through '\u005a'),
 * 
 *     The lowercase letters 'a' through 'z'
 *         ('\u0061' through '\u007a'),
 * 
 *     The digits '0' through '9'
 *         ('\u0030' through '\u0039'),
 * 
 *     The dash character '-'
 *         ('\u002d', HYPHEN-MINUS),
 * 
 *     The plus character '+'
 *         ('\u002b', PLUS SIGN),
 * 
 *     The period character '.'
 *         ('\u002e', FULL STOP),
 * 
 *     The colon character ':'
 *         ('\u003a', COLON), and
 * 
 *     The underscore character '_'
 *         ('\u005f', LOW LINE).
 * 
 *  
 * 
 *  A charset name must begin with either a letter or a digit.  The empty string
 *  is not a legal charset name.  Charset names are not case-sensitive; that is,
 *  case is always ignored when comparing charset names.  Charset names
 *  generally follow the conventions documented in RFC 2278: IANA Charset
 *  Registration Procedures.
 * 
 *   Every charset has a canonical name and may also have one or more
 *  aliases.  The canonical name is returned by the name method
 *  of this class.  Canonical names are, by convention, usually in upper case.
 *  The aliases of a charset are returned by the aliases
 *  method.
 * 
 *  Some charsets have an historical name that is defined for
 *  compatibility with previous versions of the Java platform.  A charset's
 *  historical name is either its canonical name or one of its aliases.  The
 *  historical name is returned by the getEncoding() methods of the
 *  InputStreamReader and OutputStreamWriter classes.
 * 
 *   If a charset listed in the IANA Charset
 *  Registry is supported by an implementation of the Java platform then
 *  its canonical name must be the name listed in the registry. Many charsets
 *  are given more than one name in the registry, in which case the registry
 *  identifies one of the names as MIME-preferred.  If a charset has more
 *  than one registry name then its canonical name must be the MIME-preferred
 *  name and the other names in the registry must be valid aliases.  If a
 *  supported charset is not listed in the IANA registry then its canonical name
 *  must begin with one of the strings "X-" or "x-".
 * 
 *   The IANA charset registry does change over time, and so the canonical
 *  name and the aliases of a particular charset may also change over time.  To
 *  ensure compatibility it is recommended that no alias ever be removed from a
 *  charset, and that if the canonical name of a charset is changed then its
 *  previous canonical name be made into an alias.
 * 
 * 
 *  Standard charsets
 * 
 * 
 * 
 *  Every implementation of the Java platform is required to support the
 *  following standard charsets.  Consult the release documentation for your
 *  implementation to see if any other charsets are supported.  The behavior
 *  of such optional charsets may differ between implementations.
 * 
 *  
 *  CharsetDescription
 *  US-ASCII
 *      Seven-bit ASCII, a.k.a. ISO646-US,
 *          a.k.a. the Basic Latin block of the Unicode character set
 *  ISO-8859-1  
 *      ISO Latin Alphabet No. 1, a.k.a. ISO-LATIN-1
 *  UTF-8
 *      Eight-bit UCS Transformation Format
 *  UTF-16BE
 *      Sixteen-bit UCS Transformation Format,
 *          big-endian byte order
 *  UTF-16LE
 *      Sixteen-bit UCS Transformation Format,
 *          little-endian byte order
 *  UTF-16
 *      Sixteen-bit UCS Transformation Format,
 *          byte order identified by an optional byte-order mark
 *  
 * 
 *   The UTF-8 charset is specified by RFC 2279; the
 *  transformation format upon which it is based is specified in
 *  Amendment 2 of ISO 10646-1 and is also described in the Unicode
 *  Standard.
 * 
 *   The UTF-16 charsets are specified by RFC 2781; the
 *  transformation formats upon which they are based are specified in
 *  Amendment 1 of ISO 10646-1 and are also described in the Unicode
 *  Standard.
 * 
 *   The UTF-16 charsets use sixteen-bit quantities and are
 *  therefore sensitive to byte order.  In these encodings the byte order of a
 *  stream may be indicated by an initial byte-order mark represented by
 *  the Unicode character '\uFEFF'.  Byte-order marks are handled
 *  as follows:
 * 
 *  
 * 
 *     When decoding, the UTF-16BE and UTF-16LE
 *    charsets interpret the initial byte-order marks as a ZERO-WIDTH
 *    NON-BREAKING SPACE; when encoding, they do not write
 *    byte-order marks. 
 * 
 * 
 *     When decoding, the UTF-16 charset interprets the
 *    byte-order mark at the beginning of the input stream to indicate the
 *    byte-order of the stream but defaults to big-endian if there is no
 *    byte-order mark; when encoding, it uses big-endian byte order and writes
 *    a big-endian byte-order mark. 
 * 
 *  
 * 
 *  In any case, byte order marks occurring after the first element of an
 *  input sequence are not omitted since the same code is used to represent
 *  ZERO-WIDTH NON-BREAKING SPACE.
 * 
 *   Every instance of the Java virtual machine has a default charset, which
 *  may or may not be one of the standard charsets.  The default charset is
 *  determined during virtual-machine startup and typically depends upon the
 *  locale and charset being used by the underlying operating system. 
 * 
 *  The StandardCharsets class defines constants for each of the
 *  standard charsets.
 * 
 *  Terminology
 * 
 *   The name of this class is taken from the terms used in
 *  RFC 2278.
 *  In that document a charset is defined as the combination of
 *  one or more coded character sets and a character-encoding scheme.
 *  (This definition is confusing; some other software systems define
 *  charset as a synonym for coded character set.)
 * 
 *   A coded character set is a mapping between a set of abstract
 *  characters and a set of integers.  US-ASCII, ISO 8859-1,
 *  JIS X 0201, and Unicode are examples of coded character sets.
 * 
 *   Some standards have defined a character set to be simply a
 *  set of abstract characters without an associated assigned numbering.
 *  An alphabet is an example of such a character set.  However, the subtle
 *  distinction between character set and coded character set
 *  is rarely used in practice; the former has become a short form for the
 *  latter, including in the Java API specification.
 * 
 *   A character-encoding scheme is a mapping between one or more
 *  coded character sets and a set of octet (eight-bit byte) sequences.
 *  UTF-8, UTF-16, ISO 2022, and EUC are examples of
 *  character-encoding schemes.  Encoding schemes are often associated with
 *  a particular coded character set; UTF-8, for example, is used only to
 *  encode Unicode.  Some schemes, however, are associated with multiple
 *  coded character sets; EUC, for example, can be used to encode
 *  characters in a variety of Asian coded character sets.
 * 
 *   When a coded character set is used exclusively with a single
 *  character-encoding scheme then the corresponding charset is usually
 *  named for the coded character set; otherwise a charset is usually named
 *  for the encoding scheme and, possibly, the locale of the coded
 *  character sets that it supports.  Hence US-ASCII is both the
 *  name of a coded character set and of the charset that encodes it, while
 *  EUC-JP is the name of the charset that encodes the
 *  JIS X 0201, JIS X 0208, and JIS X 0212
 *  coded character sets for the Japanese language.
 * 
 *   The native character encoding of the Java programming language is
 *  UTF-16.  A charset in the Java platform therefore defines a mapping
 *  between sequences of sixteen-bit UTF-16 code units (that is, sequences
 *  of chars) and sequences of bytes. 
 */
abstract class Charset extends Object with Comparable[Charset] {

    /** Initializes a new charset with the given canonical name and alias
     *  set.
     */
    @stub
    protected def this(canonicalName: String, aliases: Array[String]) = ???

    /** Returns a set containing this charset's aliases. */
    def aliases(): Set[String]

    /** Tells whether or not this charset supports encoding. */
    def canEncode(): Boolean

    /** Compares this charset to another. */
    def compareTo(that: Charset): Int

    /** Tells whether or not this charset contains the given charset. */
    def contains(cs: Charset): Boolean

    /** Convenience method that decodes bytes in this charset into Unicode
     *  characters.
     */
    def decode(bb: ByteBuffer): CharBuffer

    /** Returns this charset's human-readable name for the default locale. */
    def displayName(): String

    /** Returns this charset's human-readable name for the given locale. */
    def displayName(locale: Locale): String

    /** Convenience method that encodes Unicode characters into bytes in this
     *  charset.
     */
    def encode(cb: CharBuffer): ByteBuffer

    /** Convenience method that encodes a string into bytes in this charset. */
    def encode(str: String): ByteBuffer

    /** Tells whether or not this object is equal to another. */
    def equals(ob: Object): Boolean

    /** Computes a hashcode for this charset. */
    def hashCode(): Int

    /** Tells whether or not this charset is registered in the IANA Charset
     *  Registry.
     */
    def isRegistered(): Boolean

    /** Returns this charset's canonical name. */
    def name(): String

    /** Constructs a new decoder for this charset. */
    def newDecoder(): CharsetDecoder

    /** Constructs a new encoder for this charset. */
    def newEncoder(): CharsetEncoder

    /** Returns a string describing this charset. */
    def toString(): String
}

object Charset {
    /** Constructs a sorted map from canonical charset names to charset objects. */
    @stub
    def availableCharsets(): SortedMap[String, Charset] = ???

    /** Returns the default charset of this Java virtual machine. */
    @stub
    def defaultCharset(): Charset = ???

    /** Returns a charset object for the named charset. */
    @stub
    def forName(charsetName: String): Charset = ???

    /** Tells whether the named charset is supported. */
    @stub
    def isSupported(charsetName: String): Boolean = ???
}
