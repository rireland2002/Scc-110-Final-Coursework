public class Klask {
    public static void main(String[] args)
    {
        GameArena KlaskMain = new GameArena(1000, 750);
        Players PlayOne = new Players();
        Players PlayTwo = new Players();
        Board OutLine = new Board();
        Magnets Mags = new Magnets();
        Ball Goal = new Ball(800,520,50, "YELLOW",1);
        PlayOne.addTo(KlaskMain);
        PlayTwo.addTo(KlaskMain);
        OutLine.BoardAdd(KlaskMain);
        Mags.addmags(KlaskMain);
        KlaskMain.addBall(Goal);

        while(true)
        {
            
        }
    }
    //For the velocity one ball needs to be taken as the object its being performed on and the other is an extra parameter, edit the code to take one ball as paramters and the other as the object its performed on, all balls in same class.
}
