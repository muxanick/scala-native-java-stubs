package javax.xml.crypto

import java.io.InputStream
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** A representation of a Data type containing an octet stream. */
class OctetStreamData extends Object with Data {

    /** Creates a new OctetStreamData. */
    @stub
    def this(octetStream: InputStream) = ???

    /** Creates a new OctetStreamData. */
    @stub
    def this(octetStream: InputStream, uri: String, mimeType: String) = ???

    /** Returns the MIME type associated with the data object represented by this
     *  OctetStreamData.
     */
    @stub
    def getMimeType(): String = ???

    /** Returns the input stream of this OctetStreamData. */
    @stub
    def getOctetStream(): InputStream = ???

    /** Returns the URI String identifying the data object represented by this
     *  OctetStreamData.
     */
    @stub
    def getURI(): String = ???
}
