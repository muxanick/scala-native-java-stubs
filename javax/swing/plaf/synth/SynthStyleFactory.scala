package javax.swing.plaf.synth

import java.lang.Object
import javax.swing.JComponent
import scala.scalanative.annotation.stub

/** Factory used for obtaining SynthStyles.  Each of the
 *  Synth ComponentUIs will call into the current
 *  SynthStyleFactory to obtain a SynthStyle
 *  for each of the distinct regions they have.
 *  
 *  The following example creates a custom SynthStyleFactory
 *  that returns a different style based on the Region:
 *  
 *  class MyStyleFactory extends SynthStyleFactory {
 *      public SynthStyle getStyle(JComponent c, Region id) {
 *          if (id == Region.BUTTON) {
 *              return buttonStyle;
 *          }
 *          else if (id == Region.TREE) {
 *              return treeStyle;
 *          }
 *          return defaultStyle;
 *      }
 *  }
 *  SynthLookAndFeel laf = new SynthLookAndFeel();
 *  UIManager.setLookAndFeel(laf);
 *  SynthLookAndFeel.setStyleFactory(new MyStyleFactory());
 *  
 */
abstract class SynthStyleFactory extends Object {

    /** Creates a SynthStyleFactory. */
    @stub
    def this() = ???

    /** Returns the style for the specified Component. */
    def getStyle(c: JComponent, id: Region): SynthStyle
}
