package br.ufes.inf.ontouml.ontoumlprime;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import br.ufes.inf.ontoumlprime.converter.CardinalityUpperBoundConverter;

public class OntoUMLPrimeValueConverterService extends
		DefaultTerminalConverters {

	@ValueConverter(rule = "CardinalityUpperBound")
	public IValueConverter<Integer> getCardinalityUpperBoundConverter() {
	  return new CardinalityUpperBoundConverter();
	}
}
