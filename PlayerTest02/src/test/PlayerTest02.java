package test;

import player.*;

public class PlayerTest02 {
	public static void main(String[] args){
		PortablePlayer p = new PortablePlayer();
		
		p.play();
		p.stop();
		
		//public
		p.changeSkin(Skinnable.LEOPARD);
	}
}
