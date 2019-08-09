package javax.management

import scala.scalanative.annotation.stub

/** Interface to read the Descriptor of a management interface element
 *  such as an MBeanInfo.
 */
trait DescriptorRead {

    /** Returns a copy of Descriptor. */
    @stub
    def getDescriptor(): Descriptor = ???
}
