package demo;

import java.util.Comparator;
import java.util.Map;

public class HashmapComparator implements Comparator<HashMapClass>{

	@Override
	public int compare(HashMapClass o1, HashMapClass o2)
	{
		return ((Comparable) ((Map.Entry) (o1)).getValue())
                .compareTo(((Map.Entry) (o2)).getValue());
		
	}

}
