/**
 */
package csvml.impl;

import csvml.AggregationField;
import csvml.AggregationTypes;
import csvml.CompOperatorTypes;
import csvml.ComparisonRule;
import csvml.CompositeRule;
import csvml.CsvmlFactory;
import csvml.CsvmlPackage;
import csvml.DerivedField;
import csvml.FieldDefinition;
import csvml.FieldTypTypes;
import csvml.FileDefinition;
import csvml.FileDefinitionSet;
import csvml.LogicalOperatorTypes;
import csvml.Rule;
import csvml.RuleBasedField;
import csvml.StaticField;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsvmlPackageImpl extends EPackageImpl implements CsvmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDefinitionSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass derivedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aggregationFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleBasedFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comparisonRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compositeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fieldTypTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compOperatorTypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicalOperatorTypesEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see csvml.CsvmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CsvmlPackageImpl() {
		super(eNS_URI, CsvmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CsvmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CsvmlPackage init() {
		if (isInited) return (CsvmlPackage)EPackage.Registry.INSTANCE.getEPackage(CsvmlPackage.eNS_URI);

		// Obtain or create and register package
		CsvmlPackageImpl theCsvmlPackage = (CsvmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CsvmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CsvmlPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theCsvmlPackage.createPackageContents();

		// Initialize created meta-data
		theCsvmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCsvmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CsvmlPackage.eNS_URI, theCsvmlPackage);
		return theCsvmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDefinitionSet() {
		return fileDefinitionSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDefinitionSet_Filedefinitions() {
		return (EReference)fileDefinitionSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileDefinition() {
		return fileDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileDefinition_Name() {
		return (EAttribute)fileDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileDefinition_Fielddefinitions() {
		return (EReference)fileDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldDefinition() {
		return fieldDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Index() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_Name() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldDefinition_FieldType() {
		return (EAttribute)fieldDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldDefinition_Rule() {
		return (EReference)fieldDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticField() {
		return staticFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDerivedField() {
		return derivedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAggregationField() {
		return aggregationFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAggregationField_AggregationType() {
		return (EAttribute)aggregationFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationField_Aggregatedfields() {
		return (EReference)aggregationFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAggregationField_Fields() {
		return (EReference)aggregationFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuleBasedField() {
		return ruleBasedFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRuleBasedField_Rules() {
		return (EReference)ruleBasedFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRule() {
		return ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_Index() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_ResultValue() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRule_DefaultValue() {
		return (EAttribute)ruleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComparisonRule() {
		return comparisonRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComparisonRule_Comparisonfield() {
		return (EReference)comparisonRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonRule_ComparisonValue() {
		return (EAttribute)comparisonRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComparisonRule_Operator() {
		return (EAttribute)comparisonRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompositeRule() {
		return compositeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompositeRule_Operator() {
		return (EAttribute)compositeRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompositeRule_Composedrules() {
		return (EReference)compositeRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFieldTypTypes() {
		return fieldTypTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationTypes() {
		return aggregationTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompOperatorTypes() {
		return compOperatorTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicalOperatorTypes() {
		return logicalOperatorTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvmlFactory getCsvmlFactory() {
		return (CsvmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fileDefinitionSetEClass = createEClass(FILE_DEFINITION_SET);
		createEReference(fileDefinitionSetEClass, FILE_DEFINITION_SET__FILEDEFINITIONS);

		fileDefinitionEClass = createEClass(FILE_DEFINITION);
		createEAttribute(fileDefinitionEClass, FILE_DEFINITION__NAME);
		createEReference(fileDefinitionEClass, FILE_DEFINITION__FIELDDEFINITIONS);

		fieldDefinitionEClass = createEClass(FIELD_DEFINITION);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__INDEX);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__NAME);
		createEAttribute(fieldDefinitionEClass, FIELD_DEFINITION__FIELD_TYPE);
		createEReference(fieldDefinitionEClass, FIELD_DEFINITION__RULE);

		staticFieldEClass = createEClass(STATIC_FIELD);

		derivedFieldEClass = createEClass(DERIVED_FIELD);

		aggregationFieldEClass = createEClass(AGGREGATION_FIELD);
		createEAttribute(aggregationFieldEClass, AGGREGATION_FIELD__AGGREGATION_TYPE);
		createEReference(aggregationFieldEClass, AGGREGATION_FIELD__AGGREGATEDFIELDS);
		createEReference(aggregationFieldEClass, AGGREGATION_FIELD__FIELDS);

		ruleBasedFieldEClass = createEClass(RULE_BASED_FIELD);
		createEReference(ruleBasedFieldEClass, RULE_BASED_FIELD__RULES);

		ruleEClass = createEClass(RULE);
		createEAttribute(ruleEClass, RULE__INDEX);
		createEAttribute(ruleEClass, RULE__RESULT_VALUE);
		createEAttribute(ruleEClass, RULE__DEFAULT_VALUE);

		comparisonRuleEClass = createEClass(COMPARISON_RULE);
		createEReference(comparisonRuleEClass, COMPARISON_RULE__COMPARISONFIELD);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__COMPARISON_VALUE);
		createEAttribute(comparisonRuleEClass, COMPARISON_RULE__OPERATOR);

		compositeRuleEClass = createEClass(COMPOSITE_RULE);
		createEAttribute(compositeRuleEClass, COMPOSITE_RULE__OPERATOR);
		createEReference(compositeRuleEClass, COMPOSITE_RULE__COMPOSEDRULES);

		// Create enums
		fieldTypTypesEEnum = createEEnum(FIELD_TYP_TYPES);
		aggregationTypesEEnum = createEEnum(AGGREGATION_TYPES);
		compOperatorTypesEEnum = createEEnum(COMP_OPERATOR_TYPES);
		logicalOperatorTypesEEnum = createEEnum(LOGICAL_OPERATOR_TYPES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staticFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		derivedFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		aggregationFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		ruleBasedFieldEClass.getESuperTypes().add(this.getFieldDefinition());
		comparisonRuleEClass.getESuperTypes().add(this.getRule());
		compositeRuleEClass.getESuperTypes().add(this.getRule());

		// Initialize classes and features; add operations and parameters
		initEClass(fileDefinitionSetEClass, FileDefinitionSet.class, "FileDefinitionSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFileDefinitionSet_Filedefinitions(), this.getFileDefinition(), null, "filedefinitions", null, 0, -1, FileDefinitionSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileDefinitionEClass, FileDefinition.class, "FileDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileDefinition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileDefinition_Fielddefinitions(), this.getFieldDefinition(), null, "fielddefinitions", null, 1, -1, FileDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldDefinitionEClass, FieldDefinition.class, "FieldDefinition", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFieldDefinition_Index(), ecorePackage.getEInt(), "Index", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_Name(), ecorePackage.getEString(), "Name", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFieldDefinition_FieldType(), this.getFieldTypTypes(), "FieldType", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFieldDefinition_Rule(), this.getRule(), null, "rule", null, 0, 1, FieldDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticFieldEClass, StaticField.class, "StaticField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(derivedFieldEClass, DerivedField.class, "DerivedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aggregationFieldEClass, AggregationField.class, "AggregationField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAggregationField_AggregationType(), this.getAggregationTypes(), "AggregationType", null, 0, 1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationField_Aggregatedfields(), this.getFieldDefinition(), null, "aggregatedfields", null, 1, -1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAggregationField_Fields(), this.getFieldDefinition(), null, "fields", null, 1, -1, AggregationField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleBasedFieldEClass, RuleBasedField.class, "RuleBasedField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRuleBasedField_Rules(), this.getRule(), null, "rules", null, 0, -1, RuleBasedField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ruleEClass, Rule.class, "Rule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRule_Index(), ecorePackage.getEInt(), "index", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_ResultValue(), ecorePackage.getEString(), "ResultValue", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRule_DefaultValue(), ecorePackage.getEString(), "DefaultValue", null, 0, 1, Rule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comparisonRuleEClass, ComparisonRule.class, "ComparisonRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComparisonRule_Comparisonfield(), this.getFieldDefinition(), null, "comparisonfield", null, 1, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonRule_ComparisonValue(), ecorePackage.getEString(), "ComparisonValue", null, 0, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComparisonRule_Operator(), this.getCompOperatorTypes(), "Operator", null, 0, 1, ComparisonRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compositeRuleEClass, CompositeRule.class, "CompositeRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompositeRule_Operator(), this.getLogicalOperatorTypes(), "Operator", null, 0, 1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCompositeRule_Composedrules(), this.getRule(), null, "composedrules", null, 1, -1, CompositeRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(fieldTypTypesEEnum, FieldTypTypes.class, "FieldTypTypes");
		addEEnumLiteral(fieldTypTypesEEnum, FieldTypTypes.STRING);
		addEEnumLiteral(fieldTypTypesEEnum, FieldTypTypes.INTEGER);
		addEEnumLiteral(fieldTypTypesEEnum, FieldTypTypes.BOOLEAN);

		initEEnum(aggregationTypesEEnum, AggregationTypes.class, "AggregationTypes");
		addEEnumLiteral(aggregationTypesEEnum, AggregationTypes.SUM);
		addEEnumLiteral(aggregationTypesEEnum, AggregationTypes.AVERAGE);
		addEEnumLiteral(aggregationTypesEEnum, AggregationTypes.MINIMUM);
		addEEnumLiteral(aggregationTypesEEnum, AggregationTypes.MAXIMUM);

		initEEnum(compOperatorTypesEEnum, CompOperatorTypes.class, "CompOperatorTypes");
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.GREATER);
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.GREATER_OR_EQUALS);
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.LOWER);
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.LOWER_OR_EQUALS);
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.UNEQUALS);
		addEEnumLiteral(compOperatorTypesEEnum, CompOperatorTypes.EQUALS);

		initEEnum(logicalOperatorTypesEEnum, LogicalOperatorTypes.class, "LogicalOperatorTypes");
		addEEnumLiteral(logicalOperatorTypesEEnum, LogicalOperatorTypes.AND);
		addEEnumLiteral(logicalOperatorTypesEEnum, LogicalOperatorTypes.OR);
		addEEnumLiteral(logicalOperatorTypesEEnum, LogicalOperatorTypes.NOT);

		// Create resource
		createResource(eNS_URI);
	}

} //CsvmlPackageImpl
