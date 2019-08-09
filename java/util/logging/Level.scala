package java.util.logging

import java.io.Serializable
import java.lang.{Object, String}

// The Level class defines a set of standard logging levels that
// can be used to control logging output.  The logging Level objects
// are ordered and are specified by ordered integers.  Enabling logging
// at a given level also enables logging at all higher levels.
// 
// Clients should normally use the predefined Level constants such
// as Level.SEVERE.
// 
// The levels in descending order are:
// 
// SEVERE (highest value)
// WARNING
// INFO
// CONFIG
// FINE
// FINER
// FINEST  (lowest value)
// 
// In addition there is a level OFF that can be used to turn
// off logging, and a level ALL that can be used to enable
// logging of all messages.
// 
// It is possible for third parties to define additional logging
// levels by subclassing Level.  In such cases subclasses should
// take care to chose unique integer level values and to ensure that
// they maintain the Object uniqueness property across serialization
// by defining a suitable readResolve method.
class Level extends Object with Serializable {

    @stub
    // Create a named Level with a given integer value.
    protected def this(name: String, value: Int) = ???

    @stub
    // Compare two objects for value equality.
    def equals(ox: Object): Boolean = ???

    @stub
    // Return the localized string name of the Level, for
    // the current default locale.
    def getLocalizedName(): String = ???

    @stub
    // Return the non-localized string name of the Level.
    def getName(): String = ???

    @stub
    // Return the level's localization resource bundle name, or
    // null if no localization bundle is defined.
    def getResourceBundleName(): String = ???

    @stub
    // Generate a hashcode.
    def hashCode(): Int = ???

    @stub
    // Get the integer value for this level.
    def intValue(): Int = ???
}

object Level {
    @stub
    // ALL indicates that all messages should be logged.
    def ALL: Level = ???

    @stub
    // CONFIG is a message level for static configuration messages.
    def CONFIG: Level = ???

    @stub
    // FINE is a message level providing tracing information.
    def FINE: Level = ???

    @stub
    // FINER indicates a fairly detailed tracing message.
    def FINER: Level = ???

    @stub
    // FINEST indicates a highly detailed tracing message.
    def FINEST: Level = ???

    @stub
    // INFO is a message level for informational messages.
    def INFO: Level = ???

    @stub
    // OFF is a special level that can be used to turn off logging.
    def OFF: Level = ???

    @stub
    // SEVERE is a message level indicating a serious failure.
    def SEVERE: Level = ???

    @stub
    // Parse a level name string into a Level.
    def parse(name: String): Level = ???
}
