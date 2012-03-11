package c301w11.View;


import Activity;

import java.util.Collection;

import c301w11.Controller.Comparison;
import android.widget.CheckBox;
import android.widget.Button;

public class CompareActivity extends Activity {

	/**
	 * @uml.property  name="compare"
	 * @uml.associationEnd  multiplicity="(1 -1)" aggregation="shared" inverse="compareActivity:Compare"
	 */
	private Collection<Comparison> comparison;

	/**
	 * Getter of the property <tt>compare</tt>
	 * @return  Returns the compare.
	 * @uml.property  name="compare"
	 */
	public Collection<Comparison> getCompare() {
		return comparison;
	}

	/**
	 * Setter of the property <tt>compare</tt>
	 * @param comparison  The compare to set.
	 * @uml.property  name="compare"
	 */
	public void setCompare(Collection<Comparison> comparison) {
		this.comparison = comparison;
	}

	/**
	 * @uml.property  name="SelectPicture"
	 */
	private CheckBox selectPicture;

	/**
	 * Getter of the property <tt>SelectPicture</tt>
	 * @return  Returns the selectPicture.
	 * @uml.property  name="SelectPicture"
	 */
	public CheckBox getSelectPicture() {
		return selectPicture;
	}

	/**
	 * Setter of the property <tt>SelectPicture</tt>
	 * @param SelectPicture  The selectPicture to set.
	 * @uml.property  name="SelectPicture"
	 */
	public void setSelectPicture(CheckBox selectPicture) {
		this.selectPicture = selectPicture;
	}

	/**
	 * @uml.property  name="OpenPictures"
	 */
	private Button openPictures;

	/**
	 * Getter of the property <tt>OpenPictures</tt>
	 * @return  Returns the openPictures.
	 * @uml.property  name="OpenPictures"
	 */
	public Button getOpenPictures() {
		return openPictures;
	}

	/**
	 * Setter of the property <tt>OpenPictures</tt>
	 * @param OpenPictures  The openPictures to set.
	 * @uml.property  name="OpenPictures"
	 */
	public void setOpenPictures(Button openPictures) {
		this.openPictures = openPictures;
	}

}
