package javax.print

import java.io.Reader
import java.lang.Object
import javax.print.attribute.DocAttributeSet

// This class is an implementation of interface Doc that can
// be used in many common printing requests.
// It can handle all of the presently defined "pre-defined" doc flavors
// defined as static variables in the DocFlavor class.
// 
// In particular this class implements certain required semantics of the
// Doc specification as follows:
// 
// constructs a stream for the service if requested and appropriate.
// ensures the same object is returned for each call on a method.
// ensures multiple threads can access the Doc
// performs some validation of that the data matches the doc flavor.
// 
// Clients who want to re-use the doc object in other jobs,
// or need a MultiDoc will not want to use this class.
// 
// If the print data is a stream, or a print job requests data as a
// stream, then SimpleDoc does not monitor if the service
// properly closes the stream after data transfer completion or job
// termination.
// Clients may prefer to use provide their own implementation of doc that
// adds a listener to monitor job completion and to validate that
// resources such as streams are freed (ie closed).
final class SimpleDoc extends Object with Doc {

    @stub
    // Obtains the set of printing attributes for this doc object.
    def getAttributes(): DocAttributeSet = ???

    @stub
    // Determines the doc flavor in which this doc object will supply its
    // piece of print data.
    def getDocFlavor(): DocFlavor = ???

    @stub
    // Obtains the print data representation object that contains this doc
    // object's piece of print data in the format corresponding to the
    // supported doc flavor.
    def getPrintData(): Object = ???

    @stub
    // Obtains a reader for extracting character print data from this doc.
    def getReaderForText(): Reader = ???
}
