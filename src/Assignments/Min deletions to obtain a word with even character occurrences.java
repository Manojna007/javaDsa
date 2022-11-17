//Min deletions to obtain a word with even character occurrences

/*Test cases:
f("acbcbba") => 1, delete 1 'b'
f("axxaxa") => 2, delete 1 'a', 1 'x'
f("kkkkkk") => 0, nop.
*/
  
  
class Main
{
  static int solution (String S)
  {
    var counter = new int[26];
    for (int i = 0; i < S.length (); i++)
      {
	counter[S.charAt (i) - 'a']++;
      }

    var numRemove = 0;
    for (int i = 0; i < counter.length; i++)
      {
	if (counter[i] % 2 == 1)
	  {
	    numRemove++;
	  }
      }

    return numRemove;

  }
  public static void main(String [] args){
      String S="axaxxa";
      System.out.println(solution(S));
  }



}
