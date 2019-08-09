package javax.swing

import java.awt.{Component, Container}
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.plaf.DesktopIconUI

// This component represents an iconified version of a
// JInternalFrame.
// This API should NOT BE USED by Swing applications, as it will go
// away in future versions of Swing as its functionality is moved into
// JInternalFrame.  This class is public only so that
// UI objects can display a desktop icon.  If an application
// wants to display a desktop icon, it should create a
// JInternalFrame instance and iconify it.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
object JInternalFrame.JDesktopIcon extends JComponent with Accessible {

    @stub
    // Gets the AccessibleContext associated with this JDesktopIcon.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Convenience method to ask the icon for the Desktop
    // object it belongs to.
    def getDesktopPane(): JDesktopPane = ???

    @stub
    // Returns the JInternalFrame that this
    // DesktopIcon is associated with.
    def getInternalFrame(): JInternalFrame = ???

    @stub
    // Returns the look-and-feel object that renders this component.
    def getUI(): DesktopIconUI = ???

    @stub
    // Returns the name of the look-and-feel
    // class that renders this component.
    def getUIClassID(): String = ???

    @stub
    // Sets the JInternalFrame with which this
    // DesktopIcon is associated.
    def setInternalFrame(f: JInternalFrame): Unit = ???

    @stub
    // Sets the look-and-feel object that renders this component.
    def setUI(ui: DesktopIconUI): Unit = ???
}
