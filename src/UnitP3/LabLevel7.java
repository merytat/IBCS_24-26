package UnitP3;

import java.util.Scanner;

public class LabLevel7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter text 1: ");
        String text1 = kb.nextLine();
        System.out.println("Enter text 2: ");
        String text2 = kb.nextLine();

        String shortest;
        if(text1.length() < text2.length()){
            shortest = text1;
        }
        else{
            shortest = text2;
        }

        String bigText = "";
        for(int i = 0; i<shortest.length(); i++){
            bigText += text1.charAt(i);
            bigText += text2.substring(i,i+1);
        }

        if(text1.length() > text2.length()){
            bigText += text1.substring(text2.length());
        }
        else if(text1.length() < text2.length()){
            bigText += text2.substring(text1.length());
        }

        System.out.println(bigText);
    }
}
