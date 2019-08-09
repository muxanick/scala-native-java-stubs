package java.util.spi

import java.lang.Object
import java.util.Locale
import scala.scalanative.annotation.stub

/** An abstract class for service providers that provide locale-dependent Calendar parameters. */
abstract class CalendarDataProvider extends LocaleServiceProvider {

    /** Sole constructor. */
    @stub
    protected def this() = ???

    /** Returns the first day of a week in the given locale. */
    def getFirstDayOfWeek(locale: Locale): Int

    /** Returns the minimal number of days required in the first week of a
     *  year.
     */
    def getMinimalDaysInFirstWeek(locale: Locale): Int
}
