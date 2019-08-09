package java.time.chrono

import java.lang.String
import java.time.format.TextStyle
import java.time.temporal.{Temporal, TemporalAccessor, TemporalAdjuster, TemporalField, TemporalQuery}
import java.util.Locale

// An era of the time-line.
// 
// Most calendar systems have a single epoch dividing the time-line into two eras.
// However, some calendar systems, have multiple eras, such as one for the reign
// of each leader.
// In all cases, the era is conceptually the largest division of the time-line.
// Each chronology defines the Era's that are known Eras and a
// Chronology.eras to get the valid eras.
// 
// For example, the Thai Buddhist calendar system divides time into two eras,
// before and after a single date. By contrast, the Japanese calendar system
// has one era for the reign of each Emperor.
// 
// Instances of Era may be compared using the == operator.
trait Era extends TemporalAccessor , TemporalAdjuster {

    @stub
    // Adjusts the specified temporal object to have the same era as this object.
    def Temporal: default = ???

    @stub
    // Gets the value of the specified field from this era as an int.
    def Int: default = ???

    @stub
    // Gets the textual representation of this era.
    def String: default = ???

    @stub
    // Gets the value of the specified field from this era as a long.
    def Long: default = ???

    @stub
    // Gets the numeric value associated with the era as defined by the chronology.
    def getValue(): Int = ???

    @stub
    // Checks if the specified field is supported.
    def Boolean: default = ???

    @stub
    // Queries this era using the specified query.
    def R: default[R] = ???
}
