package javax.imageio.event

import java.util.EventListener

// An interface used by ImageWriter implementations to
// notify callers of their image and thumbnail reading methods of
// warnings (non-fatal errors).  Fatal errors cause the relevant
// read method to throw an IIOException.
//
//  Localization is handled by associating a Locale
// with each IIOWriteWarningListener as it is registered
// with an ImageWriter.  It is up to the
// ImageWriter to provide localized messages.
trait IIOWriteWarningListener extends EventListener {
}
