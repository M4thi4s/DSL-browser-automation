/*
 * generated by Xtext 2.36.0
 */
package org.xtext.browserautomation.mydsl.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractBrowserTestValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.xtext.browserautomation.mydsl.browserTest.BrowserTestPackage.eINSTANCE);
		return result;
	}
}