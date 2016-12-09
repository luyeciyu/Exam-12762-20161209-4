package com.test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class random 
{
    public static void main( String[] args )
    {
    	//活动list中随机数据
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i = 0; i < 50; i++){
    		list.add((int)(Math.random()*100));
    	}
    	
    	//计算map中数据
    	Map<Integer, List<Integer>> map = new HashMap<>();
    	for(int i = 0; i <= 9; i++){
    		List<Integer> value = new ArrayList<Integer>();
    		for(int k : list){
    			if(k/10 == i){
    				value.add(k);
    			}
    		}
    		map.put(i, value);
    	}
    	
    	System.out.println("随机生成50个小于100的数，分别为：" + list.toString());
    	System.out.println("Map中的数据为：" + map.toString());
    	
    	//排序
    	
    	Set<Integer> key = map.keySet();
    	for(int i : key){
    		List<Integer> value = map.get(i);
    		Collections.sort(value);
    	}
    	System.out.println("排序后Map为：" + map.toString());
	
    	
    }
}
