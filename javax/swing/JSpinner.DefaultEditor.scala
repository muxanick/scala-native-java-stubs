package javax.swing

import java.awt.{Component, Component.BaselineResizeBehavior, Container, Dimension, LayoutManager}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.event.{ChangeEvent, ChangeListener}
import scala.scalanative.annotation.stub

/** A simple base class for more specialized editors
 *  that displays a read-only view of the model's current
 *  value with a JFormattedTextField.  Subclasses
 *  can configure the JFormattedTextField to create
 *  an editor that's appropriate for the type of model they
 *  support and they may want to override
 *  the stateChanged and propertyChanged
 *  methods, which keep the model and the text field in sync.
 *  
 *  This class defines a dismiss method that removes the
 *  editors ChangeListener from the JSpinner
 *  that it's part of.   The setEditor method knows about
 *  DefaultEditor.dismiss, so if the developer
 *  replaces an editor that's derived from JSpinner.DefaultEditor
 *  its ChangeListener connection back to the
 *  JSpinner will be removed.  However after that,
 *  it's up to the developer to manage their editor listeners.
 *  Similarly, if a subclass overrides createEditor,
 *  it's up to the subclasser to deal with their editor
 *  subsequently being replaced (with setEditor).
 *  We expect that in most cases, and in editor installed
 *  with setEditor or created by a createEditor
 *  override, will not be replaced anyway.
 *  
 *  This class is the LayoutManager for it's single
 *  JFormattedTextField child.   By default the
 *  child is just centered with the parents insets.
 */
object JSpinner.DefaultEditor extends JPanel with ChangeListener with PropertyChangeListener with LayoutManager {

    /** Constructs an editor component for the specified JSpinner. */
    @stub
    def DefaultEditor(spinner: JSpinner) = ???

    /** This LayoutManager method does nothing. */
    @stub
    def addLayoutComponent(name: String, child: Component): Unit = ???

    /** Pushes the currently edited value to the SpinnerModel. */
    @stub
    def commitEdit(): Unit = ???

    /** Disconnect this editor from the specified
     *  JSpinner.
     */
    @stub
    def dismiss(spinner: JSpinner): Unit = ???

    /** Returns the baseline. */
    @stub
    def getBaseline(width: Int, height: Int): Int = ???

    /** Returns an enum indicating how the baseline of the component
     *  changes as the size changes.
     */
    @stub
    def getBaselineResizeBehavior(): Component.BaselineResizeBehavior = ???

    /** Returns the JSpinner ancestor of this editor or
     *  null if none of the ancestors are a
     *  JSpinner.
     */
    @stub
    def getSpinner(): JSpinner = ???

    /** Returns the JFormattedTextField child of this
     *  editor.
     */
    @stub
    def getTextField(): JFormattedTextField = ???

    /** Resize the one (and only) child to completely fill the area
     *  within the parents insets.
     */
    @stub
    def layoutContainer(parent: Container): Unit = ???

    /** Returns the minimum size of first (and only) child plus the
     *  size of the parents insets.
     */
    @stub
    def minimumLayoutSize(parent: Container): Dimension = ???

    /** Returns the preferred size of first (and only) child plus the
     *  size of the parents insets.
     */
    @stub
    def preferredLayoutSize(parent: Container): Dimension = ???

    /** Called by the JFormattedTextField
     *  PropertyChangeListener.
     */
    @stub
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    /** This LayoutManager method does nothing. */
    @stub
    def removeLayoutComponent(child: Component): Unit = ???

    /** This method is called when the spinner's model's state changes. */
    @stub
    def stateChanged(e: ChangeEvent): Unit = ???
}
