package javax.swing

import java.awt.Component
import java.lang.Object

// A Group that positions and sizes its elements
// sequentially, one after another.  This class has no public
// constructor, use the createSequentialGroup method
// to create one.
// 
// In order to align a SequentialGroup along the baseline
// of a baseline aligned ParallelGroup you need to specify
// which of the elements of the SequentialGroup is used to
// determine the baseline.  The element used to calculate the
// baseline is specified using one of the add methods that
// take a boolean. The last element added with a value of
// true for useAsBaseline is used to calculate the
// baseline.
class GroupLayout.SequentialGroup extends GroupLayout.Group {

    @stub
    // Adds a Component to this Group.
    def addComponent(useAsBaseline: Boolean, component: Component): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a Component to this Group
    // with the specified size.
    def addComponent(useAsBaseline: Boolean, component: Component, min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a Component to this Group.
    def addComponent(component: Component): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a Component to this Group
    // with the specified size.
    def addComponent(component: Component, min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds an element representing the preferred gap between an edge
    // the container and components that touch the border of the
    // container.
    def addContainerGap(): GroupLayout.SequentialGroup = ???

    @stub
    // Adds an element representing the preferred gap between one
    // edge of the container and the next or previous Component with the specified size.
    def addContainerGap(pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a rigid gap to this Group.
    def addGap(size: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a gap to this Group with the specified size.
    def addGap(min: Int, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a Group to this Group.
    def addGroup(useAsBaseline: Boolean, group: GroupLayout.Group): GroupLayout.SequentialGroup = ???

    @stub
    // Adds a Group to this Group.
    def addGroup(group: GroupLayout.Group): GroupLayout.SequentialGroup = ???

    @stub
    // Adds an element representing the preferred gap between two
    // components.
    def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement): GroupLayout.SequentialGroup = ???

    @stub
    // Adds an element representing the preferred gap between two
    // components.
    def addPreferredGap(comp1: JComponent, comp2: JComponent, type: LayoutStyle.ComponentPlacement, pref: Int, max: Int): GroupLayout.SequentialGroup = ???

    @stub
    // Adds an element representing the preferred gap between the
    // nearest components.
    def addPreferredGap(type: LayoutStyle.ComponentPlacement): GroupLayout.SequentialGroup = ???
}