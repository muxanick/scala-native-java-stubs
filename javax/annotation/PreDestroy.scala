package javax.annotation

import java.lang.annotation.{Documented, ElementType, Retention, RetentionPolicy, Target}

// The PreDestroy annotation is used on methods as a callback notification to
// signal that the instance is in the process of being removed by the
// container. The method annotated with PreDestroy is typically used to
// release resources that it has been holding. This annotation MUST be
// supported by all container managed objects that support PostConstruct
// except the application client container in Java EE 5. The method on which
// the PreDestroy annotation is applied MUST fulfill all of the following
// criteria:
// 
// 
// The method MUST NOT have any parameters except in the case of
// interceptors in which case it takes an InvocationContext object as
// defined by the Interceptors specification.
// The method defined on an interceptor class MUST HAVE one of the
// following signatures:
// 
// void <METHOD>(InvocationContext)
// 
// Object <METHOD>(InvocationContext) throws Exception
// 
// Note: A PreDestroy interceptor method must not throw application
// exceptions, but it may be declared to throw checked exceptions including
// the java.lang.Exception if the same interceptor method interposes on
// business or timeout methods in addition to lifecycle events. If a
// PreDestroy interceptor method returns a value, it is ignored by
// the container.
// 
// The method defined on a non-interceptor class MUST HAVE the
// following signature:
// 
// void <METHOD>()
// 
// The method on which PreDestroy is applied MAY be public, protected,
// package private or private.
// The method MUST NOT be static.
// The method MAY be final.
// If the method throws an unchecked exception it is ignored except in the
// case of EJBs where the EJB can handle exceptions.
// 
@Documented @Retention ( value = RUNTIME ) @Target ( value = METHOD ) @interface PreDestroy {
}
