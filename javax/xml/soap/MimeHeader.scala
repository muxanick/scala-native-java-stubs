package javax.xml.soap

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** An object that stores a MIME header name and its value. One or more
 *  MimeHeader objects may be contained in a MimeHeaders
 *  object.
 */
class MimeHeader extends Object {

    /** Constructs a MimeHeader object initialized with the given
     *  name and value.
     */
    @stub
    def this(name: String, value: String) = ???

    /** Returns the name of this MimeHeader object. */
    @stub
    def getName(): String = ???

    /** Returns the value of this MimeHeader object. */
    @stub
    def getValue(): String = ???
}
