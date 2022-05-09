package com.gfg.string;

public class LeftmostRepeatingCharacterBest {

	private static int getLeftmostRepeatingChar(String str) {
		final int CHAR=256;
		boolean[] visited= new boolean[256];
		int result=0;
		for(int i=str.length()-1;i>=0;i--)
		{
			if(visited[str.charAt(i)]==true)
			{
				result=i;
			}
			else
			{
				visited[str.charAt(i)]=true;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println(getLeftmostRepeatingChar("xbabcsca"));

	}

}
