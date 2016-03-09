public class magp{
  public static void main(String[] args){
    int i = findKeyword("Brother Tom is helpful", "brother", 0);
    System.out.print(i);
  }
  private static int findKeyword(String statement, String goal, int startPos)
{
 String phrase = statement.trim();
 int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
 while (psn >= 0)
 {
 String before = " ", after = " ";
 if (psn > 0)
 {
 before = phrase.substring (psn - 1, psn).toLowerCase();
 }
 if (psn + goal.length() < phrase.length())
 {
 after = phrase.substring(psn + goal.length(),
 psn + goal.length() + 1).toLowerCase();
 }
 /* determine the values of psn, before, and after at this point in the method. */
 if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))
 &&
 ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
 {
 return psn;
 }
 psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
 }
 return -1;
}
}