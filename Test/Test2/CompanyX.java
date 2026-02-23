import java.util.*;
class CompanyX{
    

    public static void dbstore(HashMap<String,HashMap<String,Integer>> db){
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the store id: ");
        String s=sc1.next();
        System.out.println(" Enter the no of products: ");
        int m=sc1.nextInt();
        HashMap<String,Integer> h=new HashMap<>();
        for(int j=0;j<m;j++){
            String k=sc1.next();
            int v=sc1.nextInt();
            h.put(k,v);
        }
        db.put(s,h);
    }
    public static void allproducts(String s,HashMap<String,HashMap<String,Integer>> db){
        if(!db.containsKey(s)){
            System.out.println("Enter vaild store id");
        }
        else{
        HashMap<String,Integer> h=db.get(s);
        for(Map.Entry<String,Integer> e:h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
        }
        
    }
    public static void maxprice(String s,HashMap<String,HashMap<String,Integer>> db){
        if(!db.containsKey(s)){
            System.out.println("Enter vaild store id");
        }
        else{
        HashMap<String,Integer> h=db.get(s);
        int max=0;
        String pname="";
        for(Map.Entry<String,Integer> e:h.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                pname=e.getKey();
            }
        }
        System.out.println("Maximum Price Product:");
        System.out.println(pname);
        System.out.println(max);
        }
        
    }
    public static void productdetails(String s,HashMap<String,HashMap<String,Integer>> db){
            int c11=0;
            for(Map.Entry<String,HashMap<String,Integer>> e:db.entrySet()){
                
            HashMap<String,Integer> h=e.getValue();
            if(h.containsKey(s)){
                c11++;
                System.out.println(e.getKey());
            }
            }
            if(c11==0){
                System.out.println("product name not found");
            }
       
       
        
    }
    
        
    public static void queries(HashMap<String,HashMap<String,Integer>> db){
        Scanner sc2=new Scanner(System.in);
        while(true){
            System.out.println("Enter your Choice number: ");
            System.out.println("1.All Products of a Store");
            System.out.println("2.Maximum product price in a store");
            System.out.println("3.product detalis related to stores");
            System.out.println("4.Exit");
            int ch=sc2.nextInt();
            if(ch==1){
                System.out.println("Enter the store id: ");
                String s=sc2.next();
                allproducts(s,db);
            }
            else if(ch==2){
                System.out.println("Enter the store id: ");
                String s11=sc2.next();
                maxprice(s11,db);
            }
            else if(ch==3){
                System.out.println("Enter the product name id: ");
                String s111=sc2.next();
                productdetails(s111,db);
            }
            else if(ch==4){
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
       
        HashMap<String,HashMap<String,Integer>> db=new HashMap<>();

        while(true){
            System.out.println("Enter your Choice number: ");
            System.out.println("1.dataStore");
            System.out.println("2.queries");
            System.out.println("3.Exit");
            int ch=sc.nextInt();
            if(ch==1){
                dbstore(db);
            }
                    
            else if(ch==2){
                queries(db);
            }
            
            else if(ch==3){
                break;
            }
            else{
                System.out.println("Invalid Choice");
                
            }
                    
        }

        
    }
}