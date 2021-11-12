import java.util.Scanner;

class LeadingZero{

    public static String removeLeadingZero(String str){
          String strpattern ="0+(?!$)";
          str=str.replaceAll(strpattern,"");
          return str;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter An Integer  : ");
        String num=s.next();
        String result=LeadingZero.removeLeadingZero(num);
        System.out.println(result);
    }

}
