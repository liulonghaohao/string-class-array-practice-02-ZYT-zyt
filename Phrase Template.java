public class Phrase
{
    private static String currentPhrase;

    /** Constructs a new Phrase object. */
    public Phrase(String p)
    {
         currentPhrase = p;
    }

    /** Returns the index of the nth occurrence of str in the current phrase;
     *  returns -1 if the nth occurrence does not exist.
     *  Precondition: str.length() > 0 and n > 0
     *  Postcondition: the current phrase is not modified.
     */
    public static int findNthOccurrence(String str, int n)
    {
        /* implementation not shown */
        int index = 0;
        while(n != 0){
            int i = currentPhrase.subString(index).indexOf(str);
            if(i == -1)
                return -1;
            else if(n == 1)
                index += i;
            else
                index += i + str.length();
            n--;
        }
        return index;
    }

    /** Modifies the current phrase by replacing the nth occurrence of str with repl.
     *  If the nth occurrence does not exist, the current phrase is unchanged.
     *  Precondition: str.length() > 0 and n > 0
     */
    public void replaceNthOccurrence(String str, int n, String repl)
    {
        if(findNthOccurrence(str,n) != -1){
            currentPhrase = currentPhrase.substring(0,findNthOccurrence(str,n)) + repl + currentPhrase.substring(findNthOccurrence(str,n) + str.length());
        }
  
    }

    /** Return the index of the last occurrence of str in the current phrase;
     *  returns -1 if str is not found.
     *  Precondition: str.length() > 0
     *  Postcondition: the current phrase is not modified.
     */
    public int findLastOccurrence(String str)
    {
        int i = 1;
        while(findNthOccurrence(str,i) != -1)
            i++;
        return findNthOccurrence(str,i-1);
    }
    /** Returns a string containing the current phrase */
    public String toString(){
        return currentPhrase;
    }
    public static void main(String[] args)
    {

    }
}
