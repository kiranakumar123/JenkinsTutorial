package com.kriyari.selenium.helper;


/*import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
public abstract class ExternalResourceKiran implements MethodRule {
	public final Statement apply(final Statement base,
			final FrameworkMethod method, Object target) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				before(method);
				try {
					base.evaluate();
				} finally {
					after();
				}
			}
		};
	}

	/**
	 * Override to set up your specific external resource.
	 * @throws if setup fails (which will disable {@code after}
	 */
	/*protected void before(FrameworkMethod method) throws Throwable {
		// do nothing
//		if method.
		
	}

	/**
	 * Override to tear down your specific external resource.
	 */
	/*protected void after() {
		// do nothing
	}
}*/