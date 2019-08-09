package java.security.cert

import java.lang.String
import java.util.{Iterator, Set}
import scala.scalanative.annotation.stub

/** An immutable valid policy tree node as defined by the PKIX certification
 *  path validation algorithm.
 * 
 *  One of the outputs of the PKIX certification path validation
 *  algorithm is a valid policy tree, which includes the policies that
 *  were determined to be valid, how this determination was reached,
 *  and any policy qualifiers encountered. This tree is of depth
 *  n, where n is the length of the certification
 *  path that has been validated.
 * 
 *  Most applications will not need to examine the valid policy tree.
 *  They can achieve their policy processing goals by setting the
 *  policy-related parameters in PKIXParameters. However,
 *  the valid policy tree is available for more sophisticated applications,
 *  especially those that process policy qualifiers.
 * 
 *  PKIXCertPathValidatorResult.getPolicyTree returns the root node of the
 *  valid policy tree. The tree can be traversed using the
 *  getChildren and getParent methods.
 *  Data about a particular node can be retrieved using other methods of
 *  PolicyNode.
 * 
 *  Concurrent Access
 *  All PolicyNode objects must be immutable and
 *  thread-safe. Multiple threads may concurrently invoke the methods defined
 *  in this class on a single PolicyNode object (or more than one)
 *  with no ill effects. This stipulation applies to all public fields and
 *  methods of this class and any added or overridden by subclasses.
 */
trait PolicyNode {

    /** Returns an iterator over the children of this node. */
    @stub
    def getChildren(): Iterator[_ <: PolicyNode] = ???

    /** Returns the depth of this node in the valid policy tree. */
    @stub
    def getDepth(): Int = ???

    /** Returns the set of expected policies that would satisfy this
     *  node's valid policy in the next certificate to be processed.
     */
    @stub
    def getExpectedPolicies(): Set[String] = ???

    /** Returns the parent of this node, or null if this is the
     *  root node.
     */
    @stub
    def getParent(): PolicyNode = ???

    /** Returns the set of policy qualifiers associated with the
     *  valid policy represented by this node.
     */
    @stub
    def getPolicyQualifiers(): Set[_ <: PolicyQualifierInfo] = ???

    /** Returns the valid policy represented by this node. */
    @stub
    def getValidPolicy(): String = ???

    /** Returns the criticality indicator of the certificate policy extension
     *  in the most recently processed certificate.
     */
    @stub
    def isCritical(): Boolean = ???
}
