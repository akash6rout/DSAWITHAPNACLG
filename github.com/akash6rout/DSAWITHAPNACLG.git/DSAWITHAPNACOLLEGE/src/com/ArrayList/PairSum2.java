package com.ArrayList;

import java.util.ArrayList;

public class PairSum2 {
	
	public static boolean pairSum2(ArrayList<Integer> list,int target) {
		int breakingpoint=-1;
		int n=list.size();
		for(int i=0;i<list.size();i++) {
			if(list.get(i)>list.get(i+1)) {
				breakingpoint=i;
				break;
			}
		}
		int leftPointr=breakingpoint+1;//smallest
		int rightPointer=breakingpoint;//largest
		
		while(leftPointr!=rightPointer) {
			//case1
			if(list.get(leftPointr)+list.get(rightPointer)==target) {
				return true;
			}
			//case2
			if(list.get(leftPointr)+list.get(rightPointer)<target) {
				leftPointr=(leftPointr+1)%n;
			}
			//case3
			else{
				rightPointer=(n+rightPointer-1)%n;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(11);
		list.add(15);
		list.add(6);
		list.add(8);
		list.add(9);
		list.add(10);
		int target=16;
		System.out.println(pairSum2(list, target));
	}

}
