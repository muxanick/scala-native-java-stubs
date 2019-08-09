package javax.xml.transform.sax

import java.lang.String
import javax.xml.transform.Templates
import org.xml.sax.ContentHandler

/** A SAX ContentHandler that may be used to process SAX
 *  parse events (parsing transformation instructions) into a Templates object.
 * 
 *  Note that TemplatesHandler does not need to implement LexicalHandler.
 */
trait TemplatesHandler extends ContentHandler {

    /** Get the base ID (URI or system ID) from where relative
     *  URLs will be resolved.
     */
    @stub
    def getSystemId(): String = ???

    /** When a TemplatesHandler object is used as a ContentHandler
     *  for the parsing of transformation instructions, it creates a Templates object,
     *  which the caller can get once the SAX events have been completed.
     */
    @stub
    def getTemplates(): Templates = ???
}
