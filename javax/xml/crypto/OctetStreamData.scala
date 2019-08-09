package javax.xml.crypto

import java.io.InputStream
import java.lang.{Object, String}

/** A representation of a Data type containing an octet stream. */
class OctetStreamData extends Object with Data {

    /** Creates a new OctetStreamData. */
    @stub
    def this(octetStream: InputStream) = ???

    /** Returns the MIME type associated with the data object represented by this
     *  OctetStreamData.
     */
    @stub
    def getMimeType(): String = ???

    /** Returns the input stream of this OctetStreamData. */
    @stub
    def getOctetStream(): InputStream = ???
}
