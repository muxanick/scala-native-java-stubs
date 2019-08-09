package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** XmlAdapter for xs:hexBinary.
 * 
 *  
 *  This XmlAdapter binds byte[] to the hexBinary representation in XML.
 */
final class HexBinaryAdapter extends XmlAdapter[String, Array[Byte]] {

    /**  */
    @stub
    def this() = ???

    /** Convert a bound type to a value type. */
    @stub
    def marshal(bytes: Array[Byte]): String = ???

    /** Convert a value type to a bound type. */
    @stub
    def unmarshal(s: String): Array[Byte] = ???
}
