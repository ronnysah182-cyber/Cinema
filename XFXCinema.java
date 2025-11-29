import java.util.Scanner;

public class XFXCinema{
     public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your age group:");
        char age_group=input.nextLine().charAt(0);
        System.out.println("Enter movie language:");
        char language=input.nextLine().charAt(0);
        System.out.println("Are you a student?(yes or no)");
        char check=input.nextLine().charAt(0);
        System.out.println("Is this festival Season? (yes or no)");
        char festival=input.nextLine().charAt(0);
        double price=0;
        
        if (age_group=='C'){
            price=150;
            
        }
        else if (age_group=='A'){
            price=250;
        
        }
        else if (age_group=='S'){
            price=200;
        
        }
         if (language=='h'){
            price+=50;
            
            
        }
        else if(language=='e'){
            price+=100;
        }
        boolean student=(check=='y')?true:false;
        boolean fest=(festival=='y')?true:false;
        if(student){
            price=price-(0.2*price);
        
        if(fest){
            price=price-(0.15*price);
        }
            
            
        }
        System.out.println("Hurray! Your Final ticket price is:"+price);
        
        
        
        
        
        
    }
}


