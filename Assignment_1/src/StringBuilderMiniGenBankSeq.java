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
public class  StringBuilderMiniGenBankSeq extends MiniGenBankSeq {     
	
	@Override
	public void concatenate(String s, int times) {
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<times;i++){
			System.out.println("Concatenating using StringBuilder... concatenations completed: \t" + i + " of "+times);
			sb.append(s);
		}
		sequence = sb.toString();
	}
}


	