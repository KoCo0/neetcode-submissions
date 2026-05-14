class Solution {

    public String encode(List<String> strs) {
        String str = "";
        for( String s : strs){
            int len = s.length();
            str += String.valueOf(len)+'#'+s;
        }
        return str;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i=0;
        int j;
        while(i < str.length()){
            j=i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int len;
            try {
                len = Integer.parseInt(str.substring(i, j)); // Parse the length
            } catch (NumberFormatException e) {
                System.err.println("Invalid length format at index " + i);
                break; // Exit if parsing fails
            }
            String s = str.substring(j+1,j+1+len);
            list.add(s);
            i=j+1+len;
            
        }
        return list;
    }
}
