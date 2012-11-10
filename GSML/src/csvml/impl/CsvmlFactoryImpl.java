/**
 */
package csvml.impl;

import csvml.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CsvmlFactoryImpl extends EFactoryImpl implements CsvmlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CsvmlFactory init() {
		try {
			CsvmlFactory theCsvmlFactory = (CsvmlFactory)EPackage.Registry.INSTANCE.getEFactory("http://csvml/1.0"); 
			if (theCsvmlFactory != null) {
				return theCsvmlFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CsvmlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvmlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CsvmlPackage.FILE_DEFINITION_SET: return createFileDefinitionSet();
			case CsvmlPackage.FILE_DEFINITION: return createFileDefinition();
			case CsvmlPackage.STATIC_FIELD: return createStaticField();
			case CsvmlPackage.DERIVED_FIELD: return createDerivedField();
			case CsvmlPackage.AGGREGATION_FIELD: return createAggregationField();
			case CsvmlPackage.RULE_BASED_FIELD: return createRuleBasedField();
			case CsvmlPackage.COMPARISON_RULE: return createComparisonRule();
			case CsvmlPackage.COMPOSITE_RULE: return createCompositeRule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CsvmlPackage.FIELD_TYP_TYPES:
				return createFieldTypTypesFromString(eDataType, initialValue);
			case CsvmlPackage.AGGREGATION_TYPES:
				return createAggregationTypesFromString(eDataType, initialValue);
			case CsvmlPackage.COMP_OPERATOR_TYPES:
				return createCompOperatorTypesFromString(eDataType, initialValue);
			case CsvmlPackage.LOGICAL_OPERATOR_TYPES:
				return createLogicalOperatorTypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CsvmlPackage.FIELD_TYP_TYPES:
				return convertFieldTypTypesToString(eDataType, instanceValue);
			case CsvmlPackage.AGGREGATION_TYPES:
				return convertAggregationTypesToString(eDataType, instanceValue);
			case CsvmlPackage.COMP_OPERATOR_TYPES:
				return convertCompOperatorTypesToString(eDataType, instanceValue);
			case CsvmlPackage.LOGICAL_OPERATOR_TYPES:
				return convertLogicalOperatorTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDefinitionSet createFileDefinitionSet() {
		FileDefinitionSetImpl fileDefinitionSet = new FileDefinitionSetImpl();
		return fileDefinitionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileDefinition createFileDefinition() {
		FileDefinitionImpl fileDefinition = new FileDefinitionImpl();
		return fileDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticField createStaticField() {
		StaticFieldImpl staticField = new StaticFieldImpl();
		return staticField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedField createDerivedField() {
		DerivedFieldImpl derivedField = new DerivedFieldImpl();
		return derivedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationField createAggregationField() {
		AggregationFieldImpl aggregationField = new AggregationFieldImpl();
		return aggregationField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuleBasedField createRuleBasedField() {
		RuleBasedFieldImpl ruleBasedField = new RuleBasedFieldImpl();
		return ruleBasedField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComparisonRule createComparisonRule() {
		ComparisonRuleImpl comparisonRule = new ComparisonRuleImpl();
		return comparisonRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeRule createCompositeRule() {
		CompositeRuleImpl compositeRule = new CompositeRuleImpl();
		return compositeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldTypTypes createFieldTypTypesFromString(EDataType eDataType, String initialValue) {
		FieldTypTypes result = FieldTypTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFieldTypTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationTypes createAggregationTypesFromString(EDataType eDataType, String initialValue) {
		AggregationTypes result = AggregationTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompOperatorTypes createCompOperatorTypesFromString(EDataType eDataType, String initialValue) {
		CompOperatorTypes result = CompOperatorTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompOperatorTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicalOperatorTypes createLogicalOperatorTypesFromString(EDataType eDataType, String initialValue) {
		LogicalOperatorTypes result = LogicalOperatorTypes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicalOperatorTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CsvmlPackage getCsvmlPackage() {
		return (CsvmlPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CsvmlPackage getPackage() {
		return CsvmlPackage.eINSTANCE;
	}

} //CsvmlFactoryImpl
