package java.io

import java.lang.FunctionalInterface
import scala.scalanative.annotation.stub

/** A filter for abstract pathnames.
 * 
 *   Instances of this interface may be passed to the listFiles(FileFilter) method
 *  of the File class.
 */
@FunctionalInterface
trait FileFilter {

    /** Tests whether or not the specified abstract pathname should be
     *  included in a pathname list.
     */
    @stub
    def accept(pathname: File): Boolean = ???
}
