package fr.cactuscata.base2base;

import fr.cactuscata.smartapplication.helper.ArrayHelper;

public enum BasicBase {

	BINARY('0', '1'),
	DECIMAL(BasicBase.BINARY, '2', '3', '4', '5', '6', '7', '8', '9'),
	HEXADECIMAL(BasicBase.DECIMAL, 'a', 'b', 'c', 'd', 'e', 'f');

	private final Character[] cars;

	private BasicBase(Character... cars) {
		this.cars = cars;
	}

	private BasicBase(BasicBase basicBase, Character car, Character... cs) {
		this(ArrayHelper.compact(basicBase.cars, new Character[]{car}, cs));
	}

	public Character[] getCharacters() {
		return this.cars;
	}

	private static BasicBase getBasicBase(int base) {
		for (BasicBase bb : BasicBase.values()) {
			if (bb.cars.length == base) return bb;
		}
		return null;
	}

	public static boolean isBasicBase(int baseToConvert) {
		return getBasicBase(baseToConvert) != null;
	}

	public static Base getBasic(int baseToConvert) {
		return new Base(getBasicBase(baseToConvert).cars);
	}

}
