package java.awt.datatransfer

import java.lang.String
import java.util.List

/** A FlavorMap which relaxes the traditional 1-to-1 restriction of a Map. A
 *  flavor is permitted to map to any number of natives, and likewise a native
 *  is permitted to map to any number of flavors. FlavorTables need not be
 *  symmetric, but typically are.
 */
trait FlavorTable extends FlavorMap {

    /** Returns a List of DataFlavors to which the
     *  specified String corresponds.
     */
    @stub
    def getFlavorsForNative(nat: String): List[DataFlavor] = ???
}
