class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character,Integer>map=new HashMap<>();
        int i=0;int max=0;
        int j=0;
        int maxCountofAcharacter=0;
        while(j<s.length()){
            char c=s.charAt(j);
            map.put(c,map.getOrDefault(c,0)+1);
            maxCountofAcharacter=Math.max(maxCountofAcharacter,map.get(c));
            // int opr=(j-i+1)-maxCountofAcharacter;
            while((j-i+1)-maxCountofAcharacter>k){
                map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i=i+1;
            }
            max=Math.max(max,j-i+1);
            j++;

        }
        return max;
    }
}
// class Solution {
//     public int characterReplacement(String s, int k) {
//         int max=0;
//         for(int i=0;i<s.length();i++){
//             Map<Character,Integer>map=new HashMap<>();
//             int maxCountofAcharacter=0;
//         for(int j=i;j<s.length();j++){
//             char curr=s.charAt(j);
//             map.put(curr,map.getOrDefault(curr,0)+1);
//             maxCountofAcharacter=Math.max(maxCountofAcharacter,map.get(curr));
//             int opr=(j-i+1)-maxCountofAcharacter;
//             if(opr>k){
//                 break;
//             }
            

//         max=Math.max(max,j-i+1);                
            
//         }
//         }
//         return max;
//     }
// }