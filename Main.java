import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a=sc.nextInt();
        System.out.println(a);
        if(true){
            
            if(a>0){
                System.out.println("positive");
            }
            else if(a<0){
                System.out.println("negative");
            }
            else
                System.out.println("Zero");
        }
        switch(a){
            case 1:{
                System.out.println("Sunday");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thrusday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{
                System.out.println("Saturday");
                break;
            }
        }
        for(int i=1;i<=a;i++){
            System.out.print(i+" ");
            
        }
        System.out.println();
        for(int j=a;j>=1;j--){
            System.out.print(j+" ");
        }
        System.out.println();
        int i=1;
        do{
            System.out.print(i+" ");
            i++;
        }while(i<=3);
    }
}