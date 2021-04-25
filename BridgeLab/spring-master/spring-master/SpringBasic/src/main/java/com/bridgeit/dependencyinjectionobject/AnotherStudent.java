package com.bridgeit.dependencyinjectionobject;

public class AnotherStudent {
 Cheat cheat;
 int id; public void setId(int id) {
		this.id = id;
	}

	public void setCheat(Cheat cheat) {
	this.cheat = cheat;
}

	public void cheat() {
		cheat.cheat();
		System.out.println(id+"   cheating exam");

	}
}
