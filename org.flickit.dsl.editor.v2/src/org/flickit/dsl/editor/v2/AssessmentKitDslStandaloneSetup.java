/*
 * generated by Xtext 2.31.0
 */
package org.flickit.dsl.editor.v2;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class AssessmentKitDslStandaloneSetup extends AssessmentKitDslStandaloneSetupGenerated {

	public static void doSetup() {
		new AssessmentKitDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
