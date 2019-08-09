package java.awt

import java.io.Serializable
import java.lang.{Object, String}

// The MenuShortcutclass represents a keyboard accelerator
// for a MenuItem.
// 
// Menu shortcuts are created using virtual keycodes, not characters.
// For example, a menu shortcut for Ctrl-a (assuming that Control is
// the accelerator key) would be created with code like the following:
// 
// MenuShortcut ms = new MenuShortcut(KeyEvent.VK_A, false);
//  or alternatively
// 
// MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('A'), false);
// 
// Menu shortcuts may also be constructed for a wider set of keycodes
// using the java.awt.event.KeyEvent.getExtendedKeyCodeForChar call.
// For example, a menu shortcut for "Ctrl+cyrillic ef" is created by
// 
// MenuShortcut ms = new MenuShortcut(KeyEvent.getExtendedKeyCodeForChar('?'), false);
// 
// Note that shortcuts created with a keycode or an extended keycode defined as a constant in KeyEvent
// work regardless of the current keyboard layout. However, a shortcut made of
// an extended keycode not listed in KeyEvent
// only work if the current keyboard layout produces a corresponding letter.
// 
// The accelerator key is platform-dependent and may be obtained
// via Toolkit.getMenuShortcutKeyMask().
class MenuShortcut extends Object with Serializable {

    @stub
    // Constructs a new MenuShortcut for the specified virtual keycode.
    def this(key: Int) = ???

    @stub
    // Returns whether this MenuShortcut is the same as another:
    // equality is defined to mean that both MenuShortcuts use the same key
    // and both either use or don't use the SHIFT key.
    def equals(s: MenuShortcut): Boolean = ???

    @stub
    // Returns whether this MenuShortcut is the same as another:
    // equality is defined to mean that both MenuShortcuts use the same key
    // and both either use or don't use the SHIFT key.
    def equals(obj: Object): Boolean = ???

    @stub
    // Returns the raw keycode of this MenuShortcut.
    def getKey(): Int = ???

    @stub
    // Returns the hashcode for this MenuShortcut.
    def hashCode(): Int = ???

    @stub
    // Returns the parameter string representing the state of this
    // MenuShortcut.
    protected def paramString(): String = ???

    @stub
    // Returns an internationalized description of the MenuShortcut.
    def toString(): String = ???
}
