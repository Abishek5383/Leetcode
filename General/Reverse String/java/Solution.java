1class Solution {
2    public void reverseString(char[] s) {
3        int first=0;
4        int last=s.length-1;
5        while(first<last){
6            char temp=s[first];
7            s[first]=s[last];
8            s[last]=temp;
9            first++;
10            last--;
11        }
12    }
13}