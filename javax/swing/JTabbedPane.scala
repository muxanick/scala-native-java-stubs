package javax.swing

import java.awt.{Color, Component, Container, Rectangle}
import java.awt.event.MouseEvent
import java.io.Serializable
import java.lang.{Object, String}
import javax.accessibility.{Accessible, AccessibleContext}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.TabbedPaneUI

/** A component that lets the user switch between a group of components by
 *  clicking on a tab with a given title and/or icon.
 *  For examples and information on using tabbed panes see
 *  How to Use Tabbed Panes,
 *  a section in The Java Tutorial.
 *  
 *  Tabs/components are added to a TabbedPane object by using the
 *  addTab and insertTab methods.
 *  A tab is represented by an index corresponding
 *  to the position it was added in, where the first tab has an index equal to 0
 *  and the last tab has an index equal to the tab count minus 1.
 *  
 *  The TabbedPane uses a SingleSelectionModel
 *  to represent the set
 *  of tab indices and the currently selected index.  If the tab count
 *  is greater than 0, then there will always be a selected index, which
 *  by default will be initialized to the first tab.  If the tab count is
 *  0, then the selected index will be -1.
 *  
 *  The tab title can be rendered by a Component.
 *  For example, the following produce similar results:
 *  
 *  // In this case the look and feel renders the title for the tab.
 *  tabbedPane.addTab("Tab", myComponent);
 *  // In this case the custom component is responsible for rendering the
 *  // title of the tab.
 *  tabbedPane.addTab(null, myComponent);
 *  tabbedPane.setTabComponentAt(0, new JLabel("Tab"));
 *  
 *  The latter is typically used when you want a more complex user interaction
 *  that requires custom components on the tab.  For example, you could
 *  provide a custom component that animates or one that has widgets for
 *  closing the tab.
 *  
 *  If you specify a component for a tab, the JTabbedPane
 *  will not render any text or icon you have specified for the tab.
 *  
 *  Note:
 *  Do not use setVisible directly on a tab component to make it visible,
 *  use setSelectedComponent or setSelectedIndex methods instead.
 *  
 *  Warning: Swing is not thread safe. For more
 *  information see Swing's Threading
 *  Policy.
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
class JTabbedPane extends JComponent with Serializable with Accessible with SwingConstants {

    /** Creates an empty TabbedPane with a default
     *  tab placement of JTabbedPane.TOP.
     */
    @stub
    def this() = ???

    /** Creates an empty TabbedPane with the specified tab placement
     *  of either: JTabbedPane.TOP, JTabbedPane.BOTTOM,
     *  JTabbedPane.LEFT, or JTabbedPane.RIGHT.
     */
    @stub
    def this(tabPlacement: Int) = ???

    /** This class implements accessibility support for the
     *  JTabbedPane class.
     */
    @stub
    protected object AccessibleJTabbedPane extends JTabbedPane.AccessibleJTabbedPane

    /** Only one ChangeEvent is needed per TabPane
     *  instance since the
     *  event's only (read-only) state is the source property.
     */
    @stub
    protected val changeEvent: ChangeEvent = ???

    /** The changeListener is the listener we add to the
     *  model.
     */
    @stub
    protected val changeListener: ChangeListener = ???

    /** The default selection model */
    @stub
    protected val model: SingleSelectionModel = ???

    /** Where the tabs are placed. */
    @stub
    protected val tabPlacement: Int = ???

    /** Adds a component with a tab title defaulting to
     *  the name of the component which is the result of calling
     *  component.getName.
     */
    @stub
    def add(component: Component): Component = ???

    /** Adds a component at the specified tab index with a tab
     *  title defaulting to the name of the component.
     */
    @stub
    def add(component: Component, index: Int): Component = ???

    /** Adds a component to the tabbed pane. */
    @stub
    def add(component: Component, constraints: Object): Unit = ???

    /** Adds a component at the specified tab index. */
    @stub
    def add(component: Component, constraints: Object, index: Int): Unit = ???

    /** Adds a component with the specified tab title. */
    @stub
    def add(title: String, component: Component): Component = ???

    /** Adds a ChangeListener to this tabbedpane. */
    @stub
    def addChangeListener(l: ChangeListener): Unit = ???

    /** Adds a component represented by a title
     *  and no icon.
     */
    @stub
    def addTab(title: String, component: Component): Unit = ???

    /** Adds a component represented by a title
     *  and/or icon, either of which can be null.
     */
    @stub
    def addTab(title: String, icon: Icon, component: Component): Unit = ???

    /** Adds a component and tip
     *  represented by a title and/or icon,
     *  either of which can be null.
     */
    @stub
    def addTab(title: String, icon: Icon, component: Component, tip: String): Unit = ???

    /** Subclasses that want to handle ChangeEvents differently
     *  can override this to return a subclass of ModelListener or
     *  another ChangeListener implementation.
     */
    @stub
    protected def createChangeListener(): ChangeListener = ???

    /** Sends a ChangeEvent, with this JTabbedPane as the source,
     *  to each registered listener.
     */
    @stub
    protected def fireStateChanged(): Unit = ???

    /** Gets the AccessibleContext associated with this JTabbedPane. */
    @stub
    def getAccessibleContext(): AccessibleContext = ???

    /** Returns the tab background color at index. */
    @stub
    def getBackgroundAt(index: Int): Color = ???

    /** Returns the tab bounds at index. */
    @stub
    def getBoundsAt(index: Int): Rectangle = ???

    /** Returns an array of all the ChangeListeners added
     *  to this JTabbedPane with addChangeListener.
     */
    @stub
    def getChangeListeners(): Array[ChangeListener] = ???

    /** Returns the component at index. */
    @stub
    def getComponentAt(index: Int): Component = ???

    /** Returns the tab disabled icon at index. */
    @stub
    def getDisabledIconAt(index: Int): Icon = ???

    /** Returns the character, as an index, that the look and feel should
     *  provide decoration for as representing the mnemonic character.
     */
    @stub
    def getDisplayedMnemonicIndexAt(tabIndex: Int): Int = ???

    /** Returns the tab foreground color at index. */
    @stub
    def getForegroundAt(index: Int): Color = ???

    /** Returns the tab icon at index. */
    @stub
    def getIconAt(index: Int): Icon = ???

    /** Returns the keyboard mnemonic for accessing the specified tab. */
    @stub
    def getMnemonicAt(tabIndex: Int): Int = ???

    /** Returns the model associated with this tabbedpane. */
    @stub
    def getModel(): SingleSelectionModel = ???

    /** Returns the currently selected component for this tabbedpane. */
    @stub
    def getSelectedComponent(): Component = ???

    /** Returns the currently selected index for this tabbedpane. */
    @stub
    def getSelectedIndex(): Int = ???

    /** Returns the tab component at index. */
    @stub
    def getTabComponentAt(index: Int): Component = ???

    /** Returns the number of tabs in this tabbedpane. */
    @stub
    def getTabCount(): Int = ???

    /** Returns the policy used by the tabbedpane to layout the tabs when all the
     *  tabs will not fit within a single run.
     */
    @stub
    def getTabLayoutPolicy(): Int = ???

    /** Returns the placement of the tabs for this tabbedpane. */
    @stub
    def getTabPlacement(): Int = ???

    /** Returns the number of tab runs currently used to display
     *  the tabs.
     */
    @stub
    def getTabRunCount(): Int = ???

    /** Returns the tab title at index. */
    @stub
    def getTitleAt(index: Int): String = ???

    /** Returns the tooltip text for the component determined by the
     *  mouse event location.
     */
    @stub
    def getToolTipText(event: MouseEvent): String = ???

    /** Returns the tab tooltip text at index. */
    @stub
    def getToolTipTextAt(index: Int): String = ???

    /** Returns the UI object which implements the L&F for this component. */
    @stub
    def getUI(): TabbedPaneUI = ???

    /** Returns the name of the UI class that implements the
     *  L&F for this component.
     */
    @stub
    def getUIClassID(): String = ???

    /** Returns the tab index corresponding to the tab whose bounds
     *  intersect the specified location.
     */
    @stub
    def indexAtLocation(x: Int, y: Int): Int = ???

    /** Returns the index of the tab for the specified component. */
    @stub
    def indexOfComponent(component: Component): Int = ???

    /** Returns the first tab index with a given icon,
     *  or -1 if no tab has this icon.
     */
    @stub
    def indexOfTab(icon: Icon): Int = ???

    /** Returns the first tab index with a given title,  or
     *  -1 if no tab has this title.
     */
    @stub
    def indexOfTab(title: String): Int = ???

    /** Returns the index of the tab for the specified tab component. */
    @stub
    def indexOfTabComponent(tabComponent: Component): Int = ???

    /** Inserts a new tab for the given component, at the given index,
     *  represented by the given title and/or icon, either of which may
     *  be null.
     */
    @stub
    def insertTab(title: String, icon: Icon, component: Component, tip: String, index: Int): Unit = ???

    /** Returns whether or not the tab at index is
     *  currently enabled.
     */
    @stub
    def isEnabledAt(index: Int): Boolean = ???

    /** Returns a string representation of this JTabbedPane. */
    @stub
    protected def paramString(): String = ???

    /** Removes the specified Component from the
     *  JTabbedPane.
     */
    @stub
    def remove(component: Component): Unit = ???

    /** Removes the tab and component which corresponds to the specified index. */
    @stub
    def remove(index: Int): Unit = ???

    /** Removes all the tabs and their corresponding components
     *  from the tabbedpane.
     */
    @stub
    def removeAll(): Unit = ???

    /** Removes a ChangeListener from this tabbedpane. */
    @stub
    def removeChangeListener(l: ChangeListener): Unit = ???

    /** Removes the tab at index. */
    @stub
    def removeTabAt(index: Int): Unit = ???

    /** Sets the background color at index to
     *  background
     *  which can be null, in which case the tab's background color
     *  will default to the background color of the tabbedpane.
     */
    @stub
    def setBackgroundAt(index: Int, background: Color): Unit = ???

    /** Sets the component at index to component. */
    @stub
    def setComponentAt(index: Int, component: Component): Unit = ???

    /** Sets the disabled icon at index to icon
     *  which can be null.
     */
    @stub
    def setDisabledIconAt(index: Int, disabledIcon: Icon): Unit = ???

    /** Provides a hint to the look and feel as to which character in the
     *  text should be decorated to represent the mnemonic.
     */
    @stub
    def setDisplayedMnemonicIndexAt(tabIndex: Int, mnemonicIndex: Int): Unit = ???

    /** Sets whether or not the tab at index is enabled. */
    @stub
    def setEnabledAt(index: Int, enabled: Boolean): Unit = ???

    /** Sets the foreground color at index to
     *  foreground which can be
     *  null, in which case the tab's foreground color
     *  will default to the foreground color of this tabbedpane.
     */
    @stub
    def setForegroundAt(index: Int, foreground: Color): Unit = ???

    /** Sets the icon at index to icon which can be
     *  null.
     */
    @stub
    def setIconAt(index: Int, icon: Icon): Unit = ???

    /** Sets the keyboard mnemonic for accessing the specified tab. */
    @stub
    def setMnemonicAt(tabIndex: Int, mnemonic: Int): Unit = ???

    /** Sets the model to be used with this tabbedpane. */
    @stub
    def setModel(model: SingleSelectionModel): Unit = ???

    /** Sets the selected component for this tabbedpane. */
    @stub
    def setSelectedComponent(c: Component): Unit = ???

    /** Sets the selected index for this tabbedpane. */
    @stub
    def setSelectedIndex(index: Int): Unit = ???

    /** Sets the component that is responsible for rendering the
     *  title for the specified tab.
     */
    @stub
    def setTabComponentAt(index: Int, component: Component): Unit = ???

    /** Sets the policy which the tabbedpane will use in laying out the tabs
     *  when all the tabs will not fit within a single run.
     */
    @stub
    def setTabLayoutPolicy(tabLayoutPolicy: Int): Unit = ???

    /** Sets the tab placement for this tabbedpane. */
    @stub
    def setTabPlacement(tabPlacement: Int): Unit = ???

    /** Sets the title at index to title which
     *  can be null.
     */
    @stub
    def setTitleAt(index: Int, title: String): Unit = ???

    /** Sets the tooltip text at index to toolTipText
     *  which can be null.
     */
    @stub
    def setToolTipTextAt(index: Int, toolTipText: String): Unit = ???

    /** Sets the UI object which implements the L&F for this component. */
    @stub
    def setUI(ui: TabbedPaneUI): Unit = ???
}

object JTabbedPane {
    /** Tab layout policy for providing a subset of available tabs when all
     *  the tabs will not fit within a single run.
     */
    @stub
    val SCROLL_TAB_LAYOUT: Int = ???
}
