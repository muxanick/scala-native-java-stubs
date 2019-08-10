package java.text

import java.io.Serializable
import java.lang.{Cloneable, Object, String, StringBuffer}
import scala.scalanative.annotation.stub

/** Format is an abstract base class for formatting locale-sensitive
 *  information such as dates, messages, and numbers.
 * 
 *  
 *  Format defines the programming interface for formatting
 *  locale-sensitive objects into Strings (the
 *  format method) and for parsing Strings back
 *  into objects (the parseObject method).
 * 
 *  
 *  Generally, a format's parseObject method must be able to parse
 *  any string formatted by its format method. However, there may
 *  be exceptional cases where this is not possible. For example, a
 *  format method might create two adjacent integer numbers with
 *  no separator in between, and in this case the parseObject could
 *  not tell which digits belong to which number.
 * 
 *  Subclassing
 * 
 *  
 *  The Java Platform provides three specialized subclasses of Format--
 *  DateFormat, MessageFormat, and
 *  NumberFormat--for formatting dates, messages, and numbers,
 *  respectively.
 *  
 *  Concrete subclasses must implement three methods:
 *  
 *   format(Object obj, StringBuffer toAppendTo, FieldPosition pos)
 *   formatToCharacterIterator(Object obj)
 *   parseObject(String source, ParsePosition pos)
 *  
 *  These general methods allow polymorphic parsing and formatting of objects
 *  and are used, for example, by MessageFormat.
 *  Subclasses often also provide additional format methods for
 *  specific input types as well as parse methods for specific
 *  result types. Any parse method that does not take a
 *  ParsePosition argument should throw ParseException
 *  when no text in the required format is at the beginning of the input text.
 * 
 *  
 *  Most subclasses will also implement the following factory methods:
 *  
 *  
 *  getInstance for getting a useful format object appropriate
 *  for the current locale
 *  
 *  getInstance(Locale) for getting a useful format
 *  object appropriate for the specified locale
 *  
 *  In addition, some subclasses may also implement other
 *  getXxxxInstance methods for more specialized control. For
 *  example, the NumberFormat class provides
 *  getPercentInstance and getCurrencyInstance
 *  methods for getting specialized number formatters.
 * 
 *  
 *  Subclasses of Format that allow programmers to create objects
 *  for locales (with getInstance(Locale) for example)
 *  must also implement the following class method:
 *  
 *  
 *  public static Locale[] getAvailableLocales()
 *  
 *  
 * 
 *  
 *  And finally subclasses may define a set of constants to identify the various
 *  fields in the formatted output. These constants are used to create a FieldPosition
 *  object which identifies what information is contained in the field and its
 *  position in the formatted result. These constants should be named
 *  item_FIELD where item identifies
 *  the field. For examples of these constants, see ERA_FIELD and its
 *  friends in DateFormat.
 * 
 *  Synchronization
 * 
 *  
 *  Formats are generally not synchronized.
 *  It is recommended to create separate format instances for each thread.
 *  If multiple threads access a format concurrently, it must be synchronized
 *  externally.
 */
abstract class Format extends Object with Serializable with Cloneable {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Creates and returns a copy of this object. */
    def clone(): Any

    /** Formats an object to produce a string. */
    def format(obj: Any): String

    /** Formats an object and appends the resulting text to a given string
     *  buffer.
     */
    def format(obj: Any, toAppendTo: StringBuffer, pos: FieldPosition): StringBuffer

    /** Formats an Object producing an AttributedCharacterIterator. */
    def formatToCharacterIterator(obj: Any): AttributedCharacterIterator

    /** Parses text from the beginning of the given string to produce an object. */
    def parseObject(source: String): Any

    /** Parses text from a string to produce an object. */
    def parseObject(source: String, pos: ParsePosition): Any
}

object Format {
    /** Defines constants that are used as attribute keys in the
     *  AttributedCharacterIterator returned
     *  from Format.formatToCharacterIterator and as
     *  field identifiers in FieldPosition.
     */
    type Field = Format_Field
}
