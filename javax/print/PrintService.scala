package javax.print

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, AttributeSet, PrintServiceAttribute, PrintServiceAttributeSet}
import javax.print.event.PrintServiceAttributeListener

/** Interface PrintService is the factory for a DocPrintJob. A PrintService
 *  describes the capabilities of a Printer and can be queried regarding
 *  a printer's supported attributes.
 *  
 *  Example:
 *    
 *    DocFlavor flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
 *    PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
 *    aset.add(MediaSizeName.ISO_A4);
 *    PrintService[] pservices =
 *                  PrintServiceLookup.lookupPrintServices(flavor, aset);
 *    if (pservices.length > 0) {
 *        DocPrintJob pj = pservices[0].createPrintJob();
 *        try {
 *            FileInputStream fis = new FileInputStream("test.ps");
 *            Doc doc = new SimpleDoc(fis, flavor, null);
 *            pj.print(doc, aset);
 *         } catch (FileNotFoundException fe) {
 *         } catch (PrintException e) {
 *         }
 *    }
 *    
 */
trait PrintService {

    /** Registers a listener for events on this PrintService. */
    @stub
    def addPrintServiceAttributeListener(listener: PrintServiceAttributeListener): Unit = ???

    /** Creates and returns a PrintJob capable of handling data from
     *  any of the supported document flavors.
     */
    @stub
    def createPrintJob(): DocPrintJob = ???

    /** Determines if two services are referring to the same underlying
     *  service.
     */
    @stub
    def equals(obj: Object): Boolean = ???

    /** Gets the value of the single specified service attribute. */
    @stub
    def getAttribute[T <: PrintServiceAttribute](category: Class[T]): T = ???

    /** Obtains this print service's set of printer description attributes
     *  giving this Print Service's status.
     */
    @stub
    def getAttributes(): PrintServiceAttributeSet = ???

    /** Determines this print service's default printing attribute value in
     *  the given category.
     */
    @stub
    def getDefaultAttributeValue(category: Class[_ <: Attribute]): Object = ???

    /** Returns a String name for this print service which may be used
     *  by applications to request a particular print service.
     */
    @stub
    def getName(): String = ???

    /** Returns a factory for UI components which allow users to interact
     *  with the service in various roles.
     */
    @stub
    def getServiceUIFactory(): ServiceUIFactory = ???

    /** Determines the printing attribute categories a client can specify
     *  when setting up a job for this print service.
     */
    @stub
    def getSupportedAttributeCategories(): Array[Class[_]] = ???

    /** Determines the printing attribute values a client can specify in
     *  the given category when setting up a job for this print service.
     */
    @stub
    def getSupportedAttributeValues(category: Class[_ <: Attribute], flavor: DocFlavor, attributes: AttributeSet): Object = ???

    /** Determines the print data formats a client can specify when setting
     *  up a job for this PrintService.
     */
    @stub
    def getSupportedDocFlavors(): Array[DocFlavor] = ???

    /** Identifies the attributes that are unsupported for a print request
     *  in the context of a particular DocFlavor.
     */
    @stub
    def getUnsupportedAttributes(flavor: DocFlavor, attributes: AttributeSet): AttributeSet = ???

    /** This method should be implemented consistently with
     *  equals(Object).
     */
    @stub
    def hashCode(): Int = ???

    /** Determines whether a client can specify the given printing
     *  attribute category when setting up a job for this print service.
     */
    @stub
    def isAttributeCategorySupported(category: Class[_ <: Attribute]): Boolean = ???

    /** Determines whether a client can specify the given printing
     *  attribute
     *  value when setting up a job for this Print Service.
     */
    @stub
    def isAttributeValueSupported(attrval: Attribute, flavor: DocFlavor, attributes: AttributeSet): Boolean = ???

    /** Determines if this print service supports a specific
     *  DocFlavor.
     */
    @stub
    def isDocFlavorSupported(flavor: DocFlavor): Boolean = ???
}
