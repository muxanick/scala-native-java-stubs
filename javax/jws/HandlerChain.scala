package javax.jws

import java.lang.annotation.{ElementType, Retention, RetentionPolicy, Target}

// 
@Retention ( value = RUNTIME ) @Target ( value ={ TYPE , METHOD , FIELD } ) @interface HandlerChain {
}
