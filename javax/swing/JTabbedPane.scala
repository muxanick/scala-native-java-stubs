package javax.swing

import java.awt.{Color, Component, Container, Rectangle}
import java.awt.event.MouseEvent
import java.io.Serializable
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.TabbedPaneUI

// A component that lets the user switch between a group of components by
// clicking on a tab with a given title and/or icon.
// For examples and information on using tabbed panes see
// How to Use Tabbed Panes,
// a section in The Java Tutorial.
// 
// Tabs/components are added to a TabbedPane object by using the
// addTab and insertTab methods.
// A tab is represented by an index corresponding
// to the position it was added in, where the first tab has an index equal to 0
// and the last tab has an index equal to the tab count minus 1.
// 
// The TabbedPane uses a SingleSelectionModel
// to represent the set
// of tab indices and the currently selected index.  If the tab count
// is greater than 0, then there will always be a selected index, which
// by default will be initialized to the first tab.  If the tab count is
// 0, then the selected index will be -1.
// 
// The tab title can be rendered by a Component.
// For example, the following produce similar results:
// 
// // In this case the look and feel renders the title for the tab.
// tabbedPane.addTab("Tab", myComponent);
// // In this case the custom component is responsible for rendering the
// // title of the tab.
// tabbedPane.addTab(null, myComponent);
// tabbedPane.setTabComponentAt(0, new JLabel("Tab"));
// 
// The latter is typically used when you want a more complex user interaction
// that requires custom components on the tab.  For example, you could
// provide a custom component that animates or one that has widgets for
// closing the tab.
// 
// If you specify a component for a tab, the JTabbedPane
// will not render any text or icon you have specified for the tab.
// 
// Note:
// Do not use setVisible directly on a tab component to make it visible,
// use setSelectedComponent or setSelectedIndex methods instead.
// 
// Warning: Swing is not thread safe. For more
// information see Swing's Threading
// Policy.
// 
// Warning:
// Serialized objects of this class will not be compatible with
// future Swing releases. The current serialization support is
// appropriate for short term storage or RMI between applications running
// the same version of Swing.  As of 1.4, support for long term storage
// of all JavaBeans™
// has been added to the java.beans package.
// Please see XMLEncoder.
class JTabbedPane extends JComponent with Serializable, with Accessible, with SwingConstants {

    @stub
    // Creates an empty TabbedPane with a default
    // tab placement of JTabbedPane.TOP.
    def this() = ???

    @stub
    // Creates an empty TabbedPane with the specified tab placement
    // of either: JTabbedPane.TOP, JTabbedPane.BOTTOM,
    // JTabbedPane.LEFT, or JTabbedPane.RIGHT.
    def this(tabPlacement: Int) = ???

    @stub
    // This class implements accessibility support for the
    // JTabbedPane class.
    protected def JTabbedPane.AccessibleJTabbedPane: class = ???

    @stub
    // Only one ChangeEvent is needed per TabPane
    // instance since the
    // event's only (read-only) state is the source property.
    protected def changeEvent: ChangeEvent = ???

    @stub
    // The changeListener is the listener we add to the
    // model.
    protected def changeListener: ChangeListener = ???

    @stub
    // The default selection model
    protected def model: SingleSelectionModel = ???

    @stub
    // Where the tabs are placed.
    protected def tabPlacement: Int = ???

    @stub
    // Adds a component with a tab title defaulting to
    // the name of the component which is the result of calling
    // component.getName.
    def add(component: Component): Component = ???

    @stub
    // Adds a component at the specified tab index with a tab
    // title defaulting to the name of the component.
    def add(component: Component, index: Int): Component = ???

    @stub
    // Adds a component to the tabbed pane.
    def add(component: Component, constraints: Object): Unit = ???

    @stub
    // Adds a component at the specified tab index.
    def add(component: Component, constraints: Object, index: Int): Unit = ???

    @stub
    // Adds a component with the specified tab title.
    def add(title: String, component: Component): Component = ???

    @stub
    // Adds a ChangeListener to this tabbedpane.
    def addChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Adds a component represented by a title
    // and no icon.
    def addTab(title: String, component: Component): Unit = ???

