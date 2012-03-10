

import java.util.Collection;

public class HandlePicture {

		
		/**
		 */
		public void viewFullScreen(){
		}

			
			/**
			 */
			public void deletePicture(){
			}


				
				/**
				 */
				public void backToGeneral(){
				}



				/**
				 * @uml.property  name="picture"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="handlePicture:Picture"
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
				 * @uml.property  name="generalActivity"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="handlePicture:GeneralActivity"
				 */
				private Collection<ListPictureActivity> generalActivity;



				/**
				 * Getter of the property <tt>generalActivity</tt>
				 * @return  Returns the generalActivity.
				 * @uml.property  name="generalActivity"
				 */
				public Collection<ListPictureActivity> getGeneralActivity() {
					return generalActivity;
				}


				/**
				 * Setter of the property <tt>generalActivity</tt>
				 * @param generalActivity  The generalActivity to set.
				 * @uml.property  name="generalActivity"
				 */
				public void setGeneralActivity(
						Collection<ListPictureActivity> generalActivity) {
							this.generalActivity = generalActivity;
						}


					
					/**
					 */
					public void slideNext(){
					}


						
						/**
						 */
						public void slidePrevious(){
						}



						/**
						 * @uml.property  name="group"
						 * @uml.associationEnd  multiplicity="(1 -1)" inverse="handlePicture:Group"
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
						 * @uml.property  name="pictureActivity"
						 * @uml.associationEnd  multiplicity="(1 1)" inverse="handlePicture:PictureActivity"
						 */
						private PictureActivity pictureActivity = new PictureActivity();



						/**
						 * Getter of the property <tt>pictureActivity</tt>
						 * @return  Returns the pictureActivity.
						 * @uml.property  name="pictureActivity"
						 */
						public PictureActivity getPictureActivity() {
							return pictureActivity;
						}


						/**
						 * Setter of the property <tt>pictureActivity</tt>
						 * @param pictureActivity  The pictureActivity to set.
						 * @uml.property  name="pictureActivity"
						 */
						public void setPictureActivity(
								PictureActivity pictureActivity) {
							this.pictureActivity = pictureActivity;
						}

}
