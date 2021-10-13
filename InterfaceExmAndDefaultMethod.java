package com.company;
interface Camera{
    void TakeSnap();
    private void Greet(){
        System.out.println("GoodMorning");
    }
   default void Record4KVideo(){
        Greet();
        System.out.println("Processing");
    }

}
interface Wifi{
 String[] SearchNetworkName();
 void ConnectToNetwork(String network);
}

class MyCellphone{
   void Calling(int a){
       System.out.println("Calling....to"+a);

   }
   void Ring(int a){
       System.out.println(a+"Ringing");
   }
}
class MySmartPhone extends MyCellphone implements Wifi,Camera{
  public  void TakeSnap(){
      System.out.println("SnapShot");
    }
   public String[] SearchNetworkName(){
       System.out.println("Getting Network List...");
       String sahil[]={"Samsung","Apple","Vivo"};
       return sahil;
    }
   public void ConnectToNetwork(String network){
       System.out.println("Connecting to"+network);
    }
}
public class InterfaceExmAndDefaultMethod {
    public static void main(String[] args) {
      MySmartPhone Oppo=new MySmartPhone();
      Oppo.TakeSnap(); Oppo.Record4KVideo();
      Oppo.Calling(94132); Oppo.Ring(9412);
 String  Net []=Oppo.SearchNetworkName();
 for(String i: Net){
     System.out.println(i);
 }
      Oppo.ConnectToNetwork("Samsung");
    }
}
