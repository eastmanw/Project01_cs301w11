package c301w11.Controller;


import java.util.Collection;

import c301w11.Model.Photo;
import c301w11.View.GroupActivity;

public class Group {

		
		/**
		 */
		public void newGroup(){
		}

			
			/**
			 */
			public void deleteGroup(){
			}


				
				/**
				 */
				public void openGroup(){
				}



				/**
				 * @uml.property  name="groupActivity"
				 * @uml.associationEnd  multiplicity="(1 1)" inverse="group:GroupActivity"
				 */
				private GroupActivity groupActivity = new GroupActivity();



				/**
				 * Getter of the property <tt>groupActivity</tt>
				 * @return  Returns the groupActivity.
				 * @uml.property  name="groupActivity"
				 */
				public GroupActivity getGroupActivity() {
					return groupActivity;
				}


				/**
				 * Setter of the property <tt>groupActivity</tt>
				 * @param groupActivity  The groupActivity to set.
				 * @uml.property  name="groupActivity"
				 */
				public void setGroupActivity(GroupActivity groupActivity) {
					this.groupActivity = groupActivity;
				}



				/**
				 * @uml.property  name="picture"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="group:Picture"
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



				/**
				 * @uml.property  name="handlePicture"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="group:HandlePicture"
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
				public void setHandlePicture(
						Collection<HandlePhoto> handlePhoto) {
					this.handlePhoto = handlePhoto;
				}

}
