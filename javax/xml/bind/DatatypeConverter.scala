package javax.xml.bind

import java.lang.{Object, String}
import java.math.{BigDecimal, BigInteger}
import java.util.Calendar
import javax.xml.namespace.{NamespaceContext, QName}
import scala.scalanative.annotation.stub

/** 
 *  The javaType binding declaration can be used to customize the binding of
 *  an XML schema datatype to a Java datatype. Customizations can involve
 *  writing a parse and print method for parsing and printing lexical
 *  representations of a XML schema datatype respectively. However, writing
 *  parse and print methods requires knowledge of the lexical representations (
 *   XML Schema Part2: Datatypes
 *  specification ) and hence may be difficult to write.
 *  
 *  
 *  This class makes it easier to write parse and print methods. It defines
 *  static parse and print methods that provide access to a JAXB provider's
 *  implementation of parse and print methods. These methods are invoked by
 *  custom parse and print methods. For example, the binding of xsd:dateTime
 *  to a long can be customized using parse and print methods as follows:
 *  
 *     
 *     // Customized parse method
 *     public long myParseCal( String dateTimeString ) {
 *         java.util.Calendar cal = DatatypeConverter.parseDateTime(dateTimeString);
 *         long longval = convert_calendar_to_long(cal); //application specific
 *         return longval;
 *     }
 * 
 *     // Customized print method
 *     public String myPrintCal( Long longval ) {
 *         java.util.Calendar cal = convert_long_to_calendar(longval) ; //application specific
 *         String dateTimeString = DatatypeConverter.printDateTime(cal);
 *         return dateTimeString;
 *     }
 *     
 *  
 *  
 *  There is a static parse and print method corresponding to each parse and
 *  print method respectively in the DatatypeConverterInterface.
 *  
 *  The static methods defined in the class can also be used to specify
 *  a parse or a print method in a javaType binding declaration.
 *  
 *  
 *  JAXB Providers are required to call the
 *  setDatatypeConverter api at some point before the first marshal or unmarshal
 *  operation (perhaps during the call to JAXBContext.newInstance).  This step is
 *  necessary to configure the converter that should be used to perform the
 *  print and parse functionality.
 *  
 * 
 *  
 *  A print method for a XML schema datatype can output any lexical
 *  representation that is valid with respect to the XML schema datatype.
 *  If an error is encountered during conversion, then an IllegalArgumentException,
 *  or a subclass of IllegalArgumentException must be thrown by the method.
 *  
 */
final class DatatypeConverter extends Object {
}

object DatatypeConverter {
    /** 
     *  Return a string containing the lexical representation of the
     *  simple type.
     */
    @stub
    def parseAnySimpleType(lexicalXSDAnySimpleType: String): String = ???

    /** 
     *  Converts the string argument into an array of bytes.
     */
    @stub
    def parseBase64Binary(lexicalXSDBase64Binary: String): Array[Byte] = ???

    /** 
     *  Converts the string argument into a boolean value.
     */
    @stub
    def parseBoolean(lexicalXSDBoolean: String): Boolean = ???

    /** 
     *  Converts the string argument into a byte value.
     */
    @stub
    def parseByte(lexicalXSDByte: String): Byte = ???

    /** 
     *  Converts the string argument into a Calendar value.
     */
    @stub
    def parseDate(lexicalXSDDate: String): Calendar = ???

    /** 
     *  Converts the string argument into a Calendar value.
     */
    @stub
    def parseDateTime(lexicalXSDDateTime: String): Calendar = ???

    /** 
     *  Converts the string argument into a BigDecimal value.
     */
    @stub
    def parseDecimal(lexicalXSDDecimal: String): BigDecimal = ???

    /** 
     *  Converts the string argument into a double value.
     */
    @stub
    def parseDouble(lexicalXSDDouble: String): Double = ???

    /** 
     *  Converts the string argument into a float value.
     */
    @stub
    def parseFloat(lexicalXSDFloat: String): Float = ???

