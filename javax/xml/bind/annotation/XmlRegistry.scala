package javax.xml.bind.annotation

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// Marks a class that has XmlElementDecls.
@Retention ( value = RUNTIME ) @Target ( value = TYPE ) @interface XmlRegistry {
}
