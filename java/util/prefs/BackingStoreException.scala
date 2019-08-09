package java.util.prefs

import java.lang.{Exception, Object, String, Throwable}

/** Thrown to indicate that a preferences operation could not complete because
 *  of a failure in the backing store, or a failure to contact the backing
 *  store.
 */
class BackingStoreException extends Exception {

    /** Constructs a BackingStoreException with the specified detail message. */
    @stub
    def this(s: String) = ???
}
