

import java.util.Collection;

public class Camera {

		
		/**
			 */
			public void cancel(){
			}


				
				/**
				 */
				public void storePicture(){
				}



				/** 
				 * @uml.property name="cameraActivity"
				 * @uml.associationEnd multiplicity="(1 1)" inverse="camera:CameraActivity"
				 */
				private CameraActivity cameraActivity = new CameraActivity();



				/** 
				 * Getter of the property <tt>cameraActivity</tt>
				 * @return  Returns the cameraActivity.
				 * @uml.property  name="cameraActivity"
				 */
				public CameraActivity getCameraActivity() {
					return cameraActivity;
				}



				/** 
				 * Setter of the property <tt>cameraActivity</tt>
				 * @param cameraActivity  The cameraActivity to set.
				 * @uml.property  name="cameraActivity"
				 */
				public void setCameraActivity(CameraActivity cameraActivity) {
					this.cameraActivity = cameraActivity;
				}



				/** 
				 * @uml.property name="picture"
				 * @uml.associationEnd multiplicity="(1 -1)" inverse="camera:Picture"
				 */
				private Collection<Picture> picture;



				/** 
				 * Getter of the property <tt>picture</tt>
				 * @return  Returns the picture.
				 * @uml.property  name="picture"
				 */
				public Collection<Picture> getPicture() {
					return picture;
				}



				/** 
				 * Setter of the property <tt>picture</tt>
				 * @param picture  The picture to set.
				 * @uml.property  name="picture"
				 */
				public void setPicture(Collection<Picture> picture) {
					this.picture = picture;
				}

}
