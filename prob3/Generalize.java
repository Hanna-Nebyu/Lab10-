package prob3;

import java.util.Arrays;
import java.util.List;

public class Generalize {


	public static <T> boolean contains1(List<T> list, T s) {

		for(T x:list) {

			if(x==null && s==null) return true;

			if(s==null || x==null) continue;

			if(x.equals(s)) return true;

		}

		return false;

	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		List<String> list=Arrays.asList("Bob","Joe","Tom");

		boolean result=Generalize.contains1(list, "Tom");

		System.out.println(result);

	}



}


