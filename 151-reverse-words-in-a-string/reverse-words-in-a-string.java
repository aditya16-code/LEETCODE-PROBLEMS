class Solution {
    public String reverseWords(String s) {

        // Remove leading spaces
        int l = 0;
        while (l < s.length() && s.charAt(l) == ' ') {
            l++;
        }

        // Remove trailing spaces
        int r = s.length() - 1;
        while (r >= l && s.charAt(r) == ' ') {
            r--;
        }

        // Remove extra spaces between words
        StringBuilder sb = new StringBuilder();

        while (l <= r) {
            if (s.charAt(l) != ' ') {
                sb.append(s.charAt(l));
            } else {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                    sb.append(' ');
                }
            }
            l++;
        }

        // Reverse the whole StringBuilder
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

        // Reverse each word
        int start = 0;

        while (start < sb.length()) {

            int end = start;

            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }

            left = start;
            right = end - 1;

            while (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }

            start = end + 1;
        }

        return sb.toString();
    }
}
// class Solution {
//     public String reverseWords(String s) {
//         String trim=s.trim();
//         String arr[]=trim.split("\\s+");
//         //[hello,world]
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             String temp=arr[i];
//             arr[i]=arr[j];
//             arr[j]=temp;
//             i++;j--;
//         }
//         return String.join(" ",arr);
//     }
// }
