package c301w11.View;



import java.util.Collection;

import c301w11.Controller.Camera;

public class CameraActivity extends ListPictureActivity {

	/** 
	 * @uml.property name="camera"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared" inverse="cameraActivity:Camera"
	 */
	private Collection<Camera> camera = new java.util.ArrayList<Camera>();

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
	 * @uml.property name="general"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="cameraActivity:General"
	 */
	private ListPicture general = new ListPicture();

	/** 
	 * Getter of the property <tt>general</tt>
	 * @return  Returns the general.
	 * @uml.property  name="general"
	 */
	public ListPicture getGeneral() {
		return general;
	}

	/** 
	 * Setter of the property <tt>general</tt>
	 * @param general  The general to set.
	 * @uml.property  name="general"
	 */
	public void setGeneral(ListPicture general) {
		this.general = general;
	}

}
