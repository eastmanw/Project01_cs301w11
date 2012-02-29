

import java.util.Collection;
import java.util.List;

public class General {

		
		/**
		 */
		public void takePicture(){
		}

			
			/**
			 */
			public void deletePicture(){
			}


			/** 
			 * @uml.property name="generalActivity"
			 * @uml.associationEnd multiplicity="(1 1)" inverse="general:GeneralActivity"
			 */
			private GeneralActivity generalActivity = new GeneralActivity();


			/** 
			 * Getter of the property <tt>generalActivity</tt>
			 * @return  Returns the generalActivity.
			 * @uml.property  name="generalActivity"
			 */
			public GeneralActivity getGeneralActivity() {
				return generalActivity;
			}


			/** 
			 * Setter of the property <tt>generalActivity</tt>
			 * @param generalActivity  The generalActivity to set.
			 * @uml.property  name="generalActivity"
			 */
			public void setGeneralActivity(GeneralActivity generalActivity) {
				this.generalActivity = generalActivity;
			}


			/** 
			 * @uml.property name="picture"
			 * @uml.associationEnd multiplicity="(1 -1)" inverse="general:Picture"
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


			/** 
			 * @uml.property name="cameraActivity"
			 * @uml.associationEnd multiplicity="(1 -1)" inverse="general:CameraActivity"
			 */
			private Collection<CameraActivity> cameraActivity;


			/** 
			 * Getter of the property <tt>cameraActivity</tt>
			 * @return  Returns the cameraActivity.
			 * @uml.property  name="cameraActivity"
			 */
			public Collection<CameraActivity> getCameraActivity() {
				return cameraActivity;
			}


			/** 
			 * Setter of the property <tt>cameraActivity</tt>
			 * @param cameraActivity  The cameraActivity to set.
			 * @uml.property  name="cameraActivity"
			 */
			public void setCameraActivity(
					Collection<CameraActivity> cameraActivity) {
						this.cameraActivity = cameraActivity;
					}


				
				/**
				 */
				public void openPicture(){
				}


				/**
				 * @uml.property  name="pictureActivity"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="general:PictureActivity"
				 */
				private Collection<PictureActivity> pictureActivity;


				/**
				 * Getter of the property <tt>pictureActivity</tt>
				 * @return  Returns the pictureActivity.
				 * @uml.property  name="pictureActivity"
				 */
				public Collection<PictureActivity> getPictureActivity() {
					return pictureActivity;
				}


				/**
				 * Setter of the property <tt>pictureActivity</tt>
				 * @param pictureActivity  The pictureActivity to set.
				 * @uml.property  name="pictureActivity"
				 */
				public void setPictureActivity(
						Collection<PictureActivity> pictureActivity) {
					this.pictureActivity = pictureActivity;
				}

}
