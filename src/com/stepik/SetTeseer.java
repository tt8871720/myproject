package com.stepik;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.ldap.SortControl;

public class SetTeseer {

	public static void main(String[] args) {
		Set<String> set = new TreeSet(Arrays.asList( "Gamma", "Alpha", "Omega"));
System.out.println(set);
	}

}
