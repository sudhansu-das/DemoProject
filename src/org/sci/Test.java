package org.sci;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="sudhansu sekhar dash";
		str.replace(" ","");
		char[] ch=str.toCharArray();
Map<Character,Integer>map1= new HashMap<Character,Integer>();
for(Character c:ch)
{
	if(map1.containsKey(c))
	
		map1.put(c, map1.get(c)+1);
	else
	
		map1.put(c, 1);
	

}
Set<Entry<Character, Integer>> set1=map1.entrySet().stream().filter(x->x.getValue()==1).collect(Collectors.toSet());
	for(Entry<Character, Integer> e:set1)
	{
		System.out.println(e.getKey()+":"+e.getValue());
	}
	}

}
