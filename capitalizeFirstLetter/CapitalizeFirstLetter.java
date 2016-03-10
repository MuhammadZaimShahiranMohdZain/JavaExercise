package capitalizeFirstLetter;

public class CapitalizeFirstLetter {

    public static String capitalizeFirstLetters(String s) {
        /*
          Please implement this method to
          capitalize all first letters of the words in the given String.
          All other symbols shall remain intact. If a word starts not with a letter, it shall remain intact too.
          Assume that the parameter String can only contain spaces and alphanumeric characters.

          NOTE: please keep in mind that the words can be divided by single or multiple spaces.
          The spaced also can be found at the beginning or the end of the parameter string,
          and you need to preserve them.
         */
    	s = s.toLowerCase();
    	s = Character.toString(s.charAt(0)).toUpperCase()+s.substring(1);

    	if(s == null || s.isEmpty())
    		return null;
    	
    	StringBuffer sb = new StringBuffer();
    	for(String str : s.toLowerCase().split(" ")){
    		sb.append(String.valueOf(str.charAt(0)).toUpperCase());
    		sb.append(str.substring(1) + " ");
    	}
    	return sb.toString().trim();
    }
}
