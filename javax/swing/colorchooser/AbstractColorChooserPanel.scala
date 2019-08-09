package javax.swing.colorchooser

import java.awt.{Color, Component, Container, Graphics}
import java.lang.{Object, String}
import javax.swing.{Icon, JColorChooser, JComponent, JPanel}

// This is the abstract superclass for color choosers.  If you want to add
// a new color chooser panel into a JColorChooser, subclass
// this class.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
abstract class AbstractColorChooserPanel extends JPanel {

    // Builds a new chooser panel.
    protected def buildChooser(): Unit

    // Returns the color that is currently selected.
    protected def getColorFromModel(): Color

    // Returns the model that the chooser panel is editing.
    def getColorSelectionModel(): ColorSelectionModel

    // Provides a hint to the look and feel as to the index of the character in
    // getDisplayName that should be visually identified as the
    // mnemonic.
    def getDisplayedMnemonicIndex(): Int

    // Returns a string containing the display name of the panel.
    def getDisplayName(): String

    // Returns the large display icon for the panel.
    def getLargeDisplayIcon(): Icon

    // Provides a hint to the look and feel as to the
    // KeyEvent.VK constant that can be used as a mnemonic to
    // access the panel.
    def getMnemonic(): Int

    // Returns the small display icon for the panel.
    def getSmallDisplayIcon(): Icon

    // Invoked when the panel is added to the chooser.
    def installChooserPanel(enclosingChooser: JColorChooser): Unit

    // Draws the panel.
    def paint(g: Graphics): Unit

    // Invoked when the panel is removed from the chooser.
    def uninstallChooserPanel(enclosingChooser: JColorChooser): Unit
}
