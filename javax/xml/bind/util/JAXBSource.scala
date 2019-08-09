package javax.xml.bind.util

import java.lang.Object
import javax.xml.bind.{JAXBContext, Marshaller}
import javax.xml.transform.sax.SAXSource
import scala.scalanative.annotation.stub

/** JAXP Source implementation
 *  that marshals a JAXB-generated object.
 * 
 *  
 *  This utility class is useful to combine JAXB with
 *  other Java/XML technologies.
 * 
 *  
 *  The following example shows how to use JAXB to marshal a document
 *  for transformation by XSLT.
 * 
 *  
 *     
 *        MyObject o = // get JAXB content tree
 * 
 *        // jaxbContext is a JAXBContext object from which 'o' is created.
 *        JAXBSource source = new JAXBSource( jaxbContext, o );
 * 
 *        // set up XSLT transformation
 *        TransformerFactory tf = TransformerFactory.newInstance();
 *        Transformer t = tf.newTransformer(new StreamSource("test.xsl"));
 * 
 *        // run transformation
 *        t.transform(source,new StreamResult(System.out));
 *     
 *  
 * 
 *  
 *  The fact that JAXBSource derives from SAXSource is an implementation
 *  detail. Thus in general applications are strongly discouraged from
 *  accessing methods defined on SAXSource. In particular,
 *  the setXMLReader and setInputSource methods shall never be called.
 *  The XMLReader object obtained by the getXMLReader method shall
 *  be used only for parsing the InputSource object returned by
 *  the getInputSource method.
 * 
 *  
 *  Similarly the InputSource object obtained by the getInputSource
 *  method shall be used only for being parsed by the XMLReader object
 *  returned by the getXMLReader.
 */
class JAXBSource extends SAXSource {

    /** Creates a new Source for the given content object. */
    @stub
    def this(context: JAXBContext, contentObject: Object) = ???

    /** Creates a new Source for the given content object. */
    @stub
    def this(marshaller: Marshaller, contentObject: Object) = ???
}
