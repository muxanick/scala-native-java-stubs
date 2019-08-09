package javax.swing.plaf.basic

import java.awt.{Dimension, Graphics, Point, Rectangle}
import java.beans.PropertyChangeEvent
import java.lang.{Object, String}
import javax.swing.JComponent
import javax.swing.plaf.{ComponentUI, TextUI}
import javax.swing.text.{Caret, EditorKit, Element, Highlighter, JTextComponent, Keymap, Position.Bias, View, ViewFactory}
import scala.scalanative.annotation.stub

/** 
 *  Basis of a text components look-and-feel.  This provides the
 *  basic editor view and controller services that may be useful
 *  when creating a look-and-feel for an extension of
 *  JTextComponent.
 *  
 *  Most state is held in the associated JTextComponent
 *  as bound properties, and the UI installs default values for the
 *  various properties.  This default will install something for
 *  all of the properties.  Typically, a LAF implementation will
 *  do more however.  At a minimum, a LAF would generally install
 *  key bindings.
 *  
 *  This class also provides some concurrency support if the
 *  Document associated with the JTextComponent is a subclass of
 *  AbstractDocument.  Access to the View (or View hierarchy) is
 *  serialized between any thread mutating the model and the Swing
 *  event thread (which is expected to render, do model/view coordinate
 *  translation, etc).  Any access to the root view should first
 *  acquire a read-lock on the AbstractDocument and release that lock
 *  in a finally block.
 *  
 *  An important method to define is the getPropertyPrefix() method
 *  which is used as the basis of the keys used to fetch defaults
 *  from the UIManager.  The string should reflect the type of
 *  TextUI (eg. TextField, TextArea, etc) without the particular
 *  LAF part of the name (eg Metal, Motif, etc).
 *  
 *  To build a view of the model, one of the following strategies
 *  can be employed.
 *  
 *  
 *  One strategy is to simply redefine the
 *  ViewFactory interface in the UI.  By default, this UI itself acts
 *  as the factory for View implementations.  This is useful
 *  for simple factories.  To do this reimplement the
 *  create(javax.swing.text.Element) method.
 *  
 *  A common strategy for creating more complex types of documents
 *  is to have the EditorKit implementation return a factory.  Since
 *  the EditorKit ties all of the pieces necessary to maintain a type
 *  of document, the factory is typically an important part of that
 *  and should be produced by the EditorKit implementation.
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
abstract class BasicTextUI extends TextUI with ViewFactory {

    /** Creates a new UI. */
    @stub
    def this() = ???

    /** Creates a view for an element. */
    def create(elem: Element): View

    /** Creates a view for an element. */
    def create(elem: Element, p0: Int, p1: Int): View

    /** Creates the object to use for a caret. */
    protected def createCaret(): Caret

    /** Creates the object to use for adding highlights. */
    protected def createHighlighter(): Highlighter

    /** Creates the keymap to use for the text component, and installs
     *  any necessary bindings into it.
     */
    protected def createKeymap(): Keymap

    /** Causes the portion of the view responsible for the
     *  given part of the model to be repainted.
     */
    def damageRange(tc: JTextComponent, p0: Int, p1: Int): Unit

    /** Causes the portion of the view responsible for the
     *  given part of the model to be repainted.
     */
    def damageRange(t: JTextComponent, p0: Int, p1: Int, p0Bias: Position.Bias, p1Bias: Position.Bias): Unit

    /** Fetches the text component associated with this
     *  UI implementation.
     */
    protected def getComponent(): JTextComponent

    /** Fetches the EditorKit for the UI. */
    def getEditorKit(tc: JTextComponent): EditorKit

    /** Fetches the name of the keymap that will be installed/used
     *  by default for this UI.
     */
    protected def getKeymapName(): String

    /** Gets the maximum size for the editor component. */
    def getMaximumSize(c: JComponent): Dimension

    /** Gets the minimum size for the editor component. */
    def getMinimumSize(c: JComponent): Dimension

    /** Provides a way to determine the next visually represented model
     *  location that one might place a caret.
     */
    def getNextVisualPositionFrom(t: JTextComponent, pos: Int, b: Position.Bias, direction: Int, biasRet: Array[Position.Bias]): Int

    /** Gets the preferred size for the editor component. */
    def getPreferredSize(c: JComponent): Dimension

    /** Gets the name used as a key to look up properties through the
     *  UIManager.
     */
    protected def getPropertyPrefix(): String

    /** Fetches a View with the allocation of the associated
     *  text component (i.e.
     */
    def getRootView(tc: JTextComponent): View

    /** Returns the string to be used as the tooltip at the passed in location. */
    def getToolTipText(t: JTextComponent, pt: Point): String

    /** Gets the allocation to give the root View. */
    protected def getVisibleEditorRect(): Rectangle

    /** Initializes component properties, such as font, foreground,
     *  background, caret color, selection color, selected text color,
     *  disabled text color, and border color.
     */
    protected def installDefaults(): Unit

    /**  */
    protected def installKeyboardActions(): Unit

    /** Installs listeners for the UI. */
    protected def installListeners(): Unit

    /** Installs the UI for a component. */
    def installUI(c: JComponent): Unit

    /** Flags model changes. */
    protected def modelChanged(): Unit

    /** Converts the given location in the model to a place in
     *  the view coordinate system.
     */
    def modelToView(tc: JTextComponent, pos: Int): Rectangle

    /** Converts the given location in the model to a place in
     *  the view coordinate system.
     */
    def modelToView(tc: JTextComponent, pos: Int, bias: Position.Bias): Rectangle

    /** Paints the interface. */
    def paint(g: Graphics, c: JComponent): Unit

    /** Paints a background for the view. */
    protected def paintBackground(g: Graphics): Unit

    /** Paints the interface safely with a guarantee that
     *  the model won't change from the view of this thread.
     */
    protected def paintSafely(g: Graphics): Unit

    /** This method gets called when a bound property is changed
     *  on the associated JTextComponent.
     */
    protected def propertyChange(evt: PropertyChangeEvent): Unit

    /** Sets the current root of the view hierarchy and calls invalidate(). */
    protected def setView(v: View): Unit

    /** Sets the component properties that have not been explicitly overridden
     *  to null.
     */
    protected def uninstallDefaults(): Unit

    /**  */
    protected def uninstallKeyboardActions(): Unit

    /** Uninstalls listeners for the UI. */
    protected def uninstallListeners(): Unit

    /** Deinstalls the UI for a component. */
    def uninstallUI(c: JComponent): Unit

    /** Superclass paints background in an uncontrollable way
     *  (i.e.
     */
    def update(g: Graphics, c: JComponent): Unit

    /** Converts the given place in the view coordinate system
     *  to the nearest representative location in the model.
     */
    def viewToModel(tc: JTextComponent, pt: Point): Int

    /** Converts the given place in the view coordinate system
     *  to the nearest representative location in the model.
     */
    def viewToModel(tc: JTextComponent, pt: Point, biasReturn: Array[Position.Bias]): Int
}

object BasicTextUI {
    /**  */
    @stub
    object BasicCaret extends BasicTextUI.BasicCaret

    /**  */
    @stub
    object BasicHighlighter extends BasicTextUI.BasicHighlighter
}
