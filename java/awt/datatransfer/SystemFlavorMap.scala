package java.awt.datatransfer

import java.lang.{Object, String}
import java.util.{List, Map}

// The SystemFlavorMap is a configurable map between "natives" (Strings), which
// correspond to platform-specific data formats, and "flavors" (DataFlavors),
// which correspond to platform-independent MIME types. This mapping is used
// by the data transfer subsystem to transfer data between Java and native
// applications, and between Java applications in separate VMs.
// 
final class SystemFlavorMap extends Object with FlavorMap, with FlavorTable {

    @stub
    // Adds a mapping from a single String native to a single
    // DataFlavor.
    def addFlavorForUnencodedNative(nat: String, flav: DataFlavor): Unit = ???

    @stub
    // Adds a mapping from the specified DataFlavor (and all
    // DataFlavors equal to the specified DataFlavor)
    // to the specified String native.
    def addUnencodedNativeForFlavor(flav: DataFlavor, nat: String): Unit = ???

    @stub
    // Returns a List of DataFlavors to which the
    // specified String native can be translated by the data
    // transfer subsystem.
    def getFlavorsForNative(nat: String): List[DataFlavor] = ???

    @stub
    // Returns a Map of the specified String natives
    // to their most preferred DataFlavor.
    def getFlavorsForNatives(natives: Array[String]): Map[String, DataFlavor] = ???

    @stub
    // Returns a List of String natives to which the
    // specified DataFlavor can be translated by the data transfer
    // subsystem.
    def getNativesForFlavor(flav: DataFlavor): List[String] = ???

    @stub
    // Returns a Map of the specified DataFlavors to
    // their most preferred String native.
    def getNativesForFlavors(flavors: Array[DataFlavor]): Map[DataFlavor, String] = ???

    @stub
    // Discards the current mappings for the specified String
    // native, and creates new mappings to the specified
    // DataFlavors.
    def setFlavorsForNative(nat: String, flavors: Array[DataFlavor]): Unit = ???
}

object SystemFlavorMap {
    @stub
    // Decodes a String native for use as a
    // DataFlavor.
    def decodeDataFlavor(nat: String): DataFlavor = ???

    @stub
    // Decodes a String native for use as a Java MIME type.
    def decodeJavaMIMEType(nat: String): String = ???

    @stub
    // Encodes a DataFlavor for use as a String
    // native.
    def encodeDataFlavor(flav: DataFlavor): String = ???

    @stub
    // Encodes a MIME type for use as a String native.
    def encodeJavaMIMEType(mimeType: String): String = ???

    @stub
    // Returns the default FlavorMap for this thread's ClassLoader.
    def getDefaultFlavorMap(): FlavorMap = ???

    @stub
    // Returns whether the specified String is an encoded Java
    // MIME type.
    def isJavaMIMEType(str: String): Boolean = ???
}
