package ch06;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tv {
	private boolean power;
	private int soundVolume;
	private int currentChannel;
	private double size;
	private double length;
	private double height;
	private String color;

	public void turnPower() {
		power = !power;
	}

	public void setChannelUp() {
		currentChannel++;
	}

	public void setChannelDown() {
		currentChannel--;
	}

	@Override public String toString() {
		return "전원상태 : " + power;
	}
}
