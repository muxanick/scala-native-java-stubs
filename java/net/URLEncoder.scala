package java.net

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Utility class for HTML form encoding. This class contains static methods
 *  for converting a String to the application/x-www-form-urlencoded MIME
 *  format. For more information about HTML form encoding, consult the HTML
 *  specification.
 * 
 *  
 *  When encoding a String, the following rules apply:
 * 
 *  
 *  The alphanumeric characters "a" through
 *      "z", "A" through
 *      "Z" and "0"
 *      through "9" remain the same.
 *  The special characters ".",
 *      "-", "*", and
 *      "_" remain the same.
 *  The space character "   " is
 *      converted into a plus sign "+".
 *  All other characters are unsafe and are first converted into
 *      one or more bytes using some encoding scheme. Then each byte is
 *      represented by the 3-character string
 *      "%xy", where xy is the
 *      two-digit hexadecimal representation of the byte.
 *      The recommended encoding scheme to use is UTF-8. However,
 *      for compatibility reasons, if an encoding is not specified,
 *      then the default encoding of the platform is used.
 *  
 * 
 *  
 *  For example using UTF-8 as the encoding scheme the string "The
 *  string ü@foo-bar" would get converted to
 *  "The+string+%C3%BC%40foo-bar" because in UTF-8 the character
 *  ü is encoded as two bytes C3 (hex) and BC (hex), and the
 *  character @ is encoded as one byte 40 (hex).
 */
class URLEncoder extends Object {
}

object URLEncoder {
    /** Deprecated. 
     * The resulting string may vary depending on the platform's
     *              default encoding. Instead, use the encode(String,String)
     *              method to specify the encoding.
     * 
     */
    @stub
    def encode(s: String): String = ???

    /** Translates a string into application/x-www-form-urlencoded
     *  format using a specific encoding scheme.
     */
    @stub
    def encode(s: String, enc: String): String = ???
}
