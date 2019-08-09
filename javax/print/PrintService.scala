package javax.print

import java.lang.{Class, Object, String}
import javax.print.attribute.{Attribute, AttributeSet, PrintServiceAttribute, PrintServiceAttributeSet}
import javax.print.event.PrintServiceAttributeListener

// Interface PrintService is the factory for a DocPrintJob. A PrintService
// describes the capabilities of a Printer and can be queried regarding
// a printer's supported attributes.
// 
// Example:
//   
//   DocFlavor flavor = DocFlavor.INPUT_STREAM.POSTSCRIPT;
//   PrintRequestAttributeSet aset = new HashPrintRequestAttributeSet();
//   aset.add(MediaSizeName.ISO_A4);
//   PrintService[] pservices =
//                 PrintServiceLookup.lookupPrintServices(flavor, aset);
//   if (pservices.length > 0) {
//       DocPrintJob pj = pservices[0].createPrintJob();
//       try {
//           FileInputStream fis = new FileInputStream("test.ps");
//           Doc doc = new SimpleDoc(fis, flavor, null);
//           pj.print(doc, aset);
//        } catch (FileNotFoundException fe) {
//        } catch (PrintException e) {
//        }
//   }
//   
trait PrintService {

    @stub
    // Registers a listener for events on this PrintService.
    def addPrintServiceAttributeListener(listener: PrintServiceAttributeListener): Unit = ???

    @stub
    // Creates and returns a PrintJob capable of handling data from
    // any of the supported document flavors.
    def createPrintJob(): DocPrintJob = ???

    @stub
    // Determines if two services are referring to the same underlying
    // service.
    def equals(obj: Object): Boolean = ???

    @stub
    // Gets the value of the single specified service attribute.
    def T: [T <: PrintServiceAttribute] = ???

    @stub
    // Obtains this print service's set of printer description attributes
    // giving this Print Service's status.
    def getAttributes(): PrintServiceAttributeSet = ???

    @stub
    // Determines this print service's default printing attribute value in
    // the given category.
    def getDefaultAttributeValue(category: Class[_ <: Attribute]): Object = ???

    @stub
    // Returns a String name for this print service which may be used
    // by applications to request a particular print service.
    def getName(): String = ???

    @stub
    // Returns a factory for UI components which allow users to interact
    // with the service in various roles.
    def getServiceUIFactory(): ServiceUIFactory = ???

    @stub
    // Determines the printing attribute categories a client can specify
    // when setting up a job for this print service.
    def getSupportedAttributeCategories(): Array[Class[_]] = ???

    @stub
    // Determines the printing attribute values a client can specify in
    // the given category when setting up a job for this print service.
    def getSupportedAttributeValues(category: Class[_ <: Attribute], flavor: DocFlavor, attributes: AttributeSet): Object = ???

    @stub
    // Determines the print data formats a client can specify when setting
    // up a job for this PrintService.
    def getSupportedDocFlavors(): Array[DocFlavor] = ???

    @stub
    // Identifies the attributes that are unsupported for a print request
    // in the context of a particular DocFlavor.
    def getUnsupportedAttributes(flavor: DocFlavor, attributes: AttributeSet): AttributeSet = ???

    @stub
    // This method should be implemented consistently with
    // equals(Object).
    def hashCode(): Int = ???

    @stub
    // Determines whether a client can specify the given printing
    // attribute category when setting up a job for this print service.
    def isAttributeCategorySupported(category: Class[_ <: Attribute]): Boolean = ???

    @stub
    // Determines whether a client can specify the given printing
    // attribute
    // value when setting up a job for this Print Service.
    def isAttributeValueSupported(attrval: Attribute, flavor: DocFlavor, attributes: AttributeSet): Boolean = ???

    @stub
    // Determines if this print service supports a specific
    // DocFlavor.
    def isDocFlavorSupported(flavor: DocFlavor): Boolean = ???
}