    @stub
    // Adds a component represented by a title
    // and/or icon, either of which can be null.
    def addTab(title: String, icon: Icon, component: Component): Unit = ???

    @stub
    // Adds a component and tip
    // represented by a title and/or icon,
    // either of which can be null.
    def addTab(title: String, icon: Icon, component: Component, tip: String): Unit = ???

    @stub
    // Subclasses that want to handle ChangeEvents differently
    // can override this to return a subclass of ModelListener or
    // another ChangeListener implementation.
    protected def createChangeListener(): ChangeListener = ???

    @stub
    // Sends a ChangeEvent, with this JTabbedPane as the source,
    // to each registered listener.
    protected def fireStateChanged(): Unit = ???

    @stub
    // Gets the AccessibleContext associated with this JTabbedPane.
    def getAccessibleContext(): AccessibleContext = ???

    @stub
    // Returns the tab background color at index.
    def getBackgroundAt(index: Int): Color = ???

    @stub
    // Returns the tab bounds at index.
    def getBoundsAt(index: Int): Rectangle = ???

    @stub
    // Returns an array of all the ChangeListeners added
    // to this JTabbedPane with addChangeListener.
    def getChangeListeners(): Array[ChangeListener] = ???

    @stub
    // Returns the component at index.
    def getComponentAt(index: Int): Component = ???

    @stub
    // Returns the tab disabled icon at index.
    def getDisabledIconAt(index: Int): Icon = ???

    @stub
    // Returns the character, as an index, that the look and feel should
    // provide decoration for as representing the mnemonic character.
    def getDisplayedMnemonicIndexAt(tabIndex: Int): Int = ???

    @stub
    // Returns the tab foreground color at index.
    def getForegroundAt(index: Int): Color = ???

    @stub
    // Returns the tab icon at index.
    def getIconAt(index: Int): Icon = ???

    @stub
    // Returns the keyboard mnemonic for accessing the specified tab.
    def getMnemonicAt(tabIndex: Int): Int = ???

    @stub
    // Returns the model associated with this tabbedpane.
    def getModel(): SingleSelectionModel = ???

    @stub
    // Returns the currently selected component for this tabbedpane.
    def getSelectedComponent(): Component = ???

    @stub
    // Returns the currently selected index for this tabbedpane.
    def getSelectedIndex(): Int = ???

    @stub
    // Returns the tab component at index.
    def getTabComponentAt(index: Int): Component = ???

    @stub
    // Returns the number of tabs in this tabbedpane.
    def getTabCount(): Int = ???

    @stub
    // Returns the policy used by the tabbedpane to layout the tabs when all the
    // tabs will not fit within a single run.
    def getTabLayoutPolicy(): Int = ???

    @stub
    // Returns the placement of the tabs for this tabbedpane.
    def getTabPlacement(): Int = ???

    @stub
    // Returns the number of tab runs currently used to display
    // the tabs.
    def getTabRunCount(): Int = ???

    @stub
    // Returns the tab title at index.
    def getTitleAt(index: Int): String = ???

    @stub
    // Returns the tooltip text for the component determined by the
    // mouse event location.
    def getToolTipText(event: MouseEvent): String = ???

    @stub
    // Returns the tab tooltip text at index.
    def getToolTipTextAt(index: Int): String = ???

    @stub
    // Returns the UI object which implements the L&F for this component.
    def getUI(): TabbedPaneUI = ???

    @stub
    // Returns the name of the UI class that implements the
    // L&F for this component.
    def getUIClassID(): String = ???

    @stub
    // Returns the tab index corresponding to the tab whose bounds
    // intersect the specified location.
    def indexAtLocation(x: Int, y: Int): Int = ???

    @stub
    // Returns the index of the tab for the specified component.
    def indexOfComponent(component: Component): Int = ???

    @stub
    // Returns the first tab index with a given icon,
    // or -1 if no tab has this icon.
    def indexOfTab(icon: Icon): Int = ???

    @stub
    // Returns the first tab index with a given title,  or
    // -1 if no tab has this title.
    def indexOfTab(title: String): Int = ???

