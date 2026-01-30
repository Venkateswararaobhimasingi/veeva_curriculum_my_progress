import java.util.*;
class Emp{
    String ename;
    String job;
    int sal;
    String doj;
    Emp(String ename,String job,int sal,String doj){
        this.ename=ename;
        this.job=job;
        this.sal=sal;
        this.doj=doj;
    }

}

class Employee {

    public static void addEmp(ArrayList<Emp> db){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the name");
        String ename=sc1.nextLine();
        System.out.println("Enter the job");
        String job=sc1.nextLine();
        
        System.out.println("Enter the salary");
        int sal=sc1.nextInt();
        sc1.nextLine();
        System.out.println("Enter the doj (date as 30-01-2026)");
        String doj=sc1.nextLine();
        Emp e=new Emp(ename,job,sal,doj);
        db.add(e);

    }
    public static int dojsort(String doj){


        int res=0;
        String k[]=doj.split("-");
        int d=Integer.parseInt(k[0]);
        int m=Integer.parseInt(k[1]);
        int y=Integer.parseInt(k[2]);
        res=y*10000+m*100+d;
        return res;
        
        
    }

    public static void display(ArrayList<Emp> db){
        Scanner sc2=new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice num");
            System.out.println("1.display emp salary in ascending order");
            System.out.println("2.display emp salary in descending order");
            System.out.println("3.display Emp doj in ascending order"); 
            System.out.println("4.Exit");
            int c=sc2.nextInt();
            if(c==1){
                Collections.sort(db, new Comparator<Emp>() {
                   
                    public int compare(Emp o1, Emp o2) {
                        return o1.sal-o2.sal;
                    }
                });
                for(Emp e:db){
                    System.out.println(e.ename+" "+e.job+" "+e.sal+" "+e.doj);
                }
            }
            else if(c==2){
                Collections.sort(db, new Comparator<Emp>() {
                    @Override
                    public int compare(Emp o1, Emp o2) {
                        return o2.sal-o1.sal;
                    }
                });
                for(Emp e:db){
                    System.out.println(e.ename+" "+e.job+" "+e.sal+" "+e.doj);
                }
            }
            else if(c==3){
                Collections.sort(db, new Comparator<Emp>() {
                   
                    public int compare(Emp o1, Emp o2) {
                        return dojsort(o1.doj)-dojsort(o2.doj);
                    }
                });
                for(Emp e:db){
                    System.out.println(e.ename+" "+e.job+" "+e.sal+" "+e.doj);
                }
            }
            else if(c==4){
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice num");
        ArrayList<Emp> db=new ArrayList<>();
        while(true){
            System.out.println("1.add Emp");
            System.out.println("2.display");
            System.out.println("3.Exit");
            int c=sc.nextInt();
            if(c==1){
                addEmp(db);
            }
            else if(c==2){
                display(db);
            }
            else if(c==3){
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }
    
    }    
    
}
