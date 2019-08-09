package javax.imageio.event

import java.util.EventListener

// An interface used by ImageReader implementations to
// notify callers of their image and thumbnail reading methods of
// warnings (non-fatal errors).  Fatal errors cause the relevant
// read method to throw an IIOException.
//
//  Localization is handled by associating a Locale
// with each IIOReadWarningListener as it is registered
// with an ImageReader.  It is up to the
// ImageReader to provide localized messages.
trait IIOReadWarningListener extends EventListener {
}
