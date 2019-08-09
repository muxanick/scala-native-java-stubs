package javax.swing.plaf

import java.awt.{Point, Rectangle}
import java.lang.{Object, String}
import javax.swing.text.{EditorKit, JTextComponent, Position.Bias, View}

/** Text editor user interface */
abstract class TextUI extends ComponentUI {

    /** Causes the portion of the view responsible for the
     *  given part of the model to be repainted.
     */
    def damageRange(t: JTextComponent, p0: Int, p1: Int): Unit

    /** Causes the portion of the view responsible for the
     *  given part of the model to be repainted.
     */
    def damageRange(t: JTextComponent, p0: Int, p1: Int, firstBias: Position.Bias, secondBias: Position.Bias): Unit

    /** Fetches the binding of services that set a policy
     *  for the type of document being edited.
     */
    def getEditorKit(t: JTextComponent): EditorKit

    /** Provides a way to determine the next visually represented model
     *  location that one might place a caret.
     */
    def getNextVisualPositionFrom(t: JTextComponent, pos: Int, b: Position.Bias, direction: Int, biasRet: Array[Position.Bias]): Int

    /** Fetches a View with the allocation of the associated
     *  text component (i.e.
     */
    def getRootView(t: JTextComponent): View

    /** Returns the string to be used as the tooltip at the passed in location. */
    def getToolTipText(t: JTextComponent, pt: Point): String

    /** Converts the given location in the model to a place in
     *  the view coordinate system.
     */
    def modelToView(t: JTextComponent, pos: Int): Rectangle

    /** Converts the given location in the model to a place in
     *  the view coordinate system.
     */
    def modelToView(t: JTextComponent, pos: Int, bias: Position.Bias): Rectangle

    /** Converts the given place in the view coordinate system
     *  to the nearest representative location in the model.
     */
    def viewToModel(t: JTextComponent, pt: Point): Int
}
