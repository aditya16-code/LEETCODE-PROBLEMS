class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>seen=new HashSet<>();
        Set<String> res=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            if(seen.contains(s.substring(i,i+10))){
                res.add(s.substring(i,i+10));
            }
            else{
                seen.add(s.substring(i,i+10));
            }

        }
        return new ArrayList<String>(res);
    }
}