package com.devansh;

import java.util.*;

public class JavaCollection {

		List list;
		Set set;
		Map map;
		Properties prop;

		//Getter and setter for List
		public void setList(List list)
		{
			this.list=list;
		}
		public List getList()
		{
			System.out.println("Elements in List:"+list);
			return list;
		}

		// Getter and Setter for Set
		public void setSet(Set set)
		{
			this.set=set;
		}
		public Set getSet()
		{
			System.out.println("Elements in Set:"+set);
			return set;
		}
		//Getter and Setter for Map

		public void setMap(Map map)
		{
			this.map=map;
		}
		public Map getMap()
		{
			System.out.println("Elements in Map:"+map);
			return map;
		}
		//Getter and Setter for Properties

		public void setProp(Properties prop)
		{
			this.prop=prop;
		}
		public Properties getProp()
		{
			System.out.println("Elements in Prop:"+prop);
			return prop;
		}



		

	}

