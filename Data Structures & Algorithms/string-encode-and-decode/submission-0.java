class Solution {

    public String encode(List<String> list){
        StringBuilder sb=new StringBuilder();
        for(String s:list){
            sb.append(String.valueOf(s.length())+'@'+s);
        }
        return sb.toString();
    
    }
    public List<String> decode(String str){
        List<String> res=new ArrayList<>();
        int i=0;
   
        StringBuilder sb=new StringBuilder();
        while(i<str.length()){
            while(str.charAt(i)!='@'){
            sb.append(str.charAt(i));
            i++;
            }
            i++;
            int n=Integer.parseInt(sb.toString());
            res.add(str.substring(i,n+i));
            i=n+i;
            sb=new StringBuilder();
            
        }
        return res;
    }
}
