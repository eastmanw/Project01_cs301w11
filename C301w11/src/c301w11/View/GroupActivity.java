package c301w11.View;


import Activity;

import java.util.Collection;

import c301w11.Controller.Group;
import android.widget.Button;
import android.widget.CheckBox;

public class GroupActivity extends Activity {

	/**
	 * @uml.property  name="group"
	 * @uml.associationEnd  multiplicity="(1 -1)" aggregation="shared" inverse="groupActivity:Group"
	 */
	private Collection<Group> group;

	/**
	 * Getter of the property <tt>group</tt>
	 * @return  Returns the group.
	 * @uml.property  name="group"
	 */
	public Collection<Group> getGroup() {
		return group;
	}

	/**
	 * Setter of the property <tt>group</tt>
	 * @param group  The group to set.
	 * @uml.property  name="group"
	 */
	public void setGroup(Collection<Group> group) {
		this.group = group;
	}

	/**
	 * @uml.property  name="OpenGroup"
	 */
	private Button openGroup;

	/**
	 * Getter of the property <tt>OpenGroup</tt>
	 * @return  Returns the openGroup.
	 * @uml.property  name="OpenGroup"
	 */
	public Button getOpenGroup() {
		return openGroup;
	}

	/**
	 * Setter of the property <tt>OpenGroup</tt>
	 * @param OpenGroup  The openGroup to set.
	 * @uml.property  name="OpenGroup"
	 */
	public void setOpenGroup(Button openGroup) {
		this.openGroup = openGroup;
	}

	/**
	 * @uml.property  name="DeleteGroup"
	 */
	private Button deleteGroup;

	/**
	 * Getter of the property <tt>DeleteGroup</tt>
	 * @return  Returns the deleteGroup.
	 * @uml.property  name="DeleteGroup"
	 */
	public Button getDeleteGroup() {
		return deleteGroup;
	}

	/**
	 * Setter of the property <tt>DeleteGroup</tt>
	 * @param DeleteGroup  The deleteGroup to set.
	 * @uml.property  name="DeleteGroup"
	 */
	public void setDeleteGroup(Button deleteGroup) {
		this.deleteGroup = deleteGroup;
	}

	/**
	 * @uml.property  name="NewGroup"
	 */
	private Button newGroup;

	/**
	 * Getter of the property <tt>NewGroup</tt>
	 * @return  Returns the newGroup.
	 * @uml.property  name="NewGroup"
	 */
	public Button getNewGroup() {
		return newGroup;
	}

	/**
	 * Setter of the property <tt>NewGroup</tt>
	 * @param NewGroup  The newGroup to set.
	 * @uml.property  name="NewGroup"
	 */
	public void setNewGroup(Button newGroup) {
		this.newGroup = newGroup;
	}

	/**
	 * @uml.property  name="SelectPicture"
	 */
	private CheckBox selectPicture;

	/**
	 * Getter of the property <tt>SelectPicture</tt>
	 * @return  Returns the selectPicture.
	 * @uml.property  name="SelectPicture"
	 */
	public CheckBox getSelectPicture() {
		return selectPicture;
	}

	/**
	 * Setter of the property <tt>SelectPicture</tt>
	 * @param SelectPicture  The selectPicture to set.
	 * @uml.property  name="SelectPicture"
	 */
	public void setSelectPicture(CheckBox selectPicture) {
		this.selectPicture = selectPicture;
	}

}
