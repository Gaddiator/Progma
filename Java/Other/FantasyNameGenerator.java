package Java.Other;

import java.util.Scanner;

public class FantasyNameGenerator {
    static char playerWord[];

    public static void main(String[]args){

        char[] plaintext = new char[26];
        char[] cypertext = new char[26];

        plaintext[0] = 'a';    cypertext[0] = 'b';
        plaintext[1] = 'b';    cypertext[1] = 'v';
        plaintext[2] = 'c';    cypertext[2] = 'g';
        plaintext[3] = 'd';    cypertext[3] = 'q';
        plaintext[4] = 'e';    cypertext[4] = 'k';
        plaintext[5] = 'f';    cypertext[5] = 'm';
        plaintext[6] = 'g';    cypertext[6] = 'n';
        plaintext[7] = 'h';    cypertext[7] = 'a';
        plaintext[8] = 'i';    cypertext[8] = 'd';
        plaintext[9] = 'j';    cypertext[9] = 'z';
        plaintext[10] = 'k';   cypertext[10] = 'c';
        plaintext[11] = 'l';   cypertext[11] = 'w';
        plaintext[12] = 'm';   cypertext[12] = 's';
        plaintext[13] = 'n';   cypertext[13] = 'e';
        plaintext[14] = 'o';   cypertext[14] = 'o';
        plaintext[15] = 'p';   cypertext[15] = 'y';
        plaintext[16] = 'q';   cypertext[16] = 'f';
        plaintext[17] = 'r';   cypertext[17] = 'j';
        plaintext[18] = 's';   cypertext[18] = 'x';
        plaintext[19] = 't';   cypertext[19] = 'h';
        plaintext[20] = 'u';   cypertext[20] = 't';
        plaintext[21] = 'v';   cypertext[21] = 'l';
        plaintext[22] = 'w';   cypertext[22] = 'p';
        plaintext[23] = 'x';   cypertext[23] = 'u';
        plaintext[24] = 'y';   cypertext[24] = 'i';
        plaintext[25] = 'z';   cypertext[25] = 'r';

        Scanner scan = new Scanner(System.in);
        String userInput;

        System.out.println("Enter a String.");
        userInput = scan.next();

        for(int i = 0; i < userInput.length(); i++){
            playerWord[i] = userInput.charAt(i);
        }


        for(int i = 0; i < userInput.length(); i++) {
            for(int j = 0; j < 26; j++){
                if(playerWord[i] == plaintext[j]){
                    playerWord[i] = cypertext[j];
                    j=0;
                }
                else if(playerWord[i] == ' '){
                    playerWord[i] = ' ';
                    j=0;
                }
            }
        }

        for(int i = 0; i < playerWord.length; i++){
            System.out.print(playerWord[i]);

        }

    }
}
