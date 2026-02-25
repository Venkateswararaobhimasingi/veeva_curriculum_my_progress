import java.util.*;

public class CountriesData {

    static void alldetails(HashMap<String,HashMap<String,String>> c){
        for(Map.Entry<String,HashMap<String,String>> e:c.entrySet()){
            System.out.println("Country "+e.getKey());
            HashMap<String,String> cap1=e.getValue();
            int m1=Integer.valueOf(cap1.get("count"));
            System.out.println("Number of capitals "+m1);
            if(m1==1){
                System.out.println(cap1.get("summer"));
            }
            else {
                for(Map.Entry<String,String> e1:cap1.entrySet()){
                    System.out.println(e1.getKey()+" "+e1.getValue());
                }
            }
        }
    }
        
    static void countrydetails(HashMap<String,HashMap<String,String>> c,String country){
        if(c.containsKey(country)){
            HashMap<String,String> cap1=c.get(country);
            int m1=Integer.valueOf(cap1.get("count"));
            System.out.println("Number of capitals "+m1);
            if(m1==1){
                System.out.println(cap1.get("summer"));
            }
            else {
                for(Map.Entry<String,String> e1:cap1.entrySet()){
                    System.out.println(e1.getKey()+" "+e1.getValue());
                }
            }
        }
        else{
            System.out.println("Country not found");
        }
    }

    static void twocapital(HashMap<String,HashMap<String,String>> c){
        for(Map.Entry<String,HashMap<String,String>> e:c.entrySet()){
            HashMap<String,String> cap1=e.getValue();
            int m1=Integer.valueOf(cap1.get("count"));
            if(m1==2){
                
                for(Map.Entry<String,String> e1:cap1.entrySet()){
                    boolean eq=e1.getKey().equals("count");
                    if(!eq){
                    System.out.println(e1.getKey()+" "+e1.getValue());
                    }
                }
            }
        }
    }

    static void summer(HashMap<String,HashMap<String,String>> c){
        for(Map.Entry<String,HashMap<String,String>> e:c.entrySet()){
            HashMap<String,String> cap1=e.getValue();
            if(cap1.containsKey("summer")){
                //System.out.println("Country "+e.getKey());
                System.out.println(cap1.get("summer"));
            }
            
        }
    }
    static boolean stwithvowelOrNot(String s,HashMap<Character,Integer> vow){
        Character ct=s.charAt(0);
        if(vow.containsKey(ct)){
            
            return true;
        }
        return false;
    }

    static void stwithvowel(HashMap<String,HashMap<String,String>> c,HashMap<Character,Integer> vow){
        
       
        
        for(Map.Entry<String,HashMap<String,String>> e:c.entrySet()){
            System.out.println("Country "+e.getKey());
            HashMap<String,String> cap1=e.getValue();
            int m1=Integer.valueOf(cap1.get("count"));
            System.out.println("Number of capitals "+m1);
            if(m1==1){
                String s11=cap1.get("summer");
                if(stwithvowelOrNot(s11,vow)){
                    System.out.println(cap1.get("summer"));
                }
            }
            else {
                for(Map.Entry<String,String> e1:cap1.entrySet()){
                    String s11=e1.getValue();
                    if(stwithvowelOrNot(s11, vow)){
                        System.out.println(e1.getValue());
                    }
                }
            }
        }
        
    }
    static void stwithvowelsummer(HashMap<String,HashMap<String,String>> c,HashMap<Character,Integer> vow){
        for(Map.Entry<String,HashMap<String,String>> e:c.entrySet()){
            HashMap<String,String> cap1=e.getValue();
            if(cap1.containsKey("summer")){
                String s11=cap1.get("summer");
                if(stwithvowelOrNot(s11, vow)){
                   
                    System.out.println(s11);
                }
            }
            
        }
        
    }


    public static void main(String[] args) {

        HashMap<Character,Integer> vow=new HashMap<>();
        vow.put('a',0);
        vow.put('e',0);
        vow.put('i',0);
        vow.put('o',0);
        vow.put('u',0);
        vow.put('A',0);
        vow.put('E',0);
        vow.put('I',0);
        vow.put('O',0);
        vow.put('U',0);

        HashMap<String,HashMap<String,String>> countries = new HashMap<>();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of countries");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of the country");
            String country=sc.nextLine();
            HashMap<String ,String> cap=new HashMap<>();
            System.out.println("Enter the no .of capitals");
            int m=sc.nextInt();
            sc.nextLine();
            if(m==1){
                System.out.println("Enter the name of the capital");
                String capital=sc.nextLine();
                cap.put("summer", capital);
                cap.put("winter", capital);
                cap.put("rainly", capital);
                cap.put("count","1");
                
            }
           else if(m==2){
            
                System.out.println("Enter the name of the capital summer");
                String capital=sc.nextLine();
                cap.put("summer", capital);
                
                System.out.println("Enter the name of the capital rainly");
                String capital1=sc.nextLine();
                
                cap.put("rainly", capital1);

                cap.put("count","2");
           }
           else if(m==3){
                System.out.println("Enter the name of the capital summer");
                String capital=sc.nextLine();
                cap.put("summer", capital);
                System.out.println("Enter the name of the capital winter");
                String capital1=sc.nextLine();
                cap.put("winter", capital1);
                System.out.println("Enter the name of the capital rainly");
                String capital2=sc.nextLine();
                cap.put("rainly", capital2);
                cap.put("count","3");
           }
           else{
            System.out.println("Max number of capitals is 3 please enter the lessthan equal to 3");
            continue;
           }
            
           countries.put(country,cap);


        }

        while(true){
            System.out.println("Options ");

            System.out.println("1.print all the countries and count of capitals and details");
            System.out.println("2.country name give return details of capitals ");
            System.out.println("3.print all the countries having two capitals");
            System.out.println("4. Display the capitals having summer capital");
            System.out.println("5.print all capitals st with vowel");
            System.out.println("6.print all summer capitals st with vowel");
            System.out.println("7.exit");
            System.out.println("enter your choice");
            
            int ch=sc.nextInt();
           
            if(ch==1){
                alldetails(countries);
            }
            else if(ch==2){
                System.out.println("Enter the name of the country");
                sc.nextLine();
                String country=sc.nextLine();
                countrydetails(countries,country);
            }
            else if(ch==3){
                twocapital(countries);
            }
            else if(ch==4){
                summer(countries);
            }
            else if(ch==5){
                stwithvowel(countries,vow);
            }
            else if(ch==6){
                stwithvowelsummer(countries,vow);
            }
            else if(ch==7){
                break;
            }
            else{
                System.out.println("Invalid choice");
            }
        }
       
        
    }
}