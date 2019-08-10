package javax.swing.plaf.basic

import java.awt.event.{ActionEvent, MouseAdapter, MouseEvent, MouseListener}
import java.beans.PropertyChangeListener
import java.io.File
import java.lang.{Boolean, Object, String}
import java.util.Hashtable
import javax.swing.{AbstractAction, Action, Icon, JButton, JComponent, JFileChooser, JList, JPanel}
import javax.swing.event.{ListSelectionEvent, ListSelectionListener}
import javax.swing.filechooser.{FileFilter, FileView}
import javax.swing.plaf.{ComponentUI, FileChooserUI}
import scala.scalanative.annotation.stub

/** Basic L&F implementation of a FileChooser. */
class BasicFileChooserUI extends FileChooserUI {

    /**  */
    @stub
    def this(b: JFileChooser) = ???

    /**  */
    protected class AcceptAllFileFilter extends FileFilter {

        /**  */
        @stub
        def this() = ???

        /** Whether the given file is accepted by this filter. */
        @stub
        def accept(f: File): Boolean = ???

        /** The description of this filter. */
        @stub
        def getDescription(): String = ???
    }


    /** Responds to an Open or Save request */
    protected class ApproveSelectionAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /**  */
    protected class BasicFileView extends FileView {

        /**  */
        @stub
        def this() = ???

        /**  */
        @stub
        protected val iconCache: Hashtable[File, Icon] = ???

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

        /**  */
        @stub
        def isHidden(f: File): Boolean = ???
    }


    /** Responds to a cancel request. */
    protected class CancelSelectionAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /**  */
    protected class ChangeToParentDirectoryAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /**  */
    protected class DoubleClickListener extends MouseAdapter {

        /**  */
        @stub
        def this(list: JList) = ???

        /** Invoked when the mouse button has been clicked (pressed
         *  and released) on a component.
         */
        @stub
        def mouseClicked(e: MouseEvent): Unit = ???

        /** The JList used for representing the files is created by subclasses, but the
         *  selection is monitored in this class.
         */
        @stub
        def mouseEntered(e: MouseEvent): Unit = ???
    }


    /** Acts on the "home" key event or equivalent event. */
    protected class GoHomeAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /** Creates a new folder. */
    protected class NewFolderAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /**  */
    protected class SelectionListener extends Object with ListSelectionListener {

        /**  */
        @stub
        protected def this() = ???

        /** Called whenever the value of the selection changes. */
        @stub
        def valueChanged(e: ListSelectionEvent): Unit = ???
    }


    /** Rescans the files in the current directory */
    protected class UpdateAction extends AbstractAction {

        /**  */
        @stub
        protected def this() = ???

        /** Invoked when an action occurs. */
        @stub
        def actionPerformed(e: ActionEvent): Unit = ???
    }


    /**  */
    @stub
    protected val cancelButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val cancelButtonText: String = ???

    /**  */
    @stub
    protected val cancelButtonToolTipText: String = ???

    /**  */
    @stub
    protected val computerIcon: Icon = ???

    /**  */
    @stub
    protected val detailsViewIcon: Icon = ???

    /**  */
    @stub
    protected val directoryIcon: Icon = ???

    /** The mnemonic keycode used for the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonMnemonic: Int = ???

    /** The label text displayed on the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonText: String = ???

    /** The tooltip text displayed on the approve button when a directory
     *  is selected and the current selection mode is FILES_ONLY.
     */
    @stub
    protected val directoryOpenButtonToolTipText: String = ???

    /**  */
    @stub
    protected val fileIcon: Icon = ???

    /**  */
    @stub
    protected val floppyDriveIcon: Icon = ???

    /**  */
    @stub
    protected val hardDriveIcon: Icon = ???

    /**  */
    @stub
    protected val helpButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val helpButtonText: String = ???

    /**  */
    @stub
    protected val helpButtonToolTipText: String = ???

    /**  */
    @stub
    protected val homeFolderIcon: Icon = ???

    /**  */
    @stub
    protected val listViewIcon: Icon = ???

    /**  */
    @stub
    protected val newFolderIcon: Icon = ???

    /**  */
    @stub
    protected val openButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val openButtonText: String = ???

    /**  */
    @stub
    protected val openButtonToolTipText: String = ???

    /**  */
    @stub
    protected val saveButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val saveButtonText: String = ???

