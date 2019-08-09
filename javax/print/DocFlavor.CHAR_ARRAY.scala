package javax.print

import java.lang.Object

// Class DocFlavor.CHAR_ARRAY provides predefined static constant
// DocFlavor objects for example doc flavors using a character array
// (char[]) as the print data representation class. As such,
// the character set is Unicode.
// 
object DocFlavor.CHAR_ARRAY extends DocFlavor {

    @stub
    // Doc flavor with MIME type = "text/html;
    // charset=utf-16", print data representation class name =
    // "[C" (character array).
    def TEXT_HTML: DocFlavor.CHAR_ARRAY = ???
}
