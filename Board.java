public class Board 
{
    Line Horz1 = new Line(160, 600, 890, 600, 20,"GREY",1);
    Line Horz2 = new Line(160, 100, 890, 100, 20,"GREY",1);
    Line Vert1 = new Line(890, 600, 890, 100, 20,"GREY",1);
    Line Vert2 = new Line(160, 600, 160, 100, 20,"GREY",1);
    Line MidLine = new Line(525,600,525,100,10,"GREY",1);
    Text top = new Text("Welcome to Klask",12 , 470, 650, "WHITE",2);
    Rectangle board = new Rectangle(150, 100, 750, 500, "BLUE",0);
    Ball leftbot1 = new Ball(170, 590, 200, "GREY",0);
    Ball leftbot2 = new Ball(170, 590, 170, "BLUE");
    Ball lefttop1 = new Ball(170, 110, 200, "GREY",0);
    Ball lefttop2 = new Ball(170, 110, 170, "BLUE");
    Ball righttop1 = new Ball(880, 110, 200, "GREY",0);
    Ball righttop2 = new Ball(880, 110, 170, "BLUE");
    Ball rightbot1 = new Ball(880, 590, 200, "GREY",0);
    Ball rightbot2 = new Ball(880, 590, 170, "BLUE");
    Ball goal1 = new Ball(230,350,80,"GREY");
    Ball goal2 = new Ball(830,350,80,"GREY");
    public void BoardAdd(GameArena Klask)
    {
        Klask.addLine(Horz1);
        Klask.addLine(Horz2);
        Klask.addLine(Vert1);
        Klask.addLine(Vert2);
        Klask.addLine(MidLine);
        Klask.addText(top);
        Klask.addRectangle(board);
        Klask.addBall(leftbot1);
        Klask.addBall(leftbot2);
        Klask.addBall(lefttop1);
        Klask.addBall(lefttop2);
        Klask.addBall(righttop1);
        Klask.addBall(righttop2);
        Klask.addBall(rightbot1);
        Klask.addBall(rightbot2);
        Klask.addBall(goal1);
        Klask.addBall(goal2);
    }
}
