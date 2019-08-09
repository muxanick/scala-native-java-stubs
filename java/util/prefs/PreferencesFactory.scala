package java.util.prefs

import scala.scalanative.annotation.stub

/** A factory object that generates Preferences objects.  Providers of
 *  new Preferences implementations should provide corresponding
 *  PreferencesFactory implementations so that the new
 *  Preferences implementation can be installed in place of the
 *  platform-specific default implementation.
 * 
 *  This class is for Preferences implementers only.
 *  Normal users of the Preferences facility should have no need to
 *  consult this documentation.
 */
trait PreferencesFactory {

    /** Returns the system root preference node. */
    @stub
    def systemRoot(): Preferences = ???

    /** Returns the user root preference node corresponding to the calling
     *  user.
     */
    @stub
    def userRoot(): Preferences = ???
}
