/**
 */
package csvml.impl;

import csvml.CsvmlPackage;
import csvml.FileDefinition;
import csvml.FileDefinitionSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File Definition Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link csvml.impl.FileDefinitionSetImpl#getFiledefinitions <em>Filedefinitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FileDefinitionSetImpl extends EObjectImpl implements FileDefinitionSet {
	/**
	 * The cached value of the '{@link #getFiledefinitions() <em>Filedefinitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFiledefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<FileDefinition> filedefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FileDefinitionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CsvmlPackage.Literals.FILE_DEFINITION_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileDefinition> getFiledefinitions() {
		if (filedefinitions == null) {
			filedefinitions = new EObjectContainmentEList<FileDefinition>(FileDefinition.class, this, CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS);
		}
		return filedefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS:
				return ((InternalEList<?>)getFiledefinitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS:
				return getFiledefinitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS:
				getFiledefinitions().clear();
				getFiledefinitions().addAll((Collection<? extends FileDefinition>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS:
				getFiledefinitions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CsvmlPackage.FILE_DEFINITION_SET__FILEDEFINITIONS:
				return filedefinitions != null && !filedefinitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FileDefinitionSetImpl
