// import java.util.*;

class str {
    public static void printLetters(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + "");

        }
    }

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();
        String First_Name = "Arsh_Ali_";
        String Last_Name = "68005  ";
        String Full_Name = First_Name + "" + Last_Name;

        printLetters(Full_Name);

        // sc.close();
    }

}