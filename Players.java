public class Players
{
    
    Ball body = new Ball(10,10,30,"BLACK",1); 
    Rectangle pole = new Rectangle(10,10,5,10,"BLACK",1);
    
    public void addTo(GameArena Klask)
    {
        Klask.addBall(body);
        Klask.addRectangle(pole);
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
    
    public void getXPos1()
    {
        body.getXPosition();
        pole.getXPosition();
    }

    public void getYpos1()
    {
        body.getYPosition();
        pole.getYPosition();
    }
    public void setPos(int x, int y)
    {
        body.setYPosition(y);
        body.setXPosition(x);
        pole.setXPosition(x);
        pole.setYPosition(y);

    }
    
    

}