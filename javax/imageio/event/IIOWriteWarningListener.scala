package javax.imageio.event

import java.lang.String
import java.util.EventListener
import javax.imageio.ImageWriter
import scala.scalanative.annotation.stub

/** An interface used by ImageWriter implementations to
 *  notify callers of their image and thumbnail reading methods of
 *  warnings (non-fatal errors).  Fatal errors cause the relevant
 *  read method to throw an IIOException.
 * 
 *   Localization is handled by associating a Locale
 *  with each IIOWriteWarningListener as it is registered
 *  with an ImageWriter.  It is up to the
 *  ImageWriter to provide localized messages.
 */
trait IIOWriteWarningListener extends EventListener {

    /** Reports the occurrence of a non-fatal error in encoding. */
    @stub
    def warningOccurred(source: ImageWriter, imageIndex: Int, warning: String): Unit = ???
}
