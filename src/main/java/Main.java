import com.log.hibernate.bean.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        //创建对象
        User user = new User();
        user.setUsername("nihao");
        user.setPassword("123");
        user.setAccount(122222);
        SessionFactory factory;
        Session session;
        //获取加载配置管理类
        Configuration configuration = new Configuration();
        //不给参数就默认加载hibernate.cfg.xml文件，
        configuration.configure();
        //创建Session工厂对象
        factory = configuration.buildSessionFactory();
        //得到Session对象
        session = factory.openSession();
        //使用Hibernate操作数据库，都要开启事务,得到事务对象
        Transaction transaction = session.getTransaction();
        //开启事务
        transaction.begin();
        //把对象添加到数据库中
        session.save(user);
        //提交事务
        transaction.commit();
        //关闭Session
        session.close();
        factory.close();
    }
}
