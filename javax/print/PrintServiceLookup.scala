package javax.print

import java.lang.Object
import javax.print.attribute.AttributeSet
import scala.scalanative.annotation.stub

/** Implementations of this class provide lookup services for
 *  print services (typically equivalent to printers) of a particular type.
 *  
 *  Multiple implementations may be installed concurrently.
 *  All implementations must be able to describe the located printers
 *  as instances of a PrintService.
 *  Typically implementations of this service class are located
 *  automatically in JAR files (see the SPI JAR file specification).
 *  These classes must be instantiable using a default constructor.
 *  Alternatively applications may explicitly register instances
 *  at runtime.
 *  
 *  Applications use only the static methods of this abstract class.
 *  The instance methods are implemented by a service provider in a subclass
 *  and the unification of the results from all installed lookup classes
 *  are reported by the static methods of this class when called by
 *  the application.
 *  
 *  A PrintServiceLookup implementor is recommended to check for the
 *  SecurityManager.checkPrintJobAccess() to deny access to untrusted code.
 *  Following this recommended policy means that untrusted code may not
 *  be able to locate any print services. Downloaded applets are the most
 *  common example of untrusted code.
 *  
 *  This check is made on a per lookup service basis to allow flexibility in
 *  the policy to reflect the needs of different lookup services.
 *  
 *  Services which are registered by registerService(PrintService)
 *  will not be included in lookup results if a security manager is
 *  installed and its checkPrintJobAccess() method denies access.
 */
abstract class PrintServiceLookup extends Object {

    /**  */
    @stub
    def this() = ???

    /** Not called directly by applications. */
    def getDefaultPrintService(): PrintService

    /** Not called directly by applications. */
    def getMultiDocPrintServices(flavors: Array[DocFlavor], attributes: AttributeSet): Array[MultiDocPrintService]

    /** Not called directly by applications. */
    def getPrintServices(): Array[PrintService]

    /** Locates services that can be positively confirmed to support
     *  the combination of attributes and DocFlavors specified.
     */
    def getPrintServices(flavor: DocFlavor, attributes: AttributeSet): Array[PrintService]
}

object PrintServiceLookup {
    /** Locates the default print service for this environment. */
    @stub
    def lookupDefaultPrintService(): PrintService = ???

    /** Locates MultiDoc print Services capable of printing MultiDocs
     *  containing all the specified doc flavors.
     */
    @stub
    def lookupMultiDocPrintServices(flavors: Array[DocFlavor], attributes: AttributeSet): Array[MultiDocPrintService] = ???

    /** Locates print services capable of printing the specified
     *  DocFlavor.
     */
    @stub
    def lookupPrintServices(flavor: DocFlavor, attributes: AttributeSet): Array[PrintService] = ???

    /** Allows an application to directly register an instance of a
     *  class which implements a print service.
     */
    @stub
    def registerService(service: PrintService): Boolean = ???

    /** Allows an application to explicitly register a class that
     *  implements lookup services.
     */
    @stub
    def registerServiceProvider(sp: PrintServiceLookup): Boolean = ???
}