    /**  */
    @stub
    protected val saveButtonToolTipText: String = ???

    /**  */
    @stub
    protected val updateButtonMnemonic: Int = ???

    /**  */
    @stub
    protected val updateButtonText: String = ???

    /**  */
    @stub
    protected val updateButtonToolTipText: String = ???

    /**  */
    @stub
    protected val upFolderIcon: Icon = ???

    /**  */
    @stub
    protected val viewMenuIcon: Icon = ???

    /**  */
    @stub
    def clearIconCache(): Unit = ???

    /**  */
    @stub
    protected def createDoubleClickListener(fc: JFileChooser, list: JList): MouseListener = ???

    /**  */
    @stub
    def createListSelectionListener(fc: JFileChooser): ListSelectionListener = ???

    /**  */
    @stub
    protected def createModel(): Unit = ???

    /**  */
    @stub
    def createPropertyChangeListener(fc: JFileChooser): PropertyChangeListener = ???

    /**  */
    @stub
    def ensureFileIsVisible(fc: JFileChooser, f: File): Unit = ???

    /** Returns the default accept all file filter */
    @stub
    def getAcceptAllFileFilter(fc: JFileChooser): FileFilter = ???

    /**  */
    @stub
    def getAccessoryPanel(): JPanel = ???

    /**  */
    @stub
    protected def getApproveButton(fc: JFileChooser): JButton = ???

    /**  */
    @stub
    def getApproveButtonMnemonic(fc: JFileChooser): Int = ???

    /**  */
    @stub
    def getApproveButtonText(fc: JFileChooser): String = ???

    /**  */
    @stub
    def getApproveButtonToolTipText(fc: JFileChooser): String = ???

    /**  */
    @stub
    def getApproveSelectionAction(): Action = ???

    /**  */
    @stub
    def getCancelSelectionAction(): Action = ???

    /**  */
    @stub
    def getChangeToParentDirectoryAction(): Action = ???

    /** Returns default button for current LookAndFeel. */
    @stub
    def getDefaultButton(fc: JFileChooser): JButton = ???

    /** Returns the title of this dialog */
    @stub
    def getDialogTitle(fc: JFileChooser): String = ???

    /** Property to remember the directory that is currently selected in the UI. */
    @stub
    protected def getDirectory(): File = ???

    /**  */
    @stub
    def getDirectoryName(): String = ???

    /**  */
    @stub
    def getFileChooser(): JFileChooser = ???

    /**  */
    @stub
    def getFileName(): String = ???

    /**  */
    @stub
    def getFileView(fc: JFileChooser): FileView = ???

    /**  */
    @stub
    def getGoHomeAction(): Action = ???

    /**  */
    @stub
    def getModel(): BasicDirectoryModel = ???

    /**  */
    @stub
    def getNewFolderAction(): Action = ???

    /**  */
    @stub
    def getUpdateAction(): Action = ???

    /**  */
    @stub
    def installComponents(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installDefaults(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installIcons(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installListeners(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def installStrings(fc: JFileChooser): Unit = ???

    /** Configures the specified component appropriately for the look and feel. */
    @stub
    def installUI(c: JComponent): Unit = ???

    /** Property to remember whether a directory is currently selected in the UI. */
    @stub
    protected def isDirectorySelected(): Boolean = ???

    /**  */
    @stub
    def rescanCurrentDirectory(fc: JFileChooser): Unit = ???

    /** Property to remember the directory that is currently selected in the UI. */
    @stub
    protected def setDirectory(f: File): Unit = ???

    /**  */
    @stub
    def setDirectoryName(dirname: String): Unit = ???

    /** Property to remember whether a directory is currently selected in the UI. */
    @stub
    protected def setDirectorySelected(b: Boolean): Unit = ???

    /**  */
    @stub
    def setFileName(filename: String): Unit = ???

    /**  */
    @stub
    def uninstallComponents(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallDefaults(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallIcons(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallListeners(fc: JFileChooser): Unit = ???

    /**  */
    @stub
    protected def uninstallStrings(fc: JFileChooser): Unit = ???

    /** Reverses configuration which was done on the specified component during
     *  installUI.
     */
    @stub
    def uninstallUI(c: JComponent): Unit = ???
}

object BasicFileChooserUI {
    /** Creates a BasicFileChooserUI implementation
     *  for the specified component.
     */
    @stub
    def createUI(c: JComponent): ComponentUI = ???
}
