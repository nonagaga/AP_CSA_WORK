package Testing;

public class Streak {
    public static void streakCounter(String str){
        int compareCount = 0;

        int maxCount = 0;

        String letter = "";

        for(int i = 0; i < str.length(); i++){
            compareCount++;

            int count = 1;

            for(int k = i+1; k < str.length(); k++){
                compareCount++;

                compareCount++;
                if(str.substring(i,i+1).equals(str.substring(k,k+1))){
                    count++;

                } else {

                    break;
                }
            }

            if(count > maxCount){

                maxCount = count;

                letter = str.substring(i,i+1);

            }

            compareCount++;
        }

        System.out.println(letter + " " + maxCount);
        System.out.print("Comparisons: " + compareCount);
    }

    public static void main(String[] args) {
        streakCounter("Hippopotomonstrosesquippedaliophobia");
    }
}
