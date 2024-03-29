package javax.swing

import java.awt.{Component, Component.AccessibleAWTComponent, Container, Container.AccessibleAWTContainer, Graphics, Image, Insets, ItemSelectable, LayoutManager, Point, Rectangle}
import java.awt.event.{ActionEvent, ActionListener, ItemEvent, ItemListener}
import java.beans.PropertyChangeListener
import java.io.Serializable
import java.lang.{Number, Object, String}
import javax.accessibility.{AccessibleAction, AccessibleContext, AccessibleExtendedComponent, AccessibleIcon, AccessibleKeyBinding, AccessibleRelationSet, AccessibleStateSet, AccessibleText, AccessibleValue}
import javax.swing.event.{ChangeEvent, ChangeListener}
import javax.swing.plaf.ButtonUI
import javax.swing.text.AttributeSet
import scala.scalanative.annotation.stub

/** Defines common behaviors for buttons and menu items.
 *  
 *  Buttons can be configured, and to some degree controlled, by
 *  Actions.  Using an
 *  Action with a button has many benefits beyond directly
 *  configuring a button.  Refer to 
 *  Swing Components Supporting Action for more
 *  details, and you can find more information in How
 *  to Use Actions, a section in The Java Tutorial.
 *  
 *  For further information see
 *  How to Use Buttons, Check Boxes, and Radio Buttons,
 *  a section in The Java Tutorial.
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
abstract class AbstractButton extends JComponent with ItemSelectable with SwingConstants {

    /**  */
    @stub
    def this() = ???

    /** This class implements accessibility support for the
     *  AbstractButton class.  It provides an implementation of the
     *  Java Accessibility API appropriate to button and menu item
     *  user-interface elements.
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
    protected abstract class AccessibleAbstractButton extends JComponent.AccessibleJComponent with AccessibleAction with AccessibleValue with AccessibleText with AccessibleExtendedComponent {

        /**  */
        @stub
        protected def this() = ???

        /** Perform the specified Action on the object */
        def doAccessibleAction(i: Int): Boolean

        /** Get the AccessibleAction associated with this object. */
        def getAccessibleAction(): AccessibleAction

        /** Returns the number of Actions available in this object. */
        def getAccessibleActionCount(): Int

        /** Return a description of the specified action of the object. */
        def getAccessibleActionDescription(i: Int): String

        /** Get the AccessibleIcons associated with this object if one
         *  or more exist.
         */
        def getAccessibleIcon(): Array[AccessibleIcon]

        /** Returns key bindings associated with this object */
        def getAccessibleKeyBinding(): AccessibleKeyBinding

        /** Returns the accessible name of this object. */
        def getAccessibleName(): String

        /** Get the AccessibleRelationSet associated with this object if one
         *  exists.
         */
        def getAccessibleRelationSet(): AccessibleRelationSet

        /** Get the state set of this object. */
        def getAccessibleStateSet(): AccessibleStateSet

        /** Gets the AccessibleText associated with this object presenting
         *  text on the display.
         */
        def getAccessibleText(): AccessibleText

        /** Get the AccessibleValue associated with this object. */
        def getAccessibleValue(): AccessibleValue

        /** Returns the String after a given index. */
        def getAfterIndex(part: Int, index: Int): String

        /** Returns the String at a given index. */
        def getAtIndex(part: Int, index: Int): String

        /** Returns the String before a given index. */
        def getBeforeIndex(part: Int, index: Int): String

        /** Return the zero-based offset of the caret. */
        def getCaretPosition(): Int

        /** Return the AttributeSet for a given character at a given index */
        def getCharacterAttribute(i: Int): AttributeSet

        /** Determine the bounding box of the character at the given
         *  index into the string.
         */
        def getCharacterBounds(i: Int): Rectangle

        /** Return the number of characters (valid indicies) */
        def getCharCount(): Int

        /** Get the value of this object as a Number. */
        def getCurrentAccessibleValue(): Number

        /** Given a point in local coordinates, return the zero-based index
         *  of the character under that Point.
         */
        def getIndexAtPoint(p: Point): Int

        /** Get the maximum value of this object as a Number. */
        def getMaximumAccessibleValue(): Number

        /** Get the minimum value of this object as a Number. */
        def getMinimumAccessibleValue(): Number

        /** Returns the portion of the text that is selected. */
        def getSelectedText(): String

        /** Returns the end offset within the selected text. */
        def getSelectionEnd(): Int

        /** Returns the start offset within the selected text. */
        def getSelectionStart(): Int

        /** Returns the titled border text */
        def getTitledBorderText(): String

        /** Returns the tool tip text */
        def getToolTipText(): String

        /** Set the value of this object as a Number. */
        def setCurrentAccessibleValue(n: Number): Boolean
    }


    /** Extends ChangeListener to be serializable.
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
    protected class ButtonChangeListener extends Object with ChangeListener with Serializable {

        /** Invoked when the target of the listener has changed its state. */
        @stub
        def stateChanged(e: ChangeEvent): Unit = ???
    }


    /** The button model's ActionListener. */
    protected val actionListener: ActionListener

    /** Only one ChangeEvent is needed per button
     *  instance since the
     *  event's only state is the source property.
     */
    protected val changeEvent: ChangeEvent

    /** The button model's changeListener. */
    protected val changeListener: ChangeListener

    /** The button model's ItemListener. */
    protected val itemListener: ItemListener

    /** The data model that determines the button's state. */
    protected val model: ButtonModel

    /** Updates the button's state in response to property changes in the
     *  associated action.
     */
    protected def actionPropertyChanged(action: Action, propertyName: String): Unit

    /** Adds an ActionListener to the button. */
    def addActionListener(l: ActionListener): Unit

    /** Adds a ChangeListener to the button. */
    def addChangeListener(l: ChangeListener): Unit

    /** Adds the specified component to this container at the specified
     *  index, refer to
     *  Container.addImpl(Component, Object, int)
     *  for a complete description of this method.
     */
    protected def addImpl(comp: Component, constraints: Any, index: Int): Unit

    /** Adds an ItemListener to the checkbox. */
    def addItemListener(l: ItemListener): Unit

    /** Verify that the key argument is a legal value for the
     *  horizontalAlignment and horizontalTextPosition
     *  properties.
     */
    protected def checkHorizontalKey(key: Int, exception: String): Int

    /** Verify that the key argument is a legal value for the
     *  vertical properties.
     */
    protected def checkVerticalKey(key: Int, exception: String): Int

    /** Sets the properties on this button to match those in the specified
     *  Action.
     */
    protected def configurePropertiesFromAction(a: Action): Unit

    /**  */
    protected def createActionListener(): ActionListener

    /** Creates and returns a PropertyChangeListener that is
     *  responsible for listening for changes from the specified
     *  Action and updating the appropriate properties.
     */
    protected def createActionPropertyChangeListener(a: Action): PropertyChangeListener

    /** Subclasses that want to handle ChangeEvents differently
     *  can override this to return another ChangeListener
     *  implementation.
     */
    protected def createChangeListener(): ChangeListener

    /**  */
    protected def createItemListener(): ItemListener

    /** Programmatically perform a "click". */
    def doClick(): Unit

    /** Programmatically perform a "click". */
    def doClick(pressTime: Int): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireActionPerformed(event: ActionEvent): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireItemStateChanged(event: ItemEvent): Unit

    /** Notifies all listeners that have registered interest for
     *  notification on this event type.
     */
    protected def fireStateChanged(): Unit

    /** Returns the currently set Action for this
     *  ActionEvent source, or null
     *  if no Action is set.
     */
    def getAction(): Action

    /** Returns the action command for this button. */
    def getActionCommand(): String

    /** Returns an array of all the ActionListeners added
     *  to this AbstractButton with addActionListener().
     */
    def getActionListeners(): Array[ActionListener]

    /** Returns an array of all the ChangeListeners added
     *  to this AbstractButton with addChangeListener().
     */
    def getChangeListeners(): Array[ChangeListener]

    /** Returns the icon used by the button when it's disabled. */
    def getDisabledIcon(): Icon

    /** Returns the icon used by the button when it's disabled and selected. */
    def getDisabledSelectedIcon(): Icon

    /** Returns the character, as an index, that the look and feel should
     *  provide decoration for as representing the mnemonic character.
     */
    def getDisplayedMnemonicIndex(): Int

    /** Returns the value of the hideActionText property, which
     *  determines whether the button displays text from the
     *  Action.
     */
    def getHideActionText(): Boolean

    /** Returns the horizontal alignment of the icon and text. */
    def getHorizontalAlignment(): Int

    /** Returns the horizontal position of the text relative to the icon. */
    def getHorizontalTextPosition(): Int

    /** Returns the default icon. */
    def getIcon(): Icon

    /** Returns the amount of space between the text and the icon
     *  displayed in this button.
     */
    def getIconTextGap(): Int

    /** Returns an array of all the ItemListeners added
     *  to this AbstractButton with addItemListener().
     */
    def getItemListeners(): Array[ItemListener]

    /** Deprecated. 
     * - Replaced by getText
     * 
     */
    def getLabel(): String

    /** Returns the margin between the button's border and
     *  the label.
     */
    def getMargin(): Insets

    /** Returns the keyboard mnemonic from the the current model. */
    def getMnemonic(): Int

    /** Returns the model that this button represents. */
    def getModel(): ButtonModel

    /** Gets the amount of time (in milliseconds) required between
     *  mouse press events for the button to generate the corresponding
     *  action events.
     */
    def getMultiClickThreshhold(): Long

    /** Returns the pressed icon for the button. */
    def getPressedIcon(): Icon

    /** Returns the rollover icon for the button. */
    def getRolloverIcon(): Icon

    /** Returns the rollover selection icon for the button. */
    def getRolloverSelectedIcon(): Icon

    /** Returns the selected icon for the button. */
    def getSelectedIcon(): Icon

    /** Returns an array (length 1) containing the label or
     *  null if the button is not selected.
     */
    def getSelectedObjects(): Array[Object]

    /** Returns the button's text. */
    def getText(): String

    /** Returns the L&F object that renders this component. */
    def getUI(): ButtonUI

    /** Returns the vertical alignment of the text and icon. */
    def getVerticalAlignment(): Int

    /** Returns the vertical position of the text relative to the icon. */
    def getVerticalTextPosition(): Int

    /** This is overridden to return false if the current Icon's
     *  Image is not equal to the
     *  passed in Image img.
     */
    def imageUpdate(img: Image, infoflags: Int, x: Int, y: Int, w: Int, h: Int): Boolean

    /**  */
    protected def init(text: String, icon: Icon): Unit

    /** Gets the borderPainted property. */
    def isBorderPainted(): Boolean

    /** Gets the contentAreaFilled property. */
    def isContentAreaFilled(): Boolean

    /** Gets the paintFocus property. */
    def isFocusPainted(): Boolean

    /** Gets the rolloverEnabled property. */
    def isRolloverEnabled(): Boolean

    /** Returns the state of the button. */
    def isSelected(): Boolean

    /** Paint the button's border if BorderPainted
     *  property is true and the button has a border.
     */
    protected def paintBorder(g: Graphics): Unit

    /** Returns a string representation of this AbstractButton. */
    protected def paramString(): String

    /** Removes an ActionListener from the button. */
    def removeActionListener(l: ActionListener): Unit

    /** Removes a ChangeListener from the button. */
    def removeChangeListener(l: ChangeListener): Unit

    /** Removes an ItemListener from the button. */
    def removeItemListener(l: ItemListener): Unit

    /** Notifies this component that it no longer has a parent component. */
    def removeNotify(): Unit

    /** Sets the Action. */
    def setAction(a: Action): Unit

    /** Sets the action command for this button. */
    def setActionCommand(actionCommand: String): Unit

    /** Sets the borderPainted property. */
    def setBorderPainted(b: Boolean): Unit

    /** Sets the contentAreaFilled property. */
    def setContentAreaFilled(b: Boolean): Unit

    /** Sets the disabled icon for the button. */
    def setDisabledIcon(disabledIcon: Icon): Unit

    /** Sets the disabled selection icon for the button. */
    def setDisabledSelectedIcon(disabledSelectedIcon: Icon): Unit

    /** Provides a hint to the look and feel as to which character in the
     *  text should be decorated to represent the mnemonic.
     */
    def setDisplayedMnemonicIndex(index: Int): Unit

    /** Enables (or disables) the button. */
    def setEnabled(b: Boolean): Unit

    /** Sets the paintFocus property, which must
     *  be true for the focus state to be painted.
     */
    def setFocusPainted(b: Boolean): Unit

    /** Sets the hideActionText property, which determines
     *  whether the button displays text from the Action.
     */
    def setHideActionText(hideActionText: Boolean): Unit

    /** Sets the horizontal alignment of the icon and text. */
    def setHorizontalAlignment(alignment: Int): Unit

    /** Sets the horizontal position of the text relative to the icon. */
    def setHorizontalTextPosition(textPosition: Int): Unit

    /** Sets the button's default icon. */
    def setIcon(defaultIcon: Icon): Unit

    /** If both the icon and text properties are set, this property
     *  defines the space between them.
     */
    def setIconTextGap(iconTextGap: Int): Unit

    /** Deprecated. 
     * - Replaced by setText(text)
     * 
     */
    def setLabel(label: String): Unit

    /** Sets the layout manager for this container, refer to
     *  Container.setLayout(LayoutManager)
     *  for a complete description of this method.
     */
    def setLayout(mgr: LayoutManager): Unit

    /** Sets space for margin between the button's border and
     *  the label.
     */
    def setMargin(m: Insets): Unit

    /** This method is now obsolete, please use setMnemonic(int)
     *  to set the mnemonic for a button.
     */
    def setMnemonic(mnemonic: Char): Unit

    /** Sets the keyboard mnemonic on the current model. */
    def setMnemonic(mnemonic: Int): Unit

    /** Sets the model that this button represents. */
    def setModel(newModel: ButtonModel): Unit

    /** Sets the amount of time (in milliseconds) required between
     *  mouse press events for the button to generate the corresponding
     *  action events.
     */
    def setMultiClickThreshhold(threshhold: Long): Unit

    /** Sets the pressed icon for the button. */
    def setPressedIcon(pressedIcon: Icon): Unit

    /** Sets the rolloverEnabled property, which
     *  must be true for rollover effects to occur.
     */
    def setRolloverEnabled(b: Boolean): Unit

    /** Sets the rollover icon for the button. */
    def setRolloverIcon(rolloverIcon: Icon): Unit

    /** Sets the rollover selected icon for the button. */
    def setRolloverSelectedIcon(rolloverSelectedIcon: Icon): Unit

    /** Sets the state of the button. */
    def setSelected(b: Boolean): Unit

    /** Sets the selected icon for the button. */
    def setSelectedIcon(selectedIcon: Icon): Unit

    /** Sets the button's text. */
    def setText(text: String): Unit

    /** Sets the L&F object that renders this component. */
    def setUI(ui: ButtonUI): Unit

    /** Sets the vertical alignment of the icon and text. */
    def setVerticalAlignment(alignment: Int): Unit

    /** Sets the vertical position of the text relative to the icon. */
    def setVerticalTextPosition(textPosition: Int): Unit

    /** Resets the UI property to a value from the current look
     *  and feel.
     */
    def updateUI(): Unit
}

