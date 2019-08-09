package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}

// XmlAdapter to handle xs:normalizedString.
//
// 
// Replaces any tab, CR, and LF by a whitespace character ' ',
// as specified in the whitespace facet 'replace'
final class NormalizedStringAdapter extends XmlAdapter[String, String] {

    @stub
    // No-op.
    def marshal(s: String): String = ???
}

object NormalizedStringAdapter {
    @stub
    // Returns true if the specified char is a white space character
    // but not 0x20.
    protected def isWhiteSpaceExceptSpace(ch: Char): Boolean = ???
}