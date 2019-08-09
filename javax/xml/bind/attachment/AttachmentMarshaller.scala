package javax.xml.bind.attachment

import java.lang.{Object, String}
import javax.activation.DataHandler
import scala.scalanative.annotation.stub

/** Enable JAXB marshalling to optimize storage of binary data.
 * 
 *  This API enables an efficient cooperative creation of optimized
 *  binary data formats between a JAXB marshalling process and a MIME-based package
 *  processor. A JAXB implementation marshals the root body of a MIME-based package,
 *  delegating the creation of referenceable MIME parts to
 *  the MIME-based package processor that implements this abstraction.
 * 
 *  XOP processing is enabled when isXOPPackage() is true.
 *     See addMtomAttachment(DataHandler, String, String) for details.
 *  
 * 
 *  WS-I Attachment Profile 1.0 is supported by
 *  addSwaRefAttachment(DataHandler) being called by the
 *  marshaller for each JAXB property related to
 *  {http://ws-i.org/profiles/basic/1.1/xsd}swaRef.
 */
abstract class AttachmentMarshaller extends Object {

    /**  */
    @stub
    def this() = ???

    /** Consider binary data for optimized binary storage as an attachment. */
    def addMtomAttachment(data: Array[Byte], offset: Int, length: Int, mimeType: String, elementNamespace: String, elementLocalName: String): String

    /** Consider MIME content data for optimized binary storage as an attachment. */
    def addMtomAttachment(data: DataHandler, elementNamespace: String, elementLocalName: String): String

    /** Add MIME data as an attachment and return attachment's content-id, cid. */
    def addSwaRefAttachment(data: DataHandler): String

    /** Read-only property that returns true if JAXB marshaller should enable XOP creation. */
    def isXOPPackage(): Boolean
}