object AbstractButton {
    /** Identifies a change to having the border drawn,
     *  or having it not drawn.
     */
    @stub
    val BORDER_PAINTED_CHANGED_PROPERTY: String = ???

    /** Identifies a change to having the button paint the content area. */
    @stub
    val CONTENT_AREA_FILLED_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the button has
     *  been disabled.
     */
    @stub
    val DISABLED_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the button has been
     *  disabled and selected.
     */
    @stub
    val DISABLED_SELECTED_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change to having the border highlighted when focused,
     *  or not.
     */
    @stub
    val FOCUS_PAINTED_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's horizontal alignment. */
    @stub
    val HORIZONTAL_ALIGNMENT_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's horizontal text position. */
    @stub
    val HORIZONTAL_TEXT_POSITION_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon that represents the button. */
    @stub
    val ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's margins. */
    @stub
    val MARGIN_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the button's mnemonic. */
    @stub
    val MNEMONIC_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button model. */
    @stub
    val MODEL_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the button has been
     *  pressed.
     */
    @stub
    val PRESSED_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change from rollover enabled to disabled or back
     *  to enabled.
     */
    @stub
    val ROLLOVER_ENABLED_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the cursor is over
     *  the button.
     */
    @stub
    val ROLLOVER_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the cursor is
     *  over the button and it has been selected.
     */
    @stub
    val ROLLOVER_SELECTED_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change to the icon used when the button has
     *  been selected.
     */
    @stub
    val SELECTED_ICON_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's text. */
    @stub
    val TEXT_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's vertical alignment. */
    @stub
    val VERTICAL_ALIGNMENT_CHANGED_PROPERTY: String = ???

    /** Identifies a change in the button's vertical text position. */
    @stub
    val VERTICAL_TEXT_POSITION_CHANGED_PROPERTY: String = ???
}
