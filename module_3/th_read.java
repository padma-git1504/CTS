class first extends Thread {
    public void run(){
        for (int i = 0; i <3; i++) {
            System.out.println("First");
           
        }
        try {
             Thread.sleep(800);
            
        } catch (Exception e) {
            System.err.println(e);
        }
        
      
    }
    

}
class th_read{
    public static void main(String[] args) {
        first fr = new first();
        fr.start();
        for (int i = 0; i < 4; i++) {
            System.out.println("Main");
        }
       try {
             Thread.sleep(500);
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}