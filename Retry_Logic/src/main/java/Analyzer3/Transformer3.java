package Analyzer3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class Transformer3 implements IAnnotationTransformer  {

	public void transform(ITestAnnotation annotation, Class TestClass,
			Constructor TestConstructor, Method TestMethod) {
		
		annotation.setRetryAnalyzer(Retry_logic.class);
	}
		
	}


