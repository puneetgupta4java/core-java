import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public  class Callercalc {
   

	public static  int caller(String methodname,int firstno,int secondno) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
	    Object object =Class.forName("Calculator").newInstance();
	    Method method = object.getClass().getDeclaredMethod(methodname, int.class,int.class);
	    Object result = method.invoke(object,firstno, secondno);
	    
		return Integer.parseInt(result.toString());
	}

	
}
