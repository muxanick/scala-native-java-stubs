package javax.xml.bind

import java.lang.Object
import scala.scalanative.annotation.stub

/** Unmarshaller implemented as SAX ContentHandler.
 * 
 *  
 *  Applications can use this interface to use their JAXB provider as a component
 *  in an XML pipeline.  For example:
 * 
 *  
 *        JAXBContext context = JAXBContext.newInstance( "org.acme.foo" );
 * 
 *        Unmarshaller unmarshaller = context.createUnmarshaller();
 * 
 *        UnmarshallerHandler unmarshallerHandler = unmarshaller.getUnmarshallerHandler();
 * 
 *        SAXParserFactory spf = SAXParserFactory.newInstance();
 *        spf.setNamespaceAware( true );
 * 
 *        XMLReader xmlReader = spf.newSAXParser().getXMLReader();
 *        xmlReader.setContentHandler( unmarshallerHandler );
 *        xmlReader.parse(new InputSource( new FileInputStream( XML_FILE ) ) );
 * 
 *        MyObject myObject= (MyObject)unmarshallerHandler.getResult();
 *  
 * 
 *  
 *  This interface is reusable: even if the user fails to unmarshal
 *  an object, s/he can still start a new round of unmarshalling.
 */
trait UnmarshallerHandler extends ContentHandler {

    /** Obtains the unmarshalled result. */
    @stub
    def getResult(): Any = ???
}
