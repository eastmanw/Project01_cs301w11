

import java.util.Collection;

public class Compare {

		
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
