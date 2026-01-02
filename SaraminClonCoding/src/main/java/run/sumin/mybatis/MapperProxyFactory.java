package run.sumin.mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import run.sumin.board.mapper.BoardMapper;

@Configuration
public class MapperProxyFactory {
	private static SqlSessionFactory factory = CustomSqlSessionFactoryBuilder.getSqlsessionfactory();
	public static <T> T generateProxy(Class<T> mapperType) {
		// Mapper 의 특정 메소드에 대해
		// 반복되는 보일러플레이트 코드를 해결하기 위한 템플릿을 갖고있음.
		InvocationHandler invocationHandler = new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				try(
					SqlSession sqlSession = factory.openSession();	
				){
					T mapperProxy = sqlSession.getMapper(mapperType);
//					saved = mapperProxy.selectMember(username);
					Object result = method.invoke(mapperProxy, args);
					sqlSession.commit();
					return result;
				}
			}
		};
		
		// 매퍼 인터페이스의 동적 프록시 객체 반환
		// proxy : 원본 객체의 동작을 대리할 수 있는 대리 객체
		// 프록시를 통해 어떤 메소드가 호출되면 해당 호출건에 대한 제어를 InvocationHandler 가 맡는다.
		return (T) Proxy.newProxyInstance(mapperType.getClassLoader(), new Class<?>[] {mapperType}, invocationHandler);
	}
	
	@Bean
	public BoardMapper boardMapper() {
        // 직접 만드신 팩토리를 사용해 프록시 객체를 생성하고 스프링 빈으로 등록합니다.
        return MapperProxyFactory.generateProxy(BoardMapper.class);
    }
}













