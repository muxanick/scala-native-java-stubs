package javax.swing.plaf.basic

import java.io.File
import java.lang.{Object, String}
import javax.swing.Icon
import javax.swing.filechooser.FileView

/**  */
protected class BasicFileChooserUI.BasicFileView extends FileView {

    /**  */
    @stub
    def cacheIcon(f: File, i: Icon): Unit = ???

    /**  */
    @stub
    def clearIconCache(): Unit = ???

    /**  */
    @stub
    def getCachedIcon(f: File): Icon = ???

    /** A human readable description of the file. */
    @stub
    def getDescription(f: File): String = ???

    /** The icon that represents this file in the JFileChooser. */
    @stub
    def getIcon(f: File): Icon = ???

    /** The name of the file. */
    @stub
    def getName(f: File): String = ???

    /** A human readable description of the type of the file. */
    @stub
    def getTypeDescription(f: File): String = ???
}
