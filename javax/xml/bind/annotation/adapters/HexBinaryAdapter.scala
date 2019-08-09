package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}

// XmlAdapter for xs:hexBinary.
//
// 
// This XmlAdapter binds byte[] to the hexBinary representation in XML.
final class HexBinaryAdapter extends XmlAdapter[String, Array[Byte]] {

    @stub
    // Convert a bound type to a value type.
    def marshal(bytes: Array[Byte]): String = ???
}
