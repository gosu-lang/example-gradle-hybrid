package scratch;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Inherited
public @interface MuhAnnotation {
  public MuhSubAnnotation[] muhSubs() default {@MuhSubAnnotation("")};
}
