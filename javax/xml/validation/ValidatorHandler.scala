package javax.xml.validation

import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** Streaming validator that works on SAX stream.
 * 
 *  
 *  A ValidatorHandler object is not thread-safe and not reentrant.
 *  In other words, it is the application's responsibility to make
 *  sure that one ValidatorHandler object is not used from
 *  more than one thread at any given time.
 * 
 *  
 *  ValidatorHandler checks if the SAX events follow
 *  the set of constraints described in the associated Schema,
 *  and additionally it may modify the SAX events (for example
 *  by adding default values, etc.)
 * 
 *  
 *  ValidatorHandler extends from ContentHandler,
 *  but it refines the underlying ContentHandler in
 *  the following way:
 *  
 *   startElement/endElement events must receive non-null String
 *       for uri, localName, and qname,
 *       even though SAX allows some of them to be null.
 *       Similarly, the user-specified ContentHandler will receive non-null
 *       Strings for all three parameters.
 * 
 *   Applications must ensure that ValidatorHandler's
 *       ContentHandler.startPrefixMapping(String,String) and
 *       ContentHandler.endPrefixMapping(String) are invoked
 *       properly. Similarly, the user-specified ContentHandler
 *       will receive startPrefixMapping/endPrefixMapping events.
 *       If the ValidatorHandler introduces additional namespace
 *       bindings, the user-specified ContentHandler will receive
 *       additional startPrefixMapping/endPrefixMapping events.
 * 
 *   Attributes for the
 *       ContentHandler.startElement(String,String,String,Attributes) method
 *       may or may not include xmlns* attributes.
 *  
 * 
 *  
 *  A ValidatorHandler is automatically reset every time
 *  the startDocument method is invoked.
 * 
 *  Recognized Properties and Features
 *  
 *  This spec defines the following feature that must be recognized
 *  by all ValidatorHandler implementations.
 * 
 *  http://xml.org/sax/features/namespace-prefixes
 *  
 *  This feature controls how a ValidatorHandler introduces
 *  namespace bindings that were not present in the original SAX event
 *  stream.
 *  When this feature is set to true, it must make
 *  sure that the user's ContentHandler will see
 *  the corresponding xmlns* attribute in
 *  the Attributes object of the
 *  ContentHandler.startElement(String,String,String,Attributes)
 *  callback. Otherwise, xmlns* attributes must not be
 *  added to Attributes that's passed to the
 *  user-specified ContentHandler.
 *  
 *  (Note that regardless of this switch, namespace bindings are
 *  always notified to applications through
 *  ContentHandler.startPrefixMapping(String,String) and
 *  ContentHandler.endPrefixMapping(String) methods of the
 *  ContentHandler specified by the user.)
 * 
 *  
 *  Note that this feature does NOT affect the way
 *  a ValidatorHandler receives SAX events. It merely
 *  changes the way it augments SAX events.
 * 
 *  This feature is set to false by default.
 */
abstract class ValidatorHandler extends Object with ContentHandler {

    /** Constructor for derived classes. */
    @stub
    protected def this() = ???

    /** Gets the ContentHandler which receives the
     *  augmented validation result.
     */
    def getContentHandler(): ContentHandler

    /** Gets the current ErrorHandler set to this ValidatorHandler. */
    def getErrorHandler(): ErrorHandler

    /** Look up the value of a feature flag. */
    def getFeature(name: String): Boolean

    /** Look up the value of a property. */
    def getProperty(name: String): Any

    /** Gets the current LSResourceResolver set to this ValidatorHandler. */
    def getResourceResolver(): LSResourceResolver

    /** Obtains the TypeInfoProvider implementation of this
     *  ValidatorHandler.
     */
    def getTypeInfoProvider(): TypeInfoProvider

    /** Sets the ContentHandler which receives
     *  the augmented validation result.
     */
    def setContentHandler(receiver: ContentHandler): Unit

    /** Sets the ErrorHandler to receive errors encountered
     *  during the validation.
     */
    def setErrorHandler(errorHandler: ErrorHandler): Unit

    /** Set a feature for this ValidatorHandler. */
    def setFeature(name: String, value: Boolean): Unit

    /** Set the value of a property. */
    def setProperty(name: String, object: Any): Unit

    /** Sets the LSResourceResolver to customize
     *  resource resolution while in a validation episode.
     */
    def setResourceResolver(resourceResolver: LSResourceResolver): Unit
}
