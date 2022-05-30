package fa.training.customannotation.test;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import fa.training.customannotation.*;

public class TestMyAnnotation {
	public static <T> void main(String[] args) throws NoSuchMethodException, SecurityException {
		MyAnnotationApply myAnnotationApply = new MyAnnotationApply();
		Method method = myAnnotationApply.getClass().getMethod("greeting");
//		System.out.println(method);
		System.out.println(MyAnnotation.class);
		
		System.out.println(MyAnnotationApply.class);
		for (Annotation annotation : method.getAnnotations()) {
			System.out.println(annotation);
		}
		
		MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
		System.out.println(method.getAnnotation(AnotherAnnotation.class));
		System.out.println("value:::" + myAnnotation.value());
	}
}
