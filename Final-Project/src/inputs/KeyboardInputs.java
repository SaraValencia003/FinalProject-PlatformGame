package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import gamestates.Gamestate;
import main.GamePanel;

import static utilz.Constants.Directions.*;


public class KeyboardInputs implements KeyListener {

	private GamePanel gamePanel;
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void keyReleased(KeyEvent e) {
		
//		switch(e.getKeyCode()) {
//		
//		case KeyEvent.VK_W:
//			gamePanel.getGame().getPlayer().setUp(false);
//			break;
//		case KeyEvent.VK_A:
//			gamePanel.getGame().getPlayer().setLeft(false);
//			break;
		
		switch (Gamestate.state) {
		case MENU:
			gamePanel.getGame().getMenu().keyReleased(e);
			break;
		case PLAYING:
			gamePanel.getGame().getPlaying().keyReleased(e);
			break;
		
			default:
				break;
		}
		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

		switch (Gamestate.state) {
		case MENU:
			gamePanel.getGame().getMenu().keyPressed(e);
			break;
		case PLAYING:
			gamePanel.getGame().getPlaying().keyPressed(e);
			break;
		
		default:
			break;
		}
		
	}

}
