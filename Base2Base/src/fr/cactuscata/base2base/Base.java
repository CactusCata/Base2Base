package fr.cactuscata.base2base;

import java.util.ArrayList;
import java.util.List;

import fr.cactuscata.smartapplication.msg.Message;

public class Base {

	public static Base getBase(int baseToConvert) {
		boolean isKnowedBase = BasicBase.isBasicBase(baseToConvert);
		return isKnowedBase ? BasicBase.getBasic(baseToConvert) : new Base(baseToConvert);
	}

	/*-----------------*/

	private final Character[] basesCharacterComposer;
	private final int baseSize;
	
	private final List<Character> value = new ArrayList<>();

	public Base(Character... cs) {
		this.basesCharacterComposer = cs;
		this.baseSize = cs.length;
	}

	public Base(BasicBase bb) {
		this(bb.getCharacters());
	}

	public Base(int base) {

		Character[] cs = new Character[base];

		Message.getMessageInstance().sendMessage(
				"La base %d n'étant pas connu, il va falloir la créer vous-même !");

		Message.setInfiniteReturnIfIsNotGood(true);
		for (int i = 0; i < base; i++) {
			cs[i] = Message
					.getMessageInstance()
					.getCharacter("Veuillez choisir la valeur %d de la base:", i);
		}
		Message.setInfiniteReturnIfIsNotGood(false);

		this.basesCharacterComposer = cs;
		this.baseSize = cs.length;
	}

	public Character[] getBasesCharacterComposer() {
		return basesCharacterComposer;
	}

	/********************/

	public void add(Base baseToSend, String toAdd) {
		
		final int sizeBaseToSend = baseToSend.baseSize;
		final int sizeBaseToReceive = this.baseSize;
		
		for(int i = sizeBaseToSend; i > 0; i--) {
			
			int value
			
			
		}
		
		

	}
	
	public static Base decrease(Base base) {
		
		Character[] cs = base.value.toArray(new Character[0]);
		
		
	}
	
	public static Base increment(Base base) {
		
		
		
	}

	public static int getRow(Base base, char c) {
		for (int i = 0; i < base.baseSize; i++) {
			if (base.basesCharacterComposer[i] == c) return i;
		}
		return -1;
	}

	public String getValue() {
		StringBuilder b = new StringBuilder();
		this.value.forEach(b::append);
		return b.toString();
	}

}
