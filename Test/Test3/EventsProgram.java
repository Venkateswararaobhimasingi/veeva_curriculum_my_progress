import java.util.*;

class Node{
    String event;
    int id;
    String name;
    double cgpa;
    int score;
    public Node(int id,String ee,String nn,double cc,int ss){
        this.id=id;
        event=ee;
        name=nn;
        cgpa=cc;
        score=ss;
    }

}
public class EventsProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of choices");

        int n=sc.nextInt();
        sc.nextLine();

        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->{
            if(a.cgpa!=b.cgpa){
                return Double.compare(b.cgpa,a.cgpa);
            }
            else if(!(a.name).equals(b.name)){
                for(int i=0;i<Math.min(a.name.length(),b.name.length());i++){
                    if(a.name.charAt(i)!=b.name.charAt(i)){
                        return b.name.charAt(i)-a.name.charAt(i);
                    }
                }
                return b.name.length()-a.name.length();
            }
            else{
                return b.id-a.id;
            }
        });
        int id=101;
        for(int i=0;i<n;i++){
            System.out.println("Enter the event name");
            String ev=sc.nextLine();
            if(ev.equalsIgnoreCase("enter")){
                System.out.println("Enter the student name");
                String nn=sc.nextLine();
                System.out.println("Enter the cgpa");
                double cg=sc.nextDouble();
                System.out.println("Enter the score");
                int ss=sc.nextInt();
                Node n1=new Node(id,ev,nn,cg,ss);
                pq.add(n1);
                id++;
                sc.nextLine();
            }
            else if(ev.equalsIgnoreCase("served")){
                pq.poll();
            }
            else{
                System.out.println("Invalid input");
            }
             //sc.nextLine();
        }
        if (pq.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            while (!pq.isEmpty()) {
                Node t = pq.poll();
                System.out.println(t.name);
            }
        }

       

        
    }
}
