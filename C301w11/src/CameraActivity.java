

import java.util.Collection;

public class CameraActivity extends GeneralActivity {

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
	private General general = new General();

	/** 
	 * Getter of the property <tt>general</tt>
	 * @return  Returns the general.
	 * @uml.property  name="general"
	 */
	public General getGeneral() {
		return general;
	}

	/** 
	 * Setter of the property <tt>general</tt>
	 * @param general  The general to set.
	 * @uml.property  name="general"
	 */
	public void setGeneral(General general) {
		this.general = general;
	}

}
