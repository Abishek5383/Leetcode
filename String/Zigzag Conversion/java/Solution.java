class Solution {
    public String convert(String s, int numRows) {
        int n=s.length();
        int []arr=new int[n];
        int ind=0;
        while(ind<n){
            for(int i=1;i<=numRows&&ind<n;i++){
                arr[ind++]=i;
            }
            for(int i=numRows-1;i>=2&&ind<n;i--){
                arr[ind++]=i;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=numRows;i++){
        for(int j=0;j<s.length();j++){
            if(arr[j]==i)sb.append(s.charAt(j));
        }}
        return sb.toString();
    }
}