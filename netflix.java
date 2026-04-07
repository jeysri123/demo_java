public class netflix{
        String user;
        int age;
        String country; 
    class details extends netflix{
        boolean isSubscription;
        String Journer;
        String LangPref;
    }
        public static void main(String[] args){
        netflix n = new netflix();          
        details d = n.new details();  
        d.user="Jeysri";
        d.age=22;
        d.country="India";
        d.isSubscription=true;
        d.Journer="Action";
        d.LangPref="Tamil";
        System.out.println(d.user);
        System.out.println(d.age);
        System.out.println(d.country);
        System.out.println(d.isSubscription);
        System.out.println(d.Journer);
        System.out.println(d.LangPref);
    }
}

