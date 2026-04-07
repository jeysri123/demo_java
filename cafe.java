abstract class cafe{
    abstract void sales();

    void open(){
        System.out.println("Cafe is opened");
    }
    class tea extends cafe  {
     void sales(){
        System.out.println("one tea");
     }
        
    }
    public static void main(String[] args){
        tea t=new tea();
        t.sales();
        t.open();
    } 
}