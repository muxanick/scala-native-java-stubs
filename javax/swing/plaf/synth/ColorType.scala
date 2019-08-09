package javax.swing.plaf.synth

import java.lang.Object

// A typesafe enumeration of colors that can be fetched from a style.
// 
// Each SynthStyle has a set of ColorTypes that
// are accessed by way of the
// SynthStyle.getColor(SynthContext, ColorType) method.
// SynthStyle's installDefaults will install
// the FOREGROUND color
// as the foreground of
// the Component, and the BACKGROUND color to the background of
// the component (assuming that you have not explicitly specified a
// foreground and background color). Some components
// support more color based properties, for
// example JList has the property
// selectionForeground which will be mapped to
// FOREGROUND with a component state of
// SynthConstants.SELECTED.
// 
// The following example shows a custom SynthStyle that returns
// a red Color for the DISABLED state, otherwise a black color.
// 
// class MyStyle extends SynthStyle {
//     private Color disabledColor = new ColorUIResource(Color.RED);
//     private Color color = new ColorUIResource(Color.BLACK);
//     protected Color getColorForState(SynthContext context, ColorType type){
//         if (context.getComponentState() == SynthConstants.DISABLED) {
//             return disabledColor;
//         }
//         return color;
//     }
// }
// 
class ColorType extends Object {

    @stub
    // Returns a unique id, as an integer, for this ColorType.
    def getID(): Int = ???
}

object ColorType {
    @stub
    // ColorType for the background of a region.
    def BACKGROUND: ColorType = ???

    @stub
    // ColorType for the focus.
    def FOCUS: ColorType = ???

    @stub
    // ColorType for the foreground of a region.
    def FOREGROUND: ColorType = ???

    @stub
    // Maximum number of ColorTypes.
    def MAX_COUNT: Int = ???

    @stub
    // ColorType for the background of a region.
    def TEXT_BACKGROUND: ColorType = ???
}
