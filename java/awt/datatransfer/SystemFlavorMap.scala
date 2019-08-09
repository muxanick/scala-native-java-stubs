package java.awt.datatransfer

import java.lang.{Object, String}
import java.util.{List, Map}
import scala.scalanative.annotation.stub

/** The SystemFlavorMap is a configurable map between "natives" (Strings), which
 *  correspond to platform-specific data formats, and "flavors" (DataFlavors),
 *  which correspond to platform-independent MIME types. This mapping is used
 *  by the data transfer subsystem to transfer data between Java and native
 *  applications, and between Java applications in separate VMs.
 *  
 */
final class SystemFlavorMap extends Object with FlavorMap with FlavorTable {

    /** Adds a mapping from a single String native to a single
     *  DataFlavor.
     */
    @stub
    def addFlavorForUnencodedNative(nat: String, flav: DataFlavor): Unit = ???

    /** Adds a mapping from the specified DataFlavor (and all
     *  DataFlavors equal to the specified DataFlavor)
     *  to the specified String native.
     */
    @stub
    def addUnencodedNativeForFlavor(flav: DataFlavor, nat: String): Unit = ???

    /** Returns a List of DataFlavors to which the
     *  specified String native can be translated by the data
     *  transfer subsystem.
     */
    @stub
    def getFlavorsForNative(nat: String): List[DataFlavor] = ???

    /** Returns a Map of the specified String natives
     *  to their most preferred DataFlavor.
     */
    @stub
    def getFlavorsForNatives(natives: Array[String]): Map[String, DataFlavor] = ???

    /** Returns a List of String natives to which the
     *  specified DataFlavor can be translated by the data transfer
     *  subsystem.
     */
    @stub
    def getNativesForFlavor(flav: DataFlavor): List[String] = ???

    /** Returns a Map of the specified DataFlavors to
     *  their most preferred String native.
     */
    @stub
    def getNativesForFlavors(flavors: Array[DataFlavor]): Map[DataFlavor, String] = ???

    /** Discards the current mappings for the specified String
     *  native, and creates new mappings to the specified
     *  DataFlavors.
     */
    @stub
    def setFlavorsForNative(nat: String, flavors: Array[DataFlavor]): Unit = ???

    /** Discards the current mappings for the specified DataFlavor
     *  and all DataFlavors equal to the specified
     *  DataFlavor, and creates new mappings to the
     *  specified String natives.
     */
    @stub
    def setNativesForFlavor(flav: DataFlavor, natives: Array[String]): Unit = ???
}

object SystemFlavorMap {
    /** Decodes a String native for use as a
     *  DataFlavor.
     */
    @stub
    def decodeDataFlavor(nat: String): DataFlavor = ???

    /** Decodes a String native for use as a Java MIME type. */
    @stub
    def decodeJavaMIMEType(nat: String): String = ???

    /** Encodes a DataFlavor for use as a String
     *  native.
     */
    @stub
    def encodeDataFlavor(flav: DataFlavor): String = ???

    /** Encodes a MIME type for use as a String native. */
    @stub
    def encodeJavaMIMEType(mimeType: String): String = ???

    /** Returns the default FlavorMap for this thread's ClassLoader. */
    @stub
    def getDefaultFlavorMap(): FlavorMap = ???

    /** Returns whether the specified String is an encoded Java
     *  MIME type.
     */
    @stub
    def isJavaMIMEType(str: String): Boolean = ???
}
