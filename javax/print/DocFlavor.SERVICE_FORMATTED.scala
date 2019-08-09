package javax.print

import java.lang.Object

// Class DocFlavor.SERVICE_FORMATTED provides predefined static constant
// DocFlavor objects for example doc flavors for service formatted print
// data.
// 
object DocFlavor.SERVICE_FORMATTED extends DocFlavor {

    @stub
    // Service formatted print data doc flavor with print data
    // representation class name = "java.awt.print.Pageable"
    // (pageable object).
    def PAGEABLE: DocFlavor.SERVICE_FORMATTED = ???

    @stub
    // Service formatted print data doc flavor with print data
    // representation class name = "java.awt.print.Printable"
    // (printable object).
    def PRINTABLE: DocFlavor.SERVICE_FORMATTED = ???
}
