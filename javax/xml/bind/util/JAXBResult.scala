package javax.xml.bind.util

import java.lang.Object
import javax.xml.bind.JAXBContext
import javax.xml.transform.sax.SAXResult

// JAXP Result implementation
// that unmarshals a JAXB object.
//
// 
// This utility class is useful to combine JAXB with
// other Java/XML technologies.
//
// 
// The following example shows how to use JAXB to unmarshal a document
// resulting from an XSLT transformation.
//
// 
//    
//       JAXBResult result = new JAXBResult(
//         JAXBContext.newInstance("org.acme.foo") );
//
//       // set up XSLT transformation
//       TransformerFactory tf = TransformerFactory.newInstance();
//       Transformer t = tf.newTransformer(new StreamSource("test.xsl"));
//
//       // run transformation
//       t.transform(new StreamSource("document.xml"),result);
//
//       // obtain the unmarshalled content tree
//       Object o = result.getResult();
//    
// 
//
// 
// The fact that JAXBResult derives from SAXResult is an implementation
// detail. Thus in general applications are strongly discouraged from
// accessing methods defined on SAXResult.
//
// 
// In particular it shall never attempt to call the setHandler,
// setLexicalHandler, and setSystemId methods.
class JAXBResult extends SAXResult {

    @stub
    // Creates a new instance that uses the specified
    // JAXBContext to unmarshal.
    def this(context: JAXBContext) = ???
}