    /** 
     *  Converts the string argument into an array of bytes.
     */
    @stub
    def parseHexBinary(lexicalXSDHexBinary: String): Array[Byte] = ???

    /** 
     *  Convert the string argument into an int value.
     */
    @stub
    def parseInt(lexicalXSDInt: String): Int = ???

    /** 
     *  Convert the string argument into a BigInteger value.
     */
    @stub
    def parseInteger(lexicalXSDInteger: String): BigInteger = ???

    /** 
     *  Converts the string argument into a long value.
     */
    @stub
    def parseLong(lexicalXSDLong: String): Long = ???

    /** 
     *  Converts the string argument into a byte value.
     */
    @stub
    def parseQName(lexicalXSDQName: String, nsc: NamespaceContext): QName = ???

    /** 
     *  Converts the string argument into a short value.
     */
    @stub
    def parseShort(lexicalXSDShort: String): Short = ???

    /** 
     *  Convert the lexical XSD string argument into a String value.
     */
    @stub
    def parseString(lexicalXSDString: String): String = ???

    /** 
     *  Converts the string argument into a Calendar value.
     */
    @stub
    def parseTime(lexicalXSDTime: String): Calendar = ???

    /** 
     *  Converts the string argument into a long value.
     */
    @stub
    def parseUnsignedInt(lexicalXSDUnsignedInt: String): Long = ???

    /** 
     *  Converts the string argument into an int value.
     */
    @stub
    def parseUnsignedShort(lexicalXSDUnsignedShort: String): Int = ???

    /** 
     *  Converts a string value into a string.
     */
    @stub
    def printAnySimpleType(val: String): String = ???

    /** 
     *  Converts an array of bytes into a string.
     */
    @stub
    def printBase64Binary(val: Array[Byte]): String = ???

    /** 
     *  Converts a boolean value into a string.
     */
    @stub
    def printBoolean(val: Boolean): String = ???

    /** 
     *  Converts a byte value into a string.
     */
    @stub
    def printByte(val: Byte): String = ???

    /** 
     *  Converts a Calendar value into a string.
     */
    @stub
    def printDate(val: Calendar): String = ???

    /** 
     *  Converts a Calendar value into a string.
     */
    @stub
    def printDateTime(val: Calendar): String = ???

    /** 
     *  Converts a BigDecimal value into a string.
     */
    @stub
    def printDecimal(val: BigDecimal): String = ???

    /** 
     *  Converts a double value into a string.
     */
    @stub
    def printDouble(val: Double): String = ???

    /** 
     *  Converts a float value into a string.
     */
    @stub
    def printFloat(val: Float): String = ???

    /** 
     *  Converts an array of bytes into a string.
     */
    @stub
    def printHexBinary(val: Array[Byte]): String = ???

    /** 
     *  Converts an int value into a string.
     */
    @stub
    def printInt(val: Int): String = ???

    /** 
     *  Converts a BigInteger value into a string.
     */
    @stub
    def printInteger(val: BigInteger): String = ???

    /** 
     *  Converts A long value into a string.
     */
    @stub
    def printLong(val: Long): String = ???

    /** 
     *  Converts a QName instance into a string.
     */
    @stub
    def printQName(val: QName, nsc: NamespaceContext): String = ???

    /** 
     *  Converts a short value into a string.
     */
    @stub
    def printShort(val: Short): String = ???

    /** 
     *  Converts the string argument into a string.
     */
    @stub
    def printString(val: String): String = ???

    /** 
     *  Converts a Calendar value into a string.
     */
    @stub
    def printTime(val: Calendar): String = ???

    /** 
     *  Converts a long value into a string.
     */
    @stub
    def printUnsignedInt(val: Long): String = ???

    /** 
     *  Converts an int value into a string.
     */
    @stub
    def printUnsignedShort(val: Int): String = ???

    /** This method is for JAXB provider use only. */
    @stub
    def setDatatypeConverter(converter: DatatypeConverterInterface): Unit = ???
}
