package java.util.logging

import java.lang.FunctionalInterface

// A Filter can be used to provide fine grain control over
// what is logged, beyond the control provided by log levels.
// 
// Each Logger and each Handler can have a filter associated with it.
// The Logger or Handler will call the isLoggable method to check
// if a given LogRecord should be published.  If isLoggable returns
// false, the LogRecord will be discarded.
@FunctionalInterface trait Filter {
}
