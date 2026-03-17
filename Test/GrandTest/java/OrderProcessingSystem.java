import java.util.Scanner;

class Item {
    String name;
    double price;
    int qty;
    int reorder;
    Item(String n,double p,int q,int r){
        name=n;
        price=p;
        qty=q;
         reorder=r;
    }
}

class Customer {
    String name,addr,phone,email;
    Customer(String n,String a,String p,String e){
        name=n;
        addr=a;
         phone=p;
        email=e;
    }
}
class Order {
    int id;
    String cname;
    String date;
    double total;

    Order(int i,String c,String d,double t){
        id=i;
        cname=c;
        date=d;
        total=t;
    }
}
public class OrderProcessingSystem {
    static Scanner sc=new Scanner(System.in);

    static Item items[]=new Item[50];
    static Customer cus[]=new Customer[50];
    static Order ord[]=new Order[50];

    static int ic=0,cc=0,oc=0;

    static void addItem(){
    	System.out.println("enter name");
    	String n = sc.next();
    	System.out.println("enter price");
   	double p = sc.nextDouble();
    	System.out.println("enter qty");
    	int q = sc.nextInt();
    	System.out.println("enter reorder");
    	int r = sc.nextInt();
    	items[ic++] = new Item(n, p, q, r);
	}

    static void addCustomer(){
    	System.out.println("enter name");
    	String n = sc.next();
    	System.out.println("enter addr");
    	String a = sc.next();

    	System.out.println("enter phone");
    	String p = sc.next();
    	System.out.println("enter email");
    	String e = sc.next();
    	cus[cc++] = new Customer(n, a, p, e);


	}

    static void placeOrder(){
        System.out.println("enter customer name");
        String cname=sc.next();
        double total=0;
        System.out.println("no of items");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("item name qty");
            String iname=sc.next();
            int q=sc.nextInt();

            for(int j=0;j<ic;j++){
                if(items[j].name.equals(iname)){
                    if(items[j].qty<=items[j].reorder){
                        System.out.println("cannot place order low stock");
                        return;
                    }
                    items[j].qty-=q;
                    total+=q*items[j].price;
                }
            }
        }

        System.out.println("enter date");
        String d=sc.next();

        ord[oc++]=new Order(oc,cname,d,total);
        System.out.println("order placed total "+total);
    }

    static void searchItem(){
        System.out.println("enter name");
        String n=sc.next();
        for(int i=0;i<ic;i++){
            if(items[i].name.equals(n)){
                System.out.println(items[i].name+" "+items[i].price+" "+items[i].qty);
            }
        }
    }

    static void priceItem(){
        System.out.println("enter price");
        double p=sc.nextDouble();
        for(int i=0;i<ic;i++){
            if(items[i].price==p){
                System.out.println(items[i].name);
            }
        }
    }

    static void orderId(){
        System.out.println("enter id");
        int id=sc.nextInt();
        for(int i=0;i<oc;i++){
            if(ord[i].id==id){
                System.out.println(ord[i].cname+" "+ord[i].total+" "+ord[i].date);
            }
        }
    }

    static void orderCustomer(){
        System.out.println("enter name");
        String n=sc.next();
        for(int i=0;i<oc;i++){
            if(ord[i].cname.equals(n)){
                System.out.println(ord[i].id+" "+ord[i].total);
            }
        }
    }

    static void highLow(){
        if(oc==0)return;

        double max=ord[0].total,min=ord[0].total;

        for(int i=0;i<oc;i++){
            if(ord[i].total>max)
                max=ord[i].total;
            if(ord[i].total<min)
                min=ord[i].total;
        }

        System.out.println("high "+max);
        System.out.println("low "+min);
    }




    public static void main(String[] a){
        while(true){
            System.out.println("1 Add item");
            System.out.println("2 Add customer");
            System.out.println("3 Place order");
            System.out.println("4 search item name");
            System.out.println("5 find item price");
            System.out.println("6 order by id");
            System.out.println("7 orders by customer");
            System.out.println("8 high low order");
            System.out.println("9 Exit");

            System.out.println("Enter choice");
            int ch=sc.nextInt();
            if(ch==1){
                addItem();
            }
            else if(ch==2){
                addCustomer();
            }
            else if(ch==3){
                placeOrder();
            }
            else if(ch==4){
                searchItem();
            }
            else if(ch==5){
                priceItem();
            }
            else if(ch==6){
                orderId();
            }
            else if(ch==7){
                orderCustomer();
            }
            else if(ch==8){
                highLow();
            }
            else if(ch == 9){
                System.out.println("exit");
                break;
            }
            else{
                System.out.println("enter valid choice");
            }
            }
        }
}
