package java.awt.datatransfer

import java.lang.String
import java.util.Map

/** A two-way Map between "natives" (Strings), which correspond to platform-
 *  specific data formats, and "flavors" (DataFlavors), which correspond to
 *  platform-independent MIME types. FlavorMaps need not be symmetric, but
 *  typically are.
 */
trait FlavorMap {

    /** Returns a Map of the specified String natives
     *  to their corresponding DataFlavor.
     */
    @stub
    def getFlavorsForNatives(natives: Array[String]): Map[String, DataFlavor] = ???
}
