public class Players
{
    int score = 0;
    Ball body = new Ball(10,10,40,"BLACK",1); 
    Rectangle pole = new Rectangle(0,10,15,70,"BLACK",1);
    
    public void addTo(GameArena Klask)
    {
        Klask.addBall(body);
        Klask.addRectangle(pole);
    }

    public void moveXright()
    {
        body.setXPosition(body.getXPosition() +2);
        pole.setXPosition(pole.getXPosition() +2);
    }

    public void moveXleft()
    {
        body.setXPosition(body.getXPosition() -2);
        pole.setXPosition(pole.getXPosition() -2);
    }

    public void moveYup()
    {
        body.setYPosition(body.getYPosition() -2);
        pole.setYPosition(pole.getYPosition() -2);
    }

    public void moveYdown()
    {
        body.setYPosition(body.getYPosition() +2);
        pole.setYPosition(pole.getYPosition() +2);
    }
    
    // public double getXPos1()
    // {
    //     body.getXPosition();
    //     pole.getXPosition();
    //     return double Xpos;
    // }

    // public double getYpos1()
    // {
    //     body.getYPosition();
    //     pole.getYPosition();
    //     return double Ypos;
    // }
    public void setPos(int x, int y)
    {
        body.setYPosition(y);
        body.setXPosition(x);
        pole.setXPosition(x-8);
        pole.setYPosition(y-8);

    }

    public void setXPos(int x)
    {
        body.setXPosition(x);
        pole.setXPosition(x-8);
    }

    public void setYPos(int y)
    {
        body.setYPosition(y);
        pole.setYPosition(y-8);
    }

    
    

}