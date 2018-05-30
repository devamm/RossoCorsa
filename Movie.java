public class Movie {
	public static void main (String[] args) {
		Sprite kimi = new Sprite ("kimi.png");
		Sprite reporter1 = new Sprite ("reporter1.png");
		Sprite reporter2Alt = new Sprite ("reporter2Alt.png");
		Sprite reporter1Alt = new Sprite ("reporter1Alt.png");
		Sprite reporter2 = new Sprite ("reporter2.png");
		Animation movie = new Animation (400,600);
		int a = 5; //reporter1 starting point
		int b = 305; //reporter2 starting point
		int k = 510; //kimi starting point
		String input;
		//movie.setFrameRate(7);
		movie.setBackgroundImage("background.png");		
		Sprite title = new Sprite ("titleScreen.png");
			title.setPosition(0,0);
			movie.addSprite(title);
			movie.frameFinished();
		Sprite intro1 = new Sprite ("intro1.png");
		intro1.setPosition(0,0);
		Sprite intro2 = new Sprite ("intro2.png");
		intro2.setPosition(0,0);
		while (true) {
			input = IO.readString();
			if (input.equals(" ")) {
				movie.removeSprite(title);
				movie.addSprite(intro1);
				movie.frameFinished();
				break;
			}
		}

		movie.frameFinished();
		while (true) {
			input = IO.readString();
			if (input.equals(" ")) {
				movie.removeSprite(intro1);
				movie.addSprite(intro2);
				movie.frameFinished();
				break;
			}
		}

		while (true) {
			input = IO.readString();
			if (input.equals(" ")) {
				movie.removeSprite(intro2);
				movie.frameFinished();
				break;
			}
		} 

		kimi.setPosition(160,510);
		movie.addSprite(kimi);
		reporter1.setPosition(a,300);
		movie.addSprite(reporter1);
		reporter2Alt.setPosition(b,100);
		movie.addSprite(reporter2Alt);
		movie.frameFinished();


		while (true) {
			for (int i = 0; i<14; i++) {
				System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
				input = IO.readString();
				if (input.equals(" ")) {
					k-=30;
					kimi.setPosition(160,k);
					reporter1.setPosition(a,300);
					reporter2Alt.setPosition(b, 100);
					a+=20;
					b-=20;
						gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
				
				}
				else if (input.equals("  ")) {
					kimi.setPosition(160,k);
					reporter1.setPosition(a,300);
					reporter2Alt.setPosition(b, 100);
					a+=20;
					b-=20;
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
			
				}
				else {}
			}
				System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
				input = IO.readString();
				if (input.equals(" ")) {
					k-=30;
					kimi.setPosition(160,k);
					a+=10;
					b-=10;
					reporter1.setPosition(a,300);
					reporter2Alt.setPosition(b, 100);
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
					
				}
				else if (input.equals("  ")) {
					kimi.setPosition(160,k);
					a+=10;
					b-=10;
					reporter1.setPosition(a,300);
					reporter2Alt.setPosition(b, 100);
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
					
				}
				else {}

				System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
				input = IO.readString();
				if (input.equals(" ")) {
					k-=30;
					kimi.setPosition(160,k);
					movie.removeSprite(reporter1);
					reporter1Alt.setPosition(295,300);
					movie.addSprite(reporter1Alt);
					movie.removeSprite(reporter2Alt);
					reporter2.setPosition(15,100);
					movie.addSprite(reporter2);
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
					
				}
				else if (input.equals("  ")) {
					kimi.setPosition(160,k);
					movie.removeSprite(reporter1);
					reporter1Alt.setPosition(295,300);
					movie.addSprite(reporter1Alt);
					movie.removeSprite(reporter2Alt);
					reporter2.setPosition(15,100);
					movie.addSprite(reporter2);
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
					//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
				}
				else {}

			for (int i = 0; i<14; i++) {
				System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
				input = IO.readString();
				if (input.equals(" ")) {
					k-=30;
					kimi.setPosition(160,k);
					reporter1Alt.setPosition(a,300);
					reporter2.setPosition(b, 100);
					a-=20;
					b+=20;
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
					//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					}
				else if (input.equals("  ")) {
					kimi.setPosition(160,k);
					reporter1Alt.setPosition(a,300);
					reporter2.setPosition(b, 100);
					a-=20;
					b+=20;
					gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
					movie.frameFinished();
				}
				else {}
			}
			
			System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
			input = IO.readString();
			if (input.equals(" ")) {
				k-=30;
				kimi.setPosition(160,k);
				a-=10;
				b+=10;
				reporter1Alt.setPosition(a,300);
				reporter2.setPosition(b,100);	
				gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
				movie.frameFinished();
				//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
			}
			else if (input.equals("  ")) {
				kimi.setPosition(160,k);
				a-=10;
				b+=10;
				reporter1Alt.setPosition(a,300);
				reporter2.setPosition(b,100);
				gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
				movie.frameFinished();
				//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
			}
			else {}

			System.out.println("Single tap the spacebar to move. Doubletap to stay in place");
			input = IO.readString();
			if (input.equals(" ")) {
				k-=30;
				kimi.setPosition(160,k);
				movie.removeSprite(reporter1Alt);
				reporter1.setPosition(a,300);
				movie.addSprite(reporter1);
				movie.removeSprite(reporter2);
				reporter2Alt.setPosition(b,100);
				movie.addSprite(reporter2Alt);
				gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
				movie.frameFinished();
				//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
			}
			else if (input.equals("  ")) {
				kimi.setPosition(160,k);
				movie.removeSprite(reporter1Alt);
				reporter1.setPosition(a,300);
				movie.addSprite(reporter1);
				movie.removeSprite(reporter2);
				reporter2Alt.setPosition(b,100);
				movie.addSprite(reporter2Alt);
				gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
				movie.frameFinished();
				//gameCondition(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt);
			}
			else {}
			
		}
	}


	public static boolean detectCollision (Sprite kimi, Sprite reporter1, Sprite reporter1Alt, Sprite reporter2, Sprite reporter2Alt) {
		Rectangle kimiR = new Rectangle ((kimi.getXposition()+11), kimi.getYposition(), (kimi.getXsize()-11), kimi.getYsize());
		Rectangle reporter2R = new Rectangle (reporter2.getXposition(), reporter2.getYposition(), (reporter2.getXsize()-10), reporter2.getYsize());
		Rectangle reporter2AltR = new Rectangle ((reporter2Alt.getXposition()+10), reporter2Alt.getYposition(), (reporter2Alt.getXsize()-10), reporter2Alt.getYsize());
		Rectangle reporter1R = new Rectangle ((reporter1.getXposition()+10), reporter1.getYposition(), reporter1.getXsize()-10, reporter1.getYsize());
		Rectangle reporter1AltR = new Rectangle (reporter1Alt.getXposition(), reporter1Alt.getYposition(), (reporter1Alt.getXsize()-10), reporter1Alt.getYsize());
		if (kimiR.intersects(reporter1R) == true) {
			return true;	
		} else if (kimiR.intersects(reporter1AltR) == true) {
			return true;
		} else if (kimiR.intersects(reporter2R) == true) {
			return true;
		} else if (kimiR.intersects(reporter2AltR) == true) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean detectWin (Sprite kimi, Sprite reporter1, Sprite reporter1Alt, Sprite reporter2, Sprite reporter2Alt) {
		if (kimi.getYposition() == 30) {
			return true;	
		} 
		else {
			return false;
		}
	}

	public static void gameCondition (Sprite kimi, Sprite reporter1, Sprite reporter1Alt, Sprite reporter2, Sprite reporter2Alt) {
		if (detectWin(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt) == true) {
			System.out.println("You Won!");

			
		} else if (detectCollision(kimi, reporter1, reporter1Alt, reporter2, reporter2Alt) == true) {
			System.out.println("There has been a collision. Game Over!");
			//System.exit(0);
		} else {}
	}  
}
