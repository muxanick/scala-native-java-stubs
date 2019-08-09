package javax.imageio.event

import java.lang.String
import java.util.EventListener
import javax.imageio.ImageReader
import scala.scalanative.annotation.stub

/** An interface used by ImageReader implementations to
 *  notify callers of their image and thumbnail reading methods of
 *  warnings (non-fatal errors).  Fatal errors cause the relevant
 *  read method to throw an IIOException.
 * 
 *   Localization is handled by associating a Locale
 *  with each IIOReadWarningListener as it is registered
 *  with an ImageReader.  It is up to the
 *  ImageReader to provide localized messages.
 */
trait IIOReadWarningListener extends EventListener {

    /** Reports the occurrence of a non-fatal error in decoding. */
    @stub
    def warningOccurred(source: ImageReader, warning: String): Unit = ???
}
