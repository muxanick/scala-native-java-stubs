package javax.swing.plaf.synth

import java.lang.Object

/** A typesafe enumeration of colors that can be fetched from a style.
 *  
 *  Each SynthStyle has a set of ColorTypes that
 *  are accessed by way of the
 *  SynthStyle.getColor(SynthContext, ColorType) method.
 *  SynthStyle's installDefaults will install
 *  the FOREGROUND color
 *  as the foreground of
 *  the Component, and the BACKGROUND color to the background of
 *  the component (assuming that you have not explicitly specified a
 *  foreground and background color). Some components
 *  support more color based properties, for
 *  example JList has the property
 *  selectionForeground which will be mapped to
 *  FOREGROUND with a component state of
 *  SynthConstants.SELECTED.
 *  
 *  The following example shows a custom SynthStyle that returns
 *  a red Color for the DISABLED state, otherwise a black color.
 *  
 *  class MyStyle extends SynthStyle {
 *      private Color disabledColor = new ColorUIResource(Color.RED);
 *      private Color color = new ColorUIResource(Color.BLACK);
 *      protected Color getColorForState(SynthContext context, ColorType type){
 *          if (context.getComponentState() == SynthConstants.DISABLED) {
 *              return disabledColor;
 *          }
 *          return color;
 *      }
 *  }
 *  
 */
class ColorType extends Object {

    /** Returns a unique id, as an integer, for this ColorType. */
    @stub
    def getID(): Int = ???
}

object ColorType {
    /** ColorType for the background of a region. */
    @stub
    val BACKGROUND: ColorType = ???

    /** ColorType for the focus. */
    @stub
    val FOCUS: ColorType = ???

    /** ColorType for the foreground of a region. */
    @stub
    val FOREGROUND: ColorType = ???

    /** Maximum number of ColorTypes. */
    @stub
    val MAX_COUNT: Int = ???

    /** ColorType for the background of a region. */
    @stub
    val TEXT_BACKGROUND: ColorType = ???
}
