package javax.xml.datatype

import java.lang.{ClassLoader, Object, String}
import java.math.{BigDecimal, BigInteger}
import java.util.GregorianCalendar

// Factory that creates new javax.xml.datatype Objects that map XML to/from Java Objects.
//
// A new instance of the DatatypeFactory is created through the newInstance() method
// that uses the following implementation resolution mechanisms to determine an implementation:
// 
//    
//      If the system property specified by DATATYPEFACTORY_PROPERTY, "javax.xml.datatype.DatatypeFactory",
//      exists, a class with the name of the property value is instantiated.
//      Any Exception thrown during the instantiation process is wrapped as a DatatypeConfigurationException.
//    
//    
//      If the file ${JAVA_HOME}/lib/jaxp.properties exists, it is loaded in a Properties Object.
//      The Properties Object  is then queried for the property as documented in the prior step
//      and processed as documented in the prior step.
//    
//    
//     Uses the service-provider loading facilities, defined by the ServiceLoader class, to attempt
//     to locate and load an implementation of the service using the default loading mechanism:
//     the service-provider loading facility will use the current thread's context class loader
//     to attempt to load the service. If the context class
//     loader is null, the system class loader will be used.
//     
//     In case of service
//     configuration error a DatatypeConfigurationException
//     will be thrown.
//    
//    
//      The final mechanism is to attempt to instantiate the Class specified by
//      DATATYPEFACTORY_IMPLEMENTATION_CLASS.
//      Any Exception thrown during the instantiation process is wrapped as a DatatypeConfigurationException.
//    
// 
abstract class DatatypeFactory extends Object {

    // Obtain a new instance of a Duration
    // specifying the Duration as isPositive, years, months, days, hours, minutes, seconds.
    def newDuration(isPositive: Boolean, years: BigInteger, months: BigInteger, days: BigInteger, hours: BigInteger, minutes: BigInteger, seconds: BigDecimal): Duration

    // Obtain a new instance of a Duration
    // specifying the Duration as isPositive, years, months, days, hours, minutes, seconds.
    def newDuration(isPositive: Boolean, years: Int, months: Int, days: Int, hours: Int, minutes: Int, seconds: Int): Duration

    // Obtain a new instance of a Duration
    // specifying the Duration as milliseconds.
    def newDuration(durationInMilliSeconds: Long): Duration

    // Obtain a new instance of a Duration
    // specifying the Duration as its string representation, "PnYnMnDTnHnMnS",
    // as defined in XML Schema 1.0 section 3.2.6.1.
    def newDuration(lexicalRepresentation: String): Duration

    // Create a Duration of type xdt:dayTimeDuration using the specified
    // day, hour, minute and second as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration.
    def newDurationDayTime(isPositive: Boolean, day: BigInteger, hour: BigInteger, minute: BigInteger, second: BigInteger): Duration

    // Create a Duration of type xdt:dayTimeDuration using the specified
    // day, hour, minute and second as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration.
    def newDurationDayTime(isPositive: Boolean, day: Int, hour: Int, minute: Int, second: Int): Duration

    // Create a Duration of type xdt:dayTimeDuration using the specified milliseconds as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration.
    def newDurationDayTime(durationInMilliseconds: Long): Duration

    // Create a Duration of type xdt:dayTimeDuration by parsing its String representation,
    // "PnDTnHnMnS", 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:dayTimeDuration.
    def newDurationDayTime(lexicalRepresentation: String): Duration

    // Create a Duration of type xdt:yearMonthDuration using the specified
    // year and month as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration.
    def newDurationYearMonth(isPositive: Boolean, year: BigInteger, month: BigInteger): Duration

    // Create a Duration of type xdt:yearMonthDuration using the specified
    // year and month as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration.
    def newDurationYearMonth(isPositive: Boolean, year: Int, month: Int): Duration

    // Create a Duration of type xdt:yearMonthDuration using the specified milliseconds as defined in
    // 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration.
    def newDurationYearMonth(durationInMilliseconds: Long): Duration

    // Create a Duration of type xdt:yearMonthDuration by parsing its String representation,
    // "PnYnM", 
    //   XQuery 1.0 and XPath 2.0 Data Model, xdt:yearMonthDuration.
    def newDurationYearMonth(lexicalRepresentation: String): Duration

    // Create a new instance of an XMLGregorianCalendar.
    def newXMLGregorianCalendar(): XMLGregorianCalendar

    // Constructor allowing for complete value spaces allowed by
    // W3C XML Schema 1.0 recommendation for xsd:dateTime and related
    // builtin datatypes.
    def newXMLGregorianCalendar(year: BigInteger, month: Int, day: Int, hour: Int, minute: Int, second: Int, fractionalSecond: BigDecimal, timezone: Int): XMLGregorianCalendar

    // Create an XMLGregorianCalendar from a GregorianCalendar.
    def newXMLGregorianCalendar(cal: GregorianCalendar): XMLGregorianCalendar

    // Constructor of value spaces that a
    // java.util.GregorianCalendar instance would need to convert to an
    // XMLGregorianCalendar instance.
    def newXMLGregorianCalendar(year: Int, month: Int, day: Int, hour: Int, minute: Int, second: Int, millisecond: Int, timezone: Int): XMLGregorianCalendar

    // Create a new XMLGregorianCalendar by parsing the String as a lexical representation.
    def newXMLGregorianCalendar(lexicalRepresentation: String): XMLGregorianCalendar

    // Create a Java representation of XML Schema builtin datatype date or g*.
    def newXMLGregorianCalendarDate(year: Int, month: Int, day: Int, timezone: Int): XMLGregorianCalendar

    // Create a Java instance of XML Schema builtin datatype time.
    def newXMLGregorianCalendarTime(hours: Int, minutes: Int, seconds: Int, fractionalSecond: BigDecimal, timezone: Int): XMLGregorianCalendar

    // Create a Java instance of XML Schema builtin datatype time.
    def newXMLGregorianCalendarTime(hours: Int, minutes: Int, seconds: Int, timezone: Int): XMLGregorianCalendar
}

object DatatypeFactory {
    @stub
    // Default implementation class name as defined in
    // JSR 206: Java(TM) API for XML Processing (JAXP) 1.3.
    def DATATYPEFACTORY_IMPLEMENTATION_CLASS: String = ???

    @stub
    // Obtain a new instance of a DatatypeFactory.
    def newInstance(): DatatypeFactory = ???

    @stub
    // Obtain a new instance of a DatatypeFactory from class name.
    def newInstance(factoryClassName: String, classLoader: ClassLoader): DatatypeFactory = ???
}
