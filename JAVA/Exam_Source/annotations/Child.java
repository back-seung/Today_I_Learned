package annotations;import java.lang.annotation.Annotation;public class Child extends Parent, Annotation {    @Override    public void doOverriding() {        // ...    }    @Override    public void dooverriding() {        // ...    }}