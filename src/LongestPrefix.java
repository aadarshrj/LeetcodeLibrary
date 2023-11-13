public class LongestPrefix {
//We have to find the longest Prefix
    public static void main(String[] args) throws Exception {
        String arr[] = {"fllower","fllow","fllight"};
        int index =0;
        String lcp = "";
        for (char c:arr[0].toCharArray()){
            for(int i = 1; i<arr.length ;i++){
                if(arr[i].length() <= index || arr[i].charAt(index) != c){
                    System.out.println(lcp);
                    throw new Exception("Done");
                }

            }
            lcp += c;
            index++;
        }
    }
}
