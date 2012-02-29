

import android.text.format.Time;
import java.util.Collection;

public class Picture {

	/**
	 * @uml.property  name="TimeStamp"
	 */
	private Time timeStamp;

	/**
	 * Getter of the property <tt>TimeStamp</tt>
	 * @return  Returns the timeStamp.
	 * @uml.property  name="TimeStamp"
	 */
	public Time getTimeStamp() {
		return timeStamp;
	}

	/**
	 * Setter of the property <tt>TimeStamp</tt>
	 * @param TimeStamp  The timeStamp to set.
	 * @uml.property  name="TimeStamp"
	 */
	public void setTimeStamp(Time timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @uml.property  name="SkinPart"
	 */
	private String skinPart;

	/**
	 * Getter of the property <tt>SkinPart</tt>
	 * @return  Returns the skinPart.
	 * @uml.property  name="SkinPart"
	 */
	public String getSkinPart() {
		return skinPart;
	}

	/**
	 * Setter of the property <tt>SkinPart</tt>
	 * @param SkinPart  The skinPart to set.
	 * @uml.property  name="SkinPart"
	 */
	public void setSkinPart(String skinPart) {
		this.skinPart = skinPart;
	}

	/**
	 * @uml.property  name="Tag"
	 */
	private String groupTag;

	/**
	 * Getter of the property <tt>Tag</tt>
	 * @return  Returns the tag.
	 * @uml.property  name="Tag"
	 */
	public String getTag() {
		return groupTag;
	}

	/**
	 * Setter of the property <tt>Tag</tt>
	 * @param Tag  The tag to set.
	 * @uml.property  name="Tag"
	 */
	public void setTag(String tag) {
		this.groupTag = tag;
	}

	/** 
	 * @uml.property name="general"
	 * @uml.associationEnd multiplicity="(1 -1)" inverse="picture:General"
	 */
	private Collection<General> general;

	/** 
	 * Getter of the property <tt>general</tt>
	 * @return  Returns the general.
	 * @uml.property  name="general"
	 */
	public Collection<General> getGeneral() {
		return general;
	}

	/** 
	 * Setter of the property <tt>general</tt>
	 * @param general  The general to set.
	 * @uml.property  name="general"
	 */
	public void setGeneral(Collection<General> general) {
		this.general = general;
	}

	/** 
	 * @uml.property name="camera"
	 * @uml.associationEnd multiplicity="(1 -1)" inverse="picture:Camera"
	 */
	private Collection<Camera> camera;

	/** 
	 * Getter of the property <tt>camera</tt>
	 * @return  Returns the camera.
	 * @uml.property  name="camera"
	 */
	public Collection<Camera> getCamera() {
		return camera;
	}

	/** 
	 * Setter of the property <tt>camera</tt>
	 * @param camera  The camera to set.
	 * @uml.property  name="camera"
	 */
	public void setCamera(Collection<Camera> camera) {
		this.camera = camera;
	}

	/**
	 * @uml.property  name="Description"
	 */
	private String description;

	/**
	 * Getter of the property <tt>Description</tt>
	 * @return  Returns the description.
	 * @uml.property  name="Description"
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Setter of the property <tt>Description</tt>
	 * @param Description  The description to set.
	 * @uml.property  name="Description"
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @uml.property  name="handlePicture"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="picture:HandlePicture"
	 */
	private Collection<HandlePicture> handlePicture;

	/**
	 * Getter of the property <tt>handlePicture</tt>
	 * @return  Returns the handlePicture.
	 * @uml.property  name="handlePicture"
	 */
	public Collection<HandlePicture> getHandlePicture() {
		return handlePicture;
	}

	/**
	 * Setter of the property <tt>handlePicture</tt>
	 * @param handlePicture  The handlePicture to set.
	 * @uml.property  name="handlePicture"
	 */
	public void setHandlePicture(Collection<HandlePicture> handlePicture) {
		this.handlePicture = handlePicture;
	}

	/**
	 * @uml.property  name="group"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="picture:Group"
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
	 * @uml.property  name="compare"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="picture:Compare"
	 */
	private Collection<Compare> compare;

	/**
	 * Getter of the property <tt>compare</tt>
	 * @return  Returns the compare.
	 * @uml.property  name="compare"
	 */
	public Collection<Compare> getCompare() {
		return compare;
	}

	/**
	 * Setter of the property <tt>compare</tt>
	 * @param compare  The compare to set.
	 * @uml.property  name="compare"
	 */
	public void setCompare(Collection<Compare> compare) {
		this.compare = compare;
	}

}
