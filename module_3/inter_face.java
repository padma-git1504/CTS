interface playable{
    void play();
}

class guitar implements playable{
    public void play(){
        System.out.println("guitar is playing");
    }
}

class piano implements playable{
    public void play(){
        System.out.println("piano is playing");

    }
    
}
class inter_face{
    public static void main(String[] args) {
        playable ob1 = new guitar();
        playable ob2 = new piano();

        ob1.play();
        ob2.play();

        
    }
}