public class PlayerOne
{
    public Ball body = new Ball();
    public Rectangle pole = new Rectangle();
    
    public PlayerOne()
    {
        body = new Ball(10,10,10,"BLUE",1); 
        pole = new Rectangle(10,10,5,10,"BLUE",1);
    }

    public void addTo(GameArena gameArena)
    {
        gameArena.addBall(body);
        gameArena.addRectangle(pole);
    }

    public void moveXright()
    {
        body.setXPosition(body.getXPosition() +1);
        pole.setXPosition(pole.getXPosition() +1);
    }

    public void moveXleft()
    {
        body.setXPosition(body.getXPosition() -1);
        pole.setXPosition(pole.getXPosition() -1);
    }

    public void moveYup()
    {
        body.setYPosition(body.getYPosition() +1);
        pole.setYPosition(pole.getYPosition() +1);
    }

    public void moveYdown()
    {
        body.setYPosition(body.getYPosition() -1);
        pole.setYPosition(pole.getYPosition() -1);
    }

}