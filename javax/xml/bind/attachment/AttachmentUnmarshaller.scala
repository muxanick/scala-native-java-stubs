package javax.xml.bind.attachment

import java.lang.{Object, String}
import javax.activation.DataHandler

/** Enables JAXB unmarshalling of a root document containing optimized binary data formats.
 * 
 *  This API enables an efficient cooperative processing of optimized
 *  binary data formats between a JAXB 2.0 implementation and MIME-based package
 *  processor (MTOM/XOP and WS-I AP 1.0). JAXB unmarshals the body of a package, delegating the
 *  understanding of the packaging format being used to a MIME-based
 *  package processor that implements this abstract class.
 * 
 *  This abstract class identifies if a package requires XOP processing, isXOPPackage() and provides retrieval of binary content stored as attachments by content-id.
 * 
 *  Identifying the content-id, cid, to pass to getAttachment*(String cid)
 *  
 *  
 *  For XOP processing, the infoset representation of the cid is described
 *  in step 2a in
 *  Section 3.2 Interpreting XOP Packages
 *  
 *  
 *  For WS-I AP 1.0, the cid is identified as an element or attribute of
 *  type ref:swaRef  specified in
 *  Section 4.4 Referencing Attachments from the SOAP Envelope
 *  
 *  
 */
abstract class AttachmentUnmarshaller extends Object {

    /** Retrieve the attachment identified by content-id, cid,  as a byte[] */
    def getAttachmentAsByteArray(cid: String): Array[Byte]

    /** Lookup MIME content by content-id, cid, and return as a DataHandler. */
    def getAttachmentAsDataHandler(cid: String): DataHandler
}
