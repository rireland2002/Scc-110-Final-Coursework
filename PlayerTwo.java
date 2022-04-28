public class PlayerTwo
{
    public Ball body2 = new Ball();
    public Rectangle pole2 = new Rectangle();
    
    public PlayerTwo()
    {
        body2 = new Ball(10,10,10,"BLUE",1); 
        pole2 = new Rectangle(10,10,5,10,"BLUE",1);
    }

    public void addTwo(GameArena gameArena)
    {
        gameArena.addBall(body2);
        gameArena.addRectangle(pole2);
    }

    public void moveXright2()
    {
        body2.setXPosition(body2.getXPosition() +1);
        pole2.setXPosition(pole2.getXPosition() +1);
    }

    public void moveXleft2()
    {
        body2.setXPosition(body2.getXPosition() -1);
        pole2.setXPosition(pole2.getXPosition() -1);
    }

    public void moveYup2()
    {
        body2.setYPosition(body2.getYPosition() +1);
        pole2.setYPosition(pole2.getYPosition() +1);
    }

    public void moveYdown2()
    {
        body2.setYPosition(body2.getYPosition() -1);
        pole2.setYPosition(pole2.getYPosition() -1);
    }
}