package javax.swing.plaf.metal

import java.awt.{Component, Graphics}
import java.io.Serializable
import java.lang.Object
import javax.swing.Icon
import javax.swing.plaf.UIResource
import scala.scalanative.annotation.stub

/** Factory object that vends Icons for
 *  the Java™ look and feel (Metal).
 *  These icons are used extensively in Metal via the defaults mechanism.
 *  While other look and feels often use GIFs for icons, creating icons
 *  in code facilitates switching to other themes.
 * 
 *  
 *  Each method in this class returns
 *  either an Icon or null,
 *  where null implies that there is no default icon.
 * 
 *  
 *  Warning:
 *  Serialized objects of this class will not be compatible with
 *  future Swing releases. The current serialization support is
 *  appropriate for short term storage or RMI between applications running
 *  the same version of Swing.  As of 1.4, support for long term storage
 *  of all JavaBeans™
 *  has been added to the java.beans package.
 *  Please see XMLEncoder.
 */
class MetalIconFactory extends Object with Serializable {

    /**  */
    @stub
    def this() = ???
}

object MetalIconFactory {
    /** 
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    object FileIcon16 extends Object with Icon with Serializable {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        def getAdditionalHeight(): Int = ???

        /** Returns the icon's height. */
        @stub
        def getIconHeight(): Int = ???

        /** Returns the icon's width. */
        @stub
        def getIconWidth(): Int = ???

        /**  */
        @stub
        def getShift(): Int = ???

        /** Draw the icon at the specified location. */
        @stub
        def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
    }


    /** 
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    object FolderIcon16 extends Object with Icon with Serializable {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        def getAdditionalHeight(): Int = ???

        /** Returns the icon's height. */
        @stub
        def getIconHeight(): Int = ???

        /** Returns the icon's width. */
        @stub
        def getIconWidth(): Int = ???

        /**  */
        @stub
        def getShift(): Int = ???

        /** Draw the icon at the specified location. */
        @stub
        def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
    }


    /** Defines an icon for Palette close */
    object PaletteCloseIcon extends Object with Icon with UIResource with Serializable {

        /**  */
        @stub
        def apply() = ???

        /** Returns the icon's height. */
        @stub
        def getIconHeight(): Int = ???

        /** Returns the icon's width. */
        @stub
        def getIconWidth(): Int = ???

        /** Draw the icon at the specified location. */
        @stub
        def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
    }


    /** 
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    object TreeControlIcon extends Object with Icon with Serializable {

        /**  */
        @stub
        def apply(isCollapsed: Boolean) = ???

        /**  */
        @stub
        protected val isLight: Boolean = ???

        /** Returns the icon's height. */
        @stub
        def getIconHeight(): Int = ???

        /** Returns the icon's width. */
        @stub
        def getIconWidth(): Int = ???

        /** Draw the icon at the specified location. */
        @stub
        def paintIcon(c: Component, g: Graphics, x: Int, y: Int): Unit = ???

        /**  */
        @stub
        def paintMe(c: Component, g: Graphics, x: Int, y: Int): Unit = ???
    }


    /** 
     *  Warning:
     *  Serialized objects of this class will not be compatible with
     *  future Swing releases. The current serialization support is
     *  appropriate for short term storage or RMI between applications running
     *  the same version of Swing.  As of 1.4, support for long term storage
     *  of all JavaBeans™
     *  has been added to the java.beans package.
     *  Please see XMLEncoder.
     */
    object TreeFolderIcon extends MetalIconFactory.FolderIcon16 {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        def getAdditionalHeight(): Int = ???

        /**  */
        @stub
        def getShift(): Int = ???
    }


    /**  */
    object TreeLeafIcon extends MetalIconFactory.FileIcon16 {

        /**  */
        @stub
        def apply() = ???

        /**  */
        @stub
        def getAdditionalHeight(): Int = ???

        /**  */
        @stub
        def getShift(): Int = ???
    }


    /**  */
    @stub
    val DARK: Boolean = ???

    /**  */
    @stub
    val LIGHT: Boolean = ???

    /** Returns a checkbox icon. */
    @stub
    def getCheckBoxIcon(): Icon = ???

    /**  */
    @stub
    def getCheckBoxMenuItemIcon(): Icon = ???

    /**  */
    @stub
    def getFileChooserDetailViewIcon(): Icon = ???

    /**  */
    @stub
    def getFileChooserHomeFolderIcon(): Icon = ???

    /**  */
    @stub
    def getFileChooserListViewIcon(): Icon = ???

    /**  */
    @stub
    def getFileChooserNewFolderIcon(): Icon = ???

    /**  */
    @stub
    def getFileChooserUpFolderIcon(): Icon = ???

    /**  */
    @stub
    def getHorizontalSliderThumbIcon(): Icon = ???

    /**  */
    @stub
    def getInternalFrameAltMaximizeIcon(size: Int): Icon = ???

    /**  */
    @stub
    def getInternalFrameCloseIcon(size: Int): Icon = ???

    /**  */
    @stub
    def getInternalFrameDefaultMenuIcon(): Icon = ???

    /**  */
    @stub
    def getInternalFrameMaximizeIcon(size: Int): Icon = ???

    /**  */
    @stub
    def getInternalFrameMinimizeIcon(size: Int): Icon = ???

    /**  */
    @stub
    def getMenuArrowIcon(): Icon = ???

    /**  */
    @stub
    def getMenuItemArrowIcon(): Icon = ???

    /** Returns an icon to be used by JCheckBoxMenuItem. */
    @stub
    def getMenuItemCheckIcon(): Icon = ???

    /**  */
    @stub
    def getRadioButtonIcon(): Icon = ???

    /**  */
    @stub
    def getRadioButtonMenuItemIcon(): Icon = ???

    /**  */
    @stub
    def getTreeComputerIcon(): Icon = ???

    /**  */
    @stub
    def getTreeControlIcon(isCollapsed: Boolean): Icon = ???

    /**  */
    @stub
    def getTreeFloppyDriveIcon(): Icon = ???

    /**  */
    @stub
    def getTreeFolderIcon(): Icon = ???

    /**  */
    @stub
    def getTreeHardDriveIcon(): Icon = ???

    /**  */
    @stub
    def getTreeLeafIcon(): Icon = ???

    /**  */
    @stub
    def getVerticalSliderThumbIcon(): Icon = ???
}
