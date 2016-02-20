/*
 * author: Maria Chalsev
 * Course: BIF812
 * Instructor: Marek Laskowski
 * Date of submission: 02.19.16
 * Declaration: I declare that the attached assignment is wholly my own work
 * in accordance with Seneca Academic Policy.  No part of this
 * assignment has been copied manually or electronically from any
 * other source (including web sites) or distributed to other students. 
 * Maria Chalsev 035231141 
 */

//this class presents pieces of information associated with genbank sequence records. 

public class MiniGenBankSeq extends SequenceLoader {
/**the following variables are pieces of information regarding a genbank file.
*Each variable is declared and has a getter and setter methods that pass a given value to the variable and return that variable, respectively. 
*getter methods include a conditional statement to account for cases where an uninitialized value is called, returning the default string value "null", instead issuing an "uninitialized value" warning/error. 	
*/
	private String locus;
	public void setLocus(String locus) {
		this.locus = locus;
	}
	public String getLocus() {
		
		if (locus==null){
			return "ERROR: uninitialized value";
		}
		else {
			return locus;
		}
	}

	private String accessionNumber;
	public void setAccessionNumber(String accessionNumber) {
		this.accessionNumber = accessionNumber;
	}
	public String getAccessionNumber() {
		if (accessionNumber==null){
			return "ERROR: uninitialized value";
		}
		else {
			return accessionNumber;
		}
	}

	private String definition; 
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getDefinition() {
		if (definition==null){
			return "ERROR: uninitialized value";
		}
		else {
			return definition;
		}
	}

	private String source; 
	public void setSource(String source) {
	this.source = source;
	}
	public String getSource() {
		if (source==null){
			return "ERROR: uninitialized value";
		}
		else {
			return source;
		}
	}

// the following constructors allow for the creation of objects (ie. genbank records) with various initialization levels. 
	
	//no argument constructor
	public MiniGenBankSeq () {
	}
	//partially-initialized 2 argument constructor
	public MiniGenBankSeq(String locus, String accessionNumber) {
		setLocus (locus);
		setAccessionNumber(accessionNumber);
	}
	//fully initialized 4 argument constructor
	public MiniGenBankSeq(String locus, String accessionNumber, String definition, String source) {
		setLocus (locus);
		setAccessionNumber(accessionNumber);
		setDefinition (definition);
		setSource(source);
	}
		
	//Override toString method is used to return a formatted string which could then be printed through the main method.  
	@Override
	public String toString() {
	    return "locus :\t\t\t " + getLocus() + "\naccession number :\t " + getAccessionNumber() + "\ndefinition :\t\t " + getDefinition() + "\nsource :\t\t " + getSource() + "\n\n";
	}
	




}