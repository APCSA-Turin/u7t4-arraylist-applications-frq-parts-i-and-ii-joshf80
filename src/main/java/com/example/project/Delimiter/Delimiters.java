package com.example.project.Delimiter;
import java.util.ArrayList;

public class Delimiters {
    /** The open and close delimiters **/
    private String openDel;
    private String closeDel;

    /** Constructs a Delimiters object where open is the open delimiter and close is the
     *  close delimiter.
     *  Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close) {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string : tokens) {
            if (string.equals(openDel) || string.equals(closeDel)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }
    

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     *  Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closedCount = 0;

        for (String string : delimiters) {
            if (string.equals(openDel)) {
                openCount += 1;
            } else {
                closedCount +=1;
            }
            
            if (closedCount > openCount) {
                return false;
            }
        }
        return true;
    }
}
