package functionp17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class FunctionP17 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        keyboard.useDelimiter("\n");
        
        int option, euro;
        float euro1;
        String euro2;
        
        DecimalFormat df1 = new DecimalFormat("000.000");
        DecimalFormat df2 = new DecimalFormat("000");
        
        do {
            UserMenu();
            option = keyboard.nextInt();
            switch (option) {
                case 1:

                    float res1;

                    System.out.print("Tell me how much euros do you have: ");
                    euro = keyboard.nextInt();

                    res1 = Conversor1(euro);

                    System.out.println("You have " + df1.format(res1) + " Dolars.");
                    
                    break;

                case 2:

                    double res2;

                    System.out.print("Tell me how much euros do you have: ");
                    euro = keyboard.nextInt();

                    res2 = Conversor2(euro);

                    System.out.println("You have " + df1.format(res2) + " Bitcoins.");
                    
                    break;

                case 3:
                    
                    String res3;
                    
                    System.out.print("Tell me how much euros do you have: ");
                    euro = keyboard.nextInt();
                    
                    res3 = Conversor3(euro);
                    
                    System.out.println("This was converted from Int to String: " + res3);
                    
                    break;

                case 4:
                    
                    int res4;
                    
                    System.out.print("Tell me how much euros do you have: ");
                    euro2 = keyboard.next();
                    
                    res4 = Conversor4(euro2);
                    
                    System.out.println("This was converted form String to Int: " + df2.format(res4));
                    
                    break;

                case 5:
                    
                    int res5;

                    System.out.print("Tell me how much euros do you have: ");
                    euro1 = keyboard.nextFloat();

                    res5 = Conversor5(euro1);

                    System.out.println("You have " + df2.format(res5) + " Marcos.");
                    
                    break;

                case 6:
                    
                    String res6;
                    
                    System.out.print("Tell me how much euros do you have: ");
                    euro1 = keyboard.nextFloat();
                    
                    res6 = Conversor6(euro1);
                    
                    System.out.println("This was converted from Float to String: " + res6);

                    break;

                case 7:
                                        
                    System.out.print("Please enter a letter: ");
                    char letra=keyboard.next().charAt(0);
                                        
                    System.out.println("Your letter equivals to " + Character.getNumericValue(letra));
                    System.out.println("Your leter is " + Integer.toBinaryString(letra) + " in binary.");

                    break;

                case 8:
                    
                    System.out.print("Tell me your name: ");
                    String name = keyboard.next();
                    
                    String result=StringToBinary(name);
                    
                    System.out.println(result);
                    break;

                case 9:

                    break;

                case 10:
                    
                    apart10();
                    
                    break;

                case 11:
                    
                    double preu = 100,
                     tax = 21,
                     res;

                    res = functionMarc(preu, tax);//Llamar a Funcion

                    methodAitor(preu, tax, res);//Llamar a Procedimiento  
                    
                    break;

                case 0:
                    p0();
                    break;

                default:
                    System.out.println("No valid Option.");

            }
        } while (option != 0);

    }

    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";

    private static void UserMenu() {
        System.out.println("Option 1");
        System.out.println("Option 2");
        System.out.println("Option 3");
        System.out.println("Option 4");
        System.out.println("Option 5");
        System.out.println("Option 6");
        System.out.println("Option 7");
        System.out.println("Option 8");
        System.out.println("Option 9");
        System.out.println("Option 10");
        System.out.println("Option 11");

        System.out.println("Option 0: Exit");

        System.out.print("\nPlease chose any option: ");
    }

    private static float Conversor1(int eu) {
        float result;
        float dolar = 1.10f;

        result = eu * dolar;

        return result;
    }

    private static double Conversor2(int eu) {
        double result;
        double bit = 0.00011;

        result = eu * bit;

        return result;
    }
    
    private static String Conversor3(int eu) {
        DecimalFormat df1 = new DecimalFormat("000.000");
        
        String result;
        
        result = String.valueOf(df1.format(eu));
        
        return result;
    }
    
    private static int Conversor4(String eu){
        int result;
        
        result = Integer.parseInt(eu);
        
        return result;
    }
    
    private static int Conversor5(float eu) {
        int result;
        int marco = 2;

        result = Math.round(eu) * marco;

        return result;
    }
    
    private static String Conversor6(float eu) {
        DecimalFormat df1 = new DecimalFormat("000.000");
        
        String result;
        
        result = String.valueOf(df1.format(eu));
        
        return result;
    
    }
    
    private static String StringToBinary(String str){
    
        String result = " ";
        
        char ch= ' ';
        for (int i=0; i < str.length(); i++){
            ch = str.charAt(i);
            result += Integer.toBinaryString(ch)+ " ";
        }
        return result;
    }
    
    private static void apart10(){
        System.out.println("--------");
        for(int i=0; i<255; i++){
            System.out.println(i + "=" + (char)i);
        }
    }

    private static double functionMarc(double price, double iva) {

        double PVP;

        PVP = price + price * (iva / 100);

        return PVP;
    }

    public static void methodAitor(double price, double iva, double result) {

        System.out.println("El precio inicial era: " + ANSI_YELLOW + price + ANSI_RESET + " al que le hemos sumado el iva: " + ANSI_YELLOW + iva + ANSI_RESET + " y ha dado como resultado el PVP: " + ANSI_YELLOW + result + ANSI_RESET);

    }

    private static void p0() {
        System.out.println("EXIT");
    }

}
