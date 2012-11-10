/**
 */
package csvml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see csvml.CsvmlFactory
 * @model kind="package"
 * @generated
 */
public interface CsvmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csvml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://csvml/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csvml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CsvmlPackage eINSTANCE = csvml.impl.CsvmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link csvml.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.FileDefinitionSetImpl
	 * @see csvml.impl.CsvmlPackageImpl#getFileDefinitionSet()
	 * @generated
	 */
	int FILE_DEFINITION_SET = 0;

	/**
	 * The feature id for the '<em><b>Filedefinitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET__FILEDEFINITIONS = 0;

	/**
	 * The number of structural features of the '<em>File Definition Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link csvml.impl.FileDefinitionImpl <em>File Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.FileDefinitionImpl
	 * @see csvml.impl.CsvmlPackageImpl#getFileDefinition()
	 * @generated
	 */
	int FILE_DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Fielddefinitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION__FIELDDEFINITIONS = 1;

	/**
	 * The number of structural features of the '<em>File Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_DEFINITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link csvml.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.FieldDefinitionImpl
	 * @see csvml.impl.CsvmlPackageImpl#getFieldDefinition()
	 * @generated
	 */
	int FIELD_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__FIELD_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION__RULE = 3;

	/**
	 * The number of structural features of the '<em>Field Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_DEFINITION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link csvml.impl.StaticFieldImpl <em>Static Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.StaticFieldImpl
	 * @see csvml.impl.CsvmlPackageImpl#getStaticField()
	 * @generated
	 */
	int STATIC_FIELD = 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD__RULE = FIELD_DEFINITION__RULE;

	/**
	 * The number of structural features of the '<em>Static Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvml.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.DerivedFieldImpl
	 * @see csvml.impl.CsvmlPackageImpl#getDerivedField()
	 * @generated
	 */
	int DERIVED_FIELD = 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD__RULE = FIELD_DEFINITION__RULE;

	/**
	 * The number of structural features of the '<em>Derived Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DERIVED_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link csvml.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.AggregationFieldImpl
	 * @see csvml.impl.CsvmlPackageImpl#getAggregationField()
	 * @generated
	 */
	int AGGREGATION_FIELD = 5;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__RULE = FIELD_DEFINITION__RULE;

	/**
	 * The feature id for the '<em><b>Aggregation Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__AGGREGATION_TYPE = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Aggregatedfields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__AGGREGATEDFIELDS = FIELD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD__FIELDS = FIELD_DEFINITION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Aggregation Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link csvml.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.RuleBasedFieldImpl
	 * @see csvml.impl.CsvmlPackageImpl#getRuleBasedField()
	 * @generated
	 */
	int RULE_BASED_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__INDEX = FIELD_DEFINITION__INDEX;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__NAME = FIELD_DEFINITION__NAME;

	/**
	 * The feature id for the '<em><b>Field Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__FIELD_TYPE = FIELD_DEFINITION__FIELD_TYPE;

	/**
	 * The feature id for the '<em><b>Rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__RULE = FIELD_DEFINITION__RULE;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD__RULES = FIELD_DEFINITION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rule Based Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_BASED_FIELD_FEATURE_COUNT = FIELD_DEFINITION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link csvml.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.RuleImpl
	 * @see csvml.impl.CsvmlPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 7;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__INDEX = 0;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RESULT_VALUE = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DEFAULT_VALUE = 2;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link csvml.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.ComparisonRuleImpl
	 * @see csvml.impl.CsvmlPackageImpl#getComparisonRule()
	 * @generated
	 */
	int COMPARISON_RULE = 8;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__INDEX = RULE__INDEX;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__DEFAULT_VALUE = RULE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Comparisonfield</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__COMPARISONFIELD = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Comparison Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__COMPARISON_VALUE = RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE__OPERATOR = RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Comparison Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARISON_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link csvml.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.impl.CompositeRuleImpl
	 * @see csvml.impl.CsvmlPackageImpl#getCompositeRule()
	 * @generated
	 */
	int COMPOSITE_RULE = 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__INDEX = RULE__INDEX;

	/**
	 * The feature id for the '<em><b>Result Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__RESULT_VALUE = RULE__RESULT_VALUE;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__DEFAULT_VALUE = RULE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__OPERATOR = RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Composedrules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE__COMPOSEDRULES = RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Composite Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_RULE_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link csvml.FieldTypTypes <em>Field Typ Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.FieldTypTypes
	 * @see csvml.impl.CsvmlPackageImpl#getFieldTypTypes()
	 * @generated
	 */
	int FIELD_TYP_TYPES = 10;

	/**
	 * The meta object id for the '{@link csvml.AggregationTypes <em>Aggregation Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.AggregationTypes
	 * @see csvml.impl.CsvmlPackageImpl#getAggregationTypes()
	 * @generated
	 */
	int AGGREGATION_TYPES = 11;

	/**
	 * The meta object id for the '{@link csvml.CompOperatorTypes <em>Comp Operator Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.CompOperatorTypes
	 * @see csvml.impl.CsvmlPackageImpl#getCompOperatorTypes()
	 * @generated
	 */
	int COMP_OPERATOR_TYPES = 12;

	/**
	 * The meta object id for the '{@link csvml.LogicalOperatorTypes <em>Logical Operator Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see csvml.LogicalOperatorTypes
	 * @see csvml.impl.CsvmlPackageImpl#getLogicalOperatorTypes()
	 * @generated
	 */
	int LOGICAL_OPERATOR_TYPES = 13;


	/**
	 * Returns the meta object for class '{@link csvml.FileDefinitionSet <em>File Definition Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition Set</em>'.
	 * @see csvml.FileDefinitionSet
	 * @generated
	 */
	EClass getFileDefinitionSet();

	/**
	 * Returns the meta object for the containment reference list '{@link csvml.FileDefinitionSet#getFiledefinitions <em>Filedefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filedefinitions</em>'.
	 * @see csvml.FileDefinitionSet#getFiledefinitions()
	 * @see #getFileDefinitionSet()
	 * @generated
	 */
	EReference getFileDefinitionSet_Filedefinitions();

	/**
	 * Returns the meta object for class '{@link csvml.FileDefinition <em>File Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Definition</em>'.
	 * @see csvml.FileDefinition
	 * @generated
	 */
	EClass getFileDefinition();

	/**
	 * Returns the meta object for the attribute '{@link csvml.FileDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csvml.FileDefinition#getName()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EAttribute getFileDefinition_Name();

	/**
	 * Returns the meta object for the reference list '{@link csvml.FileDefinition#getFielddefinitions <em>Fielddefinitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fielddefinitions</em>'.
	 * @see csvml.FileDefinition#getFielddefinitions()
	 * @see #getFileDefinition()
	 * @generated
	 */
	EReference getFileDefinition_Fielddefinitions();

	/**
	 * Returns the meta object for class '{@link csvml.FieldDefinition <em>Field Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field Definition</em>'.
	 * @see csvml.FieldDefinition
	 * @generated
	 */
	EClass getFieldDefinition();

	/**
	 * Returns the meta object for the attribute '{@link csvml.FieldDefinition#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see csvml.FieldDefinition#getIndex()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Index();

	/**
	 * Returns the meta object for the attribute '{@link csvml.FieldDefinition#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see csvml.FieldDefinition#getName()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_Name();

	/**
	 * Returns the meta object for the attribute '{@link csvml.FieldDefinition#getFieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field Type</em>'.
	 * @see csvml.FieldDefinition#getFieldType()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EAttribute getFieldDefinition_FieldType();

	/**
	 * Returns the meta object for the reference '{@link csvml.FieldDefinition#getRule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Rule</em>'.
	 * @see csvml.FieldDefinition#getRule()
	 * @see #getFieldDefinition()
	 * @generated
	 */
	EReference getFieldDefinition_Rule();

	/**
	 * Returns the meta object for class '{@link csvml.StaticField <em>Static Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Field</em>'.
	 * @see csvml.StaticField
	 * @generated
	 */
	EClass getStaticField();

	/**
	 * Returns the meta object for class '{@link csvml.DerivedField <em>Derived Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Derived Field</em>'.
	 * @see csvml.DerivedField
	 * @generated
	 */
	EClass getDerivedField();

	/**
	 * Returns the meta object for class '{@link csvml.AggregationField <em>Aggregation Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation Field</em>'.
	 * @see csvml.AggregationField
	 * @generated
	 */
	EClass getAggregationField();

	/**
	 * Returns the meta object for the attribute '{@link csvml.AggregationField#getAggregationType <em>Aggregation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Type</em>'.
	 * @see csvml.AggregationField#getAggregationType()
	 * @see #getAggregationField()
	 * @generated
	 */
	EAttribute getAggregationField_AggregationType();

	/**
	 * Returns the meta object for the reference list '{@link csvml.AggregationField#getAggregatedfields <em>Aggregatedfields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Aggregatedfields</em>'.
	 * @see csvml.AggregationField#getAggregatedfields()
	 * @see #getAggregationField()
	 * @generated
	 */
	EReference getAggregationField_Aggregatedfields();

	/**
	 * Returns the meta object for the reference list '{@link csvml.AggregationField#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fields</em>'.
	 * @see csvml.AggregationField#getFields()
	 * @see #getAggregationField()
	 * @generated
	 */
	EReference getAggregationField_Fields();

	/**
	 * Returns the meta object for class '{@link csvml.RuleBasedField <em>Rule Based Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule Based Field</em>'.
	 * @see csvml.RuleBasedField
	 * @generated
	 */
	EClass getRuleBasedField();

	/**
	 * Returns the meta object for the reference list '{@link csvml.RuleBasedField#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Rules</em>'.
	 * @see csvml.RuleBasedField#getRules()
	 * @see #getRuleBasedField()
	 * @generated
	 */
	EReference getRuleBasedField_Rules();

	/**
	 * Returns the meta object for class '{@link csvml.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see csvml.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link csvml.Rule#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see csvml.Rule#getIndex()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Index();

	/**
	 * Returns the meta object for the attribute '{@link csvml.Rule#getResultValue <em>Result Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Result Value</em>'.
	 * @see csvml.Rule#getResultValue()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_ResultValue();

	/**
	 * Returns the meta object for the attribute '{@link csvml.Rule#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see csvml.Rule#getDefaultValue()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_DefaultValue();

	/**
	 * Returns the meta object for class '{@link csvml.ComparisonRule <em>Comparison Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparison Rule</em>'.
	 * @see csvml.ComparisonRule
	 * @generated
	 */
	EClass getComparisonRule();

	/**
	 * Returns the meta object for the reference '{@link csvml.ComparisonRule#getComparisonfield <em>Comparisonfield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Comparisonfield</em>'.
	 * @see csvml.ComparisonRule#getComparisonfield()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EReference getComparisonRule_Comparisonfield();

	/**
	 * Returns the meta object for the attribute '{@link csvml.ComparisonRule#getComparisonValue <em>Comparison Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comparison Value</em>'.
	 * @see csvml.ComparisonRule#getComparisonValue()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_ComparisonValue();

	/**
	 * Returns the meta object for the attribute '{@link csvml.ComparisonRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see csvml.ComparisonRule#getOperator()
	 * @see #getComparisonRule()
	 * @generated
	 */
	EAttribute getComparisonRule_Operator();

	/**
	 * Returns the meta object for class '{@link csvml.CompositeRule <em>Composite Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Rule</em>'.
	 * @see csvml.CompositeRule
	 * @generated
	 */
	EClass getCompositeRule();

	/**
	 * Returns the meta object for the attribute '{@link csvml.CompositeRule#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see csvml.CompositeRule#getOperator()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EAttribute getCompositeRule_Operator();

	/**
	 * Returns the meta object for the reference list '{@link csvml.CompositeRule#getComposedrules <em>Composedrules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Composedrules</em>'.
	 * @see csvml.CompositeRule#getComposedrules()
	 * @see #getCompositeRule()
	 * @generated
	 */
	EReference getCompositeRule_Composedrules();

	/**
	 * Returns the meta object for enum '{@link csvml.FieldTypTypes <em>Field Typ Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Field Typ Types</em>'.
	 * @see csvml.FieldTypTypes
	 * @generated
	 */
	EEnum getFieldTypTypes();

	/**
	 * Returns the meta object for enum '{@link csvml.AggregationTypes <em>Aggregation Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Aggregation Types</em>'.
	 * @see csvml.AggregationTypes
	 * @generated
	 */
	EEnum getAggregationTypes();

	/**
	 * Returns the meta object for enum '{@link csvml.CompOperatorTypes <em>Comp Operator Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Comp Operator Types</em>'.
	 * @see csvml.CompOperatorTypes
	 * @generated
	 */
	EEnum getCompOperatorTypes();

	/**
	 * Returns the meta object for enum '{@link csvml.LogicalOperatorTypes <em>Logical Operator Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Logical Operator Types</em>'.
	 * @see csvml.LogicalOperatorTypes
	 * @generated
	 */
	EEnum getLogicalOperatorTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CsvmlFactory getCsvmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link csvml.impl.FileDefinitionSetImpl <em>File Definition Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.FileDefinitionSetImpl
		 * @see csvml.impl.CsvmlPackageImpl#getFileDefinitionSet()
		 * @generated
		 */
		EClass FILE_DEFINITION_SET = eINSTANCE.getFileDefinitionSet();

		/**
		 * The meta object literal for the '<em><b>Filedefinitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION_SET__FILEDEFINITIONS = eINSTANCE.getFileDefinitionSet_Filedefinitions();

		/**
		 * The meta object literal for the '{@link csvml.impl.FileDefinitionImpl <em>File Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.FileDefinitionImpl
		 * @see csvml.impl.CsvmlPackageImpl#getFileDefinition()
		 * @generated
		 */
		EClass FILE_DEFINITION = eINSTANCE.getFileDefinition();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_DEFINITION__NAME = eINSTANCE.getFileDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Fielddefinitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_DEFINITION__FIELDDEFINITIONS = eINSTANCE.getFileDefinition_Fielddefinitions();

		/**
		 * The meta object literal for the '{@link csvml.impl.FieldDefinitionImpl <em>Field Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.FieldDefinitionImpl
		 * @see csvml.impl.CsvmlPackageImpl#getFieldDefinition()
		 * @generated
		 */
		EClass FIELD_DEFINITION = eINSTANCE.getFieldDefinition();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__INDEX = eINSTANCE.getFieldDefinition_Index();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__NAME = eINSTANCE.getFieldDefinition_Name();

		/**
		 * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD_DEFINITION__FIELD_TYPE = eINSTANCE.getFieldDefinition_FieldType();

		/**
		 * The meta object literal for the '<em><b>Rule</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIELD_DEFINITION__RULE = eINSTANCE.getFieldDefinition_Rule();

		/**
		 * The meta object literal for the '{@link csvml.impl.StaticFieldImpl <em>Static Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.StaticFieldImpl
		 * @see csvml.impl.CsvmlPackageImpl#getStaticField()
		 * @generated
		 */
		EClass STATIC_FIELD = eINSTANCE.getStaticField();

		/**
		 * The meta object literal for the '{@link csvml.impl.DerivedFieldImpl <em>Derived Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.DerivedFieldImpl
		 * @see csvml.impl.CsvmlPackageImpl#getDerivedField()
		 * @generated
		 */
		EClass DERIVED_FIELD = eINSTANCE.getDerivedField();

		/**
		 * The meta object literal for the '{@link csvml.impl.AggregationFieldImpl <em>Aggregation Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.AggregationFieldImpl
		 * @see csvml.impl.CsvmlPackageImpl#getAggregationField()
		 * @generated
		 */
		EClass AGGREGATION_FIELD = eINSTANCE.getAggregationField();

		/**
		 * The meta object literal for the '<em><b>Aggregation Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGGREGATION_FIELD__AGGREGATION_TYPE = eINSTANCE.getAggregationField_AggregationType();

		/**
		 * The meta object literal for the '<em><b>Aggregatedfields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_FIELD__AGGREGATEDFIELDS = eINSTANCE.getAggregationField_Aggregatedfields();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATION_FIELD__FIELDS = eINSTANCE.getAggregationField_Fields();

		/**
		 * The meta object literal for the '{@link csvml.impl.RuleBasedFieldImpl <em>Rule Based Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.RuleBasedFieldImpl
		 * @see csvml.impl.CsvmlPackageImpl#getRuleBasedField()
		 * @generated
		 */
		EClass RULE_BASED_FIELD = eINSTANCE.getRuleBasedField();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE_BASED_FIELD__RULES = eINSTANCE.getRuleBasedField_Rules();

		/**
		 * The meta object literal for the '{@link csvml.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.RuleImpl
		 * @see csvml.impl.CsvmlPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__INDEX = eINSTANCE.getRule_Index();

		/**
		 * The meta object literal for the '<em><b>Result Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__RESULT_VALUE = eINSTANCE.getRule_ResultValue();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__DEFAULT_VALUE = eINSTANCE.getRule_DefaultValue();

		/**
		 * The meta object literal for the '{@link csvml.impl.ComparisonRuleImpl <em>Comparison Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.ComparisonRuleImpl
		 * @see csvml.impl.CsvmlPackageImpl#getComparisonRule()
		 * @generated
		 */
		EClass COMPARISON_RULE = eINSTANCE.getComparisonRule();

		/**
		 * The meta object literal for the '<em><b>Comparisonfield</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPARISON_RULE__COMPARISONFIELD = eINSTANCE.getComparisonRule_Comparisonfield();

		/**
		 * The meta object literal for the '<em><b>Comparison Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__COMPARISON_VALUE = eINSTANCE.getComparisonRule_ComparisonValue();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPARISON_RULE__OPERATOR = eINSTANCE.getComparisonRule_Operator();

		/**
		 * The meta object literal for the '{@link csvml.impl.CompositeRuleImpl <em>Composite Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.impl.CompositeRuleImpl
		 * @see csvml.impl.CsvmlPackageImpl#getCompositeRule()
		 * @generated
		 */
		EClass COMPOSITE_RULE = eINSTANCE.getCompositeRule();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOSITE_RULE__OPERATOR = eINSTANCE.getCompositeRule_Operator();

		/**
		 * The meta object literal for the '<em><b>Composedrules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_RULE__COMPOSEDRULES = eINSTANCE.getCompositeRule_Composedrules();

		/**
		 * The meta object literal for the '{@link csvml.FieldTypTypes <em>Field Typ Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.FieldTypTypes
		 * @see csvml.impl.CsvmlPackageImpl#getFieldTypTypes()
		 * @generated
		 */
		EEnum FIELD_TYP_TYPES = eINSTANCE.getFieldTypTypes();

		/**
		 * The meta object literal for the '{@link csvml.AggregationTypes <em>Aggregation Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.AggregationTypes
		 * @see csvml.impl.CsvmlPackageImpl#getAggregationTypes()
		 * @generated
		 */
		EEnum AGGREGATION_TYPES = eINSTANCE.getAggregationTypes();

		/**
		 * The meta object literal for the '{@link csvml.CompOperatorTypes <em>Comp Operator Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.CompOperatorTypes
		 * @see csvml.impl.CsvmlPackageImpl#getCompOperatorTypes()
		 * @generated
		 */
		EEnum COMP_OPERATOR_TYPES = eINSTANCE.getCompOperatorTypes();

		/**
		 * The meta object literal for the '{@link csvml.LogicalOperatorTypes <em>Logical Operator Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see csvml.LogicalOperatorTypes
		 * @see csvml.impl.CsvmlPackageImpl#getLogicalOperatorTypes()
		 * @generated
		 */
		EEnum LOGICAL_OPERATOR_TYPES = eINSTANCE.getLogicalOperatorTypes();

	}

} //CsvmlPackage
