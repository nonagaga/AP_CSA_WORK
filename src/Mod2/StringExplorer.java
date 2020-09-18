package Mod2;

import java.util.Scanner;

public class StringExplorer {

    public static void main(String[] args) {

        String name1 = "Name1";
        String name2 = "Name2";
        String name3 = "Name3";

        Scanner input = new Scanner(System.in);
        System.out.println("Type a name: ");
        String name4 = input.nextLine();

        System.out.println("Are the names " + name1 + " and " + name4 + " equal?");
        System.out.println(name1.equals(name4));

        String sampleText = "Teacher: \"You must complete your hw\"";
        System.out.println(sampleText);

        String text2 = "TikTok said it was \"disappointed\" in the order and disagreed with the commerce department, saying it had already committed to \"unprecedented levels of additional transparency\" in light of the Trump administration's concerns.\n" +
                "\"We will continue to challenge the unjust executive order, which was enacted without due process and threatens to deprive the American people and small businesses across the US of a significant platform for both a voice and livelihoods.\"\n" +
                "The ban order from the Department of Commerce follows President Trump's executive orders signed in August. It gave US businesses 45 days to stop working with either Chinese company.\n" +
                "If a planned partnership between US tech firm Oracle and TikTok owner ByteDance is agreed and approved by President Trump, the app will not be banned.\n" +
                "It is not yet clear whether Mr Trump will approve the deal, but he is expected to review it before the Sunday deadline.";

        System.out.println(text2);

        int index = text2.indexOf("the");
        System.out.println("Index of 'the': " + index);

        String subText2 = text2.substring(37);
        System.out.println("Text after substring: \n" + subText2);

        String subText3 = text2.substring(20, 30);
        System.out.println("Text after substring: \n" + subText3);

        int textLength = text2.length();
        System.out.println("Half the text \n" + text2.substring(textLength/2+4));

        String dem = "Biden";
        String rep = "Trump";

        System.out.println("Is the Republican candidate mentioned in the story: ");
        System.out.println(text2.indexOf(rep));

        System.out.println("Is the Democratic candidate mentioned in the story: ");
        System.out.println(text2.indexOf(dem));

        System.out.println("Is the Republican candidate mentioned in the story more than twice: ");
        System.out.println(text2.indexOf(rep, 1000));

        String allNames = "";
        allNames += name1;
        allNames += name2;

        allNames = allNames + name3;
        allNames += "\t" + true;
        System.out.println(allNames);
    }
}
