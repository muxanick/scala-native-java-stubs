package javax.xml.bind.annotation.adapters

import java.lang.{Object, String}

// Built-in XmlAdapter to handle xs:token and its derived types.
//
// 
// This adapter removes leading and trailing whitespaces, then truncate any
// sequnce of tab, CR, LF, and SP by a single whitespace character ' '.
class CollapsedStringAdapter extends XmlAdapter[String, String] {

    @stub
    // No-op.
    def marshal(s: String): String = ???
}

object CollapsedStringAdapter {
    @stub
    // returns true if the specified char is a white space character.
    protected def isWhiteSpace(ch: Char): Boolean = ???
}
