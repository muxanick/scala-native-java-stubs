package java.util.spi

import java.lang.Object
import java.util.Locale

/** An abstract class for service providers that provide locale-dependent Calendar parameters. */
abstract class CalendarDataProvider extends LocaleServiceProvider {

    /** Returns the first day of a week in the given locale. */
    def getFirstDayOfWeek(locale: Locale): Int
}
