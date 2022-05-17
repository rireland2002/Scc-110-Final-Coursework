public class Klask {
    public static void main(String[] args)
    {
        GameArena KlaskMain = new GameArena(1000, 750);
        Players PlayOne = new Players();
        Players PlayTwo = new Players();
        Board OutLine = new Board();
        Ball mags1 = new Ball(525,200,15,"WHITE",1);
        Ball mags2 = new Ball(525,350,15,"WHITE",1);
        Ball mags3 = new Ball(525,500,15,"WHITE",1);
        Ball scoreBall = new Ball(800,520,25, "YELLOW",1);
        Text PlayOneWin = new Text("Player One has scored 5 and won the game!",30 , 160, 350, "YELLOW",2);
        Text PlayTwoWin = new Text("Player Two has scored 5 and won the game!",30 , 160, 650, "YELLOW",2);
        Text PlayOneScore = new Text("P1: 0",12 , 160, 80, "WHITE",2);
        Text PlayTwoScore = new Text("P2: 0",12 , 850, 80, "WHITE",2);
        Ball goal1 = new Ball(230,350,80,"GREY");
        Ball goal2 = new Ball(830,350,80,"GREY");
        PlayOne.addTo(KlaskMain);
        PlayTwo.addTo(KlaskMain);
        OutLine.BoardAdd(KlaskMain);
        KlaskMain.addBall(goal1);
        KlaskMain.addText(PlayOneScore);
        KlaskMain.addText(PlayTwoScore);
        KlaskMain.addBall(goal2);
        KlaskMain.addBall(scoreBall);
        KlaskMain.addBall(mags1);
        KlaskMain.addBall(mags2);
        KlaskMain.addBall(mags3);
        PlayOne.setPos(200, 540);
        PlayTwo.setPos(845,540);
        
        while(true)
        {
            if(KlaskMain.wPressed())
            {
                PlayOne.moveYup();
            }
       
            if(KlaskMain.aPressed())
            {
                PlayOne.moveXleft();
            }
         
            if(KlaskMain.sPressed())
            {
                PlayOne.moveYdown();
            }
         
            if(KlaskMain.dPressed())
            {
                PlayOne.moveXright();
            }

        
            if(KlaskMain.upPressed())
            {
                PlayTwo.moveYup();
            }
          
            if(KlaskMain.leftPressed())
            {
                PlayTwo.moveXleft();
            }
          
            if(KlaskMain.downPressed())
            {
                PlayTwo.moveYdown();
            }
          
            if(KlaskMain.rightPressed())
            {
                PlayTwo.moveXright();
            }
           
            if(PlayOne.body.getXPosition() == 160)
            {
                PlayOne.setXPos(190);
            }
            
            if(PlayOne.body.getYPosition() == 600)
            {
                PlayOne.setYPos(570);
            }
            
            if(PlayOne.body.getYPosition() == 100)
            {
                PlayOne.setYPos(130);
            }
            
            if(PlayOne.body.getXPosition() == 510)
            {
                PlayOne.setXPos(490);
            }
            
            if(PlayTwo.body.getYPosition() == 600)
            {
                PlayTwo.setYPos(570);
            }
            
            if(PlayTwo.body.getYPosition() == 100)
            {
                PlayTwo.setYPos(130);
            }
            
            if(PlayTwo.body.getXPosition() == 539)
            {
                PlayTwo.setXPos(551);
            }
            
            if(PlayTwo.body.getXPosition() == 891)
            {
                PlayTwo.setXPos(861);
            }

            if(scoreBall.getXPosition()==890)
            {
                scoreBall.setXPosition(860);
            }

            if(scoreBall.getXPosition()==160)
            {
                scoreBall.setXPosition(190);
            }

            if(scoreBall.getYPosition()==100)
            {
                scoreBall.setYPosition(130);
            }

            if(scoreBall.getYPosition()==600)
            {
                scoreBall.setYPosition(570);
            }
            
            if(PlayOne.body.collides(goal1)== true)
            {
                PlayTwo.score = PlayTwo.score+1;
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
                PlayTwoScore.setText("P2: 1");
            }
            
            if(PlayTwo.body.collides(goal2)== true)
            {
                PlayOne.score = PlayOne.score+1;
                PlayTwo.setPos(845,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
            }
            
            if(scoreBall.collides(goal1)==true)
            {
                PlayTwo.score = PlayTwo.score+1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
            }
            
            if(scoreBall.collides(goal2)==true)
            {
                PlayOne.score = PlayOne.score+1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
            }

            if(PlayOne.score==1)
            {
                PlayOneScore.setText("P1: 1");
            }
            
            if(PlayOne.score==2)
            {
                PlayOneScore.setText("P1: 2");
            }
            
            if(PlayOne.score==3)
            {
                PlayOneScore.setText("P1: 3");
            }
            
            if(PlayOne.score==4)
            {
                PlayOneScore.setText("P1: 4");
            }
            
            if(PlayOne.score==5)
            {
                KlaskMain.addText(PlayOneWin);
                PlayOneScore.setText("P1: 5");
                break;
            }
            
            if(PlayTwo.score==1)
            {
                PlayTwoScore.setText("P2: 1");
            }
            
            if(PlayTwo.score==2)
            {
                PlayOneScore.setText("P2: 2");
            }
            
            if(PlayTwo.score==3)
            {
                PlayTwoScore.setText("P2: 3");
            }
            
            if(PlayTwo.score==4)
            {
                PlayTwoScore.setText("P2: 4");
            }
            
            if(PlayTwo.score==5)
            {
                KlaskMain.addText(PlayTwoWin);
                PlayOneScore.setText("P2: 5");
                break;
            }
            KlaskMain.pause();

        }
    }
    //For the velocity one ball needs to be taken as the object its being performed on and the other is an extra parameter, edit the code to take one ball as paramters and the other as the object its performed on, all balls in same class.
}
