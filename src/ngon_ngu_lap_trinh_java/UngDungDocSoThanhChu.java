package ngon_ngu_lap_trinh_java;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner scanner= new Scanner(System.in);
        int num=scanner.nextInt();
        String text="";
        if (num<1000){
            int unitHundred=num/100;
            int unitTen=num/10%10;
            int unit=num%100%10;
            if(unitHundred!=0){
                switch (unitHundred){
                    case 1:
                        text+= "One";
                        break;
                    case 2:
                        text+= "Two";
                        break;
                    case 3:
                        text+= "Three";
                        break;
                    case 4:
                        text+= "Four";
                        break;
                    case 5:
                        text+= "Five";
                        break;
                    case 6:
                        text+= "Six";
                        break;
                    case 7:
                        text+= "Seven";
                        break;
                    case 8:
                        text+= "Eight";
                        break;
                    case 9:
                        text+= "Nine";
                        break;
                }
                text+=" hundreds and ";
            }
            if (unitTen==1){
                switch (unit){
                    case 0:
                        text+= "ten";
                        break;
                    case 1:
                        text+= "eleven";
                        break;
                    case 2:
                        text+= "twelve";
                        break;
                    case 3:
                        text+= "thirteen";
                        break;
                    case 4:
                        text+= "fourteen";
                        break;
                    case 5:
                        text+= "fifteen";
                        break;
                    case 6:
                        text+= "sixteen";
                        break;
                    case 7:
                        text+= "seventeen";
                        break;
                    case 8:
                        text+= "eighteen";
                        break;
                    case 9:
                        text+= "nineteen";
                        break;
                }
            }else {
                if(unitTen!=0){
                    switch (unitTen){
                        case 2:
                            text+= "twen";
                            break;
                        case 3:
                            text+= "thir";
                            break;
                        case 4:
                            text+= "for";
                            break;
                        case 5:
                            text+= "fif";
                            break;
                        case 6:
                            text+= "six";
                            break;
                        case 7:
                            text+= "seven";
                            break;
                        case 8:
                            text+= "eight";
                            break;
                        case 9:
                            text+= "nine";
                            break;
                    }
                    text+="ty ";
                }
                switch (unit){
                    case 1:
                        text+= "one";
                        break;
                    case 2:
                        text+= "two";
                        break;
                    case 3:
                        text+= "three";
                        break;
                    case 4:
                        text+= "four";
                        break;
                    case 5:
                        text+= "five";
                        break;
                    case 6:
                        text+= "six";
                        break;
                    case 7:
                        text+= "seven";
                        break;
                    case 8:
                        text+= "eight";
                        break;
                    case 9:
                        text+= "nine";
                        break;
                }
            }
        }else {
            System.out.println("out of ability");
        }
        System.out.printf("%s",text);
    }
}
