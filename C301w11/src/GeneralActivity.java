

import java.util.Collection;
import android.widget.Button;

public class GeneralActivity extends Activity {

	/** 
	 * @uml.property name="general"
	 * @uml.associationEnd multiplicity="(1 -1)" aggregation="shared" inverse="generalActivity:General"
	 */
	private Collection<General> general;

	/** 
	 * Getter of the property <tt>general</tt>
	 * @return  Returns the general.
	 * @uml.property  name="general"
	 */
	public General getGeneral() {
		return (General) general;
	}

	/** 
	 * Setter of the property <tt>general</tt>
	 * @param general  The general to set.
	 * @uml.property  name="general"
	 */
	public void setGeneral(Collection<General> general) {
		this.general = general;
	}

	/**
	 * @uml.property  name="handlePicture"
	 * @uml.associationEnd  multiplicity="(1 -1)" inverse="generalActivity:HandlePicture"
	 */
	private Collection<HandlePicture> handlePicture;

	/**
	 * Getter of the property <tt>handlePicture</tt>
	 * @return  Returns the handlePicture.
	 * @uml.property  name="handlePicture"
	 */
	public Collection<HandlePicture> getHandlePicture() {
		return handlePicture;
	}

	/**
	 * Setter of the property <tt>handlePicture</tt>
	 * @param handlePicture  The handlePicture to set.
	 * @uml.property  name="handlePicture"
	 */
	public void setHandlePicture(Collection<HandlePicture> handlePicture) {
		this.handlePicture = handlePicture;
	}

	/**
	 * @uml.property  name="OpenPicture"
	 */
	private Button openPicture;

	/**
	 * Getter of the property <tt>OpenPicture</tt>
	 * @return  Returns the openPicture.
	 * @uml.property  name="OpenPicture"
	 */
	public Button getOpenPicture() {
		return openPicture;
	}

	/**
	 * Setter of the property <tt>OpenPicture</tt>
	 * @param OpenPicture  The openPicture to set.
	 * @uml.property  name="OpenPicture"
	 */
	public void setOpenPicture(Button openPicture) {
		this.openPicture = openPicture;
	}

	/**
	 * @uml.property  name="TakePicture"
	 */
	private Button takePicture;

	/**
	 * Getter of the property <tt>TakePicture</tt>
	 * @return  Returns the takePicture.
	 * @uml.property  name="TakePicture"
	 */
	public Button getTakePicture() {
		return takePicture;
	}

	/**
	 * Setter of the property <tt>TakePicture</tt>
	 * @param TakePicture  The takePicture to set.
	 * @uml.property  name="TakePicture"
	 */
	public void setTakePicture(Button takePicture) {
		this.takePicture = takePicture;
	}

}
