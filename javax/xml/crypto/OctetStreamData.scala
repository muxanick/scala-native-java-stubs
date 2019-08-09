package javax.xml.crypto

import java.io.InputStream
import java.lang.{Object, String}

// A representation of a Data type containing an octet stream.
class OctetStreamData extends Object with Data {

    @stub
    // Creates a new OctetStreamData.
    def this(octetStream: InputStream) = ???

    @stub
    // Returns the MIME type associated with the data object represented by this
    // OctetStreamData.
    def getMimeType(): String = ???

    @stub
    // Returns the input stream of this OctetStreamData.
    def getOctetStream(): InputStream = ???
}
