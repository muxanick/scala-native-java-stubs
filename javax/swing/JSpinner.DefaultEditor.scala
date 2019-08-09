package javax.swing

import java.awt.{Component, Component.BaselineResizeBehavior, Container, Dimension, LayoutManager}
import java.beans.{PropertyChangeEvent, PropertyChangeListener}
import java.lang.{Object, String}
import javax.swing.event.ChangeListener

// A simple base class for more specialized editors
// that displays a read-only view of the model's current
// value with a JFormattedTextField.  Subclasses
// can configure the JFormattedTextField to create
// an editor that's appropriate for the type of model they
// support and they may want to override
// the stateChanged and propertyChanged
// methods, which keep the model and the text field in sync.
// 
// This class defines a dismiss method that removes the
// editors ChangeListener from the JSpinner
// that it's part of.   The setEditor method knows about
// DefaultEditor.dismiss, so if the developer
// replaces an editor that's derived from JSpinner.DefaultEditor
// its ChangeListener connection back to the
// JSpinner will be removed.  However after that,
// it's up to the developer to manage their editor listeners.
// Similarly, if a subclass overrides createEditor,
// it's up to the subclasser to deal with their editor
// subsequently being replaced (with setEditor).
// We expect that in most cases, and in editor installed
// with setEditor or created by a createEditor
// override, will not be replaced anyway.
// 
// This class is the LayoutManager for it's single
// JFormattedTextField child.   By default the
// child is just centered with the parents insets.
object JSpinner.DefaultEditor extends JPanel with ChangeListener, with PropertyChangeListener, with LayoutManager {

    @stub
    // This LayoutManager method does nothing.
    def addLayoutComponent(name: String, child: Component): Unit = ???

    @stub
    // Pushes the currently edited value to the SpinnerModel.
    def commitEdit(): Unit = ???

    @stub
    // Disconnect this editor from the specified
    // JSpinner.
    def dismiss(spinner: JSpinner): Unit = ???

    @stub
    // Returns the baseline.
    def getBaseline(width: Int, height: Int): Int = ???

    @stub
    // Returns an enum indicating how the baseline of the component
    // changes as the size changes.
    def getBaselineResizeBehavior(): Component.BaselineResizeBehavior = ???

    @stub
    // Returns the JSpinner ancestor of this editor or
    // null if none of the ancestors are a
    // JSpinner.
    def getSpinner(): JSpinner = ???

    @stub
    // Returns the JFormattedTextField child of this
    // editor.
    def getTextField(): JFormattedTextField = ???

    @stub
    // Resize the one (and only) child to completely fill the area
    // within the parents insets.
    def layoutContainer(parent: Container): Unit = ???

    @stub
    // Returns the minimum size of first (and only) child plus the
    // size of the parents insets.
    def minimumLayoutSize(parent: Container): Dimension = ???

    @stub
    // Returns the preferred size of first (and only) child plus the
    // size of the parents insets.
    def preferredLayoutSize(parent: Container): Dimension = ???

    @stub
    // Called by the JFormattedTextField
    // PropertyChangeListener.
    def propertyChange(e: PropertyChangeEvent): Unit = ???

    @stub
    // This LayoutManager method does nothing.
    def removeLayoutComponent(child: Component): Unit = ???
}
