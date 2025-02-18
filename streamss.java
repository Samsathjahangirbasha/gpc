package gpc;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;
public class streamss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        System.out.println("ENTER -1 TO STOP THE LOOP");
        while(true){
            int num=sc.nextInt();
            if(num==-1){
                break;
            }
            else{
                arr.add(num);
            }
        }
        Stream<Integer> s=arr.stream()
                          .filter(n->n%2==0);
        s.forEach(n->System.out.println(n));
    }
    
}
