package com.glory.service.study.effectivejava.chapter5;

import java.util.*;

/**
 * Created by Administrator on 2016/11/1 0001.
 * <p>
 * 在新代码中不要使用原生态类型
 */
public class Test01<K, V, T> {
    private Object[] elements;
    public K getK() {
        @SuppressWarnings("checked") K result = (K) elements[0];
        return result;
    }

    //    @SuppressWarnings("unchecked")
//    public Test01() {
//        elements = (K[]) new Object[12];


//    }

    public static void main(String[] args) {
        //
//        List list = new ArrayList<>();
//        list.add("ych");
//        for (Iterator iterator = list.iterator(); iterator.hasNext(); ) {
//            System.out.println((int) iterator.next());
//        }
//
//        Collection<?> collection = new HashSet<>();
        //collection.add();

        //Object[] objs=new Long[];
        //List<Object> list2=new ArrayList<Long>();

        UnaryFuncation<String> un1 = identityFuncation();
        System.out.println(un1.apply("ych"));
        System.out.println(un1);
        UnaryFuncation<String> un2 = identityFuncation();
        System.out.println(un2);
        System.out.println(un2.apply("ych"));

        //List<Number> numberList = new ArrayList<Number>();
        //numberList.add(new Integer(0));


        Stack<Number> stack=new Stack<>();
        List<Integer> integerList=new ArrayList<>();
        stack.print(integerList);
    }

    private static UnaryFuncation<Object> INSTANCE = new UnaryFuncation<Object>() {
        @Override
        public Object apply(Object t) {
            return t;
        }
    };

    private static <L> UnaryFuncation<L> identityFuncation() {
        return (UnaryFuncation<L>) INSTANCE;
    }
}
