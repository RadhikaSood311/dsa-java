package Class;
class SlidingWindow{
    public static boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    public static int maxVowel(String str, int k){
        int VowelCount=0;
        for(int i=0;i<k;i++){
            if(isVowel(str.charAt(i))){
                VowelCount++;
            }
        }
        int maxVowel = VowelCount;
        for(int i=k;i<str.length();i++){
            if(isVowel(str.charAt(i-k))){
                VowelCount--;
            }
            if(isVowel(str.charAt(i))){
                VowelCount++;
            }
            maxVowel = Math.max(VowelCount, maxVowel);
        }
        return maxVowel;
    }
    public static void main(String[] args){
        String str = "aefdiiiroou";
        int k=3;
        System.out.print(maxVowel(str, k));
    }
}
