/**
 *
 * $Id$
 */
package ca.mcgill.emf.examples.hal.validation;

import ca.mcgill.emf.examples.hal.LogicGate;
import ca.mcgill.emf.examples.hal.LogicPiece;
import ca.mcgill.emf.examples.hal.SingleCondition;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.mcgill.emf.examples.hal.LogicPiece}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LogicPieceValidator {
	boolean validate();

	boolean validateLogicpiece(EList<LogicPiece> value);
	boolean validateSinglecondition(EList<SingleCondition> value);
	boolean validateLogicgate(EList<LogicGate> value);
	boolean validateId(String value);
}
