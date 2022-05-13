public class Magnets 
{
    public Ball[] magballs;   
    public double magXPos[];
    public double magYPos[];
    
    public Magnets()
    {
        magballs = new Ball[3];
        magballs[0] = new Ball(525,500,25,"WHITE",1);
        magballs[1] = new Ball(525,350,25,"WHITE",1);
        magballs[2] = new Ball(525,200,25,"WHITE",1);
    }

    public void addmags(GameArena Klask)
    {
        Klask.addBall(magballs[0]);
        Klask.addBall(magballs[1]);
        Klask.addBall(magballs[2]);
    }
    public void magnetism()
    {
        for(int i=0;i<3;i++)
        {
            magballs[i].setXPosition(-1);
            magballs[i].setYPosition(-1);
        }
    }
    public void magpos()
    {
        for(int i=0;i<3;i++)
        {
            magXPos[i] = magballs[i].getXPosition();
            magYPos[i] = magballs[i].getYPosition();
        }
    }
}