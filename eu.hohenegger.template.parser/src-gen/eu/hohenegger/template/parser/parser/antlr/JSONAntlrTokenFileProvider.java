/*
* generated by Xtext
*/
package eu.hohenegger.template.parser.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JSONAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("eu/hohenegger/template/parser/parser/antlr/internal/InternalJSON.tokens");
	}
}
