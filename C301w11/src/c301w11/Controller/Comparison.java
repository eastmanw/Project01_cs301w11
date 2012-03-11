package c301w11.Controller;


import java.util.Collection;

import c301w11.Model.Photo;
import c301w11.View.CompareActivity;

public class Comparison {

		
		/**
		 */
		public void selectPicture(){
		}

			
			/**
			 */
			public void openPictures(){
			}


				
				/**
				 */
				public void sortPicturesByTime(){
				}



				/**
				 * @uml.property  name="picture"
				 * @uml.associationEnd  multiplicity="(1 -1)" inverse="compare:Picture"
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
				 * @uml.property  name="compareActivity"
				 * @uml.associationEnd  multiplicity="(1 1)" inverse="compare:CompareActivity"
				 */
				private CompareActivity compareActivity = new CompareActivity();



				/**
				 * Getter of the property <tt>compareActivity</tt>
				 * @return  Returns the compareActivity.
				 * @uml.property  name="compareActivity"
				 */
				public CompareActivity getCompareActivity() {
					return compareActivity;
				}


				/**
				 * Setter of the property <tt>compareActivity</tt>
				 * @param compareActivity  The compareActivity to set.
				 * @uml.property  name="compareActivity"
				 */
				public void setCompareActivity(CompareActivity compareActivity) {
					this.compareActivity = compareActivity;
				}

}
