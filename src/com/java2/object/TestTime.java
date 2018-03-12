package com.java2.object;

public class TestTime {
	String section;
	public int testingtime;
	int startmins;
	int starthour;
	int hour = 0;
	int endmins;
	int endhour;

	public TestTime() {

	}

	public TestTime(int starthour, int testingtime, int startmins, String section) {

		this.testingtime = testingtime;

		this.section = section;
		if (testingtime > 60) {
			endhour = hour + 1;
			endmins = testingtime - 60 + startmins;
			if (testingtime - 60 > 0) {
				endhour = hour + 2;
				endmins = testingtime - 120 + startmins;
			}
		}
	}

	public void print() {

		System.out.print(section + ":" + starthour + startmins + "~" + endhour + endmins);
	}
}
