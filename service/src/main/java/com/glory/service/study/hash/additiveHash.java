package com.glory.service.study.hash;

import com.glory.service.study.exception.MyException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;

/**
 * Created by yangch on 2017/4/20 0020.
 */
public class AdditiveHash {
    public static void main(String[] args) {
        AdditiveHash additiveHash=new AdditiveHash();
        additiveHash.test1();
//        String key = "hello5";
//        int prime = 3;
//        int hash, i;
//        for (hash = key.length(), i = 0; i < key.length(); i++)
//            hash += key.charAt(i);
//        System.out.println(hash);
//        System.out.println((hash % prime));
    }

    public void test1(){
        ArrayList arrayList;
        SortedMap sortedMap;
        try {
            test2();
        }catch (Exception e){
            throw new MyException("文件没有找到--02",e);
        }
    }
    public void test2(){
        try {
            FileReader reader = new FileReader("G:\\myfile\\struts.txt");
            Scanner in = new Scanner(reader);
            System.out.println(in.next());
        } catch (FileNotFoundException e) {
            //e 保存异常信息
            throw new MyException("文件没有找到--01",e);
        }
    }
}
