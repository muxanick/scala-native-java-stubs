package javax.print

import java.lang.Object

// Class DocFlavor.READER provides predefined static constant DocFlavor
// objects for example doc flavors using a character stream (java.io.Reader) as the print data
// representation class. As such, the character set is Unicode.
// 
object DocFlavor.READER extends DocFlavor {

    @stub
    // Doc flavor with MIME type = "text/html;
    // charset=utf-16", print data representation class name =
    // "java.io.Reader" (character stream).
    def TEXT_HTML: DocFlavor.READER = ???
}
