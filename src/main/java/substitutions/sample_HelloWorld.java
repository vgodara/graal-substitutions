package substitutions;

import com.oracle.svm.core.annotate.Substitute;
import com.oracle.svm.core.annotate.TargetClass;
import sample.HelloWorld;

@TargetClass(HelloWorld.class)
public final class sample_HelloWorld {
    @Substitute
    private void hello() {
        System.out.println("Hello from substitute method");
    }
}
