/*
 * author: Maria Chalsev
 * Course: BIF812
 * Instructor: Marek Laskowski
 * Date: 02.19.16
 * Declaration: I declare that the attached assignment is wholly my own work
 * in accordance with Seneca Academic Policy.  No part of this
 * assignment has been copied manually or electronically from any
 * other source (including web sites) or distributed to other students. 
 * Maria Chalsev 035231141
 */
public class UseMiniGenBankSeq {

	
public static void main(String[] args){

	System.out.println ("Seneca College\nBIF812 - Concepts of Programming with Java\n\nASSIGNMENT 1 DEMO\n\n" + "Author: Maria Chalsev\n\n" + "-----------------------------------------\n");
	
	
	
	System.out.println ("The following object, representing mSRP (murine-derived Signal Recognition Particle 72) was created using the default no-argument constructor:\n");
	
	MiniGenBankSeq mSRP=new MiniGenBankSeq ();  
	System.out.println ("Here is the default state of the object:\n" + mSRP.toString ()); 
	mSRP.setLocus ("BC003434 1688 bp    mRNA    linear   ROD 11-SEP-2007");   
	mSRP.setAccessionNumber("BC003434");
	mSRP.setDefinition ("Mus musculus signal recognition particle 72, mRNA (cDNA clone IMAGE:2646894), partial cds.");
	mSRP.setSource("Mus musculus (house mouse)");
	System.out.println ("Here is the state of the same object following the implementation of setter methods to provide data for the object:\n" + mSRP.toString ()); 
	
	
	System.out.println ("The following object, representing mHO1 (murine-derived hydroxyacid oxidase 1), was created using a partially-initialized two-argument constructor:\n");
	
	MiniGenBankSeq mHO1=new MiniGenBankSeq ("BC018587 1991 bp    mRNA    linear   HTC 19-NOV-2003", "BC018587");   // partially initialized new object constructorfor second genbankfile
	System.out.println ("Here is the default state of the object:\n" + mHO1.toString ());
	mHO1.setDefinition ("Mus musculus hydroxyacid oxidase 1, liver, mRNA (cDNA clone IMAGE:4210721)");
	mHO1.setSource("Mus musculus (house mouse)");
	System.out.println ("Here is the state of the same object following the implementation of setter methods to provide the rest of the data for the object:\n" + mHO1.toString ());

	
	System.out.println ("The following object, representing dOR (danio rerio P450 oxidoreductase), was created using a fully-initialized four-argument constructor.\nNo data needed to be passed via setter methods.");
	
	MiniGenBankSeq dOR=new MiniGenBankSeq ("BC099998 2986 bp    mRNA    linear   VRT 16-FEB-2007", "BC099998", "Danio rerio P450 (cytochrome) oxidoreductase, mRNA (cDNA clone) MGC:110032 IMAGE:7277890), complete cds", "Danio rerio (zebrafish)");  
	System.out.println ("Here is the default state of the object:\n" + dOR.toString ());
	}

	/*GenBank data obtained from the following:   
	 * mSRP object:  http://www.ncbi.nlm.nih.gov/nuccore/BC003434
	 * mHO1 object:  http://www.ncbi.nlm.nih.gov/nuccore/BC018587
	 * dOR object:   http://www.ncbi.nlm.nih.gov/nuccore/BC099998
	 */

}
