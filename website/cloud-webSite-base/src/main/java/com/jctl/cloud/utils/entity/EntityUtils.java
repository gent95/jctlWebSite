package com.jctl.cloud.utils.entity;


import java.util.Date;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * Created by kay on 2016/11/21 0021.
 */
public class EntityUtils {

    /**
     * 判断是否string 或者基本数据类型
     * @param obj
     * @return
     */
    private static boolean isWrapClass(Object obj) {
        return obj instanceof String || obj instanceof Number || obj instanceof Date;
    }

    /**
     * 检查字符串是否为空
     * @param str
     * @return
     */
    private static boolean isEmpty(String str){
        return null==str||"".equals(str.trim()) ;
    }


    /**
     * 手写字母大写
     * @param str
     * @return
     */
    private static String toUpperFirst(String str){
        return isEmpty(str)?str:str.replaceFirst(str.substring(0,1), str.substring(0,1).toUpperCase()) ;
    }

    /**
     * 去除List集合里的空值，null，空格,0,0.0都为空值
     * @param <E>
     * @param list
     */
//    public static<E> void removeNullList(List<E> list) throws Exception{
//        for (int i = 0; i < list.size(); i++) {
//            if(isEmpty(list.get(i))){
//                list.remove(i) ;
//                i-- ;
//            }
//        }
//    }

    /**
     * 通过obj和str获取entity的对应的value
     * @param obj 目的对象
     * @param str 字段名
     * @return 通过字段名得到字段值
     */
    public static <E> Object getTer(E entity,String str){
    	Object fileValue=null;
    try {
		Class clazz=str.getClass();
		PropertyDescriptor pd=new PropertyDescriptor(str, clazz);
		Method getMehtod  = pd.getReadMethod();//获得get方法
		fileValue=getMehtod.invoke(entity);//执行get方法返回一个Object
	} catch (Exception e) {
		e.printStackTrace();
	}
        return fileValue;
    }
}
