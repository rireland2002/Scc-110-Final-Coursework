public class Klask {
    public static void main(String[] args)
    {
        GameArena KlaskMain = new GameArena(1000, 750);//Creating all variables and objects needed for the Klask game, players, ball etc
        Players PlayOne = new Players();
        Players PlayTwo = new Players();
        Board OutLine = new Board();
        Ball mags1 = new Ball(525,200,15,"WHITE",1);
        Ball mags2 = new Ball(525,350,15,"WHITE",1);
        Ball mags3 = new Ball(525,500,15,"WHITE",1);
        Ball scoreBall = new Ball(800,520,25, "YELLOW",1);
        Text PlayOneWin = new Text("Player One has scored 5 and won the game!",30 , 160, 350, "YELLOW",2);
        Text PlayTwoWin = new Text("Player Two has scored 5 and won the game!",30 , 160, 350, "YELLOW",2);
        Text PlayOneScore = new Text("P1: 0",12 , 160, 80, "WHITE",2);
        Text PlayTwoScore = new Text("P2: 0",12 , 850, 80, "WHITE",2);
        Ball goal1 = new Ball(230,350,80,"GREY");
        Ball goal2 = new Ball(830,350,80,"GREY");
        int magcount1 = 0;
        int magcount2 = 0;
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
        
        while(true)//Runs whilst the score is below 5 for either player
        {
            if(KlaskMain.wPressed())//Control scheme for player one, wasd movement
            {
                PlayOne.moveYup();//Moves the player up
            }
       
            if(KlaskMain.aPressed())
            {
                PlayOne.moveXleft();//Moves the player left
            }
         
            if(KlaskMain.sPressed())
            {
                PlayOne.moveYdown();//Moves the player down
            }
         
            if(KlaskMain.dPressed())
            {
                PlayOne.moveXright();//Moves the player right
            }

        
            if(KlaskMain.upPressed())//Control scheme for player two, arrow movement, same order for movements as above
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
           
            if(PlayOne.body.getXPosition() <= 160)//Collisions for player one, stops them from going out of bounds
            {
                PlayOne.setXPos(162);
            }
            
            if(PlayOne.body.getYPosition() >= 600)
            {
                PlayOne.setYPos(598);
            }
            
            if(PlayOne.body.getYPosition() <= 100)
            {
                PlayOne.setYPos(102);
            }
            
            if(PlayOne.body.getXPosition() >= 510)
            {
                PlayOne.setXPos(508);
            }
            
            if(PlayTwo.body.getYPosition() >= 600)//Collisions for player two
            {
                PlayTwo.setYPos(599);
            }
            
            if(PlayTwo.body.getYPosition() <= 100)
            {
                PlayTwo.setYPos(101);
            }
            
            if(PlayTwo.body.getXPosition() <= 539)
            {
                PlayTwo.setXPos(540);
            }
            
            if(PlayTwo.body.getXPosition() >= 891)
            {
                PlayTwo.setXPos(890);
            }

            if(scoreBall.getXPosition()>=890)//Collisions for the scoreball
            {
                scoreBall.reverseXspeed();
                scoreBall.setXPosition(888);
            }

            if(scoreBall.getXPosition()<=160)
            {
                scoreBall.reverseXspeed();
                scoreBall.setXPosition(162);
            }

            if(scoreBall.getYPosition()<=100)
            {
                scoreBall.reverseYspeed();
                scoreBall.setYPosition(102);
            }

            if(scoreBall.getYPosition()>=600)
            {
                scoreBall.reverseYspeed();
                scoreBall.setYPosition(598);
            }

            if(mags1.getXPosition()>=890)//Collisions for the three magnets from here till the end of mag3
            {
                mags1.reverseXspeed();
                mags1.setXPosition(888);
            }

            if(mags1.getXPosition()<=160)
            {
                mags1.reverseXspeed();
                mags1.setXPosition(162);
            }

            if(mags1.getYPosition()<=100)
            {
                mags1.reverseYspeed();
                mags1.setYPosition(102);
            }

            if(mags1.getYPosition()>=600)
            {
                mags1.reverseYspeed();
                mags1.setYPosition(598);
            }

            if(mags2.getXPosition()>=890)
            {
                mags2.reverseXspeed();
                mags2.setXPosition(888);
            }

            if(mags2.getXPosition()<=160)
            {
                mags2.reverseXspeed();
                mags2.setXPosition(162);
            }

            if(mags2.getYPosition()<=100)
            {
                mags2.reverseYspeed();
                mags2.setYPosition(102);
            }

            if(mags2.getYPosition()>=600)
            {
                mags2.reverseYspeed();
                mags2.setYPosition(598);
            }
            
            if(mags3.getXPosition()>=890)
            {
                mags3.reverseXspeed();
                mags3.setXPosition(888);
            }

            if(mags3.getXPosition()<=160)
            {
                mags3.reverseXspeed();
                mags3.setXPosition(162);
            }

            if(mags3.getYPosition()<=100)
            {
                mags3.reverseYspeed();
                mags3.setYPosition(102);
            }

            if(mags3.getYPosition()>=600)
            {
                mags3.reverseYspeed();
                mags3.setYPosition(598);
            }

            if(PlayOne.body.collides(goal1)== true)//Conditions for if player one hits their own goal
            {
                PlayTwo.score = PlayTwo.score+1;//Increments p2 score
                PlayOne.setPos(200,540);//Sets the positions of all the different objects back to their original
                PlayTwo.setPos(845,540);
                scoreBall.setXPosition(800);//The ball will change sides depending on who scored, going to the recievers side
                scoreBall.setYPosition(520);
                PlayTwoScore.setText("P2: 1");//Changes score text
                scoreBall.xSpeed = 0;//Sets speed and positions of the ball and magnets to 0 and their original position
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(PlayTwo.body.collides(goal2)== true)
            {
                PlayOne.score = PlayOne.score+1;//Same as collisions for player one, except player two
                PlayOne.setPos(200,540);
                PlayTwo.setPos(845,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(scoreBall.collides(goal1)==true)//Collisions for if the ball goes into the net of player one, conditions all the same
            {
                PlayTwo.score = PlayTwo.score+1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(scoreBall.collides(goal2)==true)//Same as collision above except for the p2's goal
            {
                PlayOne.score = PlayOne.score+1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(mags1.collides(PlayOne.magradius))//Checks if the magradius hidden ball is within range of a magent
            {
                mags1.magnetism(PlayOne.body.getXPosition(), PlayOne.body.getYPosition());//Calculates the distance between the main player body and reduces it until they meet
            }
            if(mags2.collides(PlayOne.magradius))//Same as above for all magnets, P1 and P2
            {
                mags2.magnetism(PlayOne.body.getXPosition(), PlayOne.body.getYPosition());
            }
            if(mags3.collides(PlayOne.magradius))
            {
                mags3.magnetism(PlayOne.body.getXPosition(), PlayOne.body.getYPosition());
            }

            if(mags1.collides(PlayTwo.magradius))
            {
                mags1.magnetism(PlayTwo.body.getXPosition(), PlayTwo.body.getYPosition());
            }
            if(mags2.collides(PlayTwo.magradius))
            {
                mags2.magnetism(PlayTwo.body.getXPosition(), PlayTwo.body.getYPosition());
            }
            if(mags3.collides(PlayTwo.magradius))
            {
                mags3.magnetism(PlayTwo.body.getXPosition(), PlayTwo.body.getYPosition());
            }
            
            if(PlayOne.body.collides(scoreBall))//Checks if P1 has collided with the ball
            {
                scoreBall.deflect(PlayOne.body);//Calls the deflect method to calculate the trajectory of the ball
                scoreBall.move(scoreBall.xSpeed,scoreBall.ySpeed);//Only moves the ball and not the player
                
            }
            if(PlayTwo.body.collides(scoreBall))//Same as collision with ball for P1
            {
                PlayTwo.body.deflect(scoreBall);
                scoreBall.move(scoreBall.xSpeed,scoreBall.ySpeed);
            }
            if(scoreBall.collides(mags1))//Checks if the ball has collided with a magnet
            {
                scoreBall.deflect(mags1);//Calls the deflect to get the trajectory for both the ball and magnet
            }
            if(scoreBall.collides(mags2))//Same as collision above for all magnets
            {
                scoreBall.deflect(mags2);
            }
            if(scoreBall.collides(mags3))
            {
                scoreBall.deflect(mags3);
            }
            if(PlayOne.body.collides(mags1))//Checks if P1 has collided with a magnet
            {
               mags1.setXPosition(PlayOne.body.getXPosition());//Sets the position of the magnet to P1 main body
               mags1.setYPosition(PlayOne.body.getYPosition()); 
            }
            
            if(PlayOne.body.collides(mags2))//Same as above for magnets 2 and 3
            {
               mags2.setXPosition(PlayOne.body.getXPosition());
               mags2.setYPosition(PlayOne.body.getYPosition()); 
            }
            if(PlayOne.body.collides(mags3))
            {
               mags3.setXPosition(PlayOne.body.getXPosition());
               mags3.setYPosition(PlayOne.body.getYPosition()); 
            }

            if(PlayOne.body.collides(mags1) && PlayOne.body.collides(mags2))//Acts the same as a board reset for a goal score, except for if a player comes into contact with two magnets
            {
                PlayTwo.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }

            if(PlayOne.body.collides(mags1) && PlayOne.body.collides(mags3))//Same for all different combinations of magnets
            {
                PlayTwo.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(PlayOne.body.collides(mags2) && PlayOne.body.collides(mags3))
            {
                PlayTwo.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(800);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }

            if(PlayTwo.body.collides(mags1) && PlayTwo.body.collides(mags2))
            {
                PlayOne.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }

            if(PlayTwo.body.collides(mags1) && PlayTwo.body.collides(mags3))
            {
                PlayOne.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }

            if(PlayTwo.body.collides(mags2) && PlayTwo.body.collides(mags3))
            {
                PlayOne.score += 1;
                PlayTwo.setPos(845,540);
                PlayOne.setPos(200,540);
                scoreBall.setXPosition(250);
                scoreBall.setYPosition(520);
                scoreBall.xSpeed = 0;
                scoreBall.ySpeed = 0;
                mags1.setXPosition(525);
                mags2.setXPosition(525);
                mags3.setXPosition(525);
                mags1.setYPosition(200);
                mags2.setYPosition(350);
                mags3.setYPosition(500);
                mags1.xSpeed = 0;
                mags1.ySpeed = 0;
                mags2.xSpeed = 0;
                mags2.ySpeed = 0;
                mags3.xSpeed = 0;
                mags3.ySpeed = 0;
                magcount1 = 0;
                magcount2 = 0;
            }
            
            if(PlayTwo.body.collides(mags1))//Same as collisions above except for P2
            {
               
               mags1.setXPosition(PlayTwo.body.getXPosition());
               mags1.setYPosition(PlayTwo.body.getYPosition()); 
            }
            if(PlayTwo.body.collides(mags2))
            {
               
               mags2.setXPosition(PlayTwo.body.getXPosition());
               mags2.setYPosition(PlayTwo.body.getYPosition()); 
            }
            if(PlayTwo.body.collides(mags3))
            {
               
               mags3.setXPosition(PlayTwo.body.getXPosition());
               mags3.setYPosition(PlayTwo.body.getYPosition()); 
            }
            
            
            
            
            mags1.move(mags1.xSpeed,mags1.ySpeed);//Moves all magnets based on current speed
            mags2.move(mags2.xSpeed,mags2.ySpeed);
            mags3.move(mags3.xSpeed,mags3.ySpeed);
            
            if(mags1.xSpeed > 0.1)//Calculates friction for each magnet, slows down if going right
            {
                mags1.xSpeed = mags1.xSpeed-0.02;
            }
            if(mags1.xSpeed < -0.1)//Slows down if going left
            {
                mags1.xSpeed = mags1.xSpeed+0.02;
            }
            if(mags1.ySpeed > 0.1)//Slows down if going down
            {
                mags1.ySpeed = mags1.ySpeed-0.02;
            }
            if(mags1.ySpeed < -0.1)//Slows down if going up
            {
                mags1.ySpeed = mags1.ySpeed+0.02;
            }
            if(mags1.xSpeed<0.1 && mags1.xSpeed>-0.1)//Stops the magnet is the X and Y speeds are at the right value
            {
                mags1.xSpeed = 0;
            }
            if(mags1.ySpeed<0.1 && mags1.ySpeed>-0.1)
            {
                mags1.ySpeed = 0;
            }    

            if(mags2.xSpeed > 0.1)//Same for all different magnets
            {
                mags2.xSpeed = mags2.xSpeed-0.02;
            }
            if(mags2.xSpeed < -0.1)
            {
                mags2.xSpeed = mags2.xSpeed+0.02;
            }
            if(mags2.ySpeed > 0.1)
            {
                mags2.ySpeed = mags2.ySpeed-0.02;
            }
            if(mags2.ySpeed < -0.1)
            {
                mags2.ySpeed = mags2.ySpeed+0.02;
            }
            if(mags2.xSpeed<0.1 && mags2.xSpeed>-0.1)
            {
                mags2.xSpeed = 0;
            }
            if(mags2.ySpeed<0.1 && mags2.ySpeed>-0.1)
            {
                mags2.ySpeed = 0;
            } 

            if(mags3.xSpeed > 0.1)
            {
                mags3.xSpeed = mags3.xSpeed-0.02;
            }
            if(mags3.xSpeed < -0.1)
            {
                mags3.xSpeed = mags3.xSpeed+0.02;
            }
            if(mags3.ySpeed > 0.1)
            {
                mags3.ySpeed = mags3.ySpeed-0.02;
            }
            if(mags3.ySpeed < -0.1)
            {
                mags3.ySpeed = mags3.ySpeed+0.02;
            }
            if(mags3.xSpeed<0.1 && mags3.xSpeed>-0.1)
            {
                mags3.xSpeed = 0;
            }
            if(mags3.ySpeed<0.1 && mags3.ySpeed>-0.1)
            {
                mags3.ySpeed = 0;
            } 
            
            if(scoreBall.xSpeed > 0.1)//Same as above except for the ball
            {
                scoreBall.xSpeed = scoreBall.xSpeed-0.02;
            }
            if(scoreBall.xSpeed < -0.1)
            {
                scoreBall.xSpeed = scoreBall.xSpeed+0.02;
            }
            if(scoreBall.ySpeed > 0.1)
            {
                scoreBall.ySpeed = scoreBall.ySpeed-0.02;
            }
            if(scoreBall.ySpeed < -0.1)
            {
                scoreBall.ySpeed = scoreBall.ySpeed+0.02;
            }
            if(scoreBall.xSpeed<0.1 && scoreBall.xSpeed>-0.1)
            {
                scoreBall.xSpeed = 0;
            }
            if(scoreBall.ySpeed<0.1 && scoreBall.ySpeed>-0.1)
            {
                scoreBall.ySpeed = 0;
            }

            scoreBall.move(scoreBall.xSpeed,scoreBall.ySpeed);//Moves the ball according to current speed
            
            if(PlayOne.score==1)//The score text for all different scores of P1
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
            
            if(PlayOne.score==5)//The win condition for P1
            {
                KlaskMain.addText(PlayOneWin);//Adds the P1 win text
                PlayOneScore.setText("P1: 5");//Sets the final score
                break;//Breaks from the loop to end the game
            }
            
            if(PlayTwo.score==1)//Same as above except for P2 and if P2 wins
            {
                PlayTwoScore.setText("P2: 1");
            }
            
            if(PlayTwo.score==2)
            {
                PlayTwoScore.setText("P2: 2");
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
                PlayTwoScore.setText("P2: 5");
                break;
            }
            KlaskMain.pause();//Slows down the game for players

        }
    }
}
