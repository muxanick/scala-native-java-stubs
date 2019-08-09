package javax.xml.bind

import java.lang.String
import java.math.{BigDecimal, BigInteger}
import java.util.Calendar
import javax.xml.namespace.{NamespaceContext, QName}
import scala.scalanative.annotation.stub

/** 
 *  The DatatypeConverterInterface is for JAXB provider use only. A
 *  JAXB provider must supply a class that implements this interface.
 *  JAXB Providers are required to call the
 *  DatatypeConverter.setDatatypeConverter api at
 *  some point before the first marshal or unmarshal operation (perhaps during
 *  the call to JAXBContext.newInstance).  This step is necessary to configure
 *  the converter that should be used to perform the print and parse
 *  functionality.  Calling this api repeatedly will have no effect - the
 *  DatatypeConverter instance passed into the first invocation is the one that
 *  will be used from then on.
 *  
 * 
 *  
 *  This interface defines the parse and print methods. There is one
 *  parse and print method for each XML schema datatype specified in the
 *  the default binding Table 5-1 in the JAXB specification.
 *  
 * 
 *  
 *  The parse and print methods defined here are invoked by the static parse
 *  and print methods defined in the DatatypeConverter
 *  class.
 *  
 * 
 *  
 *  A parse method for a XML schema datatype must be capable of converting any
 *  lexical representation of the XML schema datatype ( specified by the
 *   XML Schema Part2: Datatypes
 *  specification into a value in the value space of the XML schema datatype.
 *  If an error is encountered during conversion, then an IllegalArgumentException
 *  or a subclass of IllegalArgumentException must be thrown by the method.
 * 
 *  
 * 
 *  
 *  A print method for a XML schema datatype can output any lexical
 *  representation that is valid with respect to the XML schema datatype.
 *  If an error is encountered during conversion, then an IllegalArgumentException,
 *  or a subclass of IllegalArgumentException must be thrown by the method.
 *  
 * 
 *  The prefix xsd: is used to refer to XML schema datatypes
 *   XML Schema Part2: Datatypes
 *  specification.
 * 
 *  
 */
trait DatatypeConverterInterface {

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
     *  Converts the string argument into a QName value.
     */
    @stub
    def parseQName(lexicalXSDQName: String, nsc: NamespaceContext): QName = ???

    /** 
     *  Converts the string argument into a short value.
     */
    @stub
    def parseShort(lexicalXSDShort: String): Short = ???

    /** 
     *  Convert the string argument into a string.
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
     *  Converts a long value into a string.
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
}
