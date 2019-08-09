package javax.xml.bind

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** As of JAXB 2.0, this class is deprecated and optional.
 *  
 *  The Validator class is responsible for controlling the validation
 *  of content trees during runtime.
 * 
 *  
 *  
 *  Three Forms of Validation
 *  
 *     
 *         Unmarshal-Time Validation
 *         This form of validation enables a client application to receive
 *             information about validation errors and warnings detected while
 *             unmarshalling XML data into a Java content tree and is completely
 *             orthogonal to the other types of validation.  To enable or disable
 *             it, see the javadoc for
 *             Unmarshaller.setValidating.
 *             All JAXB 1.0 Providers are required to support this operation.
 *         
 * 
 *         On-Demand Validation
 *          This form of validation enables a client application to receive
 *              information about validation errors and warnings detected in the
 *              Java content tree.  At any point, client applications can call
 *              the Validator.validate method
 *              on the Java content tree (or any sub-tree of it).  All JAXB 1.0
 *              Providers are required to support this operation.
 *         
 * 
 *         Fail-Fast Validation
 *          This form of validation enables a client application to receive
 *              immediate feedback about modifications to the Java content tree
 *              that violate type constraints on Java Properties as defined in
 *              the specification.  JAXB Providers are not required support
 *              this type of validation.  Of the JAXB Providers that do support
 *              this type of validation, some may require you to decide at schema
 *              compile time whether or not a client application will be allowed
 *              to request fail-fast validation at runtime.
 *         
 *     
 *  
 * 
 *  
 *  The Validator class is responsible for managing On-Demand Validation.
 *  The Unmarshaller class is responsible for managing Unmarshal-Time
 *  Validation during the unmarshal operations.  Although there is no formal
 *  method of enabling validation during the marshal operations, the
 *  Marshaller may detect errors, which will be reported to the
 *  ValidationEventHandler registered on it.
 * 
 *  
 *  
 *  Using the Default EventHandler
 *  
 *    If the client application does not set an event handler on their
 *    Validator, Unmarshaller, or Marshaller prior to
 *    calling the validate, unmarshal, or marshal methods, then a default event
 *    handler will receive notification of any errors or warnings encountered.
 *    The default event handler will cause the current operation to halt after
 *    encountering the first error or fatal error (but will attempt to continue
 *    after receiving warnings).
 *  
 * 
 *  
 *  
 *  Handling Validation Events
 *  
 *    There are three ways to handle events encountered during the unmarshal,
 *    validate, and marshal operations:
 *     
 *         Use the default event handler
 *         The default event handler will be used if you do not specify one
 *             via the setEventHandler API's on Validator,
 *             Unmarshaller, or Marshaller.
 *         
 * 
 *         Implement and register a custom event handler
 *         Client applications that require sophisticated event processing
 *             can implement the ValidationEventHandler interface and
 *             register it with the Unmarshaller and/or
 *             Validator.
 *         
 * 
 *         Use the ValidationEventCollector
 *             utility
 *         For convenience, a specialized event handler is provided that
 *             simply collects any ValidationEvent objects created
 *             during the unmarshal, validate, and marshal operations and
 *             returns them to the client application as a
 *             java.util.Collection.
 *         
 *     
 *  
 * 
 *  
 *  Validation and Well-Formedness
 *  
 *  
 *  Validation events are handled differently depending on how the client
 *  application is configured to process them as described in the previous
 *  section.  However, there are certain cases where a JAXB Provider indicates
 *  that it is no longer able to reliably detect and report errors.  In these
 *  cases, the JAXB Provider will set the severity of the ValidationEvent to
 *  FATAL_ERROR to indicate that the unmarshal, validate, or marshal operations
 *  should be terminated.  The default event handler and
 *  ValidationEventCollector utility class must terminate processing
 *  after being notified of a fatal error.  Client applications that supply their
 *  own ValidationEventHandler should also terminate processing after
 *  being notified of a fatal error.  If not, unexpected behaviour may occur.
 *  
 * 
 *  
 *  
 *  Supported Properties
 *  
 *  
 *  There currently are not any properties required to be supported by all
 *  JAXB Providers on Validator.  However, some providers may support
 *  their own set of provider specific properties.
 *  
 */
trait Validator {

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def getEventHandler(): ValidationEventHandler = ???

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def getProperty(name: String): Object = ???

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def setEventHandler(handler: ValidationEventHandler): Unit = ???

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def setProperty(name: String, value: Object): Unit = ???

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def validate(subrootObj: Object): Boolean = ???

    /** Deprecated. 
     * since JAXB2.0
     * 
     */
    @stub
    def validateRoot(rootObj: Object): Boolean = ???
}
