package javax.xml.transform.sax

import java.lang.{Object, String}
import javax.xml.transform.{Source, Templates, TransformerFactory}
import scala.scalanative.annotation.stub

/** This class extends TransformerFactory to provide SAX-specific
 *  factory methods.  It provides two types of ContentHandlers,
 *  one for creating Transformers, the other for creating Templates
 *  objects.
 * 
 *  If an application wants to set the ErrorHandler or EntityResolver
 *  for an XMLReader used during a transformation, it should use a URIResolver
 *  to return the SAXSource which provides (with getXMLReader) a reference to
 *  the XMLReader.
 */
abstract class SAXTransformerFactory extends TransformerFactory {

    /** The default constructor is protected on purpose. */
    @stub
    protected def this() = ???

    /** Get a TemplatesHandler object that can process SAX
     *  ContentHandler events into a Templates object.
     */
    def newTemplatesHandler(): TemplatesHandler

    /** Get a TransformerHandler object that can process SAX
     *  ContentHandler events into a Result.
     */
    def newTransformerHandler(): TransformerHandler

    /** Get a TransformerHandler object that can process SAX
     *  ContentHandler events into a Result, based on the transformation
     *  instructions specified by the argument.
     */
    def newTransformerHandler(src: Source): TransformerHandler

    /** Get a TransformerHandler object that can process SAX
     *  ContentHandler events into a Result, based on the Templates argument.
     */
    def newTransformerHandler(templates: Templates): TransformerHandler

    /** Create an XMLFilter that uses the given Source as the
     *  transformation instructions.
     */
    def newXMLFilter(src: Source): XMLFilter

    /** Create an XMLFilter, based on the Templates argument.. */
    def newXMLFilter(templates: Templates): XMLFilter
}

object SAXTransformerFactory {
    /** If TransformerFactory.getFeature(java.lang.String)
     *  returns true when passed this value as an argument,
     *  the TransformerFactory returned from
     *  TransformerFactory.newInstance() may
     *  be safely cast to a SAXTransformerFactory.
     */
    @stub
    val FEATURE: String = ???

    /** If TransformerFactory.getFeature(java.lang.String)
     *  returns true when passed this value as an argument,
     *  the newXMLFilter(Source src)
     *  and newXMLFilter(Templates templates) methods are supported.
     */
    @stub
    val FEATURE_XMLFILTER: String = ???
}
