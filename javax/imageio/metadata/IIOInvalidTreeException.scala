package javax.imageio.metadata

import java.io.IOException
import java.lang.{Exception, Object, String, Throwable}
import javax.imageio.IIOException
import org.w3c.dom.Node

/** An IIOInvalidTreeException is thrown when an attempt
 *  by an IIOMetadata object to parse a tree of
 *  IIOMetadataNodes fails.  The node that led to the
 *  parsing error may be stored.  As with any parsing error, the actual
 *  error may occur at a different point that that where it is
 *  detected.  The node returned by getOffendingNode
 *  should merely be considered as a clue to the actual nature of the
 *  problem.
 */
class IIOInvalidTreeException extends IIOException {

    /** Constructs an IIOInvalidTreeException with a
     *  message string and a reference to the Node that
     *  caused the parsing error.
     */
    @stub
    def this(message: String, offendingNode: Node) = ???
}
