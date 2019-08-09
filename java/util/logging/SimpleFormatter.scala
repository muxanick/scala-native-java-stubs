package java.util.logging

import java.lang.Object

/** Print a brief summary of the LogRecord in a human readable
 *  format.  The summary will typically be 1 or 2 lines.
 * 
 *  
 *  
 *  Configuration:
 *  The SimpleFormatter is initialized with the
 *  format string
 *  specified in the java.util.logging.SimpleFormatter.format
 *  property to format the log messages.
 *  This property can be defined
 *  in the logging properties
 *  configuration file
 *  or as a system property.  If this property is set in both
 *  the logging properties and system properties,
 *  the format string specified in the system property will be used.
 *  If this property is not defined or the given format string
 *  is illegal,
 *  the default format is implementation-specific.
 */
class SimpleFormatter extends Formatter {
}
