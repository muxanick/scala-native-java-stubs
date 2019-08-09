package javax.xml.bind

import java.io.{File, InputStream, OutputStream, Reader, Writer}
import java.lang.{Class, Object, String}
import java.net.{URI, URL}
import javax.xml.transform.{Result, Source}

/** Class that defines convenience methods for common, simple use of JAXB.
 * 
 *  
 *  Methods defined in this class are convenience methods that combine several basic operations
 *  in the JAXBContext, Unmarshaller, and Marshaller.
 * 
 *  They are designed
 *  to be the prefered methods for developers new to JAXB. They have
 *  the following characterstics:
 * 
 *  
 *   Generally speaking, the performance is not necessarily optimal.
 *       It is expected that people who need to write performance
 *       critical code will use the rest of the JAXB API directly.
 *   Errors that happen during the processing is wrapped into
 *       DataBindingException (which will have JAXBException
 *       as its cause. It is expected that
 *       people who prefer the checked exception would use
 *       the rest of the JAXB API directly.
 *  
 * 
 *  
 *  In addition, the unmarshal methods have the following characteristic:
 * 
 *  
 *   Schema validation is not performed on the input XML.
 *       The processing will try to continue even if there
 *       are errors in the XML, as much as possible. Only as
 *       the last resort, this method fails with DataBindingException.
 *  
 * 
 *  
 *  Similarly, the marshal methods have the following characteristic:
 *  
 *   The processing will try to continue even if the Java object tree
 *       does not meet the validity requirement. Only as
 *       the last resort, this method fails with DataBindingException.
 *  
 * 
 * 
 *  
 *  All the methods on this class require non-null arguments to all parameters.
 *  The unmarshal methods either fail with an exception or return
 *  a non-null value.
 */
final class JAXB extends Object {
}

object JAXB {
    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: File): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: OutputStream): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: Result): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: String): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: URI): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: URL): Unit = ???

    /** Writes a Java object tree to XML and store it to the specified location. */
    @stub
    def marshal(jaxbObject: Object, xml: Writer): Unit = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: File, type: Class[T]): T = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: InputStream, type: Class[T]): T = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: Reader, type: Class[T]): T = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: Source, type: Class[T]): T = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: String, type: Class[T]): T = ???

    /** Reads in a Java object tree from the given XML input. */
    @stub
    def unmarshal[T](xml: URI, type: Class[T]): T = ???
}
