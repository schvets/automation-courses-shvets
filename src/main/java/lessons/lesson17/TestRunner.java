package lessons.lesson17;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class TestRunner extends BlockJUnit4ClassRunner {
    private TestRunListener testRunListener;

    public TestRunner(Class<?> klass) throws InitializationError {
        super(klass);
        testRunListener = new TestRunListener();

    }

    public void run(final RunNotifier notifier) {
        notifier.addListener(testRunListener);
        super.run(notifier);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(JunitTestSuite.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }
}