    @stub
    // Returns the index of the tab for the specified tab component.
    def indexOfTabComponent(tabComponent: Component): Int = ???

    @stub
    // Inserts a new tab for the given component, at the given index,
    // represented by the given title and/or icon, either of which may
    // be null.
    def insertTab(title: String, icon: Icon, component: Component, tip: String, index: Int): Unit = ???

    @stub
    // Returns whether or not the tab at index is
    // currently enabled.
    def isEnabledAt(index: Int): Boolean = ???

    @stub
    // Returns a string representation of this JTabbedPane.
    protected def paramString(): String = ???

    @stub
    // Removes the specified Component from the
    // JTabbedPane.
    def remove(component: Component): Unit = ???

    @stub
    // Removes the tab and component which corresponds to the specified index.
    def remove(index: Int): Unit = ???

    @stub
    // Removes all the tabs and their corresponding components
    // from the tabbedpane.
    def removeAll(): Unit = ???

    @stub
    // Removes a ChangeListener from this tabbedpane.
    def removeChangeListener(l: ChangeListener): Unit = ???

    @stub
    // Removes the tab at index.
    def removeTabAt(index: Int): Unit = ???

    @stub
    // Sets the background color at index to
    // background
    // which can be null, in which case the tab's background color
    // will default to the background color of the tabbedpane.
    def setBackgroundAt(index: Int, background: Color): Unit = ???

    @stub
    // Sets the component at index to component.
    def setComponentAt(index: Int, component: Component): Unit = ???

    @stub
    // Sets the disabled icon at index to icon
    // which can be null.
    def setDisabledIconAt(index: Int, disabledIcon: Icon): Unit = ???

    @stub
    // Provides a hint to the look and feel as to which character in the
    // text should be decorated to represent the mnemonic.
    def setDisplayedMnemonicIndexAt(tabIndex: Int, mnemonicIndex: Int): Unit = ???

    @stub
    // Sets whether or not the tab at index is enabled.
    def setEnabledAt(index: Int, enabled: Boolean): Unit = ???

    @stub
    // Sets the foreground color at index to
    // foreground which can be
    // null, in which case the tab's foreground color
    // will default to the foreground color of this tabbedpane.
    def setForegroundAt(index: Int, foreground: Color): Unit = ???

    @stub
    // Sets the icon at index to icon which can be
    // null.
    def setIconAt(index: Int, icon: Icon): Unit = ???

    @stub
    // Sets the keyboard mnemonic for accessing the specified tab.
    def setMnemonicAt(tabIndex: Int, mnemonic: Int): Unit = ???

    @stub
    // Sets the model to be used with this tabbedpane.
    def setModel(model: SingleSelectionModel): Unit = ???

    @stub
    // Sets the selected component for this tabbedpane.
    def setSelectedComponent(c: Component): Unit = ???

    @stub
    // Sets the selected index for this tabbedpane.
    def setSelectedIndex(index: Int): Unit = ???

    @stub
    // Sets the component that is responsible for rendering the
    // title for the specified tab.
    def setTabComponentAt(index: Int, component: Component): Unit = ???

    @stub
    // Sets the policy which the tabbedpane will use in laying out the tabs
    // when all the tabs will not fit within a single run.
    def setTabLayoutPolicy(tabLayoutPolicy: Int): Unit = ???

    @stub
    // Sets the tab placement for this tabbedpane.
    def setTabPlacement(tabPlacement: Int): Unit = ???

    @stub
    // Sets the title at index to title which
    // can be null.
    def setTitleAt(index: Int, title: String): Unit = ???

    @stub
    // Sets the tooltip text at index to toolTipText
    // which can be null.
    def setToolTipTextAt(index: Int, toolTipText: String): Unit = ???

    @stub
    // Sets the UI object which implements the L&F for this component.
    def setUI(ui: TabbedPaneUI): Unit = ???
}

object JTabbedPane {
    @stub
    // Tab layout policy for providing a subset of available tabs when all
    // the tabs will not fit within a single run.
    def SCROLL_TAB_LAYOUT: Int = ???
}
