package DSA.StringQuestions;

public class PrefixandSuffix {

    public static int prefixandSuffix(String[] str){

        int n =str.length;
int count =0;
        for(int i=0;i<n;i++){   

            for(int j=i+1;j<n;j++){
                if(str[j].startsWith(str[i]) 
                && str[j].endsWith(str[i]) ){
                       count++;
                }
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        
        String[] words1 = {"a", "aba", "ababa", "aa"};
        System.out.println(prefixandSuffix(words1)); // Output: 4

        String[] words2 = {"pa", "papa", "ma", "mama"};
        System.out.println(prefixandSuffix(words2)); // Output: 2

        String[] words3 = {"abab", "ab"};
        System.out.println(prefixandSuffix(words3)); // Output: 0
    

    }
}
