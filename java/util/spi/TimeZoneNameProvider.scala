package java.util.spi

import java.lang.{Object, String}
import java.util.Locale
import scala.scalanative.annotation.stub

/** An abstract class for service providers that
 *  provide localized time zone names for the
 *  TimeZone class.
 *  The localized time zone names available from the implementations of
 *  this class are also the source for the
 *  DateFormatSymbols.getZoneStrings() method.
 */
abstract class TimeZoneNameProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns a name for the given time zone ID that's suitable for
     *  presentation to the user in the specified locale.
     */
    def getDisplayName(ID: String, daylight: Boolean, style: Int, locale: Locale): String

    /** Returns a generic name for the given time zone ID that's suitable
     *  for presentation to the user in the specified locale.
     */
    def getGenericDisplayName(ID: String, style: Int, locale: Locale): String
}
