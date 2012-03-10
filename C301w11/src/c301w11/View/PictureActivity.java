package c301w11.View;


import Activity;

import java.util.Collection;

import c301w11.Controller.HandlePhoto;
import android.widget.Button;

public class PictureActivity extends Activity {

	/**
	 * @uml.property  name="general"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="pictureActivity:General"
	 */
	private Collection<ListPicture> general;

	/**
	 * Getter of the property <tt>general</tt>
	 * @return  Returns the general.
	 * @uml.property  name="general"
	 */
	public Collection<ListPicture> getGeneral() {
		return general;
	}

	/**
	 * Setter of the property <tt>general</tt>
	 * @param general  The general to set.
	 * @uml.property  name="general"
	 */
	public void setGeneral(Collection<ListPicture> general) {
		this.general = general;
	}

	/**
	 * @uml.property  name="handlePicture"
	 * @uml.associationEnd  multiplicity="(1 -1)" aggregation="shared" inverse="pictureActivity:HandlePicture"
	 */
	private Collection<HandlePhoto> handlePhoto;

	/**
	 * Getter of the property <tt>handlePicture</tt>
	 * @return  Returns the handlePicture.
	 * @uml.property  name="handlePicture"
	 */
	public Collection<HandlePhoto> getHandlePicture() {
		return handlePhoto;
	}

	/**
	 * Setter of the property <tt>handlePicture</tt>
	 * @param handlePhoto  The handlePicture to set.
	 * @uml.property  name="handlePicture"
	 */
	public void setHandlePicture(Collection<HandlePhoto> handlePhoto) {
		this.handlePhoto = handlePhoto;
	}

	/**
	 * @uml.property  name="Delete"
	 */
	private Button delete;

	/**
	 * Getter of the property <tt>Delete</tt>
	 * @return  Returns the delete.
	 * @uml.property  name="Delete"
	 */
	public Button getDelete() {
		return delete;
	}

	/**
	 * Setter of the property <tt>Delete</tt>
	 * @param Delete  The delete to set.
	 * @uml.property  name="Delete"
	 */
	public void setDelete(Button delete) {
		this.delete = delete;
	}

	/**
	 * @uml.property  name="ViewFullscreen"
	 */
	private Button viewFullscreen;

	/**
	 * Getter of the property <tt>ViewFullscreen</tt>
	 * @return  Returns the viewFullscreen.
	 * @uml.property  name="ViewFullscreen"
	 */
	public Button getViewFullscreen() {
		return viewFullscreen;
	}

	/**
	 * Setter of the property <tt>ViewFullscreen</tt>
	 * @param ViewFullscreen  The viewFullscreen to set.
	 * @uml.property  name="ViewFullscreen"
	 */
	public void setViewFullscreen(Button viewFullscreen) {
		this.viewFullscreen = viewFullscreen;
	}

	/**
	 * @uml.property  name="Back"
	 */
	private Button back;

	/**
	 * Getter of the property <tt>Back</tt>
	 * @return  Returns the back.
	 * @uml.property  name="Back"
	 */
	public Button getBack() {
		return back;
	}

	/**
	 * Setter of the property <tt>Back</tt>
	 * @param Back  The back to set.
	 * @uml.property  name="Back"
	 */
	public void setBack(Button back) {
		this.back = back;
	}

}
