package org.w3c.dom

// EntityReference nodes may be used to represent an entity
// reference in the tree. Note that character references and references to
// predefined entities are considered to be expanded by the HTML or XML
// processor so that characters are represented by their Unicode equivalent
// rather than by an entity reference. Moreover, the XML processor may
// completely expand references to entities while building the
// Document, instead of providing EntityReference
// nodes. If it does provide such nodes, then for an
// EntityReference node that represents a reference to a known
// entity an Entity exists, and the subtree of the
// EntityReference node is a copy of the Entity
// node subtree. However, the latter may not be true when an entity contains
// an unbound namespace prefix. In such a case, because the namespace prefix
// resolution depends on where the entity reference is, the descendants of
// the EntityReference node may be bound to different namespace
// URIs. When an EntityReference node represents a reference to
// an unknown entity, the node has no children and its replacement value,
// when used by Attr.value for example, is empty.
// As for Entity nodes, EntityReference nodes and
// all their descendants are readonly.
// Note: EntityReference nodes may cause element
// content and attribute value normalization problems when, such as in XML
// 1.0 and XML Schema, the normalization is performed after entity reference
// are expanded.
// See also the Document Object Model (DOM) Level 3 Core Specification.
trait EntityReference extends Node {
}
