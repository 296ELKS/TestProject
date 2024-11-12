package ca.cranelks.stocks;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.jsonschema2pojo.DefaultGenerationConfig;
import org.jsonschema2pojo.GenerationConfig;
import org.jsonschema2pojo.Jackson2Annotator;
import org.jsonschema2pojo.SchemaGenerator;
import org.jsonschema2pojo.SchemaMapper;
import org.jsonschema2pojo.SchemaStore;
import org.jsonschema2pojo.SourceType;
import org.jsonschema2pojo.rules.RuleFactory;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.codemodel.JCodeModel;

public class Converter {
	public void convertJsonToJavaClass(URL inputJsonUrl, File outputJavaClassDirectory, String packageName, String javaClassName) 
			  throws IOException {
			    JCodeModel jcodeModel = new JCodeModel();
			    
			    GenerationConfig config = new DefaultGenerationConfig() {
			        @Override
			        public boolean isGenerateBuilders() {
			            return true;
			        }

			        @Override
			        public SourceType getSourceType() {
			            return SourceType.JSON;
			        }
			    };

			    SchemaMapper mapper = new SchemaMapper(new RuleFactory(config, new Jackson2Annotator(config), new SchemaStore()), new SchemaGenerator());
			    mapper.generate(jcodeModel, javaClassName, packageName, inputJsonUrl);

			    jcodeModel.build(outputJavaClassDirectory);
			}
	
	
//	public static void main(String[] args) throws IOException {
//		File outputFile = new File("src/main/java");
//		File inputFile = new File("src/main/resources/Example.json");
//		URL url = inputFile.toURI().toURL();
//		new Converter().convertJsonToJavaClass(url, outputFile, "ca.cranelks.stocks", "price");
//	}

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		File inputFile = new File("src/main/resources/Example.json");
		
		Price price = new ObjectMapper().readValue(inputFile, Price.class);
		
		System.out.println(price.getQuoteSummary().getResult().getFirst().getPrice().getRegularMarketPrice().getRaw());
		
		
	}
	
}
