package java.util.logging

import java.io.Serializable
import java.lang.{Object, String}
import scala.scalanative.annotation.stub

/** The Level class defines a set of standard logging levels that
 *  can be used to control logging output.  The logging Level objects
 *  are ordered and are specified by ordered integers.  Enabling logging
 *  at a given level also enables logging at all higher levels.
 *  
 *  Clients should normally use the predefined Level constants such
 *  as Level.SEVERE.
 *  
 *  The levels in descending order are:
 *  
 *  SEVERE (highest value)
 *  WARNING
 *  INFO
 *  CONFIG
 *  FINE
 *  FINER
 *  FINEST  (lowest value)
 *  
 *  In addition there is a level OFF that can be used to turn
 *  off logging, and a level ALL that can be used to enable
 *  logging of all messages.
 *  
 *  It is possible for third parties to define additional logging
 *  levels by subclassing Level.  In such cases subclasses should
 *  take care to chose unique integer level values and to ensure that
 *  they maintain the Object uniqueness property across serialization
 *  by defining a suitable readResolve method.
 */
class Level extends Object with Serializable {

    /** Create a named Level with a given integer value. */
    @stub
    protected def this(name: String, value: Int) = ???

    /** Create a named Level with a given integer value and a
     *  given localization resource name.
     */
    @stub
    protected def this(name: String, value: Int, resourceBundleName: String) = ???

    /** Compare two objects for value equality. */
    @stub
    def equals(ox: Any): Boolean = ???

    /** Return the localized string name of the Level, for
     *  the current default locale.
     */
    @stub
    def getLocalizedName(): String = ???

    /** Return the non-localized string name of the Level. */
    @stub
    def getName(): String = ???

    /** Return the level's localization resource bundle name, or
     *  null if no localization bundle is defined.
     */
    @stub
    def getResourceBundleName(): String = ???

    /** Generate a hashcode. */
    @stub
    def hashCode(): Int = ???

    /** Get the integer value for this level. */
    @stub
    def intValue(): Int = ???

    /** Returns a string representation of this Level. */
    @stub
    def toString(): String = ???
}

object Level {
    /** ALL indicates that all messages should be logged. */
    @stub
    val ALL: Level = ???

    /** CONFIG is a message level for static configuration messages. */
    @stub
    val CONFIG: Level = ???

    /** FINE is a message level providing tracing information. */
    @stub
    val FINE: Level = ???

    /** FINER indicates a fairly detailed tracing message. */
    @stub
    val FINER: Level = ???

    /** FINEST indicates a highly detailed tracing message. */
    @stub
    val FINEST: Level = ???

    /** INFO is a message level for informational messages. */
    @stub
    val INFO: Level = ???

    /** OFF is a special level that can be used to turn off logging. */
    @stub
    val OFF: Level = ???

    /** SEVERE is a message level indicating a serious failure. */
    @stub
    val SEVERE: Level = ???

    /** WARNING is a message level indicating a potential problem. */
    @stub
    val WARNING: Level = ???

    /** Parse a level name string into a Level. */
    @stub
    def parse(name: String): Level = ???
}
