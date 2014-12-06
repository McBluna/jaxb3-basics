package org.jvnet.jaxb2_commons.plugin.simple.codegeneration;

import org.apache.commons.lang3.Validate;

import com.sun.codemodel.JCodeModel;

public abstract class AbstractCodeGenerator<A extends Arguments> implements
		CodeGenerator<A> {

	private final CodeGenerator<A> codeGenerator;
	private final CodeGenerationImplementor<A> implementor;
	private final JCodeModel codeModel;

	public AbstractCodeGenerator(CodeGenerator<A> codeGenerator,
			CodeGenerationImplementor<A> implementor) {
		this.codeGenerator = Validate.notNull(codeGenerator);
		this.implementor = Validate.notNull(implementor);
		this.codeModel = implementor.getCodeModel();
	}

	public CodeGenerationImplementor<A> getImplementor() {
		return implementor;
	}

	public CodeGenerator<A> getCodeGeneratorFactory() {
		return codeGenerator;
	}

	public JCodeModel getCodeModel() {
		return codeModel;
	}
}