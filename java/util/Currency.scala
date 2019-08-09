package java.util

import java.io.Serializable
import java.lang.{Object, String}

/** Represents a currency. Currencies are identified by their ISO 4217 currency
 *  codes. Visit the 
 *  ISO web site for more information.
 *  
 *  The class is designed so that there's never more than one
 *  Currency instance for any given currency. Therefore, there's
 *  no public constructor. You obtain a Currency instance using
 *  the getInstance methods.
 *  
 *  Users can supersede the Java runtime currency data by means of the system
 *  property java.util.currency.data. If this system property is
 *  defined then its value is the location of a properties file, the contents of
 *  which are key/value pairs of the ISO 3166 country codes and the ISO 4217
 *  currency data respectively.  The value part consists of three ISO 4217 values
 *  of a currency, i.e., an alphabetic code, a numeric code, and a minor unit.
 *  Those three ISO 4217 values are separated by commas.
 *  The lines which start with '#'s are considered comment lines. An optional UTC
 *  timestamp may be specified per currency entry if users need to specify a
 *  cutover date indicating when the new data comes into effect. The timestamp is
 *  appended to the end of the currency properties and uses a comma as a separator.
 *  If a UTC datestamp is present and valid, the JRE will only use the new currency
 *  properties if the current UTC date is later than the date specified at class
 *  loading time. The format of the timestamp must be of ISO 8601 format :
 *  'yyyy-MM-dd'T'HH:mm:ss'. For example,
 *  
 *  
 *  #Sample currency properties
 *  JP=JPZ,999,0
 *  
 *  
 *  will supersede the currency data for Japan.
 * 
 *  
 *  
 *  #Sample currency properties with cutover date
 *  JP=JPZ,999,0,2014-01-01T00:00:00
 *  
 *  
 *  will supersede the currency data for Japan if Currency class is loaded after
 *  1st January 2014 00:00:00 GMT.
 *  
 *  Where syntactically malformed entries are encountered, the entry is ignored
 *  and the remainder of entries in file are processed. For instances where duplicate
 *  country code entries exist, the behavior of the Currency information for that
 *  Currency is undefined and the remainder of entries in file are processed.
 */
final class Currency extends Object with Serializable {

    /** Gets the ISO 4217 currency code of this currency. */
    @stub
    def getCurrencyCode(): String = ???

    /** Gets the default number of fraction digits used with this currency. */
    @stub
    def getDefaultFractionDigits(): Int = ???

    /** Gets the name that is suitable for displaying this currency for
     *  the default DISPLAY locale.
     */
    @stub
    def getDisplayName(): String = ???

    /** Gets the name that is suitable for displaying this currency for
     *  the specified locale.
     */
    @stub
    def getDisplayName(locale: Locale): String = ???

    /** Returns the ISO 4217 numeric code of this currency. */
    @stub
    def getNumericCode(): Int = ???

    /** Gets the symbol of this currency for the default
     *  DISPLAY locale.
     */
    @stub
    def getSymbol(): String = ???

    /** Gets the symbol of this currency for the specified locale. */
    @stub
    def getSymbol(locale: Locale): String = ???
}

object Currency {
    /** Gets the set of available currencies. */
    @stub
    def getAvailableCurrencies(): Set[Currency] = ???

    /** Returns the Currency instance for the country of the
     *  given locale.
     */
    @stub
    def getInstance(locale: Locale): Currency = ???

    /** Returns the Currency instance for the given currency code. */
    @stub
    def getInstance(currencyCode: String): Currency = ???
}
