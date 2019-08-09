package javax.print

import java.lang.Object

// Class DocFlavor.INPUT_STREAM provides predefined static constant
// DocFlavor objects for example doc flavors using a byte stream (java.io.InputStream) as the print
// data representation class.
// 
object DocFlavor.INPUT_STREAM extends DocFlavor {

    @stub
    // Doc flavor with MIME type =
    // "application/octet-stream",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def AUTOSENSE: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "image/gif", print data
    // representation class name =
    // "java.io.InputStream" (byte stream).
    def GIF: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "image/jpeg", print data
    // representation class name =
    // "java.io.InputStream" (byte stream).
    def JPEG: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "application/vnd.hp-PCL",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def PCL: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "application/pdf", print
    // data representation class name = "java.io.InputStream"
    // (byte stream).
    def PDF: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "image/png", print data
    // representation class name =
    // "java.io.InputStream" (byte stream).
    def PNG: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "application/postscript",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def POSTSCRIPT: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "text/html",
    // encoded in the host platform encoding.
    def TEXT_HTML_HOST: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/html; charset=us-ascii",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_HTML_US_ASCII: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/html; charset=utf-16",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_HTML_UTF_16: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/html; charset=utf-16be"
    // (big-endian byte ordering),
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_HTML_UTF_16BE: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/html; charset=utf-16le"
    // (little-endian byte ordering),
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_HTML_UTF_16LE: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/html; charset=utf-8",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_HTML_UTF_8: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type = "text/plain",
    // encoded in the host platform encoding.
    def TEXT_PLAIN_HOST: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/plain; charset=us-ascii",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_PLAIN_US_ASCII: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/plain; charset=utf-16",
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_PLAIN_UTF_16: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/plain; charset=utf-16be"
    // (big-endian byte ordering),
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_PLAIN_UTF_16BE: DocFlavor.INPUT_STREAM = ???

    @stub
    // Doc flavor with MIME type =
    // "text/plain; charset=utf-16le"
    // (little-endian byte ordering),
    // print data representation class name =
    // "java.io.InputStream" (byte stream).
    def TEXT_PLAIN_UTF_16LE: DocFlavor.INPUT_STREAM = ???
}
