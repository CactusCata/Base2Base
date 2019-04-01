package fr.cactuscata.base2base;

import fr.cactuscata.smartapplication.SmartApplicationBox;
import fr.cactuscata.smartapplication.msg.Message;
import fr.cactuscata.smartapplication.msg.MessageType;

public class Base2Base extends SmartApplicationBox {

	public Base2Base() {
		super("Base2base", MessageType.CONSOLE);
	}

	@Override
	public void launchScript() {

		int intBaseToConvert = Message.getMessageInstance().getInteger(
				"Veuillez choisir la base à convertir: ");
		int intFinalBase = Message.getMessageInstance().getInteger(
				"Veuillez choisir la base finale: ");

		Base baseTo = Base.getBase(intBaseToConvert);
		Base baseEnd = Base.getBase(intFinalBase);

		baseTo.add(new Base(BasicBase.DECIMAL), "9");
	}

}
