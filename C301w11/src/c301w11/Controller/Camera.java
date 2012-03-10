package c301w11.Controller;


import java.util.Collection;

import c301w11.Model.Photo;
import c301w11.View.CameraActivity;

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
				private Collection<Photo> photo;



				/** 
				 * Getter of the property <tt>picture</tt>
				 * @return  Returns the picture.
				 * @uml.property  name="picture"
				 */
				public Collection<Photo> getPicture() {
					return photo;
				}



				/** 
				 * Setter of the property <tt>picture</tt>
				 * @param photo  The picture to set.
				 * @uml.property  name="picture"
				 */
				public void setPicture(Collection<Photo> photo) {
					this.photo = photo;
				}

}
