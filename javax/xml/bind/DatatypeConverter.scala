package javax.xml.bind

import java.lang.{Object, String}
import java.math.{BigDecimal, BigInteger}
import java.util.Calendar
import javax.xml.namespace.{NamespaceContext, QName}

// 
// The javaType binding declaration can be used to customize the binding of
// an XML schema datatype to a Java datatype. Customizations can involve
// writing a parse and print method for parsing and printing lexical
// representations of a XML schema datatype respectively. However, writing
// parse and print methods requires knowledge of the lexical representations (
//  XML Schema Part2: Datatypes
// specification ) and hence may be difficult to write.
// 
// 
// This class makes it easier to write parse and print methods. It defines
// static parse and print methods that provide access to a JAXB provider's
// implementation of parse and print methods. These methods are invoked by
// custom parse and print methods. For example, the binding of xsd:dateTime
// to a long can be customized using parse and print methods as follows:
// 
//    
//    // Customized parse method
//    public long myParseCal( String dateTimeString ) {
//        java.util.Calendar cal = DatatypeConverter.parseDateTime(dateTimeString);
//        long longval = convert_calendar_to_long(cal); //application specific
//        return longval;
//    }
//
//    // Customized print method
//    public String myPrintCal( Long longval ) {
//        java.util.Calendar cal = convert_long_to_calendar(longval) ; //application specific
//        String dateTimeString = DatatypeConverter.printDateTime(cal);
//        return dateTimeString;
//    }
//    
// 
// 
// There is a static parse and print method corresponding to each parse and
// print method respectively in the DatatypeConverterInterface.
// 
// The static methods defined in the class can also be used to specify
// a parse or a print method in a javaType binding declaration.
// 
// 
// JAXB Providers are required to call the
// setDatatypeConverter api at some point before the first marshal or unmarshal
// operation (perhaps during the call to JAXBContext.newInstance).  This step is
// necessary to configure the converter that should be used to perform the
// print and parse functionality.
// 
//
// 
// A print method for a XML schema datatype can output any lexical
// representation that is valid with respect to the XML schema datatype.
// If an error is encountered during conversion, then an IllegalArgumentException,
// or a subclass of IllegalArgumentException must be thrown by the method.
// 
final class DatatypeConverter extends Object {
}

object DatatypeConverter {
    @stub
    // 
    // Return a string containing the lexical representation of the
    // simple type.
    def parseAnySimpleType(lexicalXSDAnySimpleType: String): String = ???

    @stub
    // 
    // Converts the string argument into an array of bytes.
    def parseBase64Binary(lexicalXSDBase64Binary: String): Array[Byte] = ???

    @stub
    // 
    // Converts the string argument into a boolean value.
    def parseBoolean(lexicalXSDBoolean: String): Boolean = ???

    @stub
    // 
    // Converts the string argument into a byte value.
    def parseByte(lexicalXSDByte: String): Byte = ???

    @stub
    // 
    // Converts the string argument into a Calendar value.
    def parseDate(lexicalXSDDate: String): Calendar = ???

    @stub
    // 
    // Converts the string argument into a Calendar value.
    def parseDateTime(lexicalXSDDateTime: String): Calendar = ???

    @stub
    // 
    // Converts the string argument into a BigDecimal value.
    def parseDecimal(lexicalXSDDecimal: String): BigDecimal = ???

    @stub
    // 
    // Converts the string argument into a double value.
    def parseDouble(lexicalXSDDouble: String): double = ???

    @stub
    // 
    // Converts the string argument into a float value.
    def parseFloat(lexicalXSDFloat: String): float = ???

    @stub
    // 
    // Converts the string argument into an array of bytes.
    def parseHexBinary(lexicalXSDHexBinary: String): Array[Byte] = ???

    @stub
    // 
    // Convert the string argument into an int value.
    def parseInt(lexicalXSDInt: String): Int = ???

    @stub
    // 
    // Convert the string argument into a BigInteger value.
    def parseInteger(lexicalXSDInteger: String): BigInteger = ???

    @stub
    // 
    // Converts the string argument into a long value.
    def parseLong(lexicalXSDLong: String): Long = ???

    @stub
    // 
    // Converts the string argument into a byte value.
    def parseQName(lexicalXSDQName: String, nsc: NamespaceContext): QName = ???

    @stub
    // 
    // Converts the string argument into a short value.
    def parseShort(lexicalXSDShort: String): Short = ???

    @stub
    // 
    // Convert the lexical XSD string argument into a String value.
    def parseString(lexicalXSDString: String): String = ???

    @stub
    // 
    // Converts the string argument into a Calendar value.
    def parseTime(lexicalXSDTime: String): Calendar = ???

    @stub
    // 
    // Converts the string argument into a long value.
    def parseUnsignedInt(lexicalXSDUnsignedInt: String): Long = ???

    @stub
    // 
    // Converts the string argument into an int value.
    def parseUnsignedShort(lexicalXSDUnsignedShort: String): Int = ???

    @stub
    // 
    // Converts a string value into a string.
    def printAnySimpleType(val: String): String = ???

    @stub
    // 
    // Converts an array of bytes into a string.
    def printBase64Binary(val: Array[Byte]): String = ???

    @stub
    // 
    // Converts a boolean value into a string.
    def printBoolean(val: Boolean): String = ???

    @stub
    // 
    // Converts a byte value into a string.
    def printByte(val: Byte): String = ???

    @stub
    // 
    // Converts a Calendar value into a string.
    def printDate(val: Calendar): String = ???

    @stub
    // 
    // Converts a Calendar value into a string.
    def printDateTime(val: Calendar): String = ???

    @stub
    // 
    // Converts a BigDecimal value into a string.
    def printDecimal(val: BigDecimal): String = ???

    @stub
    // 
    // Converts a double value into a string.
    def printDouble(val: double): String = ???

    @stub
    // 
    // Converts a float value into a string.
    def printFloat(val: float): String = ???

    @stub
    // 
    // Converts an array of bytes into a string.
    def printHexBinary(val: Array[Byte]): String = ???

    @stub
    // 
    // Converts an int value into a string.
    def printInt(val: Int): String = ???

    @stub
    // 
    // Converts a BigInteger value into a string.
    def printInteger(val: BigInteger): String = ???

    @stub
    // 
    // Converts A long value into a string.
    def printLong(val: Long): String = ???

    @stub
    // 
    // Converts a QName instance into a string.
    def printQName(val: QName, nsc: NamespaceContext): String = ???

    @stub
    // 
    // Converts a short value into a string.
    def printShort(val: Short): String = ???

    @stub
    // 
    // Converts the string argument into a string.
    def printString(val: String): String = ???

    @stub
    // 
    // Converts a Calendar value into a string.
    def printTime(val: Calendar): String = ???

    @stub
    // 
    // Converts a long value into a string.
    def printUnsignedInt(val: Long): String = ???

    @stub
    // 
    // Converts an int value into a string.
    def printUnsignedShort(val: Int): String = ???
}
