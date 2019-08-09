package javax.swing.plaf.basic

import java.io.File
import java.lang.{Object, String}
import javax.swing.Icon
import javax.swing.filechooser.FileView

// 
protected class BasicFileChooserUI.BasicFileView extends FileView {

    @stub
    // 
    def cacheIcon(f: File, i: Icon): Unit = ???

    @stub
    // 
    def clearIconCache(): Unit = ???

    @stub
    // 
    def getCachedIcon(f: File): Icon = ???

    @stub
    // A human readable description of the file.
    def getDescription(f: File): String = ???

    @stub
    // The icon that represents this file in the JFileChooser.
    def getIcon(f: File): Icon = ???

    @stub
    // The name of the file.
    def getName(f: File): String = ???

    @stub
    // A human readable description of the type of the file.
    def getTypeDescription(f: File): String = ???
}
