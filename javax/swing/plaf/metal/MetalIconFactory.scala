package javax.swing.plaf.metal

import java.io.Serializable
import java.lang.Object
import javax.swing.Icon

// Factory object that vends Icons for
// the Java™ look and feel (Metal).
// These icons are used extensively in Metal via the defaults mechanism.
// While other look and feels often use GIFs for icons, creating icons
// in code facilitates switching to other themes.
//
// 
// Each method in this class returns
// either an Icon or null,
// where null implies that there is no default icon.
//
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class MetalIconFactory extends Object with Serializable {
}

object MetalIconFactory {
    @stub
    // 
    // Warning:
    // Serialized objects of this class will not be compatible with
    // future Swing releases.
    def MetalIconFactory.FileIcon16: class = ???

    @stub
    // 
    // Warning:
    // Serialized objects of this class will not be compatible with
    // future Swing releases.
    def MetalIconFactory.FolderIcon16: class = ???

    @stub
    // Defines an icon for Palette close
    def MetalIconFactory.PaletteCloseIcon: class = ???

    @stub
    // 
    // Warning:
    // Serialized objects of this class will not be compatible with
    // future Swing releases.
    def MetalIconFactory.TreeControlIcon: class = ???

    @stub
    // 
    // Warning:
    // Serialized objects of this class will not be compatible with
    // future Swing releases.
    def MetalIconFactory.TreeFolderIcon: class = ???

    @stub
    // 
    def DARK: Boolean = ???

    @stub
    // Returns a checkbox icon.
    def getCheckBoxIcon(): Icon = ???

    @stub
    // 
    def getCheckBoxMenuItemIcon(): Icon = ???

    @stub
    // 
    def getFileChooserDetailViewIcon(): Icon = ???

    @stub
    // 
    def getFileChooserHomeFolderIcon(): Icon = ???

    @stub
    // 
    def getFileChooserListViewIcon(): Icon = ???

    @stub
    // 
    def getFileChooserNewFolderIcon(): Icon = ???

    @stub
    // 
    def getFileChooserUpFolderIcon(): Icon = ???

    @stub
    // 
    def getHorizontalSliderThumbIcon(): Icon = ???

    @stub
    // 
    def getInternalFrameAltMaximizeIcon(size: Int): Icon = ???

    @stub
    // 
    def getInternalFrameCloseIcon(size: Int): Icon = ???

    @stub
    // 
    def getInternalFrameDefaultMenuIcon(): Icon = ???

    @stub
    // 
    def getInternalFrameMaximizeIcon(size: Int): Icon = ???

    @stub
    // 
    def getInternalFrameMinimizeIcon(size: Int): Icon = ???

    @stub
    // 
    def getMenuArrowIcon(): Icon = ???

    @stub
    // 
    def getMenuItemArrowIcon(): Icon = ???

    @stub
    // Returns an icon to be used by JCheckBoxMenuItem.
    def getMenuItemCheckIcon(): Icon = ???

    @stub
    // 
    def getRadioButtonIcon(): Icon = ???

    @stub
    // 
    def getRadioButtonMenuItemIcon(): Icon = ???

    @stub
    // 
    def getTreeComputerIcon(): Icon = ???

    @stub
    // 
    def getTreeControlIcon(isCollapsed: Boolean): Icon = ???

    @stub
    // 
    def getTreeFloppyDriveIcon(): Icon = ???

    @stub
    // 
    def getTreeFolderIcon(): Icon = ???

    @stub
    // 
    def getTreeHardDriveIcon(): Icon = ???

    @stub
    // 
    def getTreeLeafIcon(): Icon = ???
}
